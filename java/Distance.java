
//  height.java  (c) 2004 Kari Laitinen

import  java.util.* ;

class height
{
   public static void main( String[] not_in_use )
   {
      Scanner keyboard = new Scanner( System.in ) ;

      double  height_in_meters,  height_in_kilometers,
              height_in_miles,   height_in_yards,
              height_in_feet,    height_in_inches ;
      double  height_in_light_years ;

      System.out.print( 
            "\n This program converts height to other units of" 
         +  "\n height. Please, enter a height in meters:  " ) ;

      height_in_meters  =  keyboard.nextDouble() ;

      height_in_kilometers  =  height_in_meters / 1000.0 ;
      height_in_miles       =  6.21371e-4 *  height_in_meters ;
      height_in_yards       =  1.093613   *  height_in_meters ;
      height_in_feet        =  3.280840   *  height_in_meters ;
      height_in_inches      =  12         *  height_in_feet ;
      height_in_light_years  =  height_in_meters /
                               ( 2.99793e8 * 365 * 24 * 3600 ) ;

      System.out.print( "\n " + height_in_meters + " meters is: \n\n" ) ;

      System.out.printf( "%15.3f  kilometers\n",height_in_kilometers) ;
      System.out.printf( "%15.3f  miles \n",    height_in_miles ) ;
      System.out.printf( "%15.3f  yards \n",    height_in_yards ) ;

      System.out.printf( "%15.3f  feet  \n%15.3f  inches \n",
                     height_in_feet, height_in_inches ) ;

      System.out.printf( "%15.5e  light years \n",
                                       height_in_light_years) ;
   }
}

/***** This is a multiline comment.

  The following statement was in an older version of this program:

      System.out.print( "\n " + height_in_meters + " meters is: \n"

          +  "\n    "  +  height_in_kilometers  +  "  kilometers" 
          +  "\n    "  +  height_in_miles  +  "  miles"
          +  "\n    "  + height_in_yards  +  "  yards"
          +  "\n    "  +  height_in_feet  +  "  feet"
          +  "\n    "  + height_in_inches  +  "  inches"
          +  "\n    "  +  height_in_light_years  +  "  light years\n" ) ;
Last line of the multiline comment *****/






