package com.troshka.troshka.repository;


import com.troshka.troshka.entity.UserRoleEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<UserRoleEntity, Long> {

    UserRoleEntity findByName(String name);
}