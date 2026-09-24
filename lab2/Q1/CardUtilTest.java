package lab2.Q1;
public class CardUtilTest {
    public static void main(String[] args) {
        System.out.println("Highest Rank = " + CardUtil.HIGHEST_RANK);
        System.out.println("Highest Suite = " + CardUtil.HIGHEST_SUITE);
        System.out.println();

        //RANK = TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING, ACE
        //SUIT = DIAMONDS, CLUBS, HEARTS, SPADES
        Card card1 = new Card(Card.rank.TWO, Card.suit.DIAMONDS);
        System.out.println(card1.GetRank() + " of " + card1.GetSuit() + " | Highest: " + CardUtil.isHighestCard(card1));

        Card card2 = new Card(Card.rank.ACE, Card.suit.SPADES);
        System.out.println(card2.GetRank() + " of " + card2.GetSuit() + " | Highest: " + CardUtil.isHighestCard(card2));

    }
}
