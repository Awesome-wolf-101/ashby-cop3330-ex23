/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Joshua Ashby
 */

import java.time.Month;
import java.util.Calendar;
import java.util.Scanner;
import java.lang.Math;

public class APP {


    public static void main(String[] args) {
        System.out.println("Is the car silent when you turn the key?");
        Scanner sc = new Scanner(System.in);
        String UserAnswer = sc.nextLine();
        if(UserAnswer.equals("y"))
        {
            System.out.println("Are the battery terminals corroded?");
            String UserAnswer2 = sc.nextLine();
            if(UserAnswer2.equals("y"))
            {
                System.out.println("Clean terminals and try starting again.");
            }
            else
            {
                System.out.println("Replace cables and try again.");
            }
        }
        else
        {
            System.out.println("Does the car make a slicking noise?");
            String UserAnswer3 = sc.nextLine();
            if(UserAnswer3.equals("y"))
            {
                System.out.println("Replace the Battery");
            }
            else
            {
                System.out.println("Does the car crank up but fail to start?");
                String UserAnswer4 = sc.nextLine();
                if(UserAnswer4.equals("y"))
                {
                    System.out.println("Check spark plug connections.");
                }
                else
                {
                    System.out.println("Does the engine start and then die?");
                    String UserAnswer5 = sc.nextLine();
                    if(UserAnswer5.equals("y"))
                    {
                        System.out.println("Does you car have fuel injection?");
                        String UserAnswer6 = sc.nextLine();

                        if(UserAnswer6.equals("y"))
                        {
                            System.out.println("Get it in for service.");
                        }
                        else
                        {
                            System.out.println("Check to ensure the choke is opening and closing.");
                        }

                    }
                    else
                    {
                        System.out.println("This Should not be possible.");
                    }
                }
            }
        }
        System.exit(0);

    }

}






