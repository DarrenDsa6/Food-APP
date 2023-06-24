package com.example.food_ordering_app.Model;

public class pizzamodel {
    int id;
    String pizza;
    String price;

    public pizzamodel(int id, String pizza, String price) {
        this.id = id;
        this.pizza = pizza;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPizza() {
        return pizza;
    }

    public void setPizza(String pizza) {
        this.pizza = pizza;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}