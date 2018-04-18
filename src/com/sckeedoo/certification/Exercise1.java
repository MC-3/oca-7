package com.sckeedo.certification;
public class Exercise1 {
    public static void main(String[] args) {
	      String alice = "Alice";
	      String bob = "Bob";
       /* Use JDK documentation for String and find a method that
        would help you determine which of the strings above lexicographically
        precede the second and print that string.
        */
              if (alice.compareTo(bob)<0) {System.out.println(alice);}
              else {System.out.println(bob);}
    }
}