/*
        Modifier: Nadin Azraq 
*/
package ca.sheridancollege.week3.softwarefundamentals.ice1;
import java.util.Random;
import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author dancye
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Scanner input    = new Scanner(System.in);
        Card[] magicHand = new Card[7];
        
        Random random    = new Random(); //this is used to generate random numbers
        
        for (int i=0; i<magicHand.length; i++)
        {
            int value   = random.nextInt(13) + 1;  // call to random number generator
            String suit = Card.SUITS[random.nextInt(4)]; // random suit generator
            
            Card  c      = new Card(suit, value); 
            hand [i]     = c; 
        }
         
        System.out.println("Pick a suit for your card");
        for (int i = 0; i < Card.SUITS.length; i++)
        {
            System.out.println((i + 1) + ": " + Card.SUITS[i]);
        }
        int suit = input.nextInt(); 
        
        System.out.println("Enter a value from 1 to 13");
        int value = input.nextInt();
        
        Card userGuess = new Card(Card.SUITS[suit -1], value);
        
        boolean match = false; 
        for (Card c : hand)
        {
            if (c.getValue() == userGuess.getValue() && c.getSuit().equals(userGuess.getSuit()))
            {
                match = true; 
                break; 
            }
        }
        //insert code to ask the user for Card value and suit, create their card
        // and search magicHand here
        //Then report the result here
        String response = match ? "Right guess": "No match";
        System.out.println(response);
    }
    
}

//        System.out.println("Here are the cards in the hand");
//        for (Card c : hand)
//        {
//            System.out.printf("%d of %s\n", c.getSuit(), c.getValue());
//        }
