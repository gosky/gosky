
//  BigLetters.java  (c) Kari Laitinen

//  http://www.naturalprogramming.com

//  2013-09-12  File created.
//  2013-09-12  Last modification.

/*  This program demonstrates:
      - definition and calling of a static method
      - the use of static data items that are visible to
        several methods inside a class
      - the use of arrays of strings
*/

import java.util.* ;

class BigLetters
{
   static String[] letter_A_data =
                               { "   XX     ",
                                 "  XXXX    ",
                                 " XX  XX   ",
                                 "XX    XX  ",
                                 "XXXXXXXX  ",
                                 "XX    XX  ",
                                 "XX    XX  " } ;

   static String[] letter_B_data =
                               { "XXXXXXX   ",
                                 "XX    XX  ",
                                 "XX    XX  ",
                                 "XXXXXXX   ",
                                 "XX    XX  ",
                                 "XX    XX  ",
                                 "XXXXXXX   " } ;

   static String[] letter_C_data =
                               { " XXXXXX   ",
                                 "XX    XX  ",
                                 "XX        ",
                                 "XX        ",
                                 "XX        ",
                                 "XX    XX  ",
                                 " XXXXXX   " } ;

   static String[] letter_W_data =
                               { "XX     XX    XX  ",
                                 "XX     XX    XX  ",
                                 "  XX   XX   XX",
                                 "    XX   XX  ",                                                                 
                                  } ;
   static String[] letter_D_data =
                                {
                                " XXXXXXX   ",
                                 "XX    XX  ",
                                 "XX     XX ",
                                 "XX     XX ",
                                 "XX     XX ",
                                 "XX    XX  ",
                                 "XXXXXXX   ",} ;
    static String[] letter_E_data =
                                {
                                " XXXXXX   ",
                                 "XX      ",
                                 "XX        ",
                                 "XXXXXX   ",
                                 "XX        ",
                                 "XX     ",
                                 "XXXXXXX   ",} ;                             

   static void print_big_letter( char given_letter )
   {
      if ( given_letter == 'A' )
      {
         for ( String letter_data_line : letter_A_data )
         {
           System.out.print( "" + letter_data_line.charAt(X 2)
                             + letter_data_line.charAt(X 2)
                              ) ;
         }
      }
      else if ( given_letter == 'B' )
      {
         for ( String letter_data_line : letter_B_data )
         {
            System.out.print( "\n " + letter_data_line ) ;
         }
      }
      else if ( given_letter == 'C' )
      {
         for ( String letter_data_line : letter_C_data )
         {
            System.out.print( "\n " + letter_data_line ) ;
         }
      }
      else if ( given_letter == 'D' )
      {
         for ( String letter_data_line : letter_D_data )
         {
            System.out.print( "\n " + letter_data_line ) ;
         }
      }
      else if ( given_letter == 'W' )
      {
         for ( String letter_data_line : letter_W_data )
         {
            System.out.print( "\n " + letter_data_line ) ;
         }
      }
      else if ( given_letter == 'E' )
      {
         for ( String letter_data_line : letter_E_data )
         {
            System.out.print( "\n " + letter_data_line ) ;
         }
      }


      System.out.print( "\n" ) ;

   }


   public static void main( String[] not_in_use )
   {
      Scanner  keyboard  =  new  Scanner( System.in ) ;


      print_big_letter( 'C' ) ;
      print_big_letter( 'A' ) ;
      print_big_letter( 'B' ) ;
      print_big_letter( 'W' ) ;
      print_big_letter( 'D' ) ;
      print_big_letter( 'E' ) ;
   }
}



