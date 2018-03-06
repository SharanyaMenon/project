package com.example.toshimishra.photolearn;
import java.util.*;
/**
 * Created by toshimishra on 06/03/18.
 */

public class Trainer extends User{
    private ArrayList<LearningSession> sessions;
    public void createLearningSession(String title,Date date,Integer moduleNumber, String courseCode){
        LearningSession s = new LearningSession(this.getUserID(),title,date,moduleNumber,courseCode);
        sessions.add(s);
        //TODO : Update DB
    }

    public void deleteLearningSession(int index){
        sessions.get(index).deleteSession();
        sessions.remove(index);
        //TODO : Update DB

    }

    public void createQuizTitle(String Title){}
}
