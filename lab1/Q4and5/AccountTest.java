package lab1.Q4and5;

public class AccountTest {
    public static void main(String[] args) {
        Account a1 = new Account("John", 20000);
        System.out.println(a1.Get_name() + "'s Balance: " + a1.Get_Balance());
        System.out.println();
        a1.deposit(10000);
        System.out.println(a1.Get_name() + "'s Balance: " + a1.Get_Balance());
        System.out.println();

        Account a2 = new Account("Karen", -10000);
        System.out.println(a2.Get_name() + "'s Balance: " + a2.Get_Balance());
    }
}
