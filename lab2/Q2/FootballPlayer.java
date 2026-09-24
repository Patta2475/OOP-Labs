package lab2.Q2;

public class FootballPlayer extends PlayerData {
    public FootballPlayer(String n, int j){
        super(n,j);
    }

    @Override 
    public void playGame() {
        minutesPlayed =  minutesPlayed + 90;
    }
    
}
