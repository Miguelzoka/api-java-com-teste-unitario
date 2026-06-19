package br.com.miguel.api.services;

import br.com.miguel.api.domain.User;

import java.util.List;

public interface UserService {

    User findByID(Integer id);
    List<User> findAll();
}
