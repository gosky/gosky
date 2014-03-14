
//  ISODate.java  Copyright (c) Kari Laitinen

//  http://www.naturalprogramming.com

//  2012-11-14   File created.
//  2012-11-15   Last modification.


//  This file contains the definition of class ISODate.

//  ISO refers to International Standards Organization that
//  has provided a standard according to which date information
//  should be shown in the format YYYY-MM-DD. Objects of this
//  ISODate class can be easily converted to strings in which date
//  information is in ISO format.


import  java.util.Calendar ;
import  java.util.GregorianCalendar ;

class  ISODate
{
   protected int this_year, this_month, this_day ;
 
   public ISODate()
   {
      // This default constructor reads the current computer's date
      // by using the standard classes Calendar and GregorianCalendar.

      Calendar current_system_date = new GregorianCalendar() ;

      this_year  = current_system_date.get( Calendar.YEAR ) ;
      this_month = current_system_date.get( Calendar.MONTH )  +  1 ;
      this_day   = current_system_date.get( Calendar.DAY_OF_MONTH ) ;
   }

   public ISODate( int  given_year,
                   int  given_month,
                   int  given_day )
   {
      this_year          =  given_year ;
      this_month         =  given_month ;
      this_day           =  given_day ;
   }

   public ISODate( String  date_as_string )
   {
      //  This constructor accepts date strings in three formats:
      //
      //    YYYY-MM-DD  is the ISO 8601 format
      //    MM/DD/YYYY  is the American format.
      //    DD.MM.YYYY  is the format used in Europe.
      //
      //  It seems that by using the String method split() it is possible
      //  make the constructor to accept days and months that are 
      //  expressed only with a single digit.

      boolean  given_date_is_valid  =  true ;

      if ( date_as_string.indexOf( '/' )  !=  -1 )
      {
         //  Character '/' is contained in the given date.
         //  We'll think that it is a date in format MM/DD/YYYY

         String[] date_components  =  date_as_string.split( "[/]" ) ;

         this_day   = Integer.parseInt( date_components[ 1 ] ) ;
         this_month = Integer.parseInt( date_components[ 0 ] ) ;
         this_year  = Integer.parseInt( date_components[ 2 ] ) ;
      }
      else if ( date_as_string.indexOf( '.' ) !=  -1 )
      {
         //  We'll suppose the given date is in format DD.MM.YYYY

         String[] date_components  =  date_as_string.split( "[.]" ) ;

         this_day   = Integer.parseInt( date_components[ 0 ] ) ;
         this_month = Integer.parseInt( date_components[ 1 ] ) ;
         this_year  = Integer.parseInt( date_components[ 2 ] ) ;
      }
      else if ( date_as_string.indexOf( '-' ) !=  -1 )
      {
         //  We'll suppose the given date format is YYYY-MM-DD

         String[] date_components  =  date_as_string.split( "[-]" ) ;

         this_day   = Integer.parseInt( date_components[ 2 ] ) ;
         this_month = Integer.parseInt( date_components[ 1 ] ) ;
         this_year  = Integer.parseInt( date_components[ 0 ] ) ;
      }
      else
      {
         given_date_is_valid  =  false ;
      }

      if ( this_day  <  1  ||  this_day  >  31  ||
           this_month  <  1   ||  this_month  >  12 )
      {
         given_date_is_valid  =  false ;
      }

      if ( given_date_is_valid  ==  false )
      {
         System.out.print( "\n\n   "  +  date_as_string 
                        +  " is not a valid date.  \n\n" ) ;
      }
   }

   // The following is the copy constructor.

   public ISODate( ISODate another_date )
   {
      this_year   =  another_date.this_year ;
      this_month  =  another_date.this_month ;
      this_day    =  another_date.this_day ;
   }

   // The following are the getter methods for the three
   // data fields.

   public int   day()    {  return  this_day   ; }
   public int   month()  {  return  this_month ; }
   public int   year()   {  return  this_year  ; }

