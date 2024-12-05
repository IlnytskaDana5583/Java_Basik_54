package homework_24_2.Task2;

public class PaymentApp {
    public static void main(String[] args) {
        PaymentSystem bankAccount = new BankAccount(5000);
        bankAccount.checkBalance();
        bankAccount.depositTransfer(300);
        bankAccount.withdrawMoney(200);

        System.out.println("\n====================================\n");
        PaymentSystem wallet = new ElectronicWallet(3000);

        wallet.depositTransfer(400);
        wallet.withdrawMoney(100);
        wallet.checkBalance();


    }
}
