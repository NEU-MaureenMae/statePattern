public class SuspendedState implements AccountState {
    public String getState(){
        return "Account is suspended!";
    }

    public String activateState()){
        account.setState(new ActivateState());
    }

    public String closeState(){
        account.setState(new ClosedState());
    }

}