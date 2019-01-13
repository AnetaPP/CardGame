import javax.smartcardio.Card;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;

public class FullDeck<T extends Card> {

    int cardSuit;
    Enum faceValue;

    private List<T> cards = new ArrayList<>();

    public FullDeck() {
        for(CardSuit suit : EnumSet.allOf(CardSuit.class)) {
            for (int rank = 2; rank < 15; rank++) {
                cards.add(new T(suit, rank));
            }
        }
    }
}
