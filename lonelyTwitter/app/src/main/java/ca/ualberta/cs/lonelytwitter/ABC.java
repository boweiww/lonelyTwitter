package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by bowei2 on 9/14/17.
 */

public abstract class ABC {

    private String message;
    private Date date;
    private String info;


    public ABC(String message) {
        this.message = message;   //this will make the instance mesage public
        this.date = new Date();
    }
    public ABC(String info){
        this.info=info;

    }

    public ABC(String message, Date date) {
        this.message = message;
        this.date = date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
    public void setInfo(String info) throws TweetToollongException{
        if(info.length() <=300){
            this.info = info;
        }
        else{
            throw new TweetToollongException();
        }
    }



    public Date getDate(){  //access return type; name;
        return date;
    }
    public String getMessage(){
        return message;
    }
    public String info(){return info;}
    public abstract Boolean isImportant();
}