import java.util.LinkedList;

/**
 * A standard 52-card deck.
 */
public class Deck {
    /**
     * The list of cards in the deck.
     */
    private LinkedList<Card> cards;

    /**
     * Constructs a shuffled standard 52-card deck.
     */
    public Deck() {
        cards = new LinkedList<Card>();
        for (Card.Suit suit : Card.Suit.values()) {
            for (Card.Rank rank : Card.Rank.values()) {
                cards.add(new Card(suit, rank, Card.Facing.FACEDOWN));
            }
        }
        Shuffle();
    }

    /**
     * Shuffles the deck.
     */
    public void Shuffle() {
        LinkedList<Card> shuffled = new LinkedList<Card>();
        while (!cards.isEmpty()) {
            shuffled.add(cards.remove((int) (Math.random() * cards.size())));
        }
        cards = shuffled;
    }

    /**
     * Draws the top card off of the deck.
     * 
     * @return the card drawn
     */
    public Card drawCard() {
        return cards.remove();
    }

    /**
     * Prints all the cards in the deck.
     */
    public void print() {
        for (Card card : cards) {
            card.print();
        }
    }
}