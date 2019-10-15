package com.amhi.practice.web;

import com.amhi.practice.dto.BulkUsers;
import com.amhi.practice.exception.EntityNotFoundException;
import com.amhi.practice.model.Users;
import com.amhi.practice.service.IUsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UsersController {

    @Autowired
    private IUsersService iUsersService;

    @GetMapping(value = "/{userId}")
    public Users getUser(@PathVariable("userId") Long userId) throws EntityNotFoundException {
        return iUsersService.getUsersById(userId);
    }

    @GetMapping(value = "/bulkUser")
    public List<Users> getbulkUser(@RequestBody @Valid BulkUsers bulkUsers) throws EntityNotFoundException {
        return iUsersService.getBulkUsers(bulkUsers);
    }

    @GetMapping(value = "/user")
    public Users getUsersRequestParam(@RequestParam("userId") Long userId) throws EntityNotFoundException {
        return iUsersService.getUsersById(userId);
    }

    @GetMapping(value = "/exception/{userId}")
    public Users getUserNotFoundException(@PathVariable("userId") Long birdId) throws EntityNotFoundException {
        return iUsersService.getUserNotFoundException(birdId);
    }

    @PostMapping
    public Users createBird(@RequestBody @Valid Users users) {
        return iUsersService.createUser(users);
    }

}