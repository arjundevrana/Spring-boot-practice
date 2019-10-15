package com.amhi.practice.service;

import com.amhi.practice.dto.BulkUsers;
import com.amhi.practice.exception.EntityNotFoundException;
import com.amhi.practice.model.Users;
import com.amhi.practice.presist.IUsersPersist;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class IUsersServiceImpl implements IUsersService {
    @Autowired
    private IUsersPersist iUsersPersist;

    @Override
    public Users getUsersById(Long userID) {
        Users users = null;
        Optional<Users> optional = iUsersPersist.findById(userID);
        if(optional!=null){
             users= optional.get();
        }
        if(users==null){
            throw new EntityNotFoundException(Users.class, "id", userID.toString());
        }
        return users;
    }

    @Override
    public Users getUsersByName(String  userName) {
        return iUsersPersist.findByName(userName);
    }

    @Override
    public Users createUser(Users users) {
        return iUsersPersist.save(users);
    }

    @Override
    public List<Users> getBulkUsers(BulkUsers bulkUsers) {
        List<Users> users =  new ArrayList<>();
        for(Long userId:bulkUsers.getUsersIds()){
            Optional<Users> optional = iUsersPersist.findById(userId);
            Users user= optional.get();
            if(users==null){
                throw new EntityNotFoundException(Users.class, "id", userId.toString());
            }
            users.add(user);
        }
        return users;
    }

    @Override
    public Users getUserNotFoundException(Long userID) {
        Users users = null;
        Optional<Users> optional = iUsersPersist.findById(userID);
        if(optional!=null){
            users= optional.get();
        }
        return users;
    }
}
