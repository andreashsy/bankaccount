package bank;
import java.util.*;

public class BankAccount {
    private final String name;
    private final String accountNumber;
    private float balance;
    private ArrayList<String> transactions;
    private boolean closed;
    private String openDate;
    private String closeDate; 

    public BankAccount(String accName) {
        this.name = accName; 
        this.accountNumber = Integer.toString((int) Math.random()*100000000);
        this.balance = 0f;
        this.transactions = new ArrayList<String>();
    }

    public BankAccount(String accName, float initBal) {
        this.name = accName; 
        this.accountNumber = Integer.toString((int) Math.random()*100000000);
        this.balance = initBal;
        this.transactions = new ArrayList<String>();
    }

    public void deposit(float dep) {
        if (dep < 0 || closed) {
            throw new IllegalArgumentException();
        }
        this.balance += dep;
        transactions.add("deposit $" + dep + " at " + "<date time>");
    }
    public void withdraw(float wd) {
        if (wd < 0 || wd > this.balance || closed) {
            throw new IllegalArgumentException();
        }
        this.balance -= wd;
        transactions.add("withdraw $" + wd + " at " + "<date time>");
    }

    public String getName() {
        return name;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public ArrayList<String> getTransactions() {
        return transactions;
    }

    public void setTransactions(ArrayList<String> transactions) {
        this.transactions = transactions;
    }

    public boolean closed() {
        return closed;
    }

    public void setIsClosed(boolean isClosed) {
        this.closed = isClosed;
    }

    public String getOpenDate() {
        return openDate;
    }

    public void setOpenDate(String openDate) {
        this.openDate = openDate;
    }

    public String getCloseDate() {
        return closeDate;
    }

    public void setCloseDate(String closeDate) {
        this.closeDate = closeDate;
    }

}
