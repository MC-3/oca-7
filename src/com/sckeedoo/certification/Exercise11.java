
package com.sckeedo.certification;

public class Exercise11 {

    public static void main(String[] args) {
        String[] names = {"John", "Steve","Bob", "Anna", "Diana", "George", "Dodon", "Plahotniuc"};

       /*
       * Use the StringBuilder to join all the array elements into one single string.
       * Elements should be comma separated.
       *
       * Output: "John,Steve,Bob,Anna,Diana,George,Dodon,Plahotniuc"
       * */
       StringBuilder s1 = new StringBuilder();
       for (int i=0; i<names[i].length();i++)
       {s1.append(names[i]);}  
      System.out.println(s1);
    }
}
    