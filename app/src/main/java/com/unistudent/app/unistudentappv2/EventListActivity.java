package com.unistudent.app.unistudentappv2;

import android.content.Intent;
import android.media.Image;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

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
    private TextView tvNoListText;

    private Image[] images = {};
    private String[] names = {};
    private Date[] dates = {};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event_list);
        tvNoListText = (TextView) findViewById(R.id.text_keterangan_tidak_ada_event);
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

        if(names.length>0) {
            if (mRecycleView != null) {
                mRecycleView.setHasFixedSize(true);
            }

            mLayoutManager = new LinearLayoutManager(this);

            mRecycleView.setLayoutManager(mLayoutManager);

            eventList = new ArrayList<>();

            for (int i = 0; i < names.length; i++) {
                Event event = new Event(images[i], names[i], dates[i]);
                this.eventList.add(event);
            }

            eventAdapter = new EventAdapter(eventList);

            mRecycleView.setAdapter(eventAdapter);
            eventAdapter.notifyDataSetChanged();
        }else{
            tvNoListText.setText("There is no upcoming event yet");
        }
    }
}