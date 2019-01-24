package com.reactiveworkshop.api.endpoint;


import com.reactiveworkshop.api.endpoint.response.HealthResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class HealthEndpoint {


    @GetMapping("/health")
    public Mono<HealthResponse> health() {

        return Mono.just(new HealthResponse());

    }


}