   public boolean is_last_day_of_month()
   {
      boolean  it_is_last_day_of_month  =  false ;

      if  (  this_day  >  27  )
      {
         if  (  this_day  ==  31 )
         {
            it_is_last_day_of_month  =  true ;
         }
         else if  ( ( this_day  ==  30 ) &&
                    ( this_month  ==  2  ||  this_month  ==  4  ||
                      this_month  ==  6  ||  this_month  ==  9  ||
                      this_month  ==  11 ) )
         {
            it_is_last_day_of_month  =  true ;
         }
         else if  ( this_day  ==  29  &&  this_month  ==  2 )
         {
            it_is_last_day_of_month  =  true ;
         }
         else if  ( this_day    ==  28  &&
                    this_month  ==   2  &&
                    ! this_is_a_leap_year() )
         {
            it_is_last_day_of_month  =  true ;
         }
      }

      return  it_is_last_day_of_month ;
   }

   public boolean this_is_a_leap_year()
   {
      boolean  return_code  =  false ;

      if  ( this_year  %  4   ==  0 )
      {
         //  Years which are equally divisible by 4 and which
         //  are not full centuries are leap years. Centuries
         //  equally divisible by 4 are, however, leap years.

         if  ( this_year  %  100  ==  0 )
         {
            int  century  =  this_year  /  100  ;

            if  ( century  %  4   ==   0 )
            { 
               return_code  =  true ;
            }
         }
         else
         {
            return_code  =  true ;
         }
      }

      return  return_code ;
   }

   public boolean is_within_dates( ISODate earlier_date,
                                   ISODate later_date   ) 
   {
      return (( is_equal_to( earlier_date )  )  ||
              ( is_equal_to(  later_date )   )  ||
              ( is_later_than( earlier_date ) &&
                is_earlier_than( later_date ) ) ) ;
   }

   public int index_for_day_of_week() 
   {
      //  day_index will get a value in the range from 0 to 6,
      //  0 meaning Monday and 6 meaning Sunday.

      int  day_index  =  0 ;
      ISODate  known_date  =  new  ISODate( 1997, 10, 6 ) ;
      // Oct. 6, 1997 is Monday.

      if  ( known_date.is_later_than( this ) )
      {
         while ( known_date.is_not_equal_to( this ) )
         {
            if ( day_index  >  0 )
            {
               day_index  --  ;
            }
            else
            {
               day_index  =  6 ;
            }

            known_date.decrement() ;
         }
      }
      else
      {
         while ( known_date.is_not_equal_to( this ) )
         {
            if ( day_index  <  6  )
            {
               day_index  ++  ;
            }
            else
            {
               day_index  =  0 ;
            }

            known_date.increment() ;
         }
      }

      return  day_index ;
   }

   public String  get_day_of_week()
   {
      String[]  days_of_week  =  { "Monday", "Tuesday", "Wednesday",
                       "Thursday", "Friday", "Saturday", "Sunday" } ;

      return  days_of_week[ index_for_day_of_week() ] ;
   }

   public void increment()
   {
      if  (  is_last_day_of_month() )
      {
         this_day   =  1 ;

         if  (  this_month  <  12  )
         {
            this_month  ++  ;
         }
         else
         {
            this_month  =  1  ;
            this_year  ++ ;
         }
      }
      else
      {
         this_day  ++  ;
      }
   }

   public void decrement()
   {
      if ( this_day  >  1  )
      {
         this_day  --  ;
      }
      else
      {
         if ( this_month  ==   5  ||  this_month  ==   7  ||
              this_month  ==  10  ||  this_month  ==  12  )
         {
            this_day    =  30 ;
            this_month  -- ;
         }
         else if ( this_month  ==   2  ||  this_month  ==   4  ||
                   this_month  ==   6  ||  this_month  ==   8  ||
                   this_month  ==   9  ||  this_month  ==  11  )
         {
            this_day    =  31 ;
            this_month  -- ;
         }
         else if (  this_month  ==  1  )
         {
            this_day    =  31  ;
            this_month  =  12  ;
            this_year   -- ;
         }
         else if (  this_month  ==  3  )
         {
            this_month  =  2  ;

            if ( this_is_a_leap_year() )
            {
               this_day  =  29  ;
            }
            else
            {
               this_day  =  28  ;
            }
         }
      }
   }

