package com.example.toshimishra.photolearn;

/**
 * Created by toshimishra on 06/03/18.
 */

public class LearningItem extends Item {

    String userID;
    String photoDesc;
    String GPS;
    public LearningItem(String titleID,String photoURL,String photoDesc, String GPS,String userID){
        super(titleID,photoURL);
        this.photoDesc = photoDesc;
        this.GPS = GPS;
        this.userID = userID;
    }
    public void updateLearingItem(String photoDesc,String photoURL){
        super.update(photoURL);
        this.photoDesc = photoDesc;
        //todo UPDATE DB
    }
    @Override
    public  void delete(){
        //TODO update DB
    }

}
