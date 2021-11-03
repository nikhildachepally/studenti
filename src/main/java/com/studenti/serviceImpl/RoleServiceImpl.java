package com.studenti.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.studenti.model.Roles;
import com.studenti.repository.RoleDao;
import com.studenti.service.RoleService;

@Service(value = "roleService")
public class RoleServiceImpl implements RoleService{
	
	
	@Autowired
    private RoleDao roleDao;

    @Override
    public Roles findByName(String name) {
        Roles role = roleDao.findRoleByName(name);
        return role;
    }

}
