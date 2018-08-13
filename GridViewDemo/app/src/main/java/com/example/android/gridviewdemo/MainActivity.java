package com.example.android.gridviewdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;

import com.example.android.gridviewdemo.Adapter.UserAdapter;
import com.example.android.gridviewdemo.Model.User;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity
{

    private ArrayList<User> userList = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setDemoData();

        UserAdapter userAdapter = new UserAdapter(this, R.layout.user_grid_cell, userList);
        GridView gridView = (GridView) findViewById(R.id.gridView);
        gridView.setAdapter(userAdapter);
    }

    private void setDemoData()
    {
        userList.add(new User("Abhinay",R.drawable.joy));
        userList.add(new User("Abhishek",R.drawable.sad));
        userList.add(new User("John",R.drawable.wink));
        userList.add(new User("Alina",R.drawable.laugh));
        userList.add(new User("Ram",R.drawable.love));
        userList.add(new User("Mohit",R.drawable.wink));

        userList.add(new User("Abhinay",R.drawable.joy));
        userList.add(new User("Abhishek",R.drawable.sad));
        userList.add(new User("John",R.drawable.wink));
        userList.add(new User("Alina",R.drawable.laugh));
        userList.add(new User("Ram",R.drawable.love));
        userList.add(new User("Mohit",R.drawable.wink));
    }
}
