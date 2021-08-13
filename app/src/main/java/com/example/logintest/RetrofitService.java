package com.example.logintest;

import android.content.ClipData;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.HEAD;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;

public interface RetrofitService {


   /* //6. POST방식으로 값 전달 [@Body] - 객체를 전달하면 자동으로 json문자열로 변환하여 서버로 전송해줌
    @POST("/mobileapi/v1/auth/login")
    Call<ClipData.Item> postMethodTest(@Body ClipData.Item item);

    //7. POST방식으로  개별 값 전달 [@Field]
    //단 @Field를 사용하려면 반드시 @FormUrlEncoded와 함께 사용해야함.
    @FormUrlEncoded
    @POST("/mobileapi/v1/auth/login")
    Call<ClipData.Item> postMethodTest2(@Field("userCd") String name, @Field("userNm") String msg);

    //8. GET방식으로 json배열 값 받아와서 ArrayList<Item>으로 받기
    @POST("/mobileapi/v1/auth/login")
    Call<ArrayList<ClipData.Item>> PostBoardArray(@Body ClipData.Item item);

    //9. Gson을 통해 자동으로 객체로 파싱하지 않고 json문자열로 그냥 결과 응답 받기
    //서버가 cho를 단순 문자열로 할때 사용하는 방법
    @GET("/mobileapi/v1/auth/login")
    Call<String> getJsonString();*/


    @POST("/mobileapi/v1/auth/login")
    Call<Item> postMethodTest(@Body HashMap<String, String> datas );


    //7. POST방식으로  개별 값 전달 [@Field]
    //단 @Field를 사용하려면 반드시 @FormUrlEncoded와 함께 사용해야함.
    @FormUrlEncoded
    @POST("mobileapi/v1/auth/login")
    Call<Item> postMethodTest2(@Field("userId") String userId, @Field("userPwd") String userPwd);


}
