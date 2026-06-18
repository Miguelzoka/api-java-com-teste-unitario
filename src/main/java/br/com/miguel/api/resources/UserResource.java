package br.com.miguel.api.resources;

import br.com.miguel.api.domain.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/user")
public class UserResource {

    @GetMapping(value = "/{id}")
    public ResponseEntity<User> findByID(@PathVariable Integer id) {
        return ResponseEntity.ok().body(new User(1, "Miguel", "miguel@mail.com", "123"));
    }

}
