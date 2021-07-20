package com.spring.postgresql.jwt.springapitesting.services;

import com.spring.postgresql.jwt.springapitesting.domain.User;
import com.spring.postgresql.jwt.springapitesting.exceptions.EtAuthException;

public interface UserService {
    
    User validateUser(String email, String password) throws EtAuthException;

    User registerUser(String firstName, String lastName, String email, String password) throws EtAuthException;
}
