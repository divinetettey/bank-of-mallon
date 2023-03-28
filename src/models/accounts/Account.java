package models.accounts;

abstract public  class Account {
    private String accountOpenedOn;
    private double accountNumber;
    private String accountName;
    private double balance;
    private String label;

    public Account(String accountName, float balance, String label) {
        this.accountName = accountName;
        this.balance = balance;
        this.label = label;
    }
    /**
     * check account balance
     * @return float
     */
    abstract  public double checkAccountBalance();

    /**
     *  deposit into account
     * @param accountNumber
     * @param amount
     * @return float
     */
    abstract public double deposit(long accountNumber, float amount);

    /**
     * withdraw from account
     *
     * @param accountNumber
     * @param amount
     * @return
     */
    abstract public double withdraw(long accountNumber, float amount);

    public String getAccountOpenedOn() {
        return accountOpenedOn;
    }

    public void setAccountOpenedOn(String accountOpenedOn) {
        this.accountOpenedOn = accountOpenedOn;
    }

    public double getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(double accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }
}
