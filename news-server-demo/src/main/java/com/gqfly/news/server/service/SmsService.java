package com.gqfly.news.server.service;

import com.google.protobuf.ProtocolStringList;
import com.gqfly.news.server.proto.sms.PhoneNumberRequest;
import com.gqfly.news.server.proto.sms.PhoneNumberResponse;
import com.gqfly.news.server.proto.sms.SmsRequest;
import com.gqfly.news.server.proto.sms.SmsResponse;
import com.gqfly.news.server.proto.sms.SmsServiceGrpc;
import io.grpc.stub.StreamObserver;

import java.util.concurrent.TimeUnit;

/**
 * @author gqfly
 * @version 1.0
 */
public class SmsService extends SmsServiceGrpc.SmsServiceImplBase {
    private int i;
    private int j;

    @Override
    public void sendSms(SmsRequest request, StreamObserver<SmsResponse> responseObserver) {
        try {
            ProtocolStringList phoneNumberList = request.getPhoneNumberList();
            for (String phoneNumber : phoneNumberList) {
                SmsResponse response = SmsResponse.newBuilder().setResult(request.getContent() + ", " + phoneNumber + "已发送").build();
                responseObserver.onNext(response);
                TimeUnit.SECONDS.sleep(1);
            }
        } catch (Exception e) {
            responseObserver.onError(e);
        } finally {
            responseObserver.onCompleted();
        }
    }

    @Override
    public StreamObserver<PhoneNumberRequest> createPhoneNumber(StreamObserver<PhoneNumberResponse> responseObserver) {
        /**
         * 客户端流式通信必须使用异步通信
         * 异步通信要基于responseObserver的事件回调
         */
        return new StreamObserver<>() {
            @Override
            public void onNext(PhoneNumberRequest phoneNumberRequest) {
                System.out.println(phoneNumberRequest.getPhoneNumber() + "手机号已登记");
                i++;
            }

            @Override
            public void onError(Throwable throwable) {
                throwable.printStackTrace();
            }

            @Override
            public void onCompleted() {
                PhoneNumberResponse response = PhoneNumberResponse.newBuilder().setResult("server：您本次批量导入了" + i + "个员工电话").build();
                responseObserver.onNext(response);
                responseObserver.onCompleted();
            }
        };
    }

    @Override
    public StreamObserver<PhoneNumberRequest> createAndSendSms(StreamObserver<PhoneNumberResponse> responseObserver) {
        /**
         * 双向流式通信必须使用异步通信
         * 异步通信要基于responseObserver的事件回调
         */
        return new StreamObserver<>() {
            @Override
            public void onNext(PhoneNumberRequest phoneNumberRequest) {
                System.out.println(phoneNumberRequest.getPhoneNumber() + "手机号已登记");
                responseObserver.onNext(PhoneNumberResponse.newBuilder().setResult(phoneNumberRequest.getPhoneNumber() + "手机号已登记，此消息发送给部门经理").build());
                responseObserver.onNext(PhoneNumberResponse.newBuilder().setResult(phoneNumberRequest.getPhoneNumber() + "手机号已登记，此消息发送给副总经理").build());
                responseObserver.onNext(PhoneNumberResponse.newBuilder().setResult(phoneNumberRequest.getPhoneNumber() + "手机号已登记，此消息发送给总经理").build());
                j++;
            }

            @Override
            public void onError(Throwable throwable) {
                throwable.printStackTrace();
            }

            @Override
            public void onCompleted() {
                responseObserver.onCompleted();
            }
        };
    }
}
