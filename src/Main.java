public class Main {
    public static void main(String[] args) {
        int startBalance = 100; // начальная сумма счёта
        int topUp = 1100; // сумма пополнения

        // переменные для представления логики начисления бонусов — на случай, если они будут меняться в будущем :)
        int bonusPerRub = 1;
        int rubPerBonus = 100;
        int topUpScope = 1000;

        int bonus = 0;
        int finalBalance = startBalance + topUp;

        if (topUp > topUpScope) {
            bonus = (topUp / rubPerBonus) * bonusPerRub;
            finalBalance += bonus;
        }

        System.out.println("Начислено бонусов: " + bonus);
        System.out.println("Итоговая сумма на счету: " + finalBalance + " руб.");
    }
}
