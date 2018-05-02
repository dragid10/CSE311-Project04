package main.abstract_factory.toppingfactory;


import main.abstract_factory.toppings.meat.Meat;
import main.abstract_factory.toppings.pepperoni.Pepperoni;
import main.abstract_factory.toppings.pepperoni.SlicedPepperoni;
import main.abstract_factory.toppings.sauce.MarinaraSauce;
import main.abstract_factory.toppings.sauce.Sauce;
import main.abstract_factory.toppings.veggies.*;
import main.abstract_factory.toppings.cheese.Cheese;
import main.abstract_factory.toppings.cheese.ReggianoCheese;
import main.abstract_factory.toppings.clams.Clams;
import main.abstract_factory.toppings.clams.FreshClams;
import main.abstract_factory.toppings.dough.Dough;
import main.abstract_factory.toppings.dough.ThinCrustDough;

public class NYPizzaToppingFactory implements PizzaToppingFactory {

    public Dough createDough() {
        return new ThinCrustDough();
    }

    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    public Veggies[] createVeggies() {
        Veggies veggies[] = {new Garlic(), new Onion(), new Mushroom(), new RedPepper()};
        return veggies;
    }

    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    public Clams createClam() {
        return new FreshClams();
    }

    public Meat createMeat() { return null; }

}
