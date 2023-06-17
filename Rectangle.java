package cody.ex2;

import javax.swing.*;

public class Rectangle extends AbstractShape{
    @Override
    public double getArea() {
        String widthS = JOptionPane.showInputDialog("Type width for rectangle area");
        double width = Double.parseDouble(widthS);

        String heighS = JOptionPane.showInputDialog("Type height for rectangle area");
        double heigh = Double.parseDouble(heighS);

        return width*heigh;
    }

    @Override
    public double getPerimeter() {
        String widthS = JOptionPane.showInputDialog("Type width for rectangle perimeter");
        double width = Double.parseDouble(widthS);

        String heighS = JOptionPane.showInputDialog("Type height for rectangle perimeter");
        double heigh = Double.parseDouble(heighS);

        double result = 2*(width+heigh);

        return result;
    }
}
