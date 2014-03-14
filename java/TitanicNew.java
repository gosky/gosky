
//  TitanicNew.java  (c) Kari Laitinen

//  http://www.naturalprogramming.com

//  2004-10-06  Original file Titanic.java was created.
//  2012-11-14  This program was made to use the newer ISODate class.
//  2012-11-14  Last modification.

//  When this program is compiled, the file ISODate.java
//  must be in the same folder (directory) together with this file.

class TitanicNew
{
   public static void main( String[] not_in_use )
   {
      ISODate date_when_xuetao_birthday = new ISODate( "1993-09-17" ) ;

      ISODate date_of_today = new ISODate() ;

      int[] time_from_sinking = new int[ 3 ] ;

      date_of_today.get_distance_to( date_when_xuetao_birthday,
                                     time_from_sinking ) ;

      System.out.print( "\n Today it is "  +  date_of_today
                     +  ".\n On "  +  date_when_xuetao_birthday
                     +  "\n the famous person \"xuetao's age\" "
                     +  "\n is \n "
                     +  time_from_sinking[ 0 ]  +  " years, "
                     +  time_from_sinking[ 1 ]  +  " months, and "
                     +  time_from_sinking[ 2 ]  +  " days ago. \n\n" ) ;
   }
}


