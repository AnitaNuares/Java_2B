public class Main {
    public static void main(String[] args) {
        int amountStart = 101;
        int deposit = 599;
        int bonus;
        if (deposit > 1000) {
            bonus = deposit / 100;
        } else {
            bonus = 0;
        }
        System.out.println(amountStart + deposit + bonus);
    }
}