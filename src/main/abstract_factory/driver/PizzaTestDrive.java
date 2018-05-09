/**
 * Code created by: Togiberlin
 * Modifications by: Joel Minton
 */

package main.abstract_factory.driver;

import main.abstract_factory.pizza.Pizza;
import main.abstract_factory.pizzastore.ChicagoPizzaStore;
import main.abstract_factory.pizzastore.NYPizzaStore;
import main.abstract_factory.pizzastore.PizzaStore;

public class PizzaTestDrive {

    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("Ethan ordered a " + pizza + "\n");

        pizza = chicagoStore.orderPizza("cheese");
        System.out.println("Joel ordered a " + pizza + "\n");

        pizza = nyStore.orderPizza("clam");
        System.out.println("Ethan ordered a " + pizza + "\n");

        pizza = chicagoStore.orderPizza("clam");
        System.out.println("Joel ordered a " + pizza + "\n");

        pizza = nyStore.orderPizza("pepperoni");
        System.out.println("Ethan ordered a " + pizza + "\n");

        pizza = chicagoStore.orderPizza("pepperoni");
        System.out.println("Joel ordered a " + pizza + "\n");

        pizza = nyStore.orderPizza("veggie");
        System.out.println("Ethan ordered a " + pizza + "\n");

        pizza = chicagoStore.orderPizza("veggie");
        System.out.println("Joel ordered a " + pizza + "\n");

        /*
        Will specify that the ordered pizza is a meat pizza at the New York and
        Chicago pizza stores.
         */
        pizza = nyStore.orderPizza("meat");
        System.out.println("Ethan ordered a " + pizza + "\n");

        pizza = chicagoStore.orderPizza("meat");
        System.out.println("Joel ordered a " + pizza + "\n");
    }
}
