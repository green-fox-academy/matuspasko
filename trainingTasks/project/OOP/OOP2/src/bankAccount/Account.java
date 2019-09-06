package bankAccount;

public class Account {

    private int accountNumber;
    private double balance;
    private String name;
    private String email;
    private String phoneNumber;

    public void deposit(double depositAccount) {
        this.balance += depositAccount;
        System.out.println("Deposit of " + depositAccount + "made. New balance is " + this.balance);
    }

    public void withdral(double withdrawlAccount) {
        if (this.balance - withdrawlAccount <= 0) {
            System.out.println("Only " + this.balance + " available. Withdravl not processed");
        }else {
            this.balance -= withdrawlAccount;
            System.out.println("Withdrawl of " + withdrawlAccount + "processed. Remaining balanc = " + this.balance);
        }
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
