public class Main {
    public static void main(String[] args) {
        int initialAccountAmount = 100;
        int amount = 400;
        int bonus = amount + amount / 100;
        if (amount > 100) {
            amount = 100;
        }
        System.out.println("сума до пополнения:" + initialAccountAmount);
        System.out.println("сумма пополнения:" + bonus);
        System.out.println("итоговая сумма на счету:" + (initialAccountAmount + bonus));

    }
}
