package com.unistudent.app.unistudentappv2.models;

import java.util.Date;
import java.util.List;

/**
 * Created by user on 25/10/2017.
 */

public class ExerciseList {
    private List<ExerciseContent> exerciseContentList;
    private Date dueDate;
    private Date uploadedDate;
    private String name;

    public ExerciseList(List<ExerciseContent> exerciseContentList, Date dueDate, Date uploadedDate, String name) {
        this.exerciseContentList = exerciseContentList;
        this.dueDate = dueDate;
        this.uploadedDate = uploadedDate;
        this.name = name;
    }

    public List<ExerciseContent> getExerciseContent() {
        return exerciseContentList;
    }

    public void setExerciseContent(List<ExerciseContent> exerciseContentList) {
        this.exerciseContentList = exerciseContentList;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public Date getUploadedDate() {
        return uploadedDate;
    }

    public void setUploadedDate(Date uploadedDate) {
        this.uploadedDate = uploadedDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
