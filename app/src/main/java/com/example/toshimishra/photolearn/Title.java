package com.example.toshimishra.photolearn;

import  java.util.*;
/**
 * Created by toshimishra on 06/03/18.
 */

public abstract  class Title {
    Integer ID;
    String userID;
    String title;
    Integer sessionID;
    Date timeStamp;
    ArrayList <Item> Items;

    public  Title(String userID,String title,Integer sessionID){
        this.userID = userID;
        this.title = title;
        this.sessionID = sessionID;
        // TODO : set timestamp and ID
    }
    public abstract void deleteTitle();
    public void addItem(Item i){
        Items.add(i);
    }

}
