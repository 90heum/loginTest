package com.example.logintest;



import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class Item {

    @SerializedName("dataset")
    dataset dataset;


    public class Info{

    }

    public class dataset{
        public List<data> data = new ArrayList<>();
        public List<data> getData() {return data;}


        public class data{
            @SerializedName("userNm")
            public String userNm;
            @SerializedName("userCd")
            public String userCd;
            @SerializedName("userTy")
            public String userTy;
            @SerializedName("cmpnyTy")
            public String cmpnyTy;
            @SerializedName("cmpnyNm")
            public String cmpnyNm;
            @SerializedName("cldrViewTy")
            public String cldrViewTy;
            @SerializedName("accessToken")
            public String accessToken;
            @SerializedName("refreshToken")
            public String refreshToken;



            public String getUserNm() {
                return userNm;
            }
            public void setUserNm(String userNm){
                this.userNm = userNm;
            }


            public String getUserCd() {
                return userCd;
            }
            public void setUserCd(String userCd){
                this.userCd = userCd;
            }
        }


    }


    public dataset getDataset() {
        return dataset;
    }


/*


    public String getUserCd() {
        return userCd;
    }
    public void setUserCd(String userCd){
        this.userCd = userCd;
    }

    public String getUserNm(){
        return userNm;
    }
    public void setUserNm(String userNm){
        this.userNm= userNm;
    }
*/

  /*  public  String toString(){
        return "과연머가올까?"+userCd+userNm;

    }
*/




 /*   public Item(String userId, String userPwd) {
        this.userId = userId;
        this.userPwd = userPwd;

    }
*/

}