   public void get_distance_to( ISODate another_date,
                                int[]   distance_to_caller )
   {
      int years_of_distance, months_of_distance, days_of_distance ;
      ISODate  start_date, end_date ;
      int   start_day, end_day ;

      if ( this.is_earlier_than( another_date ) )
      {
         start_date  =  this ;
         end_date    =  another_date ;  
      }
      else
      {
         start_date  =  another_date ;
         end_date    =  this ;
      }

      //  We will suppose that day 30 is the last day of every
      //  month. This way we minimize calculation errors.

      if ( start_date.is_last_day_of_month() ||
           ( start_date.day()    ==  28  &&
             start_date.month()  ==  2  )    )
      {
         start_day   =  30  ;
      }
      else
      {
         start_day   =  start_date.day() ;
      }

      if ( end_date.is_last_day_of_month() ||
           ( end_date.day()    ==  28  &&
             end_date.month()  ==  2  )    )
      {
         end_day   =  30  ;
      }
      else
      {
         end_day   =  end_date.day() ;
      }

      years_of_distance  =  end_date.year()  - start_date.year() ;
      months_of_distance =  end_date.month() - start_date.month() ;
      days_of_distance   =  end_day  -  start_day ;

      if ( days_of_distance  <  0 )
      {
         months_of_distance  --  ;
         days_of_distance  =  days_of_distance  +  30 ;
      }

      if ( months_of_distance  <  0 )
      {
         years_of_distance   --  ;
         months_of_distance  =  months_of_distance +  12 ;
      }

      // This method delivers data to its caller in an array of type int.
      // The array must be created by the caller of this method.

      distance_to_caller[ 0 ] = years_of_distance ;
      distance_to_caller[ 1 ] = months_of_distance ;
      distance_to_caller[ 2 ] = days_of_distance ;
   }

   public int get_week_number()
   {
      // January 1, 1883 was a Monday with week number 1.
      // January 1, 1990 was a Monday with week number 1.

      ISODate  date_to_increment  =  new  ISODate( 1883, 1, 1 ) ;
      int    week_number  =  1 ;
      int    local_index_for_day_of_week  =  0 ; // 0 means Monday

      while ( date_to_increment.is_earlier_than( this ) )
      {
         date_to_increment.increment() ;
 
         if ( local_index_for_day_of_week  ==  6  ) // 6 means Sunday
         {
            local_index_for_day_of_week  =  0 ; // back to Monday

            if  ( week_number  <   52 )
            {
               week_number  ++  ;
            }
            else  if  ( week_number  ==  52 )
            {
               if ( date_to_increment.day()    <=  28  &&
                    date_to_increment.month()  ==  12  )
               {
                  week_number  =  53 ;
               }
               else
               {
                  week_number  =  1  ;
               }
            }
            else  // must be week_number  53 
            {
               week_number  =  1 ;
            }
         }
         else
         {
            local_index_for_day_of_week  ++  ;
         }
      }

      return  week_number  ;
   }


   public boolean is_equal_to( ISODate another_date )
   {
      return ( this_day    ==  another_date.day()    &&
               this_month  ==  another_date.month()  &&
               this_year   ==  another_date.year()  ) ;
   }

   public boolean is_not_equal_to( ISODate another_date )
   {
      return ( this_day    !=  another_date.day()    ||
               this_month  !=  another_date.month()  ||
               this_year   !=  another_date.year()  ) ;
   }

   public boolean is_earlier_than( ISODate another_date )
   {
      return ( (   this_year  <   another_date.year()     )  ||
               ( ( this_year  ==  another_date.year() )  &&
                 ( this_month <   another_date.month() )  )  ||
               ( ( this_year  ==  another_date.year() )  &&
                 ( this_month ==  another_date.month() ) &&
                 ( this_day   <   another_date.day() )   )    ) ;
   }

   public boolean is_later_than( ISODate another_date )
   {
      return ( (   this_year  >   another_date.year()     )  ||
               ( ( this_year  ==  another_date.year() )  &&
                 ( this_month >   another_date.month() )  )  ||
               ( ( this_year  ==  another_date.year() )  &&
                 ( this_month ==  another_date.month() ) &&
                 ( this_day   >   another_date.day() )   )    ) ;
   }


   public boolean is_in_year_of( ISODate another_date )
   {
      return ( this_year  ==  another_date.this_year ) ;
   }

   public boolean is_in_month_of( ISODate another_date )
   {
      return ( this_year   ==  another_date.this_year  &&
               this_month  ==  another_date.this_month ) ;
   }


   public String toString()
   {
      // This method return 'this' date as a string in the YYYY-MM-DD format.

      return String.format( "%d-%02d-%02d", this_year, this_month, this_day ) ;
   }
}








