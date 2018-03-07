package com.lris.demo.dao;

import com.lris.demo.entity.User;

/** 
* @author 作者 Lris: 
* @version 创建修改时间：2018年3月7日 上午11:26:43 
* 类说明 
*/
public interface UserDao {

	User getUser(Integer id,String name);
}
