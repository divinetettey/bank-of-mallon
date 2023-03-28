package models.accounts;

import models.cards.DebitCard;

public class BasicCurrentAccount extends Account{
    private DebitCard debitCard;
    public BasicCurrentAccount(String accountName, float balance, String label) {
        super(accountName, balance, label);
    }

    @Override
    public double checkAccountBalance() {
        return this.getBalance();
    }

    @Override
    public double deposit(long accountNumber, float amount) {
        //TODO: check account and deposit
        double balance = this.getBalance() + amount;
        this.setBalance(balance);

        return balance;
    }

    @Override
    public double withdraw(long accountNumber, float amount) {
        double balance = this.getBalance() - amount;
        this.setBalance(balance);

        return balance;
    }

    public DebitCard getDebitCard() {
        return debitCard;
    }

    public void setDebitCard(DebitCard debitCard) {
        this.debitCard = debitCard;
    }
}
