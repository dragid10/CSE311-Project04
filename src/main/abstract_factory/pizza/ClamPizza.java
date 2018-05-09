/**
 * Code created by: Togiberlin
 */
package main.abstract_factory.pizza;


import main.abstract_factory.toppingfactory.PizzaToppingFactory;

public class ClamPizza extends Pizza {
    PizzaToppingFactory ingredientFactory;

    public ClamPizza(PizzaToppingFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    public void prepare() {
        System.out.println("Preparing " + name);
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
        clam = ingredientFactory.createClam();
    }
}
