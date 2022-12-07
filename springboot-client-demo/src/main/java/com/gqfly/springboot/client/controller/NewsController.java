package com.gqfly.springboot.client.controller;

import com.gqfly.springboot.server.proto.news.NewsServiceGrpc;
import com.gqfly.springboot.server.proto.news.StringRequest;
import com.gqfly.springboot.server.proto.news.StringResponse;
import net.devh.boot.grpc.client.inject.GrpcClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author gqfly
 * @version 1.0
 */
@RestController
@RequestMapping("/api/news")
public class NewsController {

    @GrpcClient("GLOBAL")
    private NewsServiceGrpc.NewsServiceBlockingStub blockingStub;

    @GetMapping("/name")
    public String sayHello(@RequestParam("name") String name) {
        StringResponse response = blockingStub.hello(StringRequest.newBuilder().setName(name).build());
        return response.getResult();
    }
}
