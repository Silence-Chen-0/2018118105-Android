package com.example.materialtest;

public class Fruit {

    private String name;

    private int imageId;

    //private String text;

    public Fruit(String name, int imageId) {
        this.name = name;
        this.imageId = imageId;
     //   this.text = text;
    }

    public String getName() {
        return name;
    }

    public int getImageId() {
        return imageId;
    }

    //public String getText() { return text; }

}