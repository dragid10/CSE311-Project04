package main.abstract_factory.toppingfactory;


import main.abstract_factory.topings.pepperoni.Pepperoni;
import main.abstract_factory.topings.pepperoni.SlicedPepperoni;
import main.abstract_factory.topings.sauce.PlumTomatoSauce;
import main.abstract_factory.topings.sauce.Sauce;
import main.abstract_factory.topings.veggies.BlackOlives;
import main.abstract_factory.topings.veggies.Eggplant;
import main.abstract_factory.topings.veggies.Spinach;
import main.abstract_factory.topings.veggies.Veggies;
import main.abstract_factory.toppings.cheese.Cheese;
import main.abstract_factory.toppings.cheese.MozzarellaCheese;
import main.abstract_factory.toppings.clams.Clams;
import main.abstract_factory.toppings.clams.FrozenClams;
import main.abstract_factory.toppings.dough.Dough;
import main.abstract_factory.toppings.dough.ThickCrustDough;

public class ChicagoPizzaToppingFactory
        implements PizzaToppingFactory {

    public Dough createDough() {
        return new ThickCrustDough();
    }

    public Sauce createSauce() {
        return new PlumTomatoSauce();
    }

    public Cheese createCheese() {
        return new MozzarellaCheese();
    }

    public Veggies[] createVeggies() {
        Veggies veggies[] = {new BlackOlives(), new Spinach(), new Eggplant()};
        return veggies;
    }

    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    public Clams createClam() {
        return new FrozenClams();
    }

}
