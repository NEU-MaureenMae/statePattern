public class SuspendedState implements AccountState {
    Account account = new  Account();
    public String getState(){
        return "Account is suspended!";
    }

}