import code.interf.Rest;
import code.interf.Walking;

public class AboutInterface implements Walking, Rest {
    public static void main (String[] args) {
        AboutInterface aif = new AboutInterface();
        Interfacehandler ifh = new Interfacehandler(aif,aif);

        ifh.doStd();

    }

    @Override
    public void snoringSound(String sound) {
        System.out.println("This man snore sound like \""+sound+"\"");
    }

    @Override
    public void walkingKm(int kilometer) {
        System.out.println("This man ran km: "+kilometer);
    }

    @Override
    public void Walkingplace(String wp) {
        System.out.println("This man ran the places: "+wp);
    }
}