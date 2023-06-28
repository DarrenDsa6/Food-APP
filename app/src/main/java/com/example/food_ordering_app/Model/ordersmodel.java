package com.example.food_ordering_app.Model;

public class ordersmodel {
    String pizzaname;
    public ordersmodel(){}

    public String getPizzaname() {
        return pizzaname;
    }

    public void setPizzaname(String pizzaname) {
        this.pizzaname = pizzaname;
    }

    public ordersmodel(String pizzaname) {
        this.pizzaname = pizzaname;
    }
}
