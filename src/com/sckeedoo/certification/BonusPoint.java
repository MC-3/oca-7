
package com.sckeedo.certification;
import java.util.Scanner;
public class BonusPoint {
    /*
     * You probably have used the trolleybus in Chisinau.
     * Every time you enter in trolleybus you have to get a ticked from the taxator otherwise you will be a iepurash
     * Every ticket has a number of it.
     * The ticket is considered to be lucky if the sum of it's first 3 digits are equal to the sum of it's 3 last digits
     * Ex. of lucky ticket : 125800 - 1 + 2 + 5 == 8 + 0 + 0
     * A super lucky ticket is considered if it's number is a palindrome (google what a palindrome means).
     *
     * Task - Given a ticket number, find out it it's lucky , super lucky or a simple ticket
     *
     * Input :         Output:
     *    012030        lucky
     *    123999        simple ticket
     *    123321        super lucky
     */
    
    public static void main(String[] args) {
      boolean ver; 
      final int a= 6;
      int var= 2;
      int str[] = new int [a];
      do
        {   ver = true;
            System.out.println("Enter ticket number: ");
            Scanner in = new Scanner(System.in);
            String str1 = in.next();
             if (str1.length()!=a)
            {  System.out.println("Incorrect number's length"); ver = false;  }
            else
            {  
                for(int i = 0; i < a; i++)
                    {
                        str[i] = str1.charAt(i)-48;
                        if ((str[i]<0)||(str[i]>9))
                        {  System.out.println("Entered incorrect number");
                           ver = false; break;}
                    }
            }
        } while (!ver);
      
      for (int i=0; i<a/2; ++i)
        { 
          if ((str[i]==str[a-1-i]) && (var==2)){}
          else { var=1; break; }
        }
      if (var==2){ System.out.println("Super lucky ticket, palindrome!!!"); }
      else 
      {
        int sum1=0, sum2=0;
        for (int i=0; i<a/2; ++i)
        { 
           sum1 += str[i];
           sum2 += str[a-1-i]; 
        }
        if (sum1==sum2){ System.out.println("Lucky ticket"); }
        else { var=0; System.out.println("Simple ticket"); }               
      }
      /*
      switch (var)
      {
          case 0: { System.out.println("Simple ticket"); } break;
          case 1: { System.out.println("Lucky ticket"); } break;
          case 2: { System.out.println("Super lucky ticket"); } break;
      }*/
    }
}
    