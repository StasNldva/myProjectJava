package neledva.projects.simplebank;

class Account {

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
        if (cash > 0){
            balance += cash;
            return true;
        }
        return false;
    }

    protected boolean reduceBalance(long cash) {
        if (cash > 0 && balance > cash){
            balance -= cash;
            return true;
        }
        return false;
    }

    protected long getAccountNumber() {
        return number;
    }

    protected long getAccountBalance() {
        return balance;
    }
}