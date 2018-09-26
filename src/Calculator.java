import java.io.*;

/**
 * This program is a calculator with 8 matemathics options, selected by console
 * @author Andrés Pájaro 
 * This file is part if the FED_Práctico1 templates
 * This calculator is free software: you can redistribute it and/or modify it under the terms of the 
 * GNU General Public License as published by the Free Software Foundation, version 3
 */
public class Calculator {
	
	
	/**
	 * This function sum 2 variables of the main class 
	 * @param a
	 * @param b
	 * @return c
	 */
	public static int sum(int a, int b) {
		
		int c=a+b;// Sum the parameters a,b 
		return c;// Return the value of the sum
	}
	
	/**
	 * This function subtract 2 variables of the main class 
	 * @param a
	 * @param b
	 * @return c (The value of the sum)
	 */
	public static int subtract(int a, int b) {
		
		int c=a-b;//subtract the parameters a,b 
		return c; //return the subtract 
	}
	
	/**
	 * This function multiplicate 2 variables of the main class 
	 * @param a
	 * @param b
	 * @return The vaule of the multiplication
	 */
	public static long multi(long a, long b) {
		
		if(b==1) {
			return a;//If the b parameter is equal to 0, return a 
		}else {
			return a+multi(a,b-1);//Else, the function multi calls itmself and sum to a, b have a decremente until be equal to 1
		}
		
	}
	
	/**
	 * This function divide 2 variables of the main class 
	 * @param a
	 * @param b
	 * @return c (The value of the divide)
	 * @throws IOException 
	 */
	public static double div(double a, double b) throws IOException {
		
		if(b==0) {
			
			BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
			bw.write("The division is not posible");
			return b;
			
		}else{
			
			double c=a/b;//Division the a, b parameters 
			return c;//Return the divison 
			
		}
		
	}
	
	/**
	 * 
	 * @param a
	 * @param d
	 * @return The value of the pow
	 */
	public static long pow(long a, double d) {
		
		double counter=d;//Create a counter 
		if (d==0) {//if b equal to 0 return 1
			return 1;
		}if(d==1){//If b equal to 1 return a 
			return a;
		}else {
			if (counter == 1) {
				return a;
			}else {
				return multi (a, pow(a,counter-1));//Calls the multi function pow funtion calls itself and multiplicate to a, b have a decrement until be equal to 1
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
		
		if(a<b) { //if a is minor to b return a 
			
			return a;
			
		}else{
			
			return MOD(a-b,b);//else calls the MOD function with a decrement of b in the a parameter
			
		}
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
				
			
				int op = 1;
				
			    
			    while(op!=0) {
			    	
			    bw.write("Enter:\n(1) for sum\n(2) for subtraction\n(3) for multiplication\n(4) for division\n"
							 +"(5) for power\n(6) for square root\n(7) for residue of divsion\n(0) to exit\n"); //Show the calculator menu to choose the operation 
				bw.flush();
					
				op =Integer.parseInt(br.readLine());//Enter the option of the operation
				
				if (op==0) {
					
					System.out.println("Thanks for use this calculator");
					break;
					
				}
			    			 		    
			    if(op==6) {// As the square root only needs one number, will be apart of the other operations
			    	
			    	bw.write("Enter the number\n");
			    	bw.flush();
			    	int num=Integer.parseInt(br.readLine());// Enter the number to operate
			    	bw.write("The square root of "+num+" is: "+Math.sqrt(num)+"\n");//Call the Math librarie to find the square root if the number and print
			    	bw.flush();
			    	
			    	
			    }else {
		
				bw.write("Enter the first value\n");
				bw.flush();// Relase de information un the writer buffer
				int a=Integer.parseInt(br.readLine()); // Create the varibable a and ask for a value 
				bw.write("Enter the first value\n");
				bw.flush();
				int b=Integer.parseInt(br.readLine());// Create the variable b and ask for a value 
				 
				
				switch (op) { //Create a swtich case depend de option value 
				
				case 1://This case is sum
					
					int sum=sum(a,b); //The sum variable calls the sum function 
					bw.write("The sum is equal to "+sum+"\n");//Show the sum in to the console
					bw.flush();
					break;
					
				case 2://This case is subtract
					
					int subtrc=subtract(a,b);//The subtract variable calls the subtract function
					bw.write("The subtraction is equal to "+subtrc+"\n");//Show the subtraction in to the console 
					bw.flush();
					break;
					
				case 3:
					
					double multiplication=multi(a,b);//This variable calls the multi function
					bw.write("The multiplication is equal to "+multiplication+"\n");//Show the multiplication 
					bw.flush();
					break;
					
				case 4:
					
					double division=div(a,b);//This variable calls the div function 
					bw.write("The division is equal to "+division+"\n");//Show the result of the division
					bw.flush();
					break;
					
				case 5:
					
					double pow=pow(a,b);//This variable calls the pow function
					bw.write("The pow is equal to "+pow+"\n");//Show the pow
					bw.flush();
					break;
					
				case 6:
					
					break;
					
				case 7:
					
					bw.write("The residue is equal to "+a%b+"\n");//This line print the residual (MOD) of the two numbers
					bw.flush();
					break;
					
					
				}
						
			    }
			    }
			
			
		}catch(Exception ex) {
			ex.printStackTrace();	
		}
	}		
}		
		