public class Main {

    public static void main(String[] args) throws LimitException {
        BankAccount tinkoff = new BankAccount();
        double have = tinkoff.getAmount();
        tinkoff.deposit(10000);
        while (true) {
            try {
                tinkoff.withDraw(6000);
            } catch (LimitException salavat) {
                System.out.println("Уважаемый Клиент у вас недостаточно средств для вывода данной суммы ");
                salavat.getMessage();
                tinkoff.withDraw(have);
                break;
            }
        }
    }
}