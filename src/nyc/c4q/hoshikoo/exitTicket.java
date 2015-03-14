package nyc.c4q.hoshikoo;

/**
 * Created by Hoshiko on 3/14/15.
 */

import java.util.Scanner;
public class ExitTicket {

    public static void main(String[] args){
        int i =0;
        Scanner input = new Scanner(System.in);

        for(i=0; i<5; i++){
            System.out.println("Please guess a number between 1-20.");
            int userGuess = input.nextInt();

            if(userGuess>=0&&userGuess<=9){
                System.out.println("Your guess is too low.");
            }else if(userGuess>=11&&userGuess<=20){
                System.out.println("Your guess is too high.");
            }else if(userGuess==10){
                System.out.println("Congrats! You guessed it.");
            }else{
                System.out.println("You put a wrong number.  It should be a number between 1-20.");
            }

        }
    }

}

