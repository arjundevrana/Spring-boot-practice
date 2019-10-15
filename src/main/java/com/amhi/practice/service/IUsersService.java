package com.amhi.practice.service;

import com.amhi.practice.dto.BulkUsers;
import com.amhi.practice.model.Users;

import java.util.List;

public interface IUsersService {
    public Users getUsersById(Long userID);
    public Users getUsersByName(String  userName);
    public Users createUser(Users users);
    public List<Users> getBulkUsers(BulkUsers bulkUsers);
    public Users getUserNotFoundException(Long userID);
}
