package restaurant;

public class Main {
    public static void main(String[] args) {

        Waiter john = new Waiter("John");
        Chef dan = new Chef("Dan");
        Manager matus = new Manager("Matus");
        Restaurant drak = new Restaurant("Drak", 1999);
        john.work();
        dan.work();
        matus.work();
        drak.hire(john);
        drak.hire(dan);
        drak.hire(matus);
        drak.guestsArrived();
        System.out.println();
    }
}
