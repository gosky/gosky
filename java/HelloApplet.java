
//  HelloApplet.java  (c) 2006 Kari Laitinen

//  http://www.naturalprogramming.com/

//  2006-10-02  File created.
//  2006-10-02  Latest modification.

//  This is an example of a very simple Java applet.
//  An applet is a Java program that runs on a web page.
//  The browser in use must be Java-enabled.

import java.awt.* ;
import javax.swing.* ;

public class HelloApplet extends JApplet
{
   public void paint( Graphics graphics )
   {
      super.paint( graphics ) ;

      graphics.drawString( "Hello. I am a Java applet.", 80, 100 ) ;

      graphics.drawString( "The coordinates of this line are (80,150).",
                           80, 150 ) ;
   }
}




