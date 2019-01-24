package com.reactiveworkshop.api.repository;

import com.reactiveworkshop.api.model.User;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface UserRepository {

    Mono<User> findByUuid(String uuid);

    Mono<User> createUser(User user);

    Mono<User> findByCpf(String cpf);

    Mono<User> findByEmail(String email);

    Flux<User> list();

}
