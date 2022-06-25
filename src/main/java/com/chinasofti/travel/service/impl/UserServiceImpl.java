package com.chinasofti.travel.service.impl;

import com.chinasofti.travel.Dao.UserDao;
import com.chinasofti.travel.model.User;
import com.chinasofti.travel.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service   //Service的实现类必须加上@Service标注，并且需要实现Service的接口
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public void addUser(User user) {
        userDao.save(user);
    }

    @Override
    public void deleteUserById(Long id) {
        userDao.deleteById(id);
    }

    @Override
    public void updateUser(User user) {
        Optional<User> user1=userDao.findById(user.getAccountNumber()); //根据用户id获取数据库中的用户信息
        User user2=user1.get();

        user2.setUser(user.getAccountNumber(),user.getPassword(),user.getName(),user.getIdentity());//然后修改对应信息并保存
        userDao.save(user2);
    }

    @Override
    public User queryUserById(Long id) {
       Optional<User> user=userDao.findById(id);
       return user.get();
    }

    @Override
    public List<User> queryAllUser() {
        return userDao.findAll();
    }
}
