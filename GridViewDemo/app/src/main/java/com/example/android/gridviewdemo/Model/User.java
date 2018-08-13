package com.example.android.gridviewdemo.Model;

/**
 * Created by abhi on 13/08/18.
 */

public class User {

    String userName;
    int userImageId;

    public User(String name, int imageId){
        this.userImageId = imageId;
        this.userName = name;
    }

    public String getUserName(){
        return  this.userName;
    }

    public int getUserImageId(){
        return this.userImageId;
    }

}
