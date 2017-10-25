package com.unistudent.app.unistudentappv2;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.unistudent.app.unistudentappv2.adapters.EventAdapter;
import com.unistudent.app.unistudentappv2.models.Event;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EventListActivity extends AppCompatActivity {
    private RecyclerView mRecycleView;
    private RecyclerView.LayoutManager mLayoutManager;
    private List<Event> eventList;
    private EventAdapter eventAdapter;

    String[] names = {"question 1", "question 2", "question 1", "question 2",
            "question 1", "question 2", "question 1", "question 2", "question 1", "question 2"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event_list);

        Toolbar myToolbar = (Toolbar) findViewById(R.id.my_toolbar);
        setSupportActionBar(myToolbar);
        setTitle("Upcoming Event");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        myToolbar.setTitleTextColor(getResources().getColor(R.color.white));
        myToolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(EventListActivity.this, MenuActivity.class));
            }
        });

        mRecycleView = (RecyclerView) findViewById(R.id.recycler_view_event);

        if(mRecycleView != null){
            mRecycleView.setHasFixedSize(true);
        }

        mLayoutManager = new LinearLayoutManager(this);

        mRecycleView.setLayoutManager(mLayoutManager);

        eventList = new ArrayList<>();

        for (int i = 0; i< names.length; i++){
            Date date = new Date();
            Event event = new Event(R.mipmap.pahang, names[i], date);
            this.eventList.add(event);
        }

        eventAdapter = new EventAdapter(eventList);

        mRecycleView.setAdapter(eventAdapter);
        eventAdapter.notifyDataSetChanged();
    }
}