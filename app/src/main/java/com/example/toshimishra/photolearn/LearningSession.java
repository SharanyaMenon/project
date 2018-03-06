package com.example.toshimishra.photolearn;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by toshimishra on 06/03/18.
 */

public class LearningSession {

    String ID;
    String userID;
    Date courseDate;
    String courseCode;
    Integer moduleNumber;

    ArrayList<LearningTitle> learningTitles;
    ArrayList<QuizTitle> quizTitles;

    public LearningSession(String userID, String title, Date date, Integer moduleNumber, String courseCode) {
        this.ID = userID + courseCode + moduleNumber.toString();
        this.userID = userID;
        this.courseDate = date;
        this.courseCode = courseCode;
        this.moduleNumber = moduleNumber;
    }

    public void deleteSession() {
        //Using polymorphism here
        for (LearningTitle x : learningTitles) {
            x.deleteTitle();
        }
        for (QuizTitle x : quizTitles) {
            x.deleteTitle();
        }
        //TODO Update DB
    }
}
