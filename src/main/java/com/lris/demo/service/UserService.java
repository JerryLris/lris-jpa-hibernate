package com.lris.demo.service;

import com.lris.demo.entity.User;

/** 
* @author 作者 Lris: 
* @version 创建修改时间：2018年3月7日 上午11:29:30 
* 类说明 
*/
public interface UserService {

	User getUser(Integer id, String name);
}
