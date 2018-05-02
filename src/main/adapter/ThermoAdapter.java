package main.adapter;

import main.adapter.thermometers.FahrenheitThermo;

public class ThermoAdapter implements ThermoInterface {

    @Override
    public double getTempC() {
        return (new FahrenheitThermo().getFarenheitTemperature() - 32.0) * (5.0 / 9.0);
    }
}
