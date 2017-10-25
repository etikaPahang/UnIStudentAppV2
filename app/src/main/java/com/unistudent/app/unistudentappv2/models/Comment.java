package com.unistudent.app.unistudentappv2.models;

import java.util.Date;

/**
 * Created by user on 18/10/2017.
 */

public class Comment {
    private String teacherName;
    private Date commentDate;
    private String text;

    public Comment(String teacherName, Date commentDate, String text) {
        this.teacherName = teacherName;
        this.commentDate = commentDate;
        this.text = text;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public Date getCommentDate() {
        return commentDate;
    }

    public void setCommentDate(Date commentDate) {
        this.commentDate = commentDate;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
