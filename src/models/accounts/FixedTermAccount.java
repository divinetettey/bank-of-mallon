package models.accounts;

public class FixedTermAccount extends Account {
    private double interest;

    public FixedTermAccount(String accountName, float balance, String label) {
        super(accountName, balance, label);
    }

    @Override
    public double checkAccountBalance() {
        return this.getBalance();
    }

    @Override
    public double deposit(long accountNumber, float amount) {
        //TODO: find account and deposit
        double balance = this.getBalance() + amount;
        this.setBalance(balance);

        return getBalance();
    }

    @Override
    public double withdraw(long accountNumber, float amount) {
        //TODO: find account and deposit
        double balance = this.getBalance() - amount;
        this.setBalance(balance);

        return getBalance();
    }

    /**
     * customer can withdraw from account
     * @return
     */
    public boolean canWithdrawFromAccount()
    {
        return false;
    }

    /**
     * get interest
     * @return
     */
    public double getInterest() {
        return interest;
    }

    /**
     * set interest
     * @param interest
     */
    public void setInterest(double interest) {
        this.interest = interest;
    }
}
