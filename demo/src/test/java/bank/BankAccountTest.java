package bank;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class BankAccountTest {
    @Test
    public void testGetBalance() {
        BankAccount account = new BankAccount("John", 123.45f);
        assertTrue(account.getBalance() == 123.45f);
        System.out.println("testGetBalance successful");

    }
    @Test
    public void testDeposit() {
        BankAccount account = new BankAccount("John", 234.56f);
        account.deposit(65.44f);
        assertTrue(account.getBalance() == 300.00f);
        System.out.println("testDeposit successful");
    }
    
}
