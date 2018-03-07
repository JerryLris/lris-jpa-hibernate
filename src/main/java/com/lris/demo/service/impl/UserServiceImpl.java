package com.lris.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lris.demo.dao.UserDao;
import com.lris.demo.entity.User;
import com.lris.demo.service.UserService;

/** 
* @author 作者 Lris: 
* @version 创建修改时间：2018年3月7日 上午11:30:05 
* 类说明 
*/
@Service
public class UserServiceImpl implements UserService{
    @Autowired
    UserDao userDao;
    @Override
    public User getUser(Integer id, String name) {
        return userDao.getUser(id, name);
    }
}