package main.observer;



//TODO create KelvinGUI class
//TODO Add methods in TemperatureModel class

import main.observer.model.TemperatureModel;
import main.observer.observers.CelsiusGUI;
import main.observer.observers.FahrenheitGUI;
import main.observer.observers.GaugeGUI;
import main.observer.observers.SliderGUI;

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
    }
}
