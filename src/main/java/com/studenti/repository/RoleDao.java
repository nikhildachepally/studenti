package com.studenti.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.studenti.model.Roles;

@Repository
public interface RoleDao extends CrudRepository<Roles, Long> {
    Roles findRoleByName(String name);
}