/*
        Modifier: Nadin Azraq 
*/
package ca.sheridancollege.week3.softwarefundamentals.ice1;
import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author Nadin Azraq
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Scanner input    = new Scanner(System.in);
        Card[] magicHand = new Card[7];
        
        for (int i=0; i<magicHand.length; i++)
        { 
            Card luckyCard = new Card("Hearts", 7); 
            magicHand [i]  = luckyCard; 
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
        for (Card c : magicHand)
        {
            if (c.getValue() == userGuess.getValue() && c.getSuit().equals(userGuess.getSuit()))
            {
                match = true; 
                break; 
            }
        }

        String response = match ? "You Guessed right": "You guessed wrong";
        System.out.println(response);
    }
    
}

        
