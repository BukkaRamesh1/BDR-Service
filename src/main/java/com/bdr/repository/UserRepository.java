package com.bdr.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.bdr.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
