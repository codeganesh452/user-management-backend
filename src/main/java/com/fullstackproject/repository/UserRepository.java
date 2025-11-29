package com.fullstackproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.fullstackproject.model.User;

public interface UserRepository extends JpaRepository<User, Integer>{

}
