import java.io.*;

/**
 * This class contains the fibonacci, factorial and Pascal Triangle's recursive functions
 * @author Andrés
 * This program is free software: you can redistribute it and/or modify it under the terms of the 
 * GNU General Public License as published by the Free Software Foundation, version 3
 */
public class RecursiveFunctions {
	
	/**
	 * The fiobonacci's function has an input a fib variable as index and dertermine the number in the fibonacci serie
	 * @param fib
	 * @return
	 */
	
	public static int fibonacci(int x) {
		if (x==0) { //If the index of fibonacci is 0, return 0 
			return 0;
		}else {
			if(x==1) {
				return 1;//If the index of fibonacci is 1, return 1
			}else {
				return fibonacci(x-1)+fibonacci(x-2);//Else return the fibonaci's function with the x parameter minus 1 sum the fibonacci's function with the x parameter minus 2 
			}
		}
		}
					
			
	
	
	/**
	 * 
	 * @param fact
	 * @return
	 */
	public static int factorial(int fact) {
		if (fact>1) {
			
			return fact*factorial(fact-1);// If fact > that 1 return the factorial funciton with a decrement in the fact parameter
			
		}else {
			
			return 1;// Else return 1
			
		}
	}
	
	
	public static int pascal (int i,int j) {
		
		
			if(j == 0 || j == i) { //If j is 0 or j is equal to i, the function will be return 1
				
				return 1;
				
			}else {
				
				return pascal(i-1,j-1) + pascal(i-1,j);//Else the sum of the up num and back num sill be the actual num 
			}
		

		
	}
	
	/**
	 *
	 * @param args
	 */
	public static void main (String []args) {
		
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
		
		try {
			
			bw.write("FIBONACCI'S FUNCTION\n");
			bw.write("Enter the index of the fibonacci serie:\n"); 
			bw.flush();
			int index=Integer.parseInt(br.readLine());//This variable contains the index of the fibonacci serie
			bw.write("The fibonacci's number is "+fibonacci(index)+"\n\n");//Show in the console the call of the fibonacci function 
			bw.flush();
			
			
			bw.write("FACTORIAL'S FUNCTION\n");	
			bw.write("Enter a number:\n");
			bw.flush();
			int facto=Integer.parseInt(br.readLine());// This int variable contains the number that will be find the factorial
			int fact=factorial(facto);//Calls the factorial function
			bw.write("El fatorial de "+facto+" es: "+fact);//Show in console the factorial of the facto
			bw.flush();
			
			
			bw.write("PASCAL TRIANGLE\n");	
			bw.write("Enter a number:\n");
			bw.flush();
			int pascal=Integer.parseInt(br.readLine());
		
			for(int i=0; i< pascal; i++){
				for(int j=0; j <=i; j++) {
					bw.write((pascal(i,j)+" "));
					bw.flush();
					
				}
				bw.write("\n");
				bw.flush();
			}
			
		}catch(Exception ex) {
			ex.printStackTrace();
		}
	}
}
