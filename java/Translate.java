
//  Translate.java Copyright (c) 2005 Kari Laitinen

//  http://www.naturalprogramming.com

//  2002-11-25  File created.
//  2005-11-19  Last modification.

//  The best way to execute this program is to run it in a
//  command prompt window where command line parameters can
//  be given. It may be difficult, and even impossible, to
//  supply the command line parameters if this program is 
//  executed with a modern development tool such as JCreator
//  or Eclipse.

//  In the javafilesextra folder you can find a program
//  named TranslateAlternative.java which works like this
//  program but it asks for a word from the user.


import java.util.ArrayList ;

class  BilingualTranslation
{
   protected String first_word ;
   protected String second_word ;

   public BilingualTranslation() {}

   public BilingualTranslation( String  given_first_word,
                                String  given_second_word )
   {
      first_word   =  given_first_word ;
      second_word  =  given_second_word ;
   }

   public boolean translate( String given_word )
   {
      boolean  translation_was_successful  =  false ;

      if ( given_word.equals( first_word ) )
      {
         System.out.print( "\n \"" + given_word + "\" translates to \""
                         + second_word  + "\"" ) ;

         translation_was_successful  =  true ;
      }

      if ( given_word.equals( second_word ) )
      {
         System.out.print( "\n \"" + given_word + "\" translates to \""
                         + first_word  +  "\"" ) ;

         translation_was_successful  =  true ;
      }

      return  translation_was_successful ;
   }
}


class  TrilingualTranslation  extends  BilingualTranslation
{
   protected String third_word ;

   public TrilingualTranslation( String given_first_word,
                                 String given_second_word,
                                 String given_third_word )
   {
      first_word   =  given_first_word ;
      second_word  =  given_second_word ;
      third_word   =  given_third_word ;
   }

   public boolean translate( String given_word )
   {
      boolean  translation_was_successful  =  false ;

      if ( given_word.equals( first_word ) )
      {
         System.out.print( "\n \"" + given_word + "\" translates to \""
                   + second_word  + "\" and \"" + third_word + "\"" ) ;

         translation_was_successful  =  true ;
      }

      if ( given_word.equals( second_word ) )
      {
         System.out.print( "\n \"" + given_word + "\" translates to \""
                   + first_word  + "\" and \"" + third_word  + "\"" ) ;

         translation_was_successful  =  true ;
      }

      if ( given_word.equals( third_word ) )
      {
         System.out.print( "\n \"" + given_word + "\" translates to \""
                   + first_word  + "\" and \"" + second_word  + "\"" ) ;

         translation_was_successful  =  true ;
      }

      return  translation_was_successful ;
   }
}

class Translate
{
   public static void main( String[] command_line_parameters )
   {
      ArrayList<BilingualTranslation>  array_of_translations  =
                            new  ArrayList<BilingualTranslation>() ;

      array_of_translations.add(
             new BilingualTranslation( "week", "semana" ) ) ;
      array_of_translations.add(
             new TrilingualTranslation( "street", "calle", "rue" ) ) ;
      array_of_translations.add(
             new BilingualTranslation( "eat", "comer" ) ) ;
      array_of_translations.add(
             new TrilingualTranslation( "woman", "mujer", "femme" ) ) ;
      array_of_translations.add(
             new TrilingualTranslation( "man", "hombre", "homme" ) ) ;
      array_of_translations.add(
             new BilingualTranslation( "sleep", "dormir" ) ) ;

      if ( command_line_parameters.length  ==  1 )
      {
         int  translation_index  =  0 ;

         while ( translation_index  <  array_of_translations.size() )
         {
            array_of_translations.get( translation_index ).
                             translate( command_line_parameters[ 0 ] ) ;

            translation_index  ++  ;
         }

         System.out.print( "\n" ) ;
      }
      else
      {
         System.out.print( "\n Give a word on command line.\n\n" ) ;
      }
   }
}



