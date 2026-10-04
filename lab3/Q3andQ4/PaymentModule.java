package lab3.Q3andQ4;

public class PaymentModule {
    private double totalPay;
    private double pay;

    public PaymentModule(double totalPay){
        this.totalPay = totalPay;
    }

    public void payment(Employee e) {
        pay = e.computePay();
        if (e instanceof Manager && ((Manager)e).getWorkYear() > 10){
            pay *= 2;
        }
        totalPay += pay;
    }

    public double getTotalPay() {
        return totalPay;
    }
}
