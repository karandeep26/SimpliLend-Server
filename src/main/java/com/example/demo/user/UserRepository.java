package com.example.demo.user;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

/**
 * Created by karan on 26/5/17.
 */
public interface UserRepository extends CrudRepository<User, Long> {
    @Query("SELECT u FROM User u where u.email = :email")
    User findByEmail(@Param("email") String email);
    @Query("SELECT u FROM User u where u.email=:email AND u.password=:password")
    User findByEmailAndPassword(@Param("email") String email,@Param("password") String password);

}