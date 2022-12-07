package com.gqfly.news.server.service;

import com.gqfly.news.server.proto.news.News;
import com.gqfly.news.server.proto.news.NewsRequest;
import com.gqfly.news.server.proto.news.NewsResponse;
import com.gqfly.news.server.proto.news.NewsServiceGrpc;
import com.gqfly.news.server.proto.news.StringRequest;
import com.gqfly.news.server.proto.news.StringResponse;
import io.grpc.stub.StreamObserver;

/**
 * @author gqfly
 * @version 1.0
 */
public class NewsService extends NewsServiceGrpc.NewsServiceImplBase {
    private static final int NEWS_NUM = 100;

    @Override
    public void list(NewsRequest request, StreamObserver<NewsResponse> responseObserver) {
        try {
            String date = request.getDate();
            NewsResponse.Builder newsResponseBuilder = NewsResponse.newBuilder();
            for (int i = 0; i < NEWS_NUM; i++) {
                News news = News.newBuilder()
                        .setId(i)
                        .setContent(date + "当日新闻内容" + i)
                        .setTitle("新闻标题" + i)
                        .setCreateTime(System.currentTimeMillis())
                        .build();
                newsResponseBuilder.addNews(news);
            }
            NewsResponse response = newsResponseBuilder.build();
            responseObserver.onNext(response);
        } catch (Exception e) {
            responseObserver.onError(e);
        } finally {
            responseObserver.onCompleted();
        }
    }

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
