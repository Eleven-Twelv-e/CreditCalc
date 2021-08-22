import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CreditCalculatorTest {
    @Test
    void testPayment() {
        int credit = 200000;
        double rate = 12;
        int time = 24;
        double payment = rate / 100 / 12;
        double resPayment = credit * (payment + (payment / ((Math.pow((1 + payment), time) - 1))));
        int expected = (int) resPayment;
        int actualResult = new CreditCalculator(credit, rate, time).paymentCalculator();

        assertEquals(expected, actualResult);
    }

    @Test
    void testRefundAmount() {
        int credit = 200000;
        double rate = 12;
        int time = 24;
        int payment = 9500;
        int expected = time * payment;
        int actualResult = new CreditCalculator(credit, rate, time).refundAmount(payment);

        assertEquals(expected, actualResult);
    }

    @Test
    void testOverpaymentCalc() {
        int credit = 200000;
        double rate = 12;
        int time = 24;
        int sum = 225000;
        int expected = sum - credit;
        int actualResult = new CreditCalculator(credit, rate, time).overpaymentCalc(sum);

        assertEquals(expected, actualResult);
    }

}