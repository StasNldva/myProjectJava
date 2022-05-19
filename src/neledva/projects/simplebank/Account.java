package neledva.projects.simplebank;

public class Account {

    private static long accountNumbers = 0;
    private long number;
    private long balance;

    protected Account(){
        // to store information about bank account numbers
        accountNumbers++;
        number = accountNumbers;
        balance = 0;
    }

    protected boolean increaseBalance(long cash){
        return false;
    }

    protected boolean reduceBalance(long cash) {
        return false;
    }

    protected long getAccountNumber() {
        return 0;
    }

    protected long getAccountBalance() {
        return 0;
    }
}
