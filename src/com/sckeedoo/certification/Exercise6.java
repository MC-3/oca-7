package com.sckeedo.certification;

public class Exercise6 {

    public static void main(String[] args) {
        String names = "John,Steve,Bob,Anna,Diana,George,Dodon,Plahotniuc";
        
       /* Use JDK documentation for String class and find a method that
        would help you identify the position of word 'Diana' in the names string.
        Then find another method that would help you print the string from that position till the end.
        Expected output: "Diana,George,Dodon,Plahotniuc"
        */
       String str[]= names.split(",",5);
       int j = 0;
       for (String tmp: str){
       ++j;
       if (j>4)
          System.out.println(tmp);
       }
    }
}

