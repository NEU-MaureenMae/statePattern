public class ClosedState implements AccountState {
    public void activate(Account account) {
        System.out.println("You cannot activate a closed account!");
    }

    public void suspend(Account account) {
        account.setState(new SuspendedState());
        System.out.println("You cannot suspend a closed account!");
    }

    public void close(Account account) {
        account.setState(new ClosedState());
        System.out.println("Account is closed.");
    }

    public void deposit(Double depositAmount, Account account) {
        System.out.println("You cannot deposit on a closed account!");
        account.toString();
    }

    public void withdraw(Double withdrawAmount, Account account) {
        System.out.println("You cannot withdraw on a closed account!");
        account.toString();
    }

}