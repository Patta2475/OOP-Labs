package lab2.Q3;

public class MarketingClub extends Club{
    private int budget;

    public MarketingClub(String n, int m, int b){
        super(n, m);
        this.budget = b;
    }

    public boolean useBudget(int cost){
        if (budget - cost > 0) {
            return true;
        } else {
            return false;
        }
    }

    @Override 
    public int determineBudget(){
        if(budget>1000){
            return 0;
        } else {
            return (numMember * 1000);
        }
    }
}
