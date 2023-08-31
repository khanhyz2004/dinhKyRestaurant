package com.restaurantly.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.restaurantly.model.Users;

public interface UsersRepo extends JpaRepository<Users, String>{

}
