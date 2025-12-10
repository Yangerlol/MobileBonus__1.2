public class Main {
    public static void main(String[] args) {

        int currentAccount = 100; // У клиента на счету
        int refillAmount = 1100;  // Клиент пополнил на (меняйте это значение для тестов)

        int bonus;

        // Проверяем, больше ли пополнение 1000 рублей
        if (refillAmount > 1000) {
            bonus = refillAmount / 100; // 1 рубль за каждые 100 рублей
        } else {
            bonus = 0; // Бонусов нет
        }

        int finalAccount = currentAccount + refillAmount + bonus;

        System.out.println("Итоговый счет: " + finalAccount);
        System.out.println("Бонусные рубли: " + bonus);
    }
}