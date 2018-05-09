package main.adapter;

import main.adapter.thermometers.FahrenheitThermo;

import java.text.DecimalFormat;

public class TemperatureCurve {

    public static void main(String[] args) {

//        Implement ThermoAdapter instead of celsius thermo. Written by Alex
        ThermoInterface thermo = new ThermoAdapter();

        DecimalFormat df = new DecimalFormat("#.#");
        for (int i = 0; i < 5; i++) {
            System.out.println(df.format(thermo.getTempC())); // get the Celsius temp with the adapter
        }

    }

}
