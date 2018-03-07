package com.lris.demo.dao.impl;

import org.springframework.stereotype.Repository;

import com.lris.demo.dao.UserDao;
import com.lris.demo.entity.User;

/** 
* @author 作者 Lris: 
* @version 创建修改时间：2018年3月7日 上午11:27:27 
* 类说明 
*/
@Repository
public class UserDaoImpl implements UserDao{
    @Override
    public User getUser(Integer id, String name) {
        return new User(id, name);
    }
}
