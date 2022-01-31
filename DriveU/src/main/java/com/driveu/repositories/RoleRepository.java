package com.driveu.repositories;

import com.driveu.entities.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.Set;

public interface RoleRepository extends JpaRepository<Role,Long> {

    Role findRoleByName(String name);

}
