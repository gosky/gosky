
//  BirthdaysNew.java  Copyright (c) Kari Laitinen

//  http://www.naturalprogramming.com

//  2004-09-26  Original Birthdays.java was created.
//  2012-11-14  Class ISODate was taken into use.
//  2012-11-14  Last modification.

//  When this program is compiled, the file ISODate.java
//  must be in the same folder (directory) together with this file.

import java.util.Scanner ;

class BirthdaysNew
{
   public static void main( String[] not_in_use )
   {
      Scanner keyboard = new Scanner( System.in ) ;

      System.out.print( "\n Type in your date of birth as YYYY-MM-DD:  " ) ;

      String date_of_birth_as_string  =  keyboard.nextLine() ;

      ISODate date_of_birth  =  new  ISODate( date_of_birth_as_string ) ;

      System.out.print(
         "\n   You were born on a "  +  date_of_birth.get_day_of_week()
       + "\n   Here are your days to celebrate. You are\n" ) ;

      int  years_to_celebrate  =  10 ;

      while ( years_to_celebrate  <  80 )
      {
         ISODate  date_to_celebrate  =  new  ISODate(

                      date_of_birth.year()  +  years_to_celebrate,
                      date_of_birth.month(),
                      date_of_birth.day() ) ;

         System.out.print( "\n   "  +  years_to_celebrate 
            +  " years old on "  +  date_to_celebrate
            +   " ("  +  date_to_celebrate.get_day_of_week()  +  ")" ) ;

         years_to_celebrate  =  years_to_celebrate  +  10 ;
         
         
         
         
      }
       ISODate date_to_increment = new ISODate( date_of_birth_as_string ) ;
         
              int day_counter = 0 ;
             
              while ( day_counter < 10000 )
              {
                   date_to_increment.increment() ;
                   
                      day_counter ++ ;
              }
              
              System.out.print("\n   "+ day_counter + " " + "days old on" + " " + date_to_increment + " "
                                      +  "("  +  date_to_increment.get_day_of_week()  +  ")" + " "
                                      );
                                      
               
             
              while ( day_counter < 20000)
              {
                   date_to_increment.increment() ;
                   
                      day_counter ++ ;
              }
              
              System.out.print("\n   "+ day_counter + " " + "days old on" + " " + date_to_increment + " "
                                      +  "("  +  date_to_increment.get_day_of_week()  +  ")" + " "
                                      );
              
              
   }
}


