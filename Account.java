public class Account {
    private AccountState accountState;
    private String accountNumber;
    private Double balance;

    public Account(String accountNumber, Double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        accountState = new ActiveState();
    }
    public String toString() {
        System.out.println("Account Number: " + getaccountNumber() +
                "\nCurrent Balance: " + getBalance());
        return "";
    }
    public void setState(AccountState accountState) {
        this.accountState = accountState;
    }
    public String getaccountNumber() {
        return accountNumber;
    }
    public Double getBalance() {
        return balance;
    }
    public void setBalance(Double balance) {
        this.balance = balance;
    }
    public void suspend() {
        accountState.suspend(this);
    }
    public void activate() {
        accountState.activate(this);
    }
    public void close() {
        accountState.close(this);
    }
    public void deposit(Double deposit) {
        accountState.deposit(deposit, this);
    }
    public void withdraw(Double withdraw) {
        accountState.withdraw(withdraw, this);
    }
}