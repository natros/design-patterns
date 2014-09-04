package pt.ipb.patterns.creational.builder.ex2.builders;

import pt.ipb.patterns.creational.builder.ex2.Pizza;

public abstract class PizzaBuilder {
    protected Pizza pizza;

    public Pizza getPizza() {
        return pizza;
    }

    public void createNewPizzaProduct() {
        pizza = new Pizza();
    }

    public abstract void buildDough();

    public abstract void buildSauce();

    public abstract void buildTopping();
}
