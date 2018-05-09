/**
 * Code created by: Togiberlin
 */
package test.abstract_factory_test.pizza;


import main.abstract_factory.pizzastore.ChicagoPizzaStore;
import main.abstract_factory.pizzastore.NYPizzaStore;
import main.abstract_factory.pizzastore.PizzaStore;
import main.abstract_factory.toppings.cheese.MozzarellaCheese;
import main.abstract_factory.toppings.cheese.ReggianoCheese;
import main.abstract_factory.toppings.meat.Chicken;
import main.abstract_factory.toppings.meat.Ham;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class FunctionalTest {

    PizzaStore nyPizzaStore;
    PizzaStore chicagoPizzaStore;

    @Before
    public void setUp() {
        this.nyPizzaStore = new NYPizzaStore();
        this.chicagoPizzaStore = new ChicagoPizzaStore();
    }


    @Test(timeout = 100)
    public void testMeatForMeatPizzaInNY() {
        assertTrue("People from New York expect their Pizza with Ham - That is not the case here.", nyPizzaStore.orderPizza("meat").meat instanceof Ham);
    }

    @Test(timeout = 100)
    public void testMeatForMeatPizzaInChicago() {
        assertTrue("People from Chicago expect their Pizza with Chicken - That is not the case here.", chicagoPizzaStore.orderPizza("meat").meat instanceof Chicken);
    }

    @Test(timeout = 100)
    public void testCheeseForCheesePizzaINY() {
        assertTrue("People from New York expect their Pizza with ReggianoCheese - That is not the case here.", nyPizzaStore.orderPizza("cheese").cheese instanceof ReggianoCheese);
    }

    @Test(timeout = 100)
    public void testCheeseForCheesePizzaInChicago() {
        assertTrue("People from Chicago expect their Pizza with MozzarellaCheese - That is not the case here.", chicagoPizzaStore.orderPizza("cheese").cheese instanceof MozzarellaCheese);
    }
}
