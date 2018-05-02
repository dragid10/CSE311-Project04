package main.adapter;

import main.adapter.thermometers.FahrenheitThermo;
import java.text.DecimalFormat;

public class TemperatureCurve {

    public static void main(String[] args) {

        ThermoInterface thermo = new ThermoAdapter();
        //TODO: Replace the implementation of CelsiusThermo() with ThermoAdapter.


        DecimalFormat df = new DecimalFormat("#.#");

        for (int i = 0; i < 5; i++) {
            System.out.println(df.format(thermo.getTempC()));
        }

    }

}
