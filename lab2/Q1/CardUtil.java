package lab2.Q1;
public class CardUtil {
    public static final Card.rank HIGHEST_RANK = Card.rank.ACE;
    public static final Card.suit HIGHEST_SUITE = Card.suit.SPADES;

    public static boolean isHighestCard(Card card){
        return card.GetRank() == HIGHEST_RANK && card.GetSuit() == HIGHEST_SUITE;
    }
}
