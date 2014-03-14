
//  CalendarsNew.java  Copyright (c) Kari Laitinen

//  http://www.naturalprogramming.com

//  2004-10-07  Calendars.java was created.
//  2012-11-20  Class ISODate is used in place of Date
//  2012-11-21  Last modification.

//  The file ISODate.java must be in the same folder
//  with this file during compilation.

class  EnglishCalendar
{
   protected  int  this_year ;
   protected  int  this_month ;

   protected  String[]  names_of_months ;
   protected  String    week_description ;

   public EnglishCalendar() {}

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


   public void print()
   {
      ISODate a_day_in_this_month  =  new  ISODate( this_year, this_month, 1 ) ;

      int day_of_week_index   =  0 ;

      int day_of_week_of_first_day  =
                          a_day_in_this_month.index_for_day_of_week() ;

      System.out.print(
            "\n\n   "  +  names_of_months[ this_month - 1 ]
         +  "  "  +  this_year  +  "\n\n"  +  week_description   +  "\n\n" );

      System.out.printf( "%4d  ",  a_day_in_this_month.get_week_number() ) ;

      // The first week of a month is often an incomplete week, 
      // i.e., the first part of week belongs to the previous
      // month. In place of the days that belong to the previous
      // month we print just spaces.

      while ( day_of_week_index != day_of_week_of_first_day )
      {
         System.out.print( "     " )  ;
         day_of_week_index  ++ ;
      }

      while ( this_month  ==  a_day_in_this_month.month() )
      {
         if ( day_of_week_index  >=  7 )
         {
            System.out.printf( "\n%4d  ",
                               a_day_in_this_month.get_week_number() ) ;

            day_of_week_index  =  0 ;
         }

         System.out.printf( "%5d", a_day_in_this_month.day() ) ;

         a_day_in_this_month.increment() ;

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


class  CalendarsNew
{
   public static void main( String[] not_in_use )
   {
      EnglishCalendar an_english_calendar = new EnglishCalendar( 2012, 11 ) ;

      an_english_calendar.print() ;

      SpanishCalendar a_spanish_calendar  = new SpanishCalendar( 2014, 7 ) ;

      a_spanish_calendar.print() ;
   }
}


