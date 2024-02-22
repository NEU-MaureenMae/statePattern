public class ActivateState implements AccountState {
    private AccountState accountState;
    private String accountNumber;
    private Double balance;

    public String getState(){
        return "Account is actived!";
    }

    public void suspendState(){
        account.setState(new SuspendedState());
    }

    public String closeState(){
        account.setState(new ClosedState());
    }

    public void deposit(Double depositAmount, Account account){
        accountState.deposit(depositAmount, this);
    }

    public void withdraw(Double withdrawAmount, Account account){
        accountState.withdraw(withdrawAmount, this);
    }

    public String getaccountNumber(){
        return accountNumber;
    }

    
}