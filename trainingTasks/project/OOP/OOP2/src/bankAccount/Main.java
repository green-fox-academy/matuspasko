package bankAccount;

public class Main  {

    public static void main(String[] args) {
        Account bobAccount = new Account();
        bobAccount.withdral(100.00);

        bobAccount.deposit(300.00);
        bobAccount.withdral(50.00);

    }

}
