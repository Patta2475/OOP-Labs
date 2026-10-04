package lab3.Q3andQ4;

public class AdvancedPaymentModuleTest {
    public static void main(String[] args) {
        AdvancedPaymentModule a = new AdvancedPaymentModule(0);
        System.out.println(a.getTotalPay());

        Employee[] team = { new Fulltimer("Alice", 1000), 
                            new Hourly("Bob", 50, 10),
                            new Manager("Carol", 1000, 5),
                            new Manager("Dan", 1000, 10),
                            new Manager("Eve", 1000, 11)
        };

        a.payment(team);
        System.out.println(a.getTotalPay());
    }
}
