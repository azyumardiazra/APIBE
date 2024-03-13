package com.kelompoktiga.demo.controller;

import com.kelompoktiga.demo.Service.UserService;
import com.kelompoktiga.demo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/user")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping
    public Iterable <User> getAlluser() {
        return userService.getAlluser();
    }

    @GetMapping("/{userid}")
    public User getuserByid(@PathVariable Long id) {
        return userService.getuserByid(id);
    }

    @PostMapping
    public User saveUser(@RequestBody User user) {
        return userService.saveUser(user);
    }

    @PutMapping("/{userid}")
    public User updateUser(@PathVariable Long id, @RequestBody User user) {
        user.setIduser(id);
        return userService.saveUser(user);
    }

    @DeleteMapping("/{userid}")
    public void deleteUser(@PathVariable Long id) {
        userService.deleteUser(id);
    }
}
