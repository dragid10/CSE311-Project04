package main.observer;

import main.observer.model.TemperatureModel;
import main.observer.observers.*;

import java.awt.*;

public class TemperatureConverter {

    public static void main(String args[]) {
        TemperatureModel temperature = new TemperatureModel();

        FahrenheitGUI fahrenheitGUI = new FahrenheitGUI(temperature, new Point(100, 100));
        fahrenheitGUI.show();

        CelsiusGUI celsiusGUI = new CelsiusGUI(temperature, new Point(100, 250));
        celsiusGUI.show();

        SliderGUI sliderGUI = new SliderGUI(temperature, new Point(20, 100));
        sliderGUI.show();

        GaugeGUI gaugeGUI = new GaugeGUI(temperature, new Point(200, 200));
        gaugeGUI.setVisible(true);

        //TODO: instantiate the Kelvin view

        KelvinGUI kelvinGUI = new KelvinGUI(temperature, new Point(100, 200));
        kelvinGUI.show();
    }
}