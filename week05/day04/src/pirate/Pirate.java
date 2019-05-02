package pirate;

public class Pirate {

    private String name;
    private double gold;
    private int healthPoints;
    private int amoutGold;
    private boolean isCaptain;
    private boolean party;
    private boolean hasWoodenLeg;


    public Pirate() {
        this.amoutGold = 10;
        this.healthPoints = 10;

    }

    public Pirate(String name, double gold, int healthPoints, int amoutGold, boolean isCaptain, boolean party, boolean hasWoodenLeg) {
        this.name = name;
        this.gold = gold;
        this.healthPoints = healthPoints;
        this.amoutGold = amoutGold;
        this.isCaptain = isCaptain;
        this.party = party;
        this.hasWoodenLeg = hasWoodenLeg;
    }

    public boolean isCaptain() {
        return isCaptain == true;
    }



    public void work() {
        if (isCaptain == true) {
            amoutGold = amoutGold + 10;
            healthPoints = healthPoints - 5;
        } else {
            amoutGold = amoutGold + 1;
            healthPoints = healthPoints - 1;
        }

    }

    public void isParty() {
        if (isCaptain == true) {
            healthPoints = healthPoints + 10;

        } else {
            healthPoints = healthPoints + 1;
        }

    }

    // - `toString()` method:
// - if the pirate has a wooden leg, then the string that is returned by the function must look like this:
//    - Hello, I'm Jack. I have a wooden leg and 20 golds.
// -  If not:
//    - Hello, I'm Jack. I still have my real legs and 20 golds.

    @Override
    public String toString() {

        if (hasWoodenLeg == true){
            return "Hello,I'm " + name + ". I have a wooden leg and" + amoutGold + "golds.";
        }else {
           return  "Hello, I'm " + name + ". I still have my real legs and " + amoutGold + "golds.";

        }
    }

    public boolean isHasWoodenLeg() {
        return hasWoodenLeg;
    }

    public int getAmoutGold() {
        return amoutGold;
    }

    public String getName() {
        return name;
    }

}


//## Pirates
//
//Write a program which can store pirates in a ship.
//
//### Pirate
//
// - A pirate has a name, an amount of gold and health points, the default value of which is 10.
// - A pirate might be a captain and may have a wooden leg.
// - You must create the following methods:
//
// - if a pirate is a captain:
//    - `work()` which increases the amount of gold possessed by that pirate by 10 and decrease the HP by 5.
//    - `party()` which increases the HP by 10.
// - if the pirate is not a captain:
//    - `work()` which increases the amount of gold by 1 and decreases the HP by 1.
//    - `party()` which increases the HP by 1.
//
// - `toString()` method:
// - if the pirate has a wooden leg, then the string that is returned by the function must look like this:
//    - Hello, I'm Jack. I have a wooden leg and 20 golds.
// -  If not:
//    - Hello, I'm Jack. I still have my real legs and 20 golds.
//
//### Ship
//
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



