package com.week.two.weektwotue;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.config.EnableWebFlux;

import org.springframework.web.reactive.function.server.RequestPredicates;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

import java.util.HashMap;

@Configuration
public class YourRouter {

    @Bean
    public RouterFunction<ServerResponse> router(YourHandler yourHandler) {

        return RouterFunctions.route(
                RequestPredicates
                        .GET("/getJob")
                        .and(RequestPredicates.accept(MediaType.APPLICATION_JSON)), yourHandler::myjob);
    }
}
