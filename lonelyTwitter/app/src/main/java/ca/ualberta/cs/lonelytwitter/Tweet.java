package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by bowei2 on 9/14/17.
 */

public abstract class Tweet implements Tweetable {//class name should start will capital letters and attribute name should start with small letter
    private String message;
    private Date date;



    public Tweet(String message){
        this.message=message;   //this will make the instance mesage public
        this.date=new Date();
    }
    public Tweet(String message, Date date){
        this.message = message;
        this.date= date;
    }
    public void setDate(Date date){
        this.date = date;
    }
    public void setMessage(String message) throws TweetToollongException{
        if(message.length() <=140){
            this.message = message;
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
    public abstract Boolean isImportant();
}
