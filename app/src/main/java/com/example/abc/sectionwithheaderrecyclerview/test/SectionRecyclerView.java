package com.example.abc.sectionwithheaderrecyclerview.test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.abc.sectionwithheaderrecyclerview.ItemRecyclerViewAdapter;
import com.example.abc.sectionwithheaderrecyclerview.R;

public class SectionRecyclerView extends AppCompatActivity {

    RecyclerView mRecyclerView;
    RecyclerView.LayoutManager layoutManager;
    //ItemRecyclerViewAdapter mAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_section_recycler_view);

       /* mRecyclerView = (RecyclerView)findViewById(R.id.recycler_view);
        mRecyclerView.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(getApplicationContext());
        mRecyclerView.setLayoutManager(layoutManager);
        mAdapter = new ItemRecyclerViewAdapter(this,);
        mRecyclerView.setAdapter(mAdapter);*/
    }
}
