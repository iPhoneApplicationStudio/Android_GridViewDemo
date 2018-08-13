package com.example.android.gridviewdemo.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.android.gridviewdemo.Model.User;
import com.example.android.gridviewdemo.R;

import java.util.ArrayList;

/**
 * Created by abhi on 13/08/18.
 */

public class UserAdapter extends ArrayAdapter
{
    ArrayList<User> userList = new ArrayList<>();

    public UserAdapter(Context context, int resource, ArrayList<User> userList){
        super(context, resource, userList);
        this.userList = userList;
    }

    //We have to override 2 methods
    @Override
    public int getCount(){
        return super.getCount();
    }

    public View getView(int position, View convertView, ViewGroup parent)
    {
        View v = convertView;
        LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        v = inflater.inflate(R.layout.user_grid_cell, null);
        TextView textView = (TextView) v.findViewById(R.id.text_name);
        ImageView imageView = (ImageView) v.findViewById(R.id.image_user);
        textView.setText(userList.get(position).getUserName());
        imageView.setImageResource(userList.get(position).getUserImageId());

        return v;

    }

}
