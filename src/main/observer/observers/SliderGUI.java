package main.observer.observers;

import de.tum.cs.i1.pse.model.TemperatureModel;

import java.awt.*;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;
import java.util.Observable;
import java.util.Observer;

public class SliderGUI implements Observer {

    private Scrollbar tempControl = new Scrollbar(Scrollbar.HORIZONTAL, 0, 10, -20, 160);
    private TemperatureModel model = null;
    private Frame sliderFrame = new Frame("Celsius");

    public SliderGUI(TemperatureModel m, Point location) {
        m.addObserver(this); // Observe the temperature model
        model = m;
        sliderFrame.add(tempControl);
        tempControl.addAdjustmentListener(new SlideListener());
        sliderFrame.setSize(250, 50);
        sliderFrame.setLocation(location);
        sliderFrame.addWindowListener(new TemperatureGUI.CloseListener());
    }

    public void show() {
        this.sliderFrame.setVisible(true);
    }

    public void update(Observable t, Object o) {
        double temp = ((TemperatureModel) t).getC();
        tempControl.setValue((int) temp); // Move the slider thumb
    }

    class SlideListener implements AdjustmentListener {
        public void adjustmentValueChanged(AdjustmentEvent e) {
            model.setC(tempControl.getValue());
        }
    }
}
