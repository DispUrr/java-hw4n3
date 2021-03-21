public class Main {
    public static void main(String[] args) {

        CreditPaymentService service = new CreditPaymentService();

        long credit = 1_000_000; // сумма кредита;
        float creditcall = 9.99f; // годовая процентная ставка;
        int creditperiod = 12; // срок кредита в месяц.

        long payment = service.calculate(credit,creditcall,creditperiod);

        System.out.println("Ежемесячный платёж: " + payment);
    }
}
