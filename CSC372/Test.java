import javax.swing.JFrame;

import java.awt.Color;

public class Test
{
public static void main(String[]args)
{
 //Create a window using JFrame
 JFrame frame=new JFrame();

 //Get JFrame background color using method getBackground()
 Color frameBackgroundColor=frame.getBackground();

 //Get RED value from color
 int redValue=frameBackgroundColor.getRed();

 //Get GREEN value from color
 int greenValue=frameBackgroundColor.getGreen();

 //Get BLUE value from color
 int blueValue=frameBackgroundColor.getBlue();

 //Print RGB value that we get
 System.out.println("R : "+redValue);
 System.out.println("G : "+greenValue);
 System.out.println("B : "+blueValue);

 //You can check what color that match the RGB value that we get using 'Color picker' at above
}
}

