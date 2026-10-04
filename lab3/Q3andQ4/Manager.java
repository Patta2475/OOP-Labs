package lab3.Q3andQ4;

public class Manager extends Fulltimer{
    private int workYear;

    public Manager(String n, double s, int w) {
        super(n, s);
        workYear = w;
    }

    public int getWorkYear() {
        return workYear;
    }

    @Override
    public double computePay() {
        return super.computePay() * workYear;
    }
}
