package com.unistudent.app.unistudentappv2.adapters;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import com.unistudent.app.unistudentappv2.R;
import com.unistudent.app.unistudentappv2.models.Exercise;
import java.util.List;
/**
 * Created by user on 18/10/2017.
 */



public class ExerciseAdapter extends RecyclerView.Adapter<ExerciseAdapter.ViewHolder> {
    private List<Exercise> exerciseList;

    public static class ViewHolder extends RecyclerView.ViewHolder{
        public TextView tvNumber;
        public TextView tvQuestion;
        public EditText etAnswer;

        public ViewHolder(View v){
            super(v);
            tvNumber = (TextView) v.findViewById(R.id.number_exercise);
            tvQuestion = (TextView) v.findViewById(R.id.question_exercise);
            etAnswer  = (EditText) v.findViewById(R.id.answer_exercise);
        }
    }

    public ExerciseAdapter (List<Exercise> exerciseList){this.exerciseList = exerciseList;}

    public ExerciseAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.exercise_card, parent, false);
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    public void onBindViewHolder(ExerciseAdapter.ViewHolder holder, int position){
        Exercise exercise = exerciseList.get(position);
        holder.tvNumber.setText(String.valueOf(exercise.getNumber()));
        holder.tvQuestion.setText(exercise.getQuestion());
        holder.etAnswer.setText(exercise.getAnswer());
    }

    public int getItemCount(){return exerciseList.size();}
}