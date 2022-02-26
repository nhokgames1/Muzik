package com.sts.dp.commoncore.service;

import com.sts.dp.commoncore.domain.Role;
import com.sts.dp.commoncore.domain.User;

import java.util.List;

public interface UserService {
    User saveUser(User user);
    Role saveRole(Role role);
    void addRoleToUser(String username,String roleName);
    User getUser(String username);
    List<User> getUser();
}
