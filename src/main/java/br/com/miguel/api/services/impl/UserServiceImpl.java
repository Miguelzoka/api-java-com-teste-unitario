package br.com.miguel.api.services.impl;

import br.com.miguel.api.domain.User;
import br.com.miguel.api.repositories.UserRepository;
import br.com.miguel.api.services.UserService;
import br.com.miguel.api.services.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository repository;

    @Override
    public User findByID(Integer id) {
        Optional<User> obj = repository.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
    }
}
