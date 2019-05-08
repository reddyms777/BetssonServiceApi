package com.betssonassignment.restservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RestResource;

import com.betssonassignment.restservice.entity.User;

//@RepositoryRestResource(path = "/users")
@RestResource(exported = false)
public interface UserRepository extends JpaRepository<User,Integer> {

}