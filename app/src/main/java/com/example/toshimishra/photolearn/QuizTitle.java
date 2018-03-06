package com.example.toshimishra.photolearn;

/**
 * Created by toshimishra on 06/03/18.
 */

public class QuizTitle extends Title {

    public  QuizTitle(String userID,String title,Integer sessionID){
        super(userID,title,sessionID);
    }

    public void addQuizItem(String titleID,String photoURL, String options[],boolean isOptionAns[],String ansExp){
        QuizItem i = new QuizItem(titleID,photoURL,options,isOptionAns,ansExp);
        addItem(i);
        //TODO UPdate DB
    }
    @Override
    public  void deleteTitle(){
// TODO overrinding for only permissions?????
    }
}
