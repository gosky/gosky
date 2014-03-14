
//  ArrayListDemo.java  (c) 2005 Kari Laitinen

//  http://www.naturalprogramming.com

//  This program demonstrates the methods of the standard
//  class ArrayList.

//  2005-05-10  File created.
//  2005-06-07  Last modification.

//  There are some notes at the end of this file.

import java.util.* ;

class ArrayListDemo
{
   static void print_array( ArrayList<Integer> given_array )
   {
      System.out.print( "\n\n " ) ;

      for ( int element_index  =  0 ;
                element_index  <  given_array.size() ;
                element_index  ++ )
      {
         System.out.printf( "%5s", given_array.get( element_index ) ) ;
      }
   }

   public static void main( String[] not_in_use )
   {
      ArrayList<Integer> array_of_integers  =  new  ArrayList<Integer>() ;

      array_of_integers.add( 202 ) ;
      array_of_integers.add( 101 ) ;
      array_of_integers.add( 505 ) ;
      array_of_integers.add( 404 ) ;

      System.out.print( "\n Value 404 has index:  "
                  +  array_of_integers.indexOf( 404 )  ) ;
      print_array( array_of_integers ) ;

      array_of_integers.add( 2, 999 ) ;
      array_of_integers.add( 2, 888 ) ;
      print_array( array_of_integers ) ;

      array_of_integers.remove( 4 ) ;
      print_array( array_of_integers ) ;

      array_of_integers.remove( new Integer( 888 ) ) ;
      print_array( array_of_integers ) ;

      ArrayList<Integer> another_array  =   new  ArrayList<Integer>() ;
      another_array.add( 777 ) ;
      another_array.add( 666 ) ;
      print_array( another_array ) ;

      array_of_integers.addAll( another_array ) ;
      print_array( array_of_integers ) ;

      array_of_integers.set( 3, array_of_integers.get( 3 )  +  7 ) ;
      print_array( array_of_integers ) ;
   }
}

/*****

   You can write the header (declarator) of method print_array()
   in the following ways

   static void print_array( ArrayList<?> given_array )

   static void print_array( ArrayList<? extends Object> given_array )

   The following header is not accepted since it accepts only 
   arrays of type Object:

   static void print_array( ArrayList<Object> given_array )


*****/


