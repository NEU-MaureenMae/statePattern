public class ActivateState implements AccountState {
    public String getState(){
        return "Account is actived!";
    }

    public void suspendState(){
        Account account = new Account();
        account.setState(new SuspendedState());
    }

    public String closeState(){
        Account account = new Account();
        account.setState(new ClosedState());
    }

}