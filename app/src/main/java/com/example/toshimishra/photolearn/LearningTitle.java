package com.example.toshimishra.photolearn;

import java.util.*;

/**
 * Created by toshimishra on 06/03/18.
 */

public class LearningTitle extends Title {


    public  LearningTitle(String userID,String title,Integer sessionID){
        super(userID,title,sessionID);
    }
    public void addLearningItem(String titleID,String photoURL,String photoDesc, String GPS){
        LearningItem l = new LearningItem(titleID,photoURL,photoDesc,GPS,this.userID);
        addItem(l);
        //TODO update DB
    }
    @Override
    public  void deleteTitle(){

    }
}
