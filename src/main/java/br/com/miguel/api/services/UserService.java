package br.com.miguel.api.services;

import br.com.miguel.api.domain.User;

public interface UserService {

    User findByID(Integer id);
}
