package com.sckeedo.certification;
public class Exercise2 {
    public static void main(String[] args) {
        String abracadabra = "abracadabra";
       /* Use JDK documentation for String class and find a method that
        would help you determine all the indexes of the letter 'a' in abracadabra.
        Output: Print all letter 'a' indexes on a separate line.
        */
        String str1 = "";
       for (int i=0; i<abracadabra.length(); i++)
       { if (abracadabra.charAt(i)==97)
            { str1 += " " + i; }  
       }
       System.out.println(str1);
  //System.out.println(abracadabra.indexOf (97,4));
    }
}