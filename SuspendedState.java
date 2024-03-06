public class SuspendedState implements AccountState {

    public void activate(Account account){
        account.setState(new ActiveState());
        System.out.println("Account is activated.");
    }
    public void suspend(Account account){
        System.out.println("Account is suspended.");
    }

    public void close(Account account){
        account.setState(new ClosedState());
        System.out.println("Account is closed.");
    }

    public void deposit(Double depositAmount, Account account){
        System.out.println("Cannot deposit to a suspended account.");
        account.toString();
    }

    public void withdraw(Double withdrawAmount, Account account){
        System.out.println("Cannot withdraw to a suspended account.");
        account.toString();
    }


}