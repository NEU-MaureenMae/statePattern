public class Account {
    private AccountState accountState;
    private String accountNumber;
    private Double balance;

    public Account(String accountNumber, Double balance){
        this.accountNumber = accountNumber;
        this.balance = balance;
        accountState = new ActivateState();
    }
    
    public AccountState getState(){
        return accountState;
    }

    public void setState(AccountState accountState){
        this.accountState = accountState;
    }
   
    public String getaccountNumber(){
        return accountNumber;
    }

    public void setaccountNumber(String accountNumber){
        this.accountNumber = accountNumber;
    }

    public Double getBalance(){
        return balance;
    }

    public void setBalance(Double balance){
        this.balance = balance;
    }
}