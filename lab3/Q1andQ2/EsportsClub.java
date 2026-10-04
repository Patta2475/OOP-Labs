package lab3.Q1andQ2;

public final class EsportsClub extends SportsClub{
    public EsportsClub(String n, int m){
        super(n,m);
        minNumMember = 1;
    }

    @Override
    public final void advertise() {
        System.out.println("No need to advertise");
    }
}
