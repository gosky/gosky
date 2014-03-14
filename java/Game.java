
//  Game.java  (c) 2004 Kari Laitinen

//  http://www.naturalprogramming.com

//  2003-10-02  File created.
//  2004-11-06  Last modification.

import java.util.* ;
import java.io.* ; 



class Game
{
	 
   static void
   store_text_lines_to_file( ArrayList<String> given_array_of_text_lines,
                             String            given_file_name )
   {
      try
      {
         PrintWriter output_file  = 
                new PrintWriter( new FileWriter( given_file_name ) ) ;

         for ( int line_index  =  0 ;
                   line_index  <  given_array_of_text_lines.size() ;
                   line_index  ++ )
         {
            output_file.println(
                      given_array_of_text_lines.get( line_index ) ) ;
         }

         output_file.close() ;
      }
      catch ( IOException caught_io_exception )
      {
         System.out.print( "\n\n Cannot write to file \""
                        +  given_file_name  +  "\"\n" ) ;
      }
   }

	
   public static void main( String[] not_in_use )
   {
   	
   	ArrayList<String> given_text_lines =new ArrayList<String>() ;
   	
      Scanner  keyboard  =  new  Scanner( System.in ) ;
          
 
        boolean user_wants_to_type_more = true ;
        
         while ( user_wants_to_type_more == true )
         {
            String text_line_from_user = keyboard.nextLine() ;
            
               if ( text_line_from_user.length() > 0 &&
                 
                  text_line_from_user.charAt( 0 ) == '.' )
           {
                       user_wants_to_type_more = false ;
           }
              else 
           {        
             given_text_lines.add(text_line_from_user) ;
            
            
          
           }    
                 
           
        }
        
                                      
                System.out.print( "\nGIVEN LINES: \n" ) ;
                 
                  for ( String text_line : given_text_lines )
           {
                System.out.print( "\n" + text_line ) ;
                
               
           }     
           
           System.out.print( "\n you have to store your file name."); 
           
           
           
            store_text_lines_to_file( given_text_lines, "oh!.txt" ) ;       
  
   }
}     


