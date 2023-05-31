import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class Activity2 {
    @Test
    void notEnoughfunds() {
        BankAccount ba = new BankAccount(10);
        assertThrows(NotEnoughFundsException.class, () -> ba.withdraw(20),
                "Attempted to withdraw amount more than the account balance");
    }

    @Test
    void enoughFunds() {
      BankAccount ba = new BankAccount(100);
      assertDoesNotThrow(() -> ba.withdraw(90));
    }
}
