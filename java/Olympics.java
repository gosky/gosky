 
/*  Olympics.java  Copyright (c) Kari Laitinen

    This program demonstrates the use of an array of
    objects, or, more precisely, an array that contains
    references to objects.

    The program first introduces a class named Olympics.
    An Olympics object can contain the data of olympic games.
    By using the Olympics class, an array named olympics_table
    is defined inside the main() method. olympics_table is
    used to search for data of olympic games.

    At the end of this file, you'll find another way to create
    the Olympics objects for olympics_table.
*/

//  http://www.naturalprogramming.com

//  2003-08-28  File created.
//  2013-10-18  Last modification.

//  In a command prompt window, compile: javac Olympics.java
//  In a command prompt window, run:     java OlympicsDataFinder

import java.util.* ;

class  Olympics
{
   int     olympic_year  ;
   String  olympic_city ;
   String  olympic_country ;

   public Olympics( int    given_olympic_year,
                    String given_olympic_city,
                    String given_olympic_country )
   {
      olympic_year    =  given_olympic_year ;
      olympic_city    =  given_olympic_city ;
      olympic_country =  given_olympic_country ;
   }
   
   public Olympics() {}

   public int get_year()
   {
      return  olympic_year ;
   }

   public void print_olympics_data()
   {
      System.out.print( "\n    In "  +  olympic_year  +
              ", Olympic Games were held in " +  olympic_city  +
              ", "  +  olympic_country  +  ".\n" ) ;
   }
   
  
}

class  OlympicsDataFinder
{
   public static void main( String[] not_in_use )
   { Olympics[]  olympics_table  =
     
      {
         new Olympics( 1896, "Athens",   "Greece" ),
         new Olympics( 1900, "Paris",    "France" ),
         new Olympics( 1904, "St. Louis", "U.S.A." ),
         new Olympics( 1906, "Athens",   "Greece"  ), 
         new Olympics( 1908, "London",   "Great Britain" ),
         new Olympics( 1912, "Stockholm","Sweden" ),
         new Olympics( 1920, "Antwerp",  "Belgium"   ),
         new Olympics( 1924, "Paris",    "France"    ),
         new Olympics( 1928, "Amsterdam","Netherlands"),
         new Olympics( 1932, "Los Angeles", "U.S.A."),
         new Olympics( 1936, "Berlin",  "Germany"   ),
         new Olympics( 1948, "London",  "Great Britain" ),
         new Olympics( 1952, "Helsinki","Finland"  ),
         new Olympics( 1956, "Melbourne","Australia" ),
         new Olympics( 1960, "Rome",     "Italy"   ),
         new Olympics( 1964, "Tokyo",    "Japan"   ),
         new Olympics( 1968, "Mexico City","Mexico" ),
         new Olympics( 1972, "Munich",   "West Germany" ),
         new Olympics( 1976, "Montreal", "Canada"  ),
         new Olympics( 1980, "Moscow",   "Soviet Union" ),
         new Olympics( 1984, "Los Angeles","U.S.A."),
         new Olympics( 1988, "Seoul",    "South Korea"),
         new Olympics( 1992, "Barcelona","Spain"   ),
         new Olympics( 1996, "Atlanta",  "U.S.A." ),
         new Olympics( 2000, "Sydney",   "Australia" ),
         new Olympics( 2004, "Athens",   "Greece"  ),
         new Olympics( 2008, "Beijing",  "China"   ),
         new Olympics( 2012, "London",   "Great Britain" ),
         new WinterOlympics( 2006, "Torino", "Italia" )
      } ;




      System.out.print("\n This program can tell where the Olympic "
                     + "\n Games were held in a given year. Give "
                     + "\n a year by using four digits: "  ) ;

      Scanner  keyboard  =  new Scanner( System.in ) ;
      int  given_year  =  keyboard.nextInt() ;

      int  olympics_index  =  0 ;

      boolean table_search_ready  =  false ;

      while ( table_search_ready  ==  false )
      {
         if (  olympics_index >= olympics_table.length )
         {
            System.out.print( "\n    Sorry, no Olympic Games were held in "
                           +  given_year  + ".\n" ) ;

            table_search_ready  =  true ;
         }
         else if ( olympics_table[ olympics_index ].get_year()  ==  given_year )
         {
            olympics_table[ olympics_index ].print_olympics_data() ;

            table_search_ready  =  true ;
         }
         
         else
         {
            olympics_index  ++  ;
         }
      }
   }
}

 class WinterOlympics extends Olympics
 {
   public WinterOlympics( int    given_olympic_year,
                           String given_olympic_city,
                          String given_olympic_country )
   {
      olympic_year    =  given_olympic_year ;
      olympic_city    =  given_olympic_city ;
      olympic_country =  given_olympic_country ;
   }

   
   public void print_olympics_data()
   {
      System.out.print( "\n    In "  +  olympic_year  +
              ", Winter Olympic Games were held in " +  olympic_city  +
              ", "  +  olympic_country  +  ".\n" ) ;
   }
    
   
 	  
}