
//  RandomNumbersInArray.java  (c) 2005 Kari Laitinen

//  http://www.naturalprogramming.com

//  2013-09-18  File created.
//  2013-09-18  Last modification.

//  This program generates random integers and puts them into an array.

class RandomNumbersInArray
{
   public static void main( String[] not_in_use )
   {
      int[] random_numbers = new int[ 7 ] ;


      for ( int number_index = 0 ;
                number_index < random_numbers.length ;
                number_index ++ )
      {
         // Math.random() returns a double value in the range 0 .... 0.99999999
         // The returned random value can be zero but it cannot be one.

         random_numbers[ number_index ] = ( (int) ( Math.random() * 40 ) ) + 1 ;
      }

      // Now the array should contain random integers in range 1 ... 40

      System.out.print( "\n Random numbers: \n\n " ) ;

      for ( int number_index = 0 ;
                number_index < random_numbers.length ;
                number_index ++ )
      {
         System.out.printf( "%4d", random_numbers[ number_index ] )  ;
      }


      System.out.print( "\n\n" ) ;

   }
}



