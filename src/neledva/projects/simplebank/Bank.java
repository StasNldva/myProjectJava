package neledva.projects.simplebank;

public class Bank {

    protected Bank() {

    }

    protected long createAccount() {
        return 0;
    }

    protected long withdraw(long accountNumber, long cash) {
        return 0;
    }

    protected long deposit(long accountNumber, long cash) {
        return 0;
    }

    protected boolean transfer(long sourceNumber, long destinationNumber, long cash) {
        return true;
    }

    protected long accountBalance(long accountNumber) {
        return 0;
    }

    protected long bankBalance() {
        return 0;
    }
}
