package vozidlo;

public class UkazKonsVoz {
    public static void main(String[] args) {


        //konstruuje uplna vozidla
        Vozidlo minivan = new Vozidlo(7, 60, 10);
        Vozidlo sportak = new Vozidlo(2, 50, 20);
        double litry;
        double vzdal = 400;

        litry = minivan.potrebnePalivo(vzdal);

        System.out.println("Na ujeti " + vzdal + " km potrebuje minivan " + litry + " litry paliva. ");

        vzdal = minivan.potrebnePalivo(vzdal);

        System.out.println(" Na ujeti " + vzdal + " km potrebuje sportak " + litry + " litru paliva. ");


    }

}
