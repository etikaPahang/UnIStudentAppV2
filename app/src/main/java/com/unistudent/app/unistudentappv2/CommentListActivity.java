package com.unistudent.app.unistudentappv2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.unistudent.app.unistudentappv2.adapters.CommentListAdapter;
import com.unistudent.app.unistudentappv2.models.Comment;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CommentListActivity extends AppCompatActivity {
    private RecyclerView mRecycleView;
    private RecyclerView.LayoutManager mLayoutManager;
    private List<Comment> commentList;
    private CommentListAdapter commentListAdapter;
    private TextView tvNoListText;

    String[] comments = {};
    String[] teachers = {};
    Date[] dates = {};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comment_list);
        mRecycleView = (RecyclerView) findViewById(R.id.recycler_view_comment);
        tvNoListText = (TextView) findViewById(R.id.text_keterangan_tidak_ada_comment);
        Toolbar myToolbar = (Toolbar) findViewById(R.id.my_toolbar);
        setSupportActionBar(myToolbar);
        setTitle("Comment");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        myToolbar.setTitleTextColor(getResources().getColor(R.color.white));
        myToolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(CommentListActivity.this, MenuActivity.class));
            }
        });

        if(comments.length>0) {
            if (mRecycleView != null) {
                mRecycleView.setHasFixedSize(true);
            }

            mLayoutManager = new LinearLayoutManager(this);

            mRecycleView.setLayoutManager(mLayoutManager);

            commentList = new ArrayList<>();


            for (int i = 0; i < comments.length; i++) {
                Comment comment = new Comment(teachers[i], dates[i], comments[i]);
                this.commentList.add(comment);
            }

            commentListAdapter = new CommentListAdapter(commentList);

            mRecycleView.setAdapter(commentListAdapter);
            commentListAdapter.notifyDataSetChanged();
        }else{
            tvNoListText.setText("There is no comment yet.");
        }
    }
}