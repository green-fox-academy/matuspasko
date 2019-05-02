package pirate;
import java.util.ArrayList;
import java.util.List;

public class Ship {

    private List<Pirate> pirates = new ArrayList<>();

    public void addPirate(Pirate pirate) {
        pirates.add(pirate);
    }


    public List<String> getPoorPirates(Pirate poorPirates) {
        ArrayList<String> pirateWithWoodenLeg = new ArrayList<>();
        for (Pirate poorPirate : pirates) {
            if (poorPirate.isHasWoodenLeg() && 15 < poorPirate.getAmoutGold()) {
                pirateWithWoodenLeg.add(poorPirate.getName());

            }
        }
        return pirateWithWoodenLeg;

    }

    public int getGolds() {
        int sum;
        sum = 0;
        for (Pirate goldOfPritares : pirates) {
            sum = sum + goldOfPritares.getAmoutGold();
        }
        return sum;
    }

    public void lastDayOnTheShip() {

        for (Pirate pirate : pirates) {
            pirate.isParty();

        }
    }
    public void prepareForBattle(){
        for (int i = 0 ; i < 5; i++) {
            for (Pirate pirate : pirates) {
                pirate.work();
            }
        }
        lastDayOnTheShip();





    }


}






// - It should have a list of pirates.
// - You must be able to add new pirates to the ship. It must have only one captain!
// - You must create the following methods:
// - `getPoorPirates()` which returns a list of names containing the pirates that
//    - have a wooden leg and have less than 15 golds
// - `getGolds()` which returns the sum of gold owned by the pirates of that particular ship
// - `lastDayOnTheShip()` which calls the pirates' `party()` method.
// - `prepareForBattle()` which calls
//    - the pirates' `work()` method 5 times
//    - then the ship's `lastDayOnTheShip()` method.
