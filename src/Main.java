public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int creditSum = 1_000_000;
        double yearlyRate = 0.0999;
        double monthlyRate = yearlyRate / 12;
        int monthCreditPeriod = 12;
        int creditPayment = (int) service.calculateCreditPayment(creditSum,monthlyRate,monthCreditPeriod);
        System.out.println(creditPayment);
    }
}