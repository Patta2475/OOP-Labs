package lab3.Q1andQ2;

public class SportsClub extends Club{
    public SportsClub(String n, int m){
        super(n, m);
    }

    public int getNumber() {
        return numMember;
    }

    @Override 
    public int determineBudget() {
        return (numMember * 1000) + ((numMember - minNumMember) * 100);
    }
    
    @Override 
    public void changeName(String newName) { }
}
