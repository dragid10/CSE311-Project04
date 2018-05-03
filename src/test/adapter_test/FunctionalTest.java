package test.adapter_test;


import main.adapter.ThermoAdapter;
import main.adapter.ThermoInterface;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.assertEquals;

public class FunctionalTest {


    @Before
    public void setup() {

    }

    @After
    public void tearDown() {

    }

    @Test(timeout = 100)
    public void TestIfAdapterReturnsExpectedValue() {
        ThermoInterface adapter = new ThermoAdapter();
        Random random = new Random(1);
        double valueIshouldHaveGotFromFahrenheitThermo = random.nextDouble() * 100;
        double tempC = adapter.getTempC();
        double expectedCelsiusTemperature = (valueIshouldHaveGotFromFahrenheitThermo - 32.0) * (5.0 / 9.0);
        assertEquals(expectedCelsiusTemperature, tempC, 0001);

    }


}
