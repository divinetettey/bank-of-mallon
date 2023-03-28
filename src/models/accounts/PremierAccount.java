package models.accounts;

import models.cards.DebitCard;

public class PremierAccount extends Account{

    private double fee;
    private double overdraftLimit;
    private DebitCard debitCard;

    public PremierAccount(String accountName, float balance, String label) {
        super(accountName, balance, label);
    }

    @Override
    public double checkAccountBalance() {
        return 0;
    }

    @Override
    public double deposit(long accountNumber, float amount) {
        return 0;
    }

    @Override
    public double withdraw(long accountNumber, float amount) {
        return 0;
    }

    public float cashback(String period, int numOfTransactions) {
        return 0;
    }

    public boolean hasOverdraftLimit(double amount)
    {
        return amount > this.overdraftLimit;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }

    public double getOverdraftLimit() {
        return overdraftLimit;
    }

    public void setOverdraftLimit(double overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }

    public DebitCard getDebitCard() {
        return debitCard;
    }

    public void setDebitCard(DebitCard debitCard) {
        this.debitCard = debitCard;
    }
}
