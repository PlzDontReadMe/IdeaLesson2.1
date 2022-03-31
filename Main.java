public class Main {
    public static void main(String[] args) {
        int balance = 23;
        int amount = 550;

        int bonus = amount / 100;
        int total;
        if(amount > 100) {
            total = balance + amount + bonus;
        } else {
            total = balance + amount;
        }
        System.out.println(total);

    }
}
