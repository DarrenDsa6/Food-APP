package com.example.food_ordering_app.Model;

public class pizzaordermodel {
    String pizzaname, pizzaprice;

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

    public pizzaordermodel(String pizzaname, String pizzaprice) {
        this.pizzaname = pizzaname;
        this.pizzaprice = pizzaprice;
    }
}
