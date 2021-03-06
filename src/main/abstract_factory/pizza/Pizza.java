/**
 * Code created by: Togiberlin
 */
package main.abstract_factory.pizza;

import main.abstract_factory.toppings.meat.Chicken;
import main.abstract_factory.toppings.meat.Ham;
import main.abstract_factory.toppings.meat.Meat;
import main.abstract_factory.toppings.pepperoni.Pepperoni;
import main.abstract_factory.toppings.sauce.Sauce;
import main.abstract_factory.toppings.veggies.Veggies;
import main.abstract_factory.toppings.cheese.Cheese;
import main.abstract_factory.toppings.clams.Clams;
import main.abstract_factory.toppings.dough.Dough;

public abstract class Pizza {
    String name;

    Dough dough;
    Sauce sauce;
    Veggies veggies[];
    public Cheese cheese;
    Pepperoni pepperoni;
    Clams clam;
    public Meat meat;
    public Ham ham;
    public Chicken chicken;

    public abstract void prepare();

    public void bake() {
        System.out.println("Bake for 25 minutes at 350");
    }

    public void cut() {
        System.out.println("Cutting the pizza into diagonal slices");
    }

    public void box() {
        System.out.println("Place pizza in official PizzaStore box");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        StringBuffer result = new StringBuffer();
        result.append("---- " + name + " ----\n");
        if (dough != null) {
            result.append(dough);
            result.append("\n");
        }
        if (sauce != null) {
            result.append(sauce);
            result.append("\n");
        }
        if (cheese != null) {
            result.append(cheese);
            result.append("\n");
        }
        if (veggies != null) {
            for (int i = 0; i < veggies.length; i++) {
                result.append(veggies[i]);
                if (i < veggies.length - 1) {
                    result.append(", ");
                }
            }
            result.append("\n");
        }
        if (meat != null) {
           result.append(meat);
           result.append("\n");
        }
        if (clam != null) {
            result.append(clam);
            result.append("\n");
        }
        if (pepperoni != null) {
            result.append(pepperoni);
            result.append("\n");
        }
        if (ham != null) {
            result.append(ham);
            result.append("\n");
        }
        if (chicken != null) {
            result.append(chicken);
            result.append("\n");
        }
        return result.toString();
    }
}
