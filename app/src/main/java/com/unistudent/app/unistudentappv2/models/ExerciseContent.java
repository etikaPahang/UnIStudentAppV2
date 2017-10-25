package com.unistudent.app.unistudentappv2.models;

import java.util.Date;

/**
 * Created by user on 18/10/2017.
 */

public class ExerciseContent {
    private int number;
    private String question;
    private String answer;
    private Date dueDate;
    private Date uploadedDate;
    private String name;

    public ExerciseContent(int number, String question, String answer){
        this.number = number;
        this.question = question;
        this.answer = answer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }
}
