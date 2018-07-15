package com.djordje.betOrDie.resource;

import com.djordje.betOrDie.jpa.User;
import com.djordje.betOrDie.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/rest/users")
public class UserResource {

    @Autowired
    private UserRepository userRepository;

    @GetMapping(value = "/all")
    public List<User> getAll() {
        return userRepository.findAll();
    }

    @PostMapping(value = "load")
    public List<User> persist(@RequestBody User user) {
        userRepository.save(user);
        return userRepository.findAll();
    }
}
