public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int credit = 1_000_000;
        double percent = 9.99;
        byte years = 3;
        double payment = service.calculate(credit, percent, years);
        System.out.println(payment);
    }
}
