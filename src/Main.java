public class Main {
    public static void main(String[] args) {
        System.out.println("Баланс счета");
        int pay = 1300; //платеж
        int balance = 1000; //начальный баланс
        int bonus; //бонус
        int balansfinal; //итоговый баланс

        if (pay > 1000) {
            bonus = pay / 100;
            balansfinal = balance + pay + bonus;
            System.out.println("Сумма зачисления c бонусом:" + balansfinal);
            System.out.println("Бонус зачислен на сумму:" + bonus);
        } else {
            balansfinal = pay + balance;
            System.out.print("Сумма зачисления без бонуса" + balansfinal);
        }
    }
}





