package cz.uhk.pro2;

import cz.uhk.pro2.models.PizzaMenu;
import cz.uhk.pro2.models.PizzaMenuItem;

public class Main {

    public static void main(String[] args) {

        PizzaMenu menu = new PizzaMenu();

        menu.addItem(new PizzaMenuItem("Cheese", "Delicious with cheese", 150));
        menu.addItem(new PizzaMenuItem("Ham", "Delicious with ham and cheese", 160));

        for (PizzaMenuItem item: menu.getItems()){ // for looping a Pizza from list
            System.out.println(item.toString());

        }
        System.out.print("Last update: " +menu.getLastUpdate());


    }
}
