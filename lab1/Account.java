package lab1;
public class Account {
    private String name;
    private double balance;

    public Account(String name, double balance){
        if (balance < 0){
            this.name = name;
            balance = 0;
        } else {
            this.name = name;
            this.balance = balance;
        }
    }

    public void deposit(double depositAmount){
        if (depositAmount>0){
            this.balance = this.balance + depositAmount;
        }
    }

    public double Get_Balance(){
        return balance;
    }

    public String Get_name(){
        return name;
    }
}
