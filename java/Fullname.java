
//  Fullname.java (c) 2004 Kari Laitinen

//  http://www.naturalprogramming.com

//  2004-03-05  File created.
//  2004-12-19  Last modification.

import  java.util.* ;

class Fullname
{
   public static void main( String[] not_in_use )
   {
      Scanner keyboard = new Scanner( System.in ) ;

      String  first_name;
      String  last_name;

      System.out.print( "\n Please, type in your first name: " ) ;
      first_name  =  keyboard.nextLine() ;
      System.out.print( "\n Please, type in your last name:  " ) ;
      last_name   =  keyboard.nextLine() ;
      
      
      String  full_name = first_name + " " + last_name ;
    
      System.out.print( "\n Your full name is "
                          +full_name +  ".\n"
                     +"\n Your first name characters is "
                     +first_name.length()  +  ".\n"
                      +"\n Your last name characters is "
                     +last_name.length()  +  ".\n" );
                     
              StringBuffer full_name_buffer = new StringBuffer( full_name ) ;
    
              int random_character_index =(int) ( Math.random() * full_name_buffer.length() ) ;
              
              char removed_character = full_name_buffer.charAt( random_character_index ) ;
                            
                full_name_buffer.deleteCharAt( random_character_index ) ;
                
                
                
                System.out.print( "\n " + removed_character + " was removed from .\n\n"
                
                               + full_name_buffer ) ;
               
                   
                               
                               
                               
                               
                               
                               
                               
                               
                     
      int character_index  =  full_name.length() ;

      while (  character_index  >  0  )
      {
         character_index  --  ;
                   System.out.print( full_name.charAt( character_index ));
               
      }
                   
       int  character_index_2  =  full_name.length() ;
        while (  character_index_2  >  0  )
        {
         character_index  -- ;
         System.out.printf( " %X", (int) full_name.charAt( character_index_2 ) ) ;
         }                           
             
}
}



