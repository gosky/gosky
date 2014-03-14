import java.util.Scanner ;

class BirthdaysNew
{
   public static void main( String[] not_in_use )
   {
      Scanner keyboard = new Scanner( System.in ) ;

 
      ISODate date_of_birth  =  new  ISODate( "1992-11-04" ) ;

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
       
         ISODate date_to_increment = new ISODate( date_of_birth ) ;
         
              int day_counter = 0 ;
             
              while ( day_counter < 10000)
              {
                   date_to_increment.increment() ;
                   
                      day_counter ++ ;
                      
               }
               
                System.out.print(  "\n " + day_counter  + " " + "days"  + " " + date_to_increment   + " " + date_to_increment.get_day_of_week() + " " + "27 years 4 months 15 days" + "\n");

   }
}
