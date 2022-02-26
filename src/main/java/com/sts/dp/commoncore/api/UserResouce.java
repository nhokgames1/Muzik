package com.sts.dp.commoncore.api;

import com.sts.dp.commoncore.domain.Role;
import com.sts.dp.commoncore.domain.User;
import com.sts.dp.commoncore.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class UserResouce {
    @Autowired
    private UserService userService;

    @GetMapping("/users")
    public ResponseEntity<List<User>> getUsers(){
        return  ResponseEntity.ok().body(userService.getUser());
    }
    @PostMapping("/user")
    public ResponseEntity<User> createUser(@RequestBody User user){
        return ResponseEntity.ok().body(userService.saveUser(user));
    }
    @PostMapping("/role")
    public ResponseEntity<Role> createRole(@RequestBody Role role){
        return ResponseEntity.ok().body(userService.saveRole(role));
    }
}
