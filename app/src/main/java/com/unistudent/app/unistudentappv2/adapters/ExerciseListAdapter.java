package com.unistudent.app.unistudentappv2.adapters;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.unistudent.app.unistudentappv2.R;
import com.unistudent.app.unistudentappv2.models.ExerciseContent;
import com.unistudent.app.unistudentappv2.models.ExerciseList;

import org.w3c.dom.Text;

import java.util.List;
/**
 * Created by user on 18/10/2017.
 */



public class ExerciseListAdapter extends RecyclerView.Adapter<ExerciseListAdapter.ViewHolder> {
    private List<ExerciseList> exerciseListList;

    public static class ViewHolder extends RecyclerView.ViewHolder{
        public TextView tvExerciseName;
        public TextView tvUploaded;
        public TextView tvDuedate;

        public ViewHolder(View v){
            super(v);
            tvExerciseName = (TextView) v.findViewById(R.id.exercise_name);
            tvUploaded = (TextView) v.findViewById(R.id.exercise_uploaded);
            tvDuedate = (TextView) v.findViewById(R.id.exercise_duedate);
        }
    }

    public ExerciseListAdapter(List<ExerciseList> exerciseListList){this.exerciseListList = exerciseListList;}
    public ExerciseListAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.exercise_card_list, parent, false);
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    public void onBindViewHolder(ExerciseListAdapter.ViewHolder holder, int position){
        ExerciseList exerciseList = exerciseListList.get(position);
        holder.tvDuedate.setText(exerciseList.getDueDate().toString());
        holder.tvUploaded.setText(exerciseList.getUploadedDate().toString());
        holder.tvExerciseName.setText(exerciseList.getName().toString());
    }

    public int getItemCount(){return exerciseListList.size();}
}