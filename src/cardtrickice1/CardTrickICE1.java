    /*
Student ID:- 991655260
 */
package cardtrickice1;
import java.util.Scanner;
/** step1 : generate 7 random cards and store in array - how
 * step 2: take any card input from user suit,number
 * step 3: user card is in  the array 'card is found
 *
 * @author Aastha Patel
 */
public class CardTrickICE1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner kb = new Scanner(System.in);
        Card[] magicHand = new Card[7]; //Array of object
         Card  luckyCard = new Card();
        luckyCard.setValue(6);
        luckyCard.setSuits("diamonds");
        for( int i=0;i<magicHand.length;i++)
        {
            Card c1 = new Card();
            c1.setValue(Card.RandomValue());
            c1.setSuits(Card.RandomSuit());
            magicHand[i]= c1;
            System.out.println(magicHand[i].getValue() + " " + magicHand[i].getSuits());
            
        }
        
        System.out.println("Enter the card number (1 to 12)");
        int num = kb.nextInt();
        System.out.println("Choose the card suits: ");
        System.out.println("1:hearts\n2:diamonds\n3:spades\n4:clubs");
        int suitnum = kb.nextInt();
        String suit;
        suit = CallSuit(suitnum);
        
        boolean match = true ;
        for (Card magicHand1 : magicHand) {
            match = true;
            if ((magicHand1.getValue() == num) && (magicHand1.getSuits().equals(suit))) {
                System.out.println("card is found");
                break;
            } else {
                match = false;
            }
        }
        
        if(match == false)
        {
            System.out.println("Card not found");
        }
    }
    public static String CallSuit(int a)
    {
        String suit= "";
        int b =a;
        switch(b)
        {
            case 1 -> suit= "hearts";
            
            case 2 -> suit = "diamonds";
            
            case 3 -> suit ="spades";
            
            case 4 -> suit = "clubs";
        
        }
        return suit;
    
    }
}

    
