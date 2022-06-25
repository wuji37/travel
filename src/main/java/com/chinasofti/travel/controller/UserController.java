package com.chinasofti.travel.controller;

import com.alibaba.fastjson.JSON;
import com.chinasofti.travel.model.User;
import com.chinasofti.travel.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/user",method = RequestMethod.GET)
//该注解path和value作用相同
public class UserController {
    @Autowired
    private UserService userService;

    //增加一个用户，成功运行
    @RequestMapping(value = "/addUser",method = RequestMethod.POST)
    public void addUser(@RequestBody User user){
        userService.addUser(user);
    }


    //根据id删除一个用户，成功运行
    @RequestMapping(value = "/deleteUserById",method=RequestMethod.POST)
    public void deleteUserById(Long id){
        userService.deleteUserById(id);
    }


    //获取所有用户信息，成功运行
    @RequestMapping(value="/queryAllUser",method=RequestMethod.GET)
    public String queryAllUser(){
        List<User> list=userService.queryAllUser();

        return JSON.toJSONString(list);
    }

    //修改单个用户信息，成功运行
    @RequestMapping(value="/updateUser",method = RequestMethod.POST)
    public void updateUser(@RequestBody User user){
        userService.updateUser(user);
    }

    //获取单个用户信息,成功运行
    @RequestMapping(value = "/queryUserById",method = RequestMethod.GET)
    public String queryUserById(@RequestParam(value="id",required =true)Long id){  //表示必须传过来一个名为id的参数
        return JSON.toJSONString(userService.queryUserById(id));
    }

    @RequestMapping(value = "test",method = RequestMethod.POST)
    public String test(@RequestBody String jsonString,String string1){    //用于测试@RequestBody和@RequestParam数据插入
        System.out.println(jsonString);
        System.out.println(string1);
        return jsonString;
    }


    @RequestMapping(value = "test1",method = RequestMethod.POST)   //用于测试单个对象数据插入
    public String test1(@RequestBody User user){
        System.out.println(user.toString());
        return JSON.toJSONString(user.toString());
    }

}
