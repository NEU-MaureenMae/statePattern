public interface AccountState {
    public void deposit(Double depositAmount);
    public void withdraw(Double withdrawAmount);
    public void activateState(Account account);
    public void suspendState(Account account);
    public void closeState(Account account);
    public String toString();
}