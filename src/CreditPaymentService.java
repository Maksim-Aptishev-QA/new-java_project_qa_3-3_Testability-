public class CreditPaymentService {
    public int calculate(int loadAmount, double annualInterestRate, int months) {
        double monthlyPaymentPercent = annualInterestRate/12/100;
        //double payment = loadAmount * Math.pow(monthlyPaymentPercent+1,months) / (Math.pow(monthlyPaymentPercent+1,months)-1);
        double payment = loadAmount * (monthlyPaymentPercent * Math.pow(monthlyPaymentPercent+1,months)/(Math.pow(monthlyPaymentPercent+1, months)-1));
        //double payment = loadAmount *(Math.pow (monthlyPayment+1) ,months)/((Math.pow(1+monthlyPayment)-1));
        return (int) payment;
    }
}
