package com.takehome.usermanagement.repository;

import com.takehome.usermanagement.entity.Users;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<Users, Long>{}
