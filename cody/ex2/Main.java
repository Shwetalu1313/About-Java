package cody.ex2;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Circle c = new Circle();
        Rectangle r = new Rectangle();

        String[] shape;
        shape = new String[]{"Circle", "Rectangle"};

        int choice = JOptionPane.showOptionDialog(
                null,
                "Choose one",
                "Shape",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.INFORMATION_MESSAGE,
                null,
                shape,
                shape[0]);

        String[] Unit;
        Unit = new String[]{"Area", "Perimeter"};

        if (choice == 0){

            int Cc = JOptionPane.showOptionDialog(
                    null,
                    "Choose one",
                    "Shape",
                    JOptionPane.YES_NO_OPTION,
                    JOptionPane.INFORMATION_MESSAGE,
                    null,
                    Unit,
                    Unit[0]);
            switch (Cc){
                case 0:
                    System.out.println(c.getArea());
                case 1:
                    System.out.println(c.getPerimeter());
            }
        }

        else {
            int Rc = JOptionPane.showOptionDialog(
                    null,
                    "Choose one",
                    "Shape",
                    JOptionPane.YES_NO_OPTION,
                    JOptionPane.INFORMATION_MESSAGE,
                    null,
                    Unit,
                    Unit[0]);

            switch (Rc){
                case 0:
                    System.out.println(r.getArea());
                case 1:
                    System.out.println(r.getPerimeter());
            }
        }
    }
}
