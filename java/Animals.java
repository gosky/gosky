
//  Animals.java   Copyright (c) 2005 Kari Laitinen

//  http://www.naturalprogramming.com

//  2004-10-03  File created.
//  2005-02-05  Last modification.

class  Animal
{
   String  species_name ;
   String  stomach_contents ;
   String animal_name ;

   public Animal( String  given_species_name ) 
   {
      species_name      =  given_species_name ;
      stomach_contents  =  "" ;
   }

   public Animal( Animal  another_animal )
   {
      species_name      =  another_animal.species_name ;
      stomach_contents  =  another_animal.stomach_contents ;
   }

   public void feed( String  food_for_this_animal )
   {
   	stomach_contents  =  
          stomach_contents  +  food_for_this_animal + " "  ;     
            
}
     public void make_speak()
   {
      System.out.print( "\n Hello, I am a " + species_name     + "."
                      + "\n I have eaten: " + stomach_contents + "\n" );
                      
           if ( stomach_contents.length() == 0 )
       {  
         System.out.print( "\n Hello, I am a " + species_name     + "."
                      + "\n my stomach is empty" + "\n" );
       }

   }
    public void  make_stomach_empty() 
    {
      
    	stomach_contents  =  "" ;   	
      
        
    }  
                      
  
   public void named_cat()
   { 
      System.out.print( "\n Hello, I am a " + species_name     +  "my name is Ludwing"  + "."
                      + "\n my stomach is empty" + "\n" );
   }
}

class  Animals
{
   public static void main( String[] not_in_use )
   {
      Animal  cat_object  =  new Animal( "cat" ) ;
      Animal  dog_object  =  new Animal( "vegetarian dog" ) ;
      Animal  named_cat   =  new Animal( "cat" ) ;
      Animal  some_animal =  new Animal("default");

      cat_object.feed( "fish" ) ;
      cat_object.feed( "chicken" ) ;

      dog_object.feed( "salad" ) ;
      dog_object.feed( "potatoes" ) ;

      Animal  another_cat  =  new Animal( cat_object ) ;
      

      another_cat.feed( "milk" ) ;

      cat_object.make_speak() ;
      dog_object.make_speak() ;
      another_cat.make_speak() ;
      named_cat. named_cat()  ;
      some_animal.make_speak() ;
   }
}



class Zoo
{
         Animal[] animals_in_zoo = new Animal[ 20 ] ;
   
             int number_of_animals_in_zoo = 20 ;
             
    public void add_animal( Animal new_animal_to_zoo )
    
    {   
     
    	species_name      =  new_animal_to_zoo  ;
    }
    	

       public void make_animals_speak()
    
    {
        for ( int animal_index = 0 ;
        
       animal_index < number_of_animals_in_zoo ;
       
          animal_index ++ )
          
    {  
      System.out.print( "\n " +species_name  +" comes in zoo "  + "."
                      + "\n" );
    }
   }
}




