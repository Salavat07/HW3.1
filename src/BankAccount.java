public class BankAccount {

    double amount;

    double getAmount() {
        return amount;
    }

    void deposit(double sum) {

        System.out.println("Вы открыли cчёт в размере - " + sum);
        amount = amount + sum;

    }

    void withDraw(double sum)
            throws LimitException {
        System.out.println("Вы сняли сумму в размере - " + sum);
        if (amount < sum) {
            throw new LimitException("На вашем балансе не достаточно средств(", +amount);
        }
        amount = amount - sum;
    }
}