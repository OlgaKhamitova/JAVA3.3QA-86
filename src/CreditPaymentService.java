public class CreditPaymentService {
    public double calculateCreditPayment(int creditSum, double monthlyRate, int monthCreditPeriod) {
        double creditPayment = creditSum * ((monthlyRate * Math.pow (1 + monthlyRate,monthCreditPeriod) / (Math.pow (1 + monthlyRate,monthCreditPeriod) - 1)));
        return creditPayment;
    }
}
