package models.cards;

public class CreditCard extends Card {
    private double interest;
    private int minimumCreditScore;
    private int maximumCreditScore;
    private double fee;
    private double minimumCreditLine;
    private double maximumCreditLine;

    public CreditCard(long cardNumber, int cardCVV, String cardHolder) {
        super(cardNumber, cardCVV, cardHolder);
    }

    @Override
    long generateCardNumber() {
        return 0;
    }

    public double getInterest() {
        return interest;
    }

    public void setInterest(double interest) {
        this.interest = interest;
    }

    public int getMinimumCreditScore() {
        return minimumCreditScore;
    }

    public void setMinimumCreditScore(int minimumCreditScore) {
        this.minimumCreditScore = minimumCreditScore;
    }

    public int getMaximumCreditScore() {
        return maximumCreditScore;
    }

    public void setMaximumCreditScore(int maximumCreditScore) {
        this.maximumCreditScore = maximumCreditScore;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }

    public double getMinimumCreditLine() {
        return minimumCreditLine;
    }

    public void setMinimumCreditLine(double minimumCreditLine) {
        this.minimumCreditLine = minimumCreditLine;
    }

    public double getMaximumCreditLine() {
        return maximumCreditLine;
    }

    public void setMaximumCreditLine(double maximumCreditLine) {
        this.maximumCreditLine = maximumCreditLine;
    }

    public double transaction(double amount)
    {
        return amount;
    }
}
