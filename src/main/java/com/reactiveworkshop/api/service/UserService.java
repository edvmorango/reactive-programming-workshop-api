package com.reactiveworkshop.api.service;

import com.reactiveworkshop.api.model.User;
import reactor.core.publisher.Mono;

import java.util.List;

public interface UserService {

    Mono<User> findByUuid(String uuid);

    Mono<User> createUser(User user);

    List<User> list();


}
