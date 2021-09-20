package cz.uhk.pro2.models;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class PizzaMenu {

    private List<PizzaMenuItem> items; // creating a list for getting a description...
    private LocalDateTime lastUpdate;

    public PizzaMenu(){ //initiation a list 2.
        items = new ArrayList<PizzaMenuItem>();
    };

    public List<PizzaMenuItem> getItems() {
        return items;
    }
    public void addItem(PizzaMenuItem item){ //adding an item into the list 1.
        items.add(item);
        lastUpdate = LocalDateTime.now(); //method for adding last update


    }

    public LocalDateTime getLastUpdate() { //get for last update
        return lastUpdate;
    }
}
