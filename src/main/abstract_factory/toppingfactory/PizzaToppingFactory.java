package main.abstract_factory.toppingfactory;


import main.abstract_factory.toppings.pepperoni.Pepperoni;
import main.abstract_factory.toppings.sauce.Sauce;
import main.abstract_factory.toppings.veggies.Veggies;
import main.abstract_factory.toppings.cheese.Cheese;
import main.abstract_factory.toppings.clams.Clams;
import main.abstract_factory.toppings.dough.Dough;

public interface PizzaToppingFactory {

    Dough createDough();

    Sauce createSauce();

    Cheese createCheese();

    Veggies[] createVeggies();

    Pepperoni createPepperoni();

    Clams createClam();
    //TODO: Extend the PizzaToppingFactory with a method to create a meat topping
}
