package homework_24_2.Task2;

public class BankAccount implements PaymentSystem{
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    @Override
    public void withdrawMoney(double amount) {
        balance -= amount;

        System.out.println("Снято:" + amount + " $ " );
        System.out.println(balance);

    }

    @Override
    public void depositTransfer(double amount) {

        balance += amount;
        System.out.println("Зачисление:" + amount + "$");

    }

    @Override
    public void checkBalance() {

        System.out.println("Баланс:" + balance);



    }
}
