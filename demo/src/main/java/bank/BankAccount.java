package bank;
import java.util.*;

public class BankAccount {
    private final String name;
    private final String accountNumber;
    private float balance;
    private ArrayList<String> transactions;
    private boolean isClosed;
    private String openDate;
    private String closeDate; 

    public BankAccount(String accName) {
        this.name = accName; 
    }

    public BankAccount(String accName, float inBal) {
        this.name = accName; 
        this.balance = inBal;
    }

    public void deposit(float dep) {
        this.balance = this.balance + dep;
        transactions.add("deposit $" + dep + " at " + "<date time>");
    }
    public void withdraw(float wd) {
        this.balance = this.balance + wd;
        transactions.add("withdraw $" + wd + " at " + "<date time>");
    }

}
