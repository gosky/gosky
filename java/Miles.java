
//  Miles.java  (c) 2004 Kari Laitinen

import  java.util.* ;

class conversion
{
   public static void main( String[] not_in_use )
   {
      Scanner keyboard = new Scanner( System.in ) ;
       char  character_from_keyboard ;
       System.out.print( "\n m to k or k to m "
                     +  "\n Please, answer Y or N :  " ) ;
    character_from_keyboard  =  keyboard.nextLine().charAt( 0 ) ;
    
    
      if ( ( character_from_keyboard  ==  'Y' ) || 
           ( character_from_keyboard  ==  'y' ) )
        {
    






     double  distance_in_miles  =  10.00 ;
     double  distance_in_kilometers = 16.09;
    
      
     
     
     
     System.out.print("\n miles kilometers" );
     
     while ( distance_in_miles  <= 110 )
     {
        distance_in_kilometers  =  1.6093F * distance_in_miles ;
        
        System.out.printf( "\n %.3f miles is %.3f kilometers.",
                         distance_in_miles,  distance_in_kilometers   ) ;

        
        distance_in_miles =distance_in_miles+10;
}
     }
      
      
      
     else if ( ( character_from_keyboard  ==  'N' ) ||
                ( character_from_keyboard  ==  'n' ) )
  {

       double   distance_in_miles_2  =  6.21;
     double  distance_in_kilometers_2 = 10.00;
     
     
      while ( distance_in_kilometers_2  <= 110 )
     {
        distance_in_miles_2  =  distance_in_kilometers_2/  1.6093F ;
        
        System.out.printf( "\n %.3f miles is %.3f kilometers.",
                         distance_in_miles_2,  distance_in_kilometers_2   ) ;

        
        distance_in_kilometers_2 =distance_in_kilometers_2+10;

     }

       }      
        else
      {
         System.out.print( "\n I do not understand \""
                        +  character_from_keyboard   +  "\".\n" ) ;
      }
             
      
       
      
         
       
         

   
      

    
   }
}


