public class ActiveState implements AccountState {

    public void activate(Account account) {
        System.out.println("Account is already activated!");
    }

    public void suspend(Account account) {
        account.setState(new SuspendedState());
        System.out.println("Account is suspended!");
    }

    public void close(Account account) {
        account.setState(new ClosedState());
        System.out.println("Account is closed!");
    }

    public void deposit(Double depositAmount, Account account) {
        account.setBalance(account.getBalance() + depositAmount);
        System.out.println(depositAmount + " pesos has been deposited to you account.");
        account.toString();
    }

    public void withdraw(Double withdrawAmount, Account account) {
        account.setBalance(account.getBalance() - withdrawAmount);
        System.out.println(withdrawAmount + " pesos has been withdrawn to you account.");
        account.toString();
    }

}