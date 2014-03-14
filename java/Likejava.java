
//  Likejava.java  (c) 2004 Kari Laitinen

//  http://www.naturalprogramming.com

//  2004-10-10  File created.
//  2004-12-19  Last modification.

import java.util.* ;

class Likejava
{
   public static void main( String[] not_in_use )
   {
      Scanner keyboard = new Scanner( System.in ) ;

      char  character_from_keyboard ;

      System.out.print( "\n Do you like the Java programming language?" 
                     +  "\n Please, answer Y or N :  " ) ;

      character_from_keyboard  =  keyboard.nextLine().charAt( 0 ) ;

      if ( ( character_from_keyboard  ==  'Y' ) || 
           ( character_from_keyboard  ==  'y' ) )
      {
         System.out.print( "\n That's nice to hear. \n" ) ;
      }
      else if ( ( character_from_keyboard  ==  'N' ) ||
                ( character_from_keyboard  ==  'n' ) )
      {
         System.out.print( "\n That is not so nice to hear. "
                        +  "\n I hope you change your mind soon.\n" ) ;
      }
      else
      {
         System.out.print( "\n I do not understand \""
                        +  character_from_keyboard   +  "\".\n" ) ;
      }
   }
}



