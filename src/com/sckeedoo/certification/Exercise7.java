
package com.sckeedo.certification;

public class Exercise7 {
 
    public static void main(String[] args) {
        String names = "John,Steve,Bob,Anna,Diana,George,Dodon,Plahotniuc";
        
       /* Use JDK documentation for String class and find a method that
        would help you identify the position of word 'Steve' and 'George' in the names string.
        Then find another method that would help you print the string from between those positions.
        Expected output: "Steve,Bob,Anna,Diana,George"
        */
       String str[]= names.split(",",2);
       int j = 0;
       for ( String tmp:str){
       ++j;
       if ((j>1))
       { 
           System.out.println(tmp + " "+ j); }
       }
    }
}