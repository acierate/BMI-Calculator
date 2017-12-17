
package playground;

import java.util.Scanner;

public class playground{
	
public static void main(String[] args) {
	System.out.println("Welcome to Aaron's BMI/Body mass index calculator");
	System.out.println("Enter 1 for pounds and inches, or 2 for kilograms and centimeters.");
	Scanner metcust = new Scanner(System.in);
	int metty = metcust.nextInt(); 
			if (metty == 1) {    // this is the line that splits customary (1) and metric (anything that isnt 1)
					System.out.println("Enter your weight in pounds");
					Scanner weight = new Scanner(System.in);
					Double input = weight.nextDouble ();
				System.out.println("Enter your height in inches");
				Scanner height = new Scanner(System.in);
				Double input2 = height.nextDouble ();
				
			Double bmi = (input / input2 / input2 * 703); // this arithmetic sets the value for the bmi
			
			System.out.print(bmi);
			System.out.print(" is your BMI."); 
				
					if (bmi < 18.5) {
						System.out.println(" You're considered underweight.");}
						else {}
					
					if (bmi < 24.9 && bmi > 18.5) {
						System.out.println(" You're considered healthy.");}
						else {}
					
					if (bmi < 29.9 && bmi > 25)  {
						System.out.println(" You're considered overweight.");}
						else {}
					
					if (bmi > 30) {
						System.out.println(" You're considered obese.");}
			} // <--this brace ends the pounds and inches option (when user inputs 1)
			
else  			    {System.out.println("Enter your weight in kilograms");
					Scanner weightkg = new Scanner(System.in);
					Double input3 = weightkg.nextDouble ();
							    System.out.println("Enter your height in centimeters");
								Scanner heightcm = new Scanner(System.in);
								Double input4 = heightcm.nextDouble ();
								
		Double bmi2 = (input3 / input4 / input4 * 10000); //this line sets the value for the bmi
		
		System.out.print(bmi2);
		System.out.print(" is your BMI.");
			
				if (bmi2 < 18.5) {
					System.out.println(" You're considered underweight.");}
					else {}
				
				if (bmi2 < 24.9 && bmi2 > 18.5) {
					System.out.println(" You're considered healthy.");}
					else {}
				
				if (bmi2 < 29.9 && bmi2 > 25)  {
					System.out.println(" You're considered overweight.");}
					else {}
				
				if (bmi2 > 30) {
					System.out.println(" You're considered obese.");
			}
			} // this brace end the kilograms and centimeters option (when user inputs anything except 1)
	}
}