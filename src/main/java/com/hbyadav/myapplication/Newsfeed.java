package com.hbyadav.myapplication;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.fragment.app.Fragment;

import java.util.ArrayList;
import java.util.List;


public class Newsfeed<FloatingActionButton, PostPOJO> extends Fragment {
    private ListView postsListView;
    List<PostPOJO> listPost;
    private FloatingActionButton postFAB;


    public Newsfeed(){
        // empty constructor needed
    }


    public void onCreateView(LayoutInflater inflater) {
        ViewGroup container;
        final View fragmentView = inflater.inflate(R.layout.newsfeed,false);

        listPost = new ArrayList<PostPOJO>();
        postsListView = (ListView) fragmentView.findViewById(R.id.postList);


        Object databaseReference = new Object();
        databaseReference.getClass(new ChildEventListener() {


            public Newsfeed newInstance() {

                Bundle args = new Bundle();

                Newsfeed fragment = new Newsfeed();
                fragment.setArguments(args);
                return fragment;

            }
        }
    }
}
