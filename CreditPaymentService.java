public class CreditPaymentService {
    public int calculate(long credit, float creditcall, int creditperiod) {

        long payment = (long) (credit * (creditcall / 12 / 100 * Math.pow(1 + creditcall / 12 / 100, creditperiod)) / (Math.pow(1 + creditcall / 12 / 100, creditperiod) - 1));

        return (int) payment;
    }
}
