package com.gqfly.news.client;

import com.gqfly.news.server.proto.news.News;
import com.gqfly.news.server.proto.news.NewsRequest;
import com.gqfly.news.server.proto.news.NewsResponse;
import com.gqfly.news.server.proto.news.NewsServiceGrpc;
import com.gqfly.news.server.proto.news.StringRequest;
import com.gqfly.news.server.proto.news.StringResponse;
import com.gqfly.news.server.proto.sms.PhoneNumberRequest;
import com.gqfly.news.server.proto.sms.PhoneNumberResponse;
import com.gqfly.news.server.proto.sms.SmsRequest;
import com.gqfly.news.server.proto.sms.SmsResponse;
import com.gqfly.news.server.proto.sms.SmsServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;

import java.util.Iterator;
import java.util.concurrent.TimeUnit;

/**
 * @author gqfly
 * @version 1.0
 */
public class GrpcClient {
    private static final String HOST = "localhost";
    private static final int PORT = 8090;
    private static final int PHONE_NUM = 10;

    public static void main(String[] args) {
        createAndSendSms();
    }

    private static void list() {
        ManagedChannel channel = ManagedChannelBuilder.forAddress(HOST, PORT).usePlaintext().build();
        try {
            NewsServiceGrpc.NewsServiceBlockingStub blockingStub = NewsServiceGrpc.newBlockingStub(channel);
            NewsRequest request = NewsRequest.newBuilder().setDate("20221207").build();
            NewsResponse response = blockingStub.list(request);
            for (News news : response.getNewsList()) {
                System.out.println(news.getTitle() + ":" + news.getContent());
            }
        } finally {
            channel.shutdown();
        }
    }

    private static void hello() {
        ManagedChannel channel = ManagedChannelBuilder.forAddress(HOST, PORT).usePlaintext().build();
        try {
            NewsServiceGrpc.NewsServiceBlockingStub blockingStub = NewsServiceGrpc.newBlockingStub(channel);
            StringRequest request = StringRequest.newBuilder().setName("Tom").build();
            StringResponse response = blockingStub.hello(request);
            System.out.println(response.getResult());
        } finally {
            channel.shutdown();
        }
    }

    private static void sendSms() {
        ManagedChannel channel = ManagedChannelBuilder.forAddress(HOST, PORT).usePlaintext().build();
        try {
            SmsServiceGrpc.SmsServiceBlockingStub blockingStub = SmsServiceGrpc.newBlockingStub(channel);
            SmsRequest request = SmsRequest.newBuilder()
                    .setContent("下午三点开会")
                    .addPhoneNumber("13166668888")
                    .addPhoneNumber("13166668889")
                    .addPhoneNumber("13166668890")
                    .addPhoneNumber("13166668891")
                    .addPhoneNumber("13166668892")
                    .addPhoneNumber("13166668893")
                    .build();
            Iterator<SmsResponse> iter = blockingStub.sendSms(request);
            while (iter.hasNext()) {
                SmsResponse response = iter.next();
                System.out.println(response.getResult());
            }
        } finally {
            channel.shutdown();
        }
    }

    /**
     * 监听服务器获取服务器响应的消息
     */
    private static final StreamObserver<PhoneNumberResponse> responseObserver = new StreamObserver<>() {
        @Override
        public void onNext(PhoneNumberResponse response) {
            System.out.println(response.getResult());
        }

        @Override
        public void onError(Throwable throwable) {
        }

        @Override
        public void onCompleted() {
            System.out.println("处理完毕");
        }
    };

    private static void createPhoneNumber() {
        ManagedChannel channel = ManagedChannelBuilder.forAddress(HOST, PORT).usePlaintext().build();
        // 客户端流式通信必须创建异步stub实现
        SmsServiceGrpc.SmsServiceStub asyncStub = SmsServiceGrpc.newStub(channel);
        StreamObserver<PhoneNumberRequest> requestObserver = asyncStub.createPhoneNumber(responseObserver);
        doSendSms(requestObserver);
    }

    private static void createAndSendSms() {
        ManagedChannel channel = ManagedChannelBuilder.forAddress(HOST, PORT).usePlaintext().build();
        // 客户端流式通信必须创建异步stub实现
        SmsServiceGrpc.SmsServiceStub asyncStub = SmsServiceGrpc.newStub(channel);
        StreamObserver<PhoneNumberRequest> requestObserver = asyncStub.createAndSendSms(responseObserver);
        doSendSms(requestObserver);
    }

    private static void doSendSms(StreamObserver<PhoneNumberRequest> requestObserver) {
        try {
            for (int i = 0; i < PHONE_NUM; i++) {
                PhoneNumberRequest request = PhoneNumberRequest.newBuilder().setPhoneNumber(String.valueOf(18866668881L + i)).build();
                requestObserver.onNext(request);
                TimeUnit.SECONDS.sleep(1);
            }
        } catch (Exception e) {
            requestObserver.onError(e);
        } finally {
            requestObserver.onCompleted();
        }
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
