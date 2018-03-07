package com.xy.service;

import com.blade.ioc.annotation.Bean;
import com.xy.mapper.User;

import java.util.List;

@Bean
public class UserService {

    public List<User> findAll() {
        return new User().findAll();
    }

    public User find(Integer id) {
        return new User().find(id);
    }

    public Integer save(User user) {
        return Integer.valueOf(user.save().toString());
    }

    public boolean delete(Integer id) {
        return 1 == new User().delete(id);
    }

    public boolean put(User user, Integer id) {
        return 1 == user.update(id);
    }
}
