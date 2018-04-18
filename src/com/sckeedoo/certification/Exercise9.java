
package com.sckeedo.certification;

public class Exercise9 {

    public static void main(String[] args) {
        String names = "John,Steve,Bob,Anna,Diana,George,Dodon,Plahotniuc";
           /* Use JDK documentation for String class and find the methods that
            would help you determine if 'Steve' and 'Maria' are part of the names string.
            Output print:
            'Maria is not part of the names variable'
            'Steve is part of the names variable'
            */
           String str1="Maria";
           if (names.contains(str1))
           { System.out.println( str1 + " is part of the names variable");}
           else  { System.out.println( str1 + " is not part of the names variable");}
           
            String str2 = "Steve";
           if (names.contains(str2))
           { System.out.println( str2 + " is part of the names variable");}
           else  { System.out.println( str2 + " is not part of the names variable");}
           
    }
}

