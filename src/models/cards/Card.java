package models.cards;

abstract public class Card {
    private long cardNumber;
    private int cardCVV;
    private String expiryDate;

    private String cardHolder;

    public Card(long cardNumber, int cardCVV, String cardHolder) {
        this.cardCVV = cardCVV;
        this.cardNumber = cardNumber;
        this.cardHolder = cardHolder;
    }

    public long getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(long cardNumber) {
        this.cardNumber = cardNumber;
    }

    public int getCardCVV() {
        return cardCVV;
    }

    public void setCardCVV(int cardCVV) {
        this.cardCVV = cardCVV;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }

    public String getCardHolder() {
        return cardHolder;
    }

    public void setCardHolder(String cardHolder) {
        this.cardHolder = cardHolder;
    }

    abstract long generateCardNumber() ;
}
