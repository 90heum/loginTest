package com.example.logintest;

import android.app.Activity;
import android.content.ClipData;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;
import com.google.gson.Gson;
import com.google.gson.JsonParser;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.POST;

import static android.content.ContentValues.TAG;
import static android.webkit.ConsoleMessage.MessageLevel.LOG;

public class LoginActivity extends AppCompatActivity {

    private EditText et_id, et_pass;
    private Button btn_login, btn_register;

    TextView tv;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        tv=findViewById(R.id.tv);
        btn_login= findViewById(R.id.btn_login);


        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String userId="user@service.com";
                String userPwd="1234";

                Retrofit retrofit=RetrofitHelper.getRetrofitInstance();
                RetrofitService retrofitService=retrofit.create(RetrofitService.class);

                retrofitService.postMethodTest2(userId,userPwd).enqueue(new Callback<Item>() {

                    @Override
                    public void onResponse(Call<Item> call, Response<Item> response) {
                        if(response.isSuccessful()){

                            Item item=response.body();

                            Log.d("respose.raw", String.valueOf(response.raw()));
                            Log.d("제발되라",""+response.body().dataset.toString());
                            Log.d("제발!",response.body().getDataset().toString());
                            Log.d("하이","gd");


                            item.dataset.toString();


                            Log.d("제발 ㅠ",""+item.getDataset().getData().get(0).getUserNm());
                            Log.d("제발 ㅠ",""+item.getDataset().getData().get(0).getUserCd());

                            tv.setText("성공"+item.dataset.toString());

                        }


                    }

                    @Override
                    public void onFailure(Call<Item> call, Throwable t) {

                    }
                });

            }
        });







    }
}




