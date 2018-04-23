package main.abstract_factory.pizzastore;


import main.abstract_factory.pizza.*;
import main.abstract_factory.toppingfactory.ChicagoPizzaToppingFactory;
import main.abstract_factory.toppingfactory.PizzaToppingFactory;

public class ChicagoPizzaStore extends PizzaStore {

    protected Pizza createPizza(String item) {
        Pizza pizza = null;
        PizzaToppingFactory ingredientFactory =
                new ChicagoPizzaToppingFactory();

        if (item.equals("cheese")) {

            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("Chicago Style Cheese Pizza");

        } else if (item.equals("veggie")) {

            pizza = new VeggiePizza(ingredientFactory);
            pizza.setName("Chicago Style Veggie Pizza");

        } else if (item.equals("clam")) {

            pizza = new ClamPizza(ingredientFactory);
            pizza.setName("Chicago Style Clam Pizza");

        } else if (item.equals("pepperoni")) {

            pizza = new PepperoniPizza(ingredientFactory);
            pizza.setName("Chicago Style Pepperoni Pizza");

        }
        //TODO: Create pizzas of type meat here and give them an appropriate name
        return pizza;
    }
}
