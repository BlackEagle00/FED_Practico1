import java.io.*;

/**
 * This program is a calculator with 8 matemathics options, selected by console
 * @author Andrés Pájaro 
 * This file is part if the FED_Practico templates
 * GNU General Public License as published by the Free Software Foundation, version 3.
 */
public class Calculator {
	
	
	/**
	 * This function sum 2 variables of the main class 
	 * @param a
	 * @param b
	 * @return c
	 */
	public static int sum(int a, int b) {
		
		int c=a+b;
		return c;
	}
	
	/**
	 * This function subtract 2 variables of the main class 
	 * @param a
	 * @param b
	 * @return c (The value of the sum)
	 */
	public static int subtract(int a, int b) {
		
		int c=a-b;
		return c;
	}
	
	/**
	 * This function multiplicate 2 variables of the main class 
	 * @param a
	 * @param b
	 * @return The vaule of the multiplication
	 */
	public static int multi(int a, int b) {
		
		if(b==1) {
			return a;
		}else {
			return a+multi(a,b-1);
		}
		
	}
	
	/**
	 * This function divide 2 variables of the main class 
	 * @param a
	 * @param b
	 * @return c (The value of the divide)
	 */
	public static double div(double a, double b) {
		
		double c=a/b;
		return c;
	}
	
	/**
	 * 
	 * @param a
	 * @param b
	 * @return The value of the pow
	 */
	public static int pow(int a, int b) {
		
		int counter=b;
		if (b==0) {
			return 1;
		}if(b==1){
			return a;
		}else {
			if (counter == 1) {
				return a;
			}else {
				return a*pow(a,counter-1);
			}
		}
	}
	
	
	
	/**
	 * 
	 * @param a
	 * @param b
	 * @return c (The residue of division )
	 */
	public static int MOD (int a, int b) {
		
		int c= a%b;
		return c;
	}
	

	/**
	 * This program is a virtual calculator, that consist to enter two values, choose a operation and depending 
	 of your decision the program determine the result of the operation 
	 * @param args
	 */
	public static void main (String [] args) {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		try {
			
				bw.write("Enter the first value\n");
				bw.flush();// Relase de information un the writer buffer
				int a=Integer.parseInt(br.readLine()); // Create the varibable a and ask for a value 
				bw.write("Enter the first value\n");
				bw.flush();
				int b=Integer.parseInt(br.readLine());// Create the variable b and ask for a value 
				 
				bw.write("Enter (1) for sum,(2) for subtraction, (3) for multiplication, (4) for division \n"
						 +"(5) for power, (6) for square root, (7) for residue of divsion or (0) to exit\n"); //Show the calculator menu to choose the operation 
				bw.flush();
				
				int option=Integer.parseInt(br.readLine()); //Read a value for the option variable and determine the operation to do	
				
				switch (option) { //Create a swtich case depend de option value 
				
				case 1://This case is sum
					
					int sum=sum(a,b); //The sum variable calls the sum function 
					bw.write("The sum is equal to "+sum+"\n");//Show the sum in to the console
					bw.flush();
					
				case 2://This case is subtract
					
					int subtrc=subtract(a,b);//The subtract variable calls the subtract function
					bw.write("The subtraction is equal to "+subtrc+"\n");//Show the subtraction in to the console 
					bw.flush();
					
				case 3:
					
					int multiplication=multi(a,b);
					bw.write("The multiplication is equal to "+multiplication+"\n");
					bw.flush();
					
				case 4:
					
					double division=div(a,b);
					bw.write("The division is equal to "+division+"\n");
					bw.flush();
					
				case 5:
					
					int pow=pow(a,b);
					bw.write("The pow is equal to "+pow+"\n");
					bw.flush();
					
				case 6:
					
					
					
				case 7:
					
					bw.write("The residue is equal to "+a%b+"\n");
					bw.flush();
				}
			
				
			
		}catch(Exception ex) {
			ex.printStackTrace();
		}
	}
}
