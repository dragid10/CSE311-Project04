/**
 * Code created by: Togiberlin
 * Modifications by: Joel Minton
 * Created the method "createMeat()" which will return a meat for the pizza.
 */
package main.abstract_factory.toppingfactory;

import main.abstract_factory.toppings.meat.Chicken;
import main.abstract_factory.toppings.meat.Meat;
import main.abstract_factory.toppings.pepperoni.Pepperoni;
import main.abstract_factory.toppings.meat.Ham;
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

    Meat createMeat();
}
