package com.spring.postgresql.jwt.springapitesting.repositories;

import com.spring.postgresql.jwt.springapitesting.domain.User;
import com.spring.postgresql.jwt.springapitesting.exceptions.EtAuthException;

public interface UserRepository {
    
    Integer create(String firstName, String lastName, String email, String password) throws EtAuthException;
    User findByEmailAndPassword(String email, String password) throws EtAuthException;
    Integer getCountByEmail(String email);
    User findById(Integer userId);
}
