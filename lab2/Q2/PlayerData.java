package lab2.Q2;

public class PlayerData {
    protected String name;
    protected int jerseyNumber;
    protected int minutesPlayed;

    public PlayerData(String name, int jerseyNumber){
        this.name = name;
        this.jerseyNumber = jerseyNumber;
        minutesPlayed = 0;
    }

    public void print() {
        System.out.println(name + ": " + jerseyNumber);
    }

    public int getMinutesPlayed() {
        return minutesPlayed;
    }

    public void playGame() {
        minutesPlayed = minutesPlayed + 48;
    }
}
