package com.gqfly.news.server;

import com.gqfly.news.server.service.NewsService;
import com.gqfly.news.server.service.SmsService;
import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;

/**
 * @author gqfly
 * @version 1.0
 */
public class GrpcServer {
    private static final int PORT = 8090;

    public static void main(String[] args) throws InterruptedException, IOException {
        Server server = ServerBuilder.forPort(PORT)
                .addService(new NewsService())
                .addService(new SmsService())
                .build()
                .start();
        System.out.println(String.format("GRPC服务端启动成功，端口号：%d.", PORT));
        server.awaitTermination();
    }
}
