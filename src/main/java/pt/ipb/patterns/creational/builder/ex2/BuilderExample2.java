package pt.ipb.patterns.creational.builder.ex2;

import pt.ipb.patterns.creational.builder.ex2.builders.HawaiianPizzaBuilder;
import pt.ipb.patterns.creational.builder.ex2.builders.PizzaBuilder;
import pt.ipb.patterns.creational.builder.ex2.builders.SpicyPizzaBuilder;

public class BuilderExample2 {
    public static void main(String[] args) {
        Waiter waiter = new Waiter();
        PizzaBuilder hawaiianPizzaBuilder = new HawaiianPizzaBuilder();
        PizzaBuilder spicyPizzaBuilder = new SpicyPizzaBuilder();
        waiter.setPizzaBuilder(hawaiianPizzaBuilder);
        waiter.constructPizza();
        Pizza pizza = waiter.getPizza();
    }
}
