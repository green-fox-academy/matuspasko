package restauratn;

public class Main {
    public static void main(String[] args) {

        Restaurant uHraba = new Restaurant("uHraba",1845);
        Waiter donald = new Waiter("Donald");
        Chef guru = new Chef("Guru");
        Manager trol = new Manager("Trol");

        donald.work();
        guru.work();
        guru.cook("burger");
        guru.cook("burger");
        trol.work();

        uHraba.hire(donald);
        uHraba.hire(guru);
        uHraba.hire(trol);
        uHraba.guestsArrived();

        System.out.println();

    }
}
