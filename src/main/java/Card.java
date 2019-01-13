abstract class Card {
    CardSuit cardSuit;
    int faceValue;

    Card(CardSuit suit, int value){
        this.cardSuit = suit;
        this.faceValue = value;
    }
}

class FourColorCard extends Card{
    private boolean _isRed;

    FourColorCard(CardSuit suit, int value){
        super(suit, value);
        this._isRed = (this.cardSuit == CardSuit.DIAMOND || this.cardSuit == CardSuit.HEART);
    }

    boolean isRed(){
        return this._isRed;
    }
}

