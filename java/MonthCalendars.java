
//  MonthCalendars.java  Copyright (c) Kari Laitinen

//  http://www.naturalprogramming.com

//  2012-11-21  File created.
//  2012-11-21  Last modification.

import java.util.Calendar ;
import java.util.GregorianCalendar ;

import java.util.Scanner ;

class  EnglishCalendar
{
   protected  int  this_year ;
   protected  int  this_month ;

   protected  String[]  names_of_months ;
   protected  String    week_description ;

   public EnglishCalendar()
   {}

   public EnglishCalendar( int given_year, int given_month )
   {
      String[]  english_names_of_months  =  

         { "January", "February", "March", "April",
           "May", "June", "July", "August",
           "September", "October", "November", "December" } ;

      String  english_week_description  =

          " Week   Mon  Tue  Wed  Thu  Fri  Sat  Sun" ;

      names_of_months   =  english_names_of_months ;

      week_description  =  english_week_description ;

      this_year   =  given_year  ;
      this_month  =  given_month ;
   }

   public int get_calendar_year()
   {
      return this_year ;
   }

   public int get_calendar_month()
   {
      return this_month ;
   }


   public void increment_calendar_month()
   {
      this_month ++ ;

      if ( this_month > 12 )
      {
         this_month = 1 ;
         this_year ++ ;
      }
    }
      
      public  void decrement_calendar_month()
   {
      this_month -- ;

      if ( this_month > 12 )
      {
         this_month = 1 ;
         this_year ++;
      }
  }
     public int go_calendar_year() 
     {
      return this_year = this_year + 1 ;
     }
     
      public int go_calendar_month() 
     {
      return this_month =  1 ;
     }
   
   
  

   public void print()
   {
      Calendar a_day_in_this_month  =
                  new  GregorianCalendar( this_year, this_month - 1, 1 ) ; 
                  

      a_day_in_this_month.setFirstDayOfWeek( Calendar.MONDAY ) ;

      // In the standard Java calendar-related classes
      // Calendar.SUNDAY == 1, Calendar.MONDAY == 2, ...., Calendar.SATURDAY == 7

      int day_of_week_index   =  0 ;

      int day_of_week_of_first_day  =
                          a_day_in_this_month.get( Calendar.DAY_OF_WEEK ) ;

      System.out.print(
            "\n\n   "  +  names_of_months[ this_month - 1 ]
         +  "  "  +  this_year  +  "\n\n"  +  week_description   +  "\n\n" );

      System.out.printf( "%4d  ",  a_day_in_this_month.get( Calendar.WEEK_OF_YEAR ) ) ;

      // The first week of a month is often an incomplete week, 
      // i.e., the first part of week belongs to the previous
      // month. In place of the days that belong to the previous
      // month we print just spaces.

      while ( day_of_week_index < 6 &&
              day_of_week_index != ( day_of_week_of_first_day - 2 ) )
      {
         System.out.print( "     " )  ;
         day_of_week_index  ++ ;
      }

      while ( ( this_month - 1 )  ==  a_day_in_this_month.get( Calendar.MONTH ) )
      {
         if ( day_of_week_index  >=  7 )
         {
            System.out.printf( "\n%4d  ",
                               a_day_in_this_month.get( Calendar.WEEK_OF_YEAR ) ) ;

            day_of_week_index  =  0 ;
         }

         System.out.printf( "%5d", a_day_in_this_month.get( Calendar.DAY_OF_MONTH ) ) ;

         a_day_in_this_month.add( Calendar.DAY_OF_MONTH, 1 ) ;

         day_of_week_index  ++  ;
      }

      System.out.print( "\n" ) ;
   }
}



class  SpanishCalendar  extends  EnglishCalendar
{
   public SpanishCalendar( int given_year, int given_month )
   {
      String[]  spanish_names_of_months  =


         { "Enero", "Febrero", "Marzo", "Abril",
           "Mayo", "Junio", "Julio", "Agosto",
           "Septiembre", "Octubre", "Noviembre", "Diciembre" } ;

      String   spanish_week_description  =

           "Semana  Lun  Mar  Mie  Jue  Vie  Sab  Dom" ;

      names_of_months   =  spanish_names_of_months ;
      week_description  =  spanish_week_description ;

      this_year   =  given_year  ;
      this_month  =  given_month ;
   }
}

class  GermanCalendar  extends  EnglishCalendar 
{
	 public GermanCalendar( int given_year, int given_month )
	{
	   String[] german_names_of_months =
	   
          { "Januar", "Februar", "Marz", "April",
            "Mai", "Juni", "Juli", "August",
            "September", "Oktober", "November", "Dezember"} ;
            
      String german_week_description =

    "Woche  Mon  Die  Mit  Don  Fre  Sam  Son" ;    
    
     names_of_months   =  german_names_of_months ;     
     week_description  =  german_week_description ;
     
      this_year   =  given_year  ;
      this_month  =  given_month ;
	}
}

class  MonthCalendars
{     
           
   public static void main( String[] not_in_use )
   {
      Scanner  keyboard  =  new  Scanner( System.in ) ;

      SpanishCalendar a_spanish_calendar  = new SpanishCalendar( 2012, 11 ) ;

      a_spanish_calendar.print() ;


    	Calendar current_system_date = new GregorianCalendar() ;
	int current_year = current_system_date.get( Calendar.YEAR ) ;
	int current_month = current_system_date.get( Calendar.MONTH ) + 1 ;
	
      EnglishCalendar calendar_to_print = new EnglishCalendar(current_year,current_month ) ;

      calendar_to_print.print() ;
      
      
      GermanCalendar a_german_calendar  = new GermanCalendar( 2012, 11 ) ;
      
      a_german_calendar.print() ;     


      String  user_selection  =  "????"  ;

      System.out.print("\n This program prints calendars. Please, select from"
                    +  "\n the following menu by typing in a letter. ") ;

      while ( user_selection.charAt( 0 )  !=  'e' )
      {
         System.out.print("\n\n   p   Print current calendar."
                         +  "\n   n   Print next calendar."
                         +  "\n   s   Switch to Spanish calendars."
                         +  "\n   g   Switch to German calendars."
                         +  "\n   y   To see the calendar of the first month of the next year."
                         +  "\n   e   Exit the program.\n\n   " ) ;

         user_selection  =  keyboard.nextLine() ;

         if ( user_selection.charAt( 0 )  ==  'p' )
         {
            calendar_to_print.decrement_calendar_month() ;
            calendar_to_print.print() ;
         }
         else if ( user_selection.charAt( 0 )  ==  'n' )
         {
            calendar_to_print.increment_calendar_month() ;

            calendar_to_print.print() ;
         }
         else if ( user_selection.charAt( 0 )  ==  'g' )
         {
         	calendar_to_print =
                 new GermanCalendar( calendar_to_print.get_calendar_year(),
                                      calendar_to_print.get_calendar_month() ) ;                                     
          calendar_to_print.print() ;
         }
         
          else if ( user_selection.charAt( 0 )  ==  'y' )
          {
          	calendar_to_print.go_calendar_year();
          	calendar_to_print.go_calendar_month();
          	calendar_to_print.print() ;
          	}
         
         else if ( user_selection.charAt( 0 )  ==  's' )
         {
            // We'll take the calendar year and month from the old calendar
            // object and use them to create a SpanishCalendar object.

            calendar_to_print =
                 new SpanishCalendar( calendar_to_print.get_calendar_year(),
                                      calendar_to_print.get_calendar_month() ) ;

            calendar_to_print.print() ;
         }
      }

   }
}


