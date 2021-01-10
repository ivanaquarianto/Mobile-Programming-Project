package com.example.ezyfoodyproject;

public class ShowProduct {
    private int picture;
    private String name;
    private int price;


    public ShowProduct(String name, int price, int picture) {
        this.picture = picture;
        this.name = name;
        this.price = price;
    }
    public int getPicture(){return picture;}
    public String getPriceToString(){
        return String.valueOf(this.price);
    }
    public String getName(){
        return name;
    }


}
