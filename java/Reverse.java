

//  Reverse.java  (c) 2004 Kari Laitinen

//  http://www.naturalprogramming.com

//  2004-10-10  File created.
//  2004-12-19  Last modification.

import java.util.* ;

class Reverse
{
   public static void main( String[] not_in_use )
   {
      Scanner keyboard = new Scanner( System.in ) ;

      int[] array_of_integers      =  new  int[ 100 ] ;
      int   integer_index          =  0 ;
      int   integer_from_keyboard  =  0 ;
      int   index_for_previous_numbers = 0 ;
      boolean integer_previously_given = false ;
      System.out.print("\n This program reads integers from the keyboard."
                 +  "\n After receiving a zero, it prints the numbers"
                 +  "\n in reverse order. Please, start entering numbers."
                 +  "\n The program will stop when you enter a zero.\n\n") ;
      do
      {
         System.out.print( " "  +  integer_index  +  "  Enter an integer: ") ;
         integer_from_keyboard  =  keyboard.nextInt() ;
         
         if ( integer_from_keyboard > 0 &&
              integer_from_keyboard < 40 )
         {
            array_of_integers[ integer_index ]  =  integer_from_keyboard ;
            integer_index  ++;        
         }
          
      }
       while  ( integer_from_keyboard  !=  0 ) ;

      System.out.print( "\n Normal order:  " ) ;
     


      int number_of_given_integers = integer_index ;

      integer_index = 0 ;

      while  ( integer_index  < number_of_given_integers )
      {

         System.out.print( array_of_integers[ integer_index ]  +  "   " ) ;        
         integer_index  ++; 
         
      } 
   }
 }





