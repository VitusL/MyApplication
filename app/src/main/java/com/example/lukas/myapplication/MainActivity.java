package com.example.lukas.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private List<Data> myData;

    private void initializeData(){
        myData = new ArrayList<>();
        myData.add(new Data(0,21));
        myData.add(new Data(0,22));
        myData.add(new Data(0,23));
        myData.add(new Data(0,24));
        myData.add(new Data(1,"Erste Überschrift","erster Text erster Text erster Text erster Text erster Text erster Text erster Text "));
        myData.add(new Data(1,"Erste Überschrift","erster Text erster Text erster Text erster Text erster Text erster Text erster Text "));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initializeData();

        //Obtaining the RecyclerView
        RecyclerView rv = (RecyclerView)findViewById(R.id.rv_id);
        rv.setHasFixedSize(true);

        //Setting up the LayoutManager
        LinearLayoutManager llm = new LinearLayoutManager(this);
        rv.setLayoutManager(llm);

        rvAdapter adapter = new rvAdapter(myData);
        rv.setAdapter(adapter);

    }

}

