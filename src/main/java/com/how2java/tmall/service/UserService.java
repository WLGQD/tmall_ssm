package com.how2java.tmall.service;

import com.how2java.tmall.pojo.User;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: XKK
 * Date: 2018-01-29
 * Time: 10:27
 */
public interface UserService {

    void add(User c);
    void delete(int id);
    void update(User c);
    User get(int id);
    List list();

    boolean isExist(String name);

    User get(String name, String password);
}
