package pirates;

public class Pirate {
    int timeDrinkSome = 4;

    public void howsitGoingMate() {
        if (timeDrinkSome <= 4) {
            System.out.println("Pour me anudder!");
            this.timeDrinkSome = this.timeDrinkSome + 1;
        } else
            System.out.println("Arghh, I'ma Pirate. How d'ya d'ink its goin?");

    }

    public void die() {
        if (timeDrinkSome > 4) {
            System.out.println("I am drunk pirate and I am dead");
        } else
            System.out.println("Iam drunk but alife");


    }
}
