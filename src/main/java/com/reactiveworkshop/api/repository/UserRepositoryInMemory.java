package com.reactiveworkshop.api.repository;

import com.reactiveworkshop.api.model.User;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class UserRepositoryInMemory implements UserRepository {

    private List<User> db = new ArrayList<>();


    @Override
    public Mono<User> findByUuid(String cpf) {

        var result = db
                .stream()
                .filter(u -> u.getUuid().equals(cpf))
                .findFirst();

        return Mono.justOrEmpty(result);
    }



    @Override
    public Mono<User> createUser(User user) {

        db.add(user);

        return Mono.just(user);
    }

    @Override
    public Mono<User> findByCpf(String cpf) {

        var result = db
                        .stream()
                        .filter(u -> u.getCpf().equals(cpf))
                        .findFirst();

        return Mono.justOrEmpty(result);
    }

    @Override
    public Mono<User> findByEmail(String email) {

        var result = db
                .stream()
                .filter(u -> u.getEmail().equals(email))
                .findFirst();

        return Mono.justOrEmpty(result);

    }

    @Override
    public Flux<User> list() {
        return Flux.fromIterable(db);
    }
}
