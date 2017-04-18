package BlackJack;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by Gabor on 18/04/2017.
 */
public class Card {

  String color;
  int value;
  String name;
  final static String[] availableColors = new String[] {"Hearts", "Diamonds", "Spades", "Clubs"};

  public Card(String color, int value) {
    this.color = color;
    this.value = value;
    cardName();
    System.out.println(name);
  }

  public Card() {
  }

  public void cardName(){
    if (value < 11) {
      this.name = this.value + " " + this.color;
    } else if (value == 11) {
      this.name = "Jack " + this.color;
    } else if (value == 12) {
      this.name = "Queen " + this.color;
    } else if (value == 13) {
      this.name = "King " + this.color;
    } else if (value == 14){
      this.name = "Ace " + this.color;
    } else {
      this.name = this.value + this.color;
    }
  }

  public void printCard(Card card){
    System.out.println(card.name);
  }

  public static Card randomCard(){
   int randomForColor = (int)(Math.random() * 4);
   String randomColor = availableColors[randomForColor];
   int randomNumber = (int)(Math.random() * 15);
   Card random = new Card(randomColor, randomNumber + 1 );
   return random;
  }
}
