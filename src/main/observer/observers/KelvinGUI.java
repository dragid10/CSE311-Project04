package main.observer.observers;

import main.observer.model.TemperatureModel;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Observable;

public class KelvinGUI extends TemperatureGUI {

    public KelvinGUI(TemperatureModel model, Point location) {
        super("Kelvin Temperature", model, location);
        setDisplay("" + model.getK());
        addRaiseTempListener(new RaiseTempListener());
        addLowerTempListener(new LowerTempListener());
        addDisplayListener(new DisplayListener());
    }

    public void update(Observable t, Object o) {
        setDisplay("" + getModel().getK());
    }

    class RaiseTempListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            getModel().setK(getModel().getK() + 1.0);
        }
    }

    class LowerTempListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            getModel().setK(getModel().getK() - 1.0);
        }
    }

    class DisplayListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            double value = getDisplay();
            getModel().setK(value);
        }
    }
}
