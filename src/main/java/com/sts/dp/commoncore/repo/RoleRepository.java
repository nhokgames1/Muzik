package com.sts.dp.commoncore.repo;

import com.sts.dp.commoncore.domain.Role;
import com.sts.dp.commoncore.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role,Long> {
    Role findByName(String name);
}
