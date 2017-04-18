package BlackJack;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Gabor on 18/04/2017.
 */
public class Deck {

  ArrayList<Card> pack = new ArrayList<>();
  Card drawnCard;
  Card newCard = new Card();
  String currentDeck;
  int hearts, diamonds, spades, clubs;

  public Deck(int number) {
    addCards(number);
    colorCounter(pack);
    this.currentDeck =
        number + "cards - " + hearts + " Hearts, " + diamonds + " Diamonds, " + spades + " Spades, "
            + clubs + " Clubs";
    System.out.println(currentDeck);
  }

  public void colorCounter(ArrayList<Card> pack) {
    hearts = diamonds = spades = clubs = 0;
    for (Card card : pack) {
      if (card.color.equals(Card.availableColors[0])) {
        hearts++;
      } else if (card.color.equals("Diamonds")) {
        diamonds++;
      } else if (card.color.equals("Spades")) {
        spades++;
      } else if (card.color.equals("Clubs")) {
        clubs++;
      }
    }
  }

  public void addCards(int number) {
    pack = new ArrayList<>();
    pack.add(Card.randomCard());
    for (int i = 0; i < number - 1; i++) {
      newCard = Card.randomCard();
      if ((!newCard.color.equals(pack.get(i).color) && (newCard.value != pack.get(i).value))) {
        pack.add(newCard);
      } else {
        i--;
      }
    }
  }

  public Card draw() {
    drawnCard = new Card();
    drawnCard = pack.get(pack.size() - 1);
    return drawnCard;
  }
}



