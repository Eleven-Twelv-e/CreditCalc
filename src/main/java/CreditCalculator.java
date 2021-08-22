public class CreditCalculator {
    private int credit;
    private double rate;
    private int time;

    public CreditCalculator(int credit, double rate, int time) {
        this.credit = credit;
        this.rate = rate;
        this.time = time;
    }

    public int paymentCalculator() {
        double payment = rate / 100 / 12;
        return (int) (credit * (payment + (payment / ((Math.pow((1 + payment), time) - 1)))));
    }

    public int refundAmount(int payment) {
        return time * payment;
    }

    public int overpaymentCalc(int sum) {
        return sum - credit;
    }
}