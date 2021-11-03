package com.studenti.service;

import com.studenti.model.Roles;

public interface RoleService {
	Roles findByName(String name);
}
