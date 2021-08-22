public class Main {
    public static void main(String[] args) {
        int credit = 200000;
        double rate = 12;
        int time = 24;
        CreditCalculator creditCalculator = new CreditCalculator(credit, rate, time);
        int payment = creditCalculator.paymentCalculator();
        System.out.printf("Расчет платежа на сумму кредита %d рублей," +
                " с процентной ставкой %.2f, " +
                "сроком на %d месяца: %d \n", credit, rate, time, payment);

        int sum = creditCalculator.refundAmount(payment);
        System.out.println("Общая сумма к возврату в банк: " + sum);

        int overpayment = creditCalculator.overpaymentCalc(sum);
        System.out.println("Переплата за весь период составит: " + overpayment);
    }
}