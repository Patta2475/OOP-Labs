package lab2.Q2;

public class BasketballPlayer extends PlayerData {
    public BasketballPlayer(String n, int j) {
        super(n,j);
    }

    public void changeJerseyNumber(int newNumber) {
        jerseyNumber = newNumber;
        System.out.println(name + "changes number to "+ jerseyNumber);
    }
}
