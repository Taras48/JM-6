package com.spring.controller;

import com.spring.model.User;
import com.spring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
@ComponentScan(basePackages = "com.spring.service")
public class UserController {

    private UserService userService;


    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;

    }


    @GetMapping(value = "/helloUser")
    public String getUserGet() {
        return "helloUser";
    }


    @PostMapping(value = "/admin/add")
    public String addUserPost(User messageUser) {
     userService.addUser(messageUser);
        return "redirect:/admin";
    }

    @PostMapping(value = "/admin/delete")
    public String deleteUsersPost(Long id) {

        userService.deleteUser(id);

        return "redirect:/admin";
    }

    @PostMapping(value = "/admin/update")
    public String updateUsersPost(User messageUser) {
        userService.updateUser(messageUser);
        return "redirect:/admin";
    }

    @GetMapping(value = "/admin")
    public ModelAndView allUsers(ModelAndView modelAndView) {
        modelAndView.addObject("list", userService.getAllUsers());
        modelAndView.setViewName("admin/allUsers");
        return modelAndView;
    }

    @GetMapping(value = "/admin/add")
    public String addUser() {
        return "admin/addUser";
    }

    @GetMapping(value = "/admin/delete")
    public String deleteUsers() {
        return "admin/deleteUser";
    }

    @GetMapping(value = "/admin/update")
    public String updateUsers() {
        return "admin/updateUser";
    }

}
