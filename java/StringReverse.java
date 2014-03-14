
//  StringReverse.java (c) 2004 Kari Laitinen

//  http://www.naturalprogramming.com

//  2004-10-09  File created.
//  2004-12-19  Last modification.

import java.util.* ;

class StringReverse
{
   public static void main( String[] not_in_use )
   {
      Scanner keyboard = new Scanner( System.in ) ;

      System.out.print("\n This program is able to reverse a string."
                    +  "\n Please, type in a string.\n\n   " ) ;

      String  string_from_keyboard  =  keyboard.nextLine() ;

      System.out.print("\n String length is " + string_from_keyboard.length()
                    +  ".\n\n String in reverse character order: \n\n   " ) ;

      int character_index  =  string_from_keyboard.length() ;

      while (  character_index  >  0  )
      {
         character_index  --  ;
         System.out.print( string_from_keyboard.charAt( character_index ) ) ;
      }
   }
}





