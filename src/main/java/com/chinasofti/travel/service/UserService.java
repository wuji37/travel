package com.chinasofti.travel.service;

import com.chinasofti.travel.model.User;
import org.springframework.stereotype.Service;

import java.util.List;

public interface UserService {
    public void addUser(User user);

    public void deleteUserById(Long  id);

    public void updateUser(User user);

    public User queryUserById(Long id);   //可以尝试通过其他参数查询

    public List<User> queryAllUser();
}
