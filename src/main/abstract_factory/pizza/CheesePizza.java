package main.abstract_factory.pizza;


import main.abstract_factory.toppingfactory.PizzaToppingFactory;

public class CheesePizza extends Pizza {
    PizzaToppingFactory ingredientFactory;

    public CheesePizza(PizzaToppingFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    public void prepare() {
        System.out.println("Preparing " + name);
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
    }
}
