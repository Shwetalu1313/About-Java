import code.interf.Rest;
import code.interf.Walking;

import javax.swing.*;

public class Interfacehandler {
    Walking w;
    Rest r;

    public Interfacehandler(Walking w, Rest r) {
        this.w = w;
        this.r = r;
    }

    public void doStd(){
        String kilometer = JOptionPane.showInputDialog("How many kilometers did you run?");
        int intKilometer = Integer.parseInt(kilometer);

        String wp = JOptionPane.showInputDialog("Where did you run?");

        String snore = JOptionPane.showInputDialog("Which type of sound snoring are you?");

        w.walkingKm(intKilometer);
        w.Walkingplace(wp);
        r.snoringSound(snore);
    }
}
