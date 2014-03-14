
//  Birthdays.java  Copyright (c) 2005 Kari Laitinen

//  http://www.naturalprogramming.com

//  2004-09-26  File created.
//  2005-07-25  Last modification.

//  When this program is compiled, Date.java and DateDistance.java
//  must be in the same folder (directory) together with this file.

import java.util.Scanner ;

class Birthdays
{
   public static void main( String[] not_in_use )
   {
      Scanner keyboard = new Scanner( System.in ) ;

      System.out.print( "\n Type in your date of birth as DD.MM.YYYY"
                     +  "\n or MM/DD/YYYY. Use four digits for the year"
                     +  "\n and two digits for the month and day:  " ) ;

      String  date_of_birth_as_string   =  keyboard.nextLine() ;

      Date date_of_birth  =  new  Date( date_of_birth_as_string ) ;

      System.out.print(
         "\n   You were born on a "  +  date_of_birth.get_day_of_week()
       + "\n   Here are your days to celebrate. You are\n" ) ;

      int  years_to_celebrate  =  10 ;

      while ( years_to_celebrate  <  80 )
      {
         Date  date_to_celebrate  =  new  Date(

                      date_of_birth.day(),
                      date_of_birth.month(),
                      date_of_birth.year()  +  years_to_celebrate,
                      date_of_birth.get_date_print_format() ) ;

         System.out.print( "\n   "  +  years_to_celebrate 
            +  " years old on "  +  date_to_celebrate
            +   " ("  +  date_to_celebrate.get_day_of_week()  +  ")" ) ;

         years_to_celebrate  =  years_to_celebrate  +  10 ;
      }
   }
}


