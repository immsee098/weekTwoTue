package com.week.two.weektwotue;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

import java.util.HashMap;

@Component
public class YourHandler {

    public Mono<ServerResponse> myjob(ServerRequest req) {
        HashMap rmap = new HashMap();
        rmap.put("job", "test");

        return ServerResponse
                .ok()
                .contentType(MediaType.APPLICATION_JSON)
                .bodyValue(rmap).log();
    }
}
