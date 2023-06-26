package com.example.food_ordering_app.Model;

public class ordersmodel {
    int id;
    String pizzaname;

    public ordersmodel(int id, String pizzaname) {
        this.id = id;
        this.pizzaname = pizzaname;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPizzaname() {
        return pizzaname;
    }

    public void setPizzaname(String pizzaname) {
        this.pizzaname = pizzaname;
    }
}
