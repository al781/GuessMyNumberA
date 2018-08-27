package com.company;
import java.util.Scanner;
import java.util.Random;
public class Main
{
    public static void main(String[] args)
        {
            int x;
            int input = 0;
            int counter;
            String checker;
            Scanner scan = new Scanner(System.in);
            Random rand = new Random();
            System.out.println("Guess a number between 1-100. Enter stop to exit");
            while(1 == 1)
                {
                    counter = 0;
                    x = rand.nextInt(100) + 1;
                    System.out.println("Enter Guess:");
                    while(1 == 1)
                        {
                            while(!scan.hasNextInt())
                                {
                                    checker = scan.nextLine();
                                    if(checker.equals("stop"))
                                        {
                                            System.exit(0);
                                        }
                                    System.out.println("Input a Valid Guess:");
                                }
                            input = scan.nextInt();
                            if(input == x)
                                {
                                    counter ++;
                                    System.out.println("Congrats! You guessed the number!");
                                    System.out.print("It took you ");
                                    System.out.print(counter);
                                    System.out.println(" tries!");
                                    counter = 0;
                                    break;
                                }
                            else if(input > x)
                                {
                                    counter ++;
                                    System.out.println("You guessed too high. Try again!");
                                    System.out.println("Enter Guess:");
                                }
                            else if(input < x)
                                {
                                    counter ++;
                                    System.out.println("You guessed too low. Try again!");
                                    System.out.println("Enter Guess:");
                                }
                            if(counter == 7)
                                {
                                    System.out.println("You took too many guesses");
                                    counter = 0;
                                    break;
                                }
                        }
                }
        }
}
