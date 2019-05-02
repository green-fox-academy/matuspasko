package pirate;

import java.time.Period;

public class main {
    public static void main(String[] args) {


        Pirate jack = new Pirate();
        Pirate captain = new Pirate( "Dan", 30, 10, 10, true,false,false);
        Pirate withoutLeg = new Pirate("Tanos", 3, 3, 7, true, true, true);
        Ship perla = new Ship();

        perla.addPirate(captain);

        System.out.println(jack);
        System.out.println(captain);
        System.out.println(withoutLeg);

    }
}
