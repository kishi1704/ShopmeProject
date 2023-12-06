package com.shopme.admin.user;

import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;

import com.shopme.common.entity.Role;

@Repository
public interface RoleRepository extends ListCrudRepository<Role, Integer> {

}
