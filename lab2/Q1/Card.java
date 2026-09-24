package lab2.Q1;
public class Card {
    public enum rank {
        TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK,
        QUEEN, KING, ACE
    }   
    public enum suit {
        DIAMONDS, CLUBS, HEARTS, SPADES
    }

    private final rank rank;
    private final suit suit;
    
    public Card(rank Rank, suit Suit){
        this.rank = Rank;
        this.suit = Suit;
    }

    public rank GetRank(){
        return rank;
    }

    public suit GetSuit(){
        return suit;
    }
}
