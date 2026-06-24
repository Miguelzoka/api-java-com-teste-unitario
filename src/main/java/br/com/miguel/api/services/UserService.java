package br.com.miguel.api.services;

import br.com.miguel.api.domain.User;
import br.com.miguel.api.domain.dto.UserDTO;

import java.util.List;

public interface UserService {

    User findByID(Integer id);
    List<User> findAll();
    User create(UserDTO obj);
    User update(UserDTO obj);
    void delete(Integer id);
}
