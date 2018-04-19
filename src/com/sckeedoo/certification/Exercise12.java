
package com.sckeedo.certification;
import java.util.Arrays;
public class Exercise12 {

    public static void main(String[] args) {
        String names = "John,Steve,Bob,Anna,Diana,George,Dodon,Plahotniuc";

       /*
       * Use JDK documentation for StringBuilder class and find the method that
       * would help you print the string in reverse order.
       * Output: "nhoJ,evetS,boB,annA,anaiD,egroeG,nodoD,cuintohalP"
       * */
       String str[]= names.split(",");
       StringBuilder sb = new StringBuilder();
       StringBuilder sp = new StringBuilder();
       for ( String tmp:str){
       { 
          sb.append(tmp);
          sb.reverse();
          sp.append(sb + ",");
          sb.delete(0, sb.length());
       } 
    }
       sp.delete(sp.length()-1, sp.length());
       System.out.println(sp);
}
    
}
