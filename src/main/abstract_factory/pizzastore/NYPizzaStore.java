package main.abstract_factory.pizzastore;


import main.abstract_factory.pizza.*;
import main.abstract_factory.toppingfactory.NYPizzaToppingFactory;
import main.abstract_factory.toppingfactory.PizzaToppingFactory;

public class NYPizzaStore extends PizzaStore {

    protected Pizza createPizza(String item) {
        Pizza pizza = null;
        PizzaToppingFactory ingredientFactory =
                new NYPizzaToppingFactory();

        if (item.equals("cheese")) {

            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("New York Style Cheese Pizza");

        } else if (item.equals("veggie")) {

            pizza = new VeggiePizza(ingredientFactory);
            pizza.setName("New York Style Veggie Pizza");

        } else if (item.equals("clam")) {

            pizza = new ClamPizza(ingredientFactory);
            pizza.setName("New York Style Clam Pizza");

        } else if (item.equals("pepperoni")) {

            pizza = new PepperoniPizza(ingredientFactory);
            pizza.setName("New York Style Pepperoni Pizza");

        } else if (item.equals("meat")) {
            pizza = new MeatPizza(ingredientFactory);
            pizza.setName("New York Style Meat Pizza");
        }
        return pizza;
    }
}
