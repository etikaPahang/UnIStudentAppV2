package com.unistudent.app.unistudentappv2.adapters;

/**
 * Created by user on 18/10/2017.
 */

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.unistudent.app.unistudentappv2.R;
import com.unistudent.app.unistudentappv2.models.Comment;
import java.util.List;
public class CommentListAdapter extends RecyclerView.Adapter<CommentListAdapter.ViewHolder> {
    private List<Comment> commentList;

    public static class ViewHolder extends RecyclerView.ViewHolder{
        public TextView tvTeacherName;
        public TextView tvDate;

        public ViewHolder(View v){
            super(v);
            tvDate  = (TextView) v.findViewById(R.id.tanggal_comment_card);
            tvTeacherName = (TextView) v.findViewById(R.id.nama_guru_comment_card);
        }
    }

    public CommentListAdapter(List<Comment> comment){this.commentList = comment;}

    public CommentListAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.comment_card, parent, false);
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    public void onBindViewHolder(CommentListAdapter.ViewHolder holder, int position){
        Comment comment = this.commentList.get(position);
        holder.tvTeacherName.setText(comment.getTeacherName());
        holder.tvDate.setText(comment.getCommentDate().toString());
    }

    public int getItemCount(){return commentList.size();}
}
