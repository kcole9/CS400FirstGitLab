/*
 * Test the use of the Color method
 *	Name: Kathryn Cole
 *	Email: kcole9@wisc.edu
 *	CS Account User name: kcole
 */
import java.util.*;

public class Main{
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Beggining of testing the color class:");
		Color myColor = new Color("blue");
		
		//print current color
		System.out.println("The current color is:" + myColor.getColor());

		System.out.println("What color do you want to change to? ");
		String newColor = input.next();
		//If color change succeeded
		if( myColor.changeColor(newColor)){
			System.out.println("The new color is:"+myColor.getColor());
		}
		else{
			System.out.println("Color change failed! ");
		}
	}
}
