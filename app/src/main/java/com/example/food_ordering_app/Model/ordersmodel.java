package com.example.food_ordering_app.Model;

public class ordersmodel {
    String pizzaname, pizzaprice;
    public ordersmodel(){}

    public String getPizzaname() {
        return pizzaname;
    }

    public void setPizzaname(String pizzaname) {
        this.pizzaname = pizzaname;
    }

    public String getPizzaprice() {
        return pizzaprice;
    }

    public void setPizzaprice(String pizzaprice) {
        this.pizzaprice = pizzaprice;
    }

    public ordersmodel(String pizzaname, String pizzaprice) {
        this.pizzaname = pizzaname;
        this.pizzaprice = pizzaprice;
    }
}
