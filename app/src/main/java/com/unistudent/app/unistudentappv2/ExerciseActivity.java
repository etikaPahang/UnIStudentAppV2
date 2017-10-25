package com.unistudent.app.unistudentappv2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.unistudent.app.unistudentappv2.adapters.ExerciseAdapter;
import com.unistudent.app.unistudentappv2.models.ExerciseContent;

import java.util.ArrayList;
import java.util.List;

public class ExerciseActivity extends AppCompatActivity {
    private RecyclerView mRecycleView;
    private RecyclerView.LayoutManager mLayoutManager;
    private List<ExerciseContent> exerciseList;
    private ExerciseAdapter exerciseAdapter;

    String[] names = {"question 1", "question 2"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise);
        mRecycleView = (RecyclerView) findViewById(R.id.recycler_view_exercise);

        if(mRecycleView != null){
            mRecycleView.setHasFixedSize(true);
        }

        mLayoutManager = new LinearLayoutManager(this);

        mRecycleView.setLayoutManager(mLayoutManager);

        exerciseList = new ArrayList<>();

        for (int i = 0; i< names.length; i++){
            ExerciseContent album = new ExerciseContent(i+1, names[i], "");
            exerciseList.add(album);
        }

        exerciseAdapter = new ExerciseAdapter(exerciseList);

        mRecycleView.setAdapter(exerciseAdapter);
        exerciseAdapter.notifyDataSetChanged();
    }


}
