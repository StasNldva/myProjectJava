package neledva.projects.simplebank;

class BankTest {
    public static void main(String[] args) {

        try {
            Bank bank = new Bank();

            long accountSourceNumber = bank.createAccount();
            long accountDestinationNumber = bank.createAccount();

            System.out.println("Account source number: " + accountSourceNumber); // 1
            System.out.println("Account destination number: " + accountDestinationNumber); // 2
            System.out.println("Account source balance: " + bank.accountBalance(accountSourceNumber)); // 3
            System.out.println("Account destination balance: " + bank.accountBalance(accountDestinationNumber)); // 4
            System.out.println("Account source deposit 10000: " + bank.deposit(accountSourceNumber, 10000)); // 5
            System.out.println("Account destination deposit 30000: " + bank.deposit(accountDestinationNumber, 30000)); // 6
            System.out.println("Account source withdraw 2000: " + bank.withdraw(accountSourceNumber, 2000)); // 7
            System.out.println("Account destination withdraw 12000: " + bank.withdraw(accountDestinationNumber, 12000)); // 8

            System.out.println("Account source transfer (2000) to destination: " + bank.transfer(accountSourceNumber, accountDestinationNumber, 2000)); // 9

            System.out.println("Account source balance: " + bank.accountBalance(accountSourceNumber)); // 10
            System.out.println("Account destination balance: " + bank.accountBalance(accountDestinationNumber)); // 11

            System.out.println("Bank balance: " + bank.bankBalance()); // 12

        } catch (AccountNotExists | OperationNotAllowed e) {
            e.printStackTrace();
        }
    }
}
