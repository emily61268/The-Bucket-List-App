package com.emilypyhuang.thebucketlist;

import androidx.annotation.DrawableRes;

public class BucketListEntry {

    private String heading;
    private String description;
    private int image;
    private float rating;

    public BucketListEntry(String heading, String description, @DrawableRes int image, float rating){
        this.heading = heading;
        this.description = description;
        this.image = image;
        this.rating = rating;
    }

    public void setHeading(String heading){
        this.heading = heading;
    }

    public String getHeading(){
        return heading;
    }

    public void setDescription(String description){
        this.description = description;
    }

    public String getDescription(){
        return description;
    }

    public void setImage(int image){
        this.image = image;
    }

    public int getImage(){
        return image;
    }

    public void setRating(float rating){
        this.rating = rating;
    }

    public float getRating(){
        return rating;
    }


}
