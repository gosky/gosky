
//  Findreplace.xxxx  (c) 2005 Kari Laitinen

//  http://www.naturalprogramming.com

//  2004-10-08  File created.
//  2005-11-19  Last modification.

//  The best way to execute this program is to run it in a
//  command prompt window where command line parameters can
//  be given. It may be difficult, and even impossible, to
//  supply the command line parameters if this program is 
//  executed with a modern development tool such as JCreator
//  or Eclipse.

//  This program will, though, ask for data from the user
//  if no command line parameters are given.

import java.util.* ;  // ArrayList, Scanner, etc.
import java.io.* ;    // Classes for file handling.

class Findreplace
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


   static void replace_string_in_file( String  original_file_name,
                                       String  string_to_replace,
                                       String  replacement_string )
   {
      try
      {
         BufferedReader original_file  =
             new BufferedReader( new FileReader( original_file_name ) ) ;
         ArrayList<String>  original_text_lines  =  new  ArrayList<String>() ;
         ArrayList<String>  modified_text_lines  =  new  ArrayList<String>() ;

         int  line_counter  =  0 ;
         boolean end_of_file_encountered  =  false ;

         while ( end_of_file_encountered  ==  false )
         {
            String  text_line_from_file   =  original_file.readLine() ;

            if ( text_line_from_file  ==  null )
            {
               end_of_file_encountered  =  true ;
            }
            else
            {
               line_counter  ++ ;
               original_text_lines.add( text_line_from_file ) ;

               if ( text_line_from_file.contains( string_to_replace ) )
               {
                  text_line_from_file  =
                          text_line_from_file.replace( string_to_replace,
                                                       replacement_string ) ;

                  System.out.print( "\n \""  +  string_to_replace
                       +  "\" was replaced with \""  +  replacement_string
                       +  "\" on line "  +  line_counter  ) ;
               }

               modified_text_lines.add( text_line_from_file ) ;
            }
         }

         original_file.close() ;

         String  backup_file_name  =  original_file_name  +  ".bak" ;

         store_text_lines_to_file( original_text_lines,
                                   backup_file_name   ) ; 
         store_text_lines_to_file( modified_text_lines,
                                   original_file_name ) ;
      }
      catch ( FileNotFoundException caught_file_not_found_exception )
      {
         System.out.print( "\n Cannot open file " + original_file_name ) ;
      }
      catch ( IOException  caught_io_exception )
      {
         System.out.print( "\n Error in reading " + original_file_name ) ;
      }
   }


   public static void main( String[] command_line_parameters )
   {
      Scanner keyboard = new Scanner( System.in ) ;

      String  file_name_given_by_user ;
      String  string_to_replace ;
      String  replacement_string ;

      if ( command_line_parameters.length  ==  3 )
      {
         file_name_given_by_user  =  command_line_parameters[ 0 ] ;
         string_to_replace        =  command_line_parameters[ 1 ] ;
         replacement_string       =  command_line_parameters[ 2 ] ;
      }
      else
      {
         System.out.print( "\n This program can replace a string in a "
                        +  "\n text file. Give first the file name :  " ) ;

         file_name_given_by_user  =  keyboard.nextLine() ;

         System.out.print( "\n Type in the string to be replaced: " ) ;
         string_to_replace    =  keyboard.nextLine() ;

         System.out.print( "\n Type in the replacement string:    " ) ;
         replacement_string   =  keyboard.nextLine() ;
      }

      if ( string_to_replace.equals( "" )  ||
           string_to_replace.equals( replacement_string ) )
      {
         System.out.print( "\n Cannot replace \""  +  string_to_replace
              +  "\" with \""  +  replacement_string  +  "\"\n\n" ) ;
      }
      else
      {
         replace_string_in_file( file_name_given_by_user,
                                 string_to_replace,
                                 replacement_string ) ;
      }
   }
}



