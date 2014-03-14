
//  MorseCodes.java (c) 2005 Kari Laitinen

//  http://www.naturalprogramming.com

//  2004-09-26  File created.
//  2005-05-10  Last modification.

import java.util.* ;

class MorseCodes
{
   public static void main( String[] not_in_use )
   {
      Scanner keyboard = new Scanner( System.in ) ;

      String[]  array_of_morse_codes  =

       { "A", ".-",   "B", "-...", "C", "-.-.", "D", "-..", "E", ".",
         "F", "..-.", "G", " --.", "H", "....", "I", "..",  "J", ".---",
         "K", "-.-",  "L", ".-..", "M", "--",   "N", "-.",  "O", "---",
         "P", ".--.", "Q", "--.-", "R", ".-.",  "S", "...", "T", "-",   
         "U", "..-",  "V", "...-", "W", ".--",  "X", "-..-","Y", " -.--", 
         "Z", "--..", "1", ".----","2", "..---","3", "...--","4","....-",
         "5", ".....","6", "-....","7", "--...","8", "---..","9","----.",
         "0", "-----"," ", "     "  } ;

      ArrayList<String> arraylist_of_morse_codes = new ArrayList<String>() ;

      Collections.addAll( arraylist_of_morse_codes, array_of_morse_codes ) ;

      System.out.print( "\n  Type in your name: " ) ;

      String  given_name  =  keyboard.nextLine().toUpperCase() ;

      System.out.print( "\n  Your name in Morse codes is: \n\n" ) ;

      for ( int character_index  =  0 ;
                character_index  <  given_name.length() ;
                character_index  ++ )
      {
         int index_of_character_in_arraylist  =
                arraylist_of_morse_codes.indexOf( 
                       ""  +  given_name.charAt( character_index ) ) ;

         if ( index_of_character_in_arraylist  !=  -1 )
         {
            System.out.print( "   "  +  
                      arraylist_of_morse_codes.get(
                                  index_of_character_in_arraylist + 1 ) ) ;
         }
      }
   }
}











