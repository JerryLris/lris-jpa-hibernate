package com.lris.demo.entity;
/** 
* @author 作者 Lris: 
* @version 创建修改时间：2018年3月7日 上午11:25:56 
* 类说明 
*/
public class User {
    private Integer id;
    private String name;
    public User(Integer id, String name) {
        this.id = id;
        this.name = name;
    }
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return "id:"+id+",name:"+name;
    }
}