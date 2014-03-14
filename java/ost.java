import java.util.* ;

class BigLetters
{
   static String[] letter_A_data =
                               { "   XX     ",
                                 "  XXXX    ",
                                 " XX  XX   ",
                                 "XX    XX  ",
                                 "XXXXXXXX  ",
                                 "XX    XX  ",
                                 "XX    XX  " } ;

   static String[] letter_B_data =
                               { "XXXXXXX   ",
                                 "XX    XX  ",
                                 "XX    XX  ",
                                 "XXXXXXX   ",
                                 "XX    XX  ",
                                 "XX    XX  ",
                                 "XXXXXXX   " } ;

   static String[] letter_C_data =
                               { " XXXXXX   ",
                                 "XX    XX  ",
                                 "XX        ",
                                 "XX        ",
                                 "XX        ",
                                 "XX    XX  ",
                                 " XXXXXX   " } ;

   static String[] unknown_letter_data =
                               { "????????  ",
                                 "????????  ",
                                 "????????  ",
                                 "????????  ",
                                 "????????  ",
                                 "????????  ",
                                 "????????  " } ;

   static String[] letter_D_data =
                                {
                                " XXXXXXX   ",
                                 "XX    XX  ",
                                 "XX     XX ",
                                 "XX     XX ",
                                 "XX     XX ",
                                 "XX    XX  ",
                                 "XXXXXXX   ",} ;
    static String[] letter_E_data =
                                {
                                " XXXXXX   ",
                                 "XX      ",
                                 "XX        ",
                                 "XXXXXX   ",
                                 "XX        ",
                                 "XX     ",
                                 "XXXXXXX   ",} ;   




static String[] get_letter_data( char given_letter )

{

        String[] letter_data ;
        
         switch ( given_letter )
{
	
      case 'A' : letter_data = letter_A_data ; break ;
      
      case 'B' : letter_data = letter_B_data ; break ;
      
      case 'C' : letter_data = letter_C_data ; break ;
      
      case 'D' : letter_data = letter_D_data ; break ;
       
      case 'E' : letter_data = letter_E_data ; break ;
      
      default: letter_data = unknown_letter_data ;
      
}
  
          return letter_data ;
}
      static void print_big_letter( char given_letter )
{

     String[] letter_data = get_letter_data( given_letter ) ;
     
      for ( String letter_data_line : letter_data )
{
       System.out.print( "\n " + letter_data_line ) ;
}
            System.out.print( "\n" ) ;
            }
    }
       public static void main( String[] not_in_use )
   {
      Scanner  keyboard  =  new  Scanner( System.in ) ;


      print_big_letter( 'C' ) ;
      print_big_letter( 'A' ) ;
      print_big_letter( 'B' ) ;
      print_big_letter( 'W' ) ;
      print_big_letter( 'D' ) ;
      print_big_letter( 'E' ) ;
   }
}