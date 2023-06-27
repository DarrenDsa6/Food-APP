package com.example.food_ordering_app.Model;

public class ordersmodel {
    String pizzaname, price;

    public String getPizzaname() {
        return pizzaname;
    }

    public void setPizzaname(String pizzaname) {
        this.pizzaname = pizzaname;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public ordersmodel(String pizzaname, String price) {
        this.pizzaname = pizzaname;
        this.price = price;
    }
}
