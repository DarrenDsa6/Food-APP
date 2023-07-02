package com.example.food_ordering_app.Model;

public class drinkmodel {
    int id;
    String drink;
    String price;

    public drinkmodel(int id, String drink, String price) {
        this.id = id;
        this.drink = drink;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDrink() {
        return drink;
    }

    public void setDrink(String drink) {
        this.drink = drink;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
