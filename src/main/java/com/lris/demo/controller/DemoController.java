package com.lris.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lris.demo.service.UserService;

/** 
* @author 作者 Lris: 
* @version 创建修改时间：2018年3月7日 上午11:30:49 
* 类说明 
*/
@Controller
@RequestMapping("/")
public class DemoController {
    @Autowired
    UserService userService;
    @RequestMapping("/")
    @ResponseBody
    public String index(){
        return "index";
    }
    @RequestMapping("/getuser")
    @ResponseBody
    public String getUser(Integer id, String name){
        return userService.getUser(id, name).toString();
    }
}