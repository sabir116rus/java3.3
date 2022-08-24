public class CreditPaymentService {
    public double calculate(int c, double p, byte y) {
        double rate = p / 100 / 12;
        double result = c * ((rate * Math.pow((1 + rate), 12 * y)) / (Math.pow((1 + rate), 12 * y) - 1));
        return result;
    }
}
