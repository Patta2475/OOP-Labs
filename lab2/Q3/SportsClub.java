package lab2.Q3;

public class SportsClub extends Club{
    public SportsClub(String n, int m){
        super(n, m);
    }

    @Override 
    public int determineBudget() {
        return (numMember * 1000) + ((numMember - minNumMember) * 100);
    }
    
    @Override 
    public void changeName(String newName) { }
}
