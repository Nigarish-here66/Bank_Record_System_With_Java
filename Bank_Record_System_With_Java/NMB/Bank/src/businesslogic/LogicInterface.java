package businesslogic;

/**
 * The LogicInterface interface defines the methods that represent the operations
 * to be performed in the bank record system.
 */
public interface LogicInterface {
    /**
     * Performs the deposit operation.
     * This method allows the user to enter the account number, account holder name,
     * and deposit amount, and performs the deposit operation on the account.
     */
    void performDeposit();

    /**
     * Performs the debit operation.
     * This method allows the user to enter the account number, account holder name,
     * and debit amount, and performs the debit operation on the account.
     */
    void performDebit();

    /**
     * Performs the calculate interest operation.
     * This method allows the user to enter the account number, account holder name,
     * balance, and interest rate, and calculates the interest on the account.
     */
    void performCalculateInterest();
}
