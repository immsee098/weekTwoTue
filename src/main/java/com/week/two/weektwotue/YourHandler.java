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
        String name = req.queryParam("name").get();
        rmap.put("to", name);
        rmap.put("message", "hello "+name);
        rmap.put("job", name+"'s job");

        return ServerResponse
                .ok()
                .contentType(MediaType.APPLICATION_JSON)
                .bodyValue(rmap).log();
    }
}
