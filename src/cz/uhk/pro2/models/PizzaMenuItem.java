package cz.uhk.pro2.models;

import java.time.LocalDateTime;

public class PizzaMenuItem {
    private String name;
    private String description;
    private int price;

    public PizzaMenuItem(String name,String description, int price){    //constructor for adding a items

        this.name = name;
       this.description = description;
       this.price = price;
    };
    public void setName(){ //gets and sets
        this.name = name;


    }

    public String getName(){
        return name;

    }

    public void setDescription(){
        this.description = description;


    }
    public String getDescription(){
        return description;


    }

    public void setPrice(){
        this.price = price;


    }
    public int getPrice(){
        return price;


    }
@Override  // for editing the method string
public String toString(){

  return name+ " " + description + " " + price +"CZK";
};



}
