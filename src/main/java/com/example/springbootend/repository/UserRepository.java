package com.example.springbootend.repository;

import com.example.springbootend.entity.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CustomizedRepoistory<User, Integer> {
    @Query("SELECT u FROM User u WHERE u.number=:number")
    User find(@Param("number") String number);
}
