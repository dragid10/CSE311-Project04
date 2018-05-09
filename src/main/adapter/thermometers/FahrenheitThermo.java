package main.adapter.thermometers;

import java.util.Random;

/**
 * Pre-written by repo maintainer
 */
public class FahrenheitThermo {


    public double getFarenheitTemperature() {
        Random random = new Random(1);
        return random.nextDouble() * 100;
    }


}
