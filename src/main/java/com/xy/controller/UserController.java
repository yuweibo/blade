package com.xy.controller;

import com.blade.ioc.annotation.Inject;
import com.blade.mvc.annotation.*;
import com.xy.mapper.User;
import com.xy.service.UserService;

import java.util.List;

@Path(value = "user", restful = true)
public class UserController {

    @Inject
    private UserService userService;

    @GetRoute
    public List<User> all() {
        return userService.findAll();
    }

    @GetRoute(value = ":id")
    public User find(@PathParam Integer id) {
        return userService.find(id);
    }

    @PostRoute
    public Integer post(@Param User user) {
        return userService.save(user);
    }

    @DeleteRoute(value = ":id")
    public boolean delete(@PathParam Integer id) {
        return userService.delete(id);
    }

    @PutRoute(value = ":id")
    public boolean put(@Param User user, @PathParam Integer id) {
        return userService.put(user, id);
    }

}
