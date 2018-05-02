package main.adapter.thermometers;


import main.adapter.ThermoInterface;

public class CelsiusThermo implements ThermoInterface {

    public double getTempC() {
        throw new IllegalStateException("Someone stepped on the Celcius Thermometer. It is not working :(");
    }

}
