/**
 * Code created by: Togiberlin
 */
package main.abstract_factory.pizza;


import main.abstract_factory.toppingfactory.PizzaToppingFactory;

public class PepperoniPizza extends Pizza {
    PizzaToppingFactory ingredientFactory;

    public PepperoniPizza(PizzaToppingFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    public void prepare() {
        System.out.println("Preparing " + name);
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
        pepperoni = ingredientFactory.createPepperoni();
    }
}
