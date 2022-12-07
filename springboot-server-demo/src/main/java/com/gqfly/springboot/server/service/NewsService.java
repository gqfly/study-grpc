package com.gqfly.springboot.server.service;

import com.gqfly.springboot.server.proto.news.NewsServiceGrpc;
import com.gqfly.springboot.server.proto.news.StringRequest;
import com.gqfly.springboot.server.proto.news.StringResponse;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;

/**
 * @author gqfly
 * @version 1.0
 */
@GrpcService
public class NewsService extends NewsServiceGrpc.NewsServiceImplBase {

    @Override
    public void hello(StringRequest request, StreamObserver<StringResponse> responseObserver) {
        try {
            String name = request.getName();
            StringResponse response = StringResponse.newBuilder().setResult("Hi, " + name).build();
            responseObserver.onNext(response);
        } catch (Exception e) {
            responseObserver.onError(e);
        } finally {
            responseObserver.onCompleted();
        }
    }
}
