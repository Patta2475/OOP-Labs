package lab3.Q3andQ4;

public class PaymentModuleTest {
    public static void main(String[] args) {
        PaymentModule p = new PaymentModule(0);
        System.out.println(p.getTotalPay());
 
        p.payment(new Fulltimer("Alice", 1000));
        System.out.println("Fulltimer: " + p.getTotalPay());
 
        p.payment(new Hourly("Bob", 50, 10));
        System.out.println("Hourly: " + p.getTotalPay());

        p.payment(new Manager("Carol", 1000, 5));
        System.out.println("5 years: " + p.getTotalPay());
 
        p.payment(new Manager("Dan", 1000, 10));
        System.out.println("10 years: " + p.getTotalPay());
 
        p.payment(new Manager("Eve", 1000, 11));
        System.out.println("11 years: " + p.getTotalPay());

    }
}
