package cody.ex2;

import javax.swing.*;

public class Circle extends AbstractShape{

    @Override
    public double getArea() {
        String radiusS = JOptionPane.showInputDialog("Interst radius for circle area");
        double radius = Double.parseDouble(radiusS);

        return (3.14*(radius*radius));
    }

    @Override
    public double getPerimeter() {
        String radiusS = JOptionPane.showInputDialog("Interst radius for circle perimeter");
        double radius = Double.parseDouble(radiusS);

        return (2*3.14*radius);
    }
}
