
/**
 * Write a description of class Main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
public class Main
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class Main
     */
    public Main()
    {
        // initialise instance variables
        x = 0;
    }

    /**
     * This method is checking if a value is part of ArrayList or not
     *
     * @param  x  a the value we are checking in the ArrayList
     * @param storedArray is the ArrayList storing all values entered in terminal
     * @returns false when the value is not found.
     */
    public Boolean verifyValue(int x,ArrayList<Integer>storedArray)
    {
        boolean validateFlag= false;
        validateFlag = storedArray.contains(x);
        if (validateFlag == true)
        {
            System.out.println("Already Guessed Value");
        }
        return validateFlag;
    }
     
    public static void main(String []args)
    {
        Random randomNumber = new Random();
        Scanner scan = new Scanner(System.in);
        int genValue=randomNumber.nextInt(5);
        int countTries=0;
        int successFlag =0;
        int userGuess =0;
       
        ArrayList<Integer> guessedNumbers = new ArrayList<Integer>();
        
        Main main= new Main();
        
        
        while(successFlag ==0)
        {
           System.out.println("Please enter an integer between 1 and 5 : ");
           userGuess = scan.nextInt();
         
           boolean flag = main.verifyValue(userGuess, guessedNumbers);
           if(flag == false)
           {
               countTries++;
               guessedNumbers.add(userGuess);
            }
          
           if(userGuess < 1 || userGuess >5)
           {
               System.out.println("Invalid input");
            }
            else if(userGuess == genValue)
            {
                successFlag++;
                System.out.println("Awesome you won! "+
                " your number of tries "+ countTries +
                " and the number was: " + genValue);
                break;
            }
            else if(userGuess < genValue)
            {
                System.out.println("Your guess is too low!!");
            }
            else if(userGuess > genValue)
            {
                System.out.println("Your guess too high!!!");
            }
           
        
        }
        
        
        
    }

}
