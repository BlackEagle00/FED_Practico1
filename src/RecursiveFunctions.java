import java.io.*;

/**
 * This class contains the fibonacci, factorial and Pascal Triangle's recursive functions
 * @author Andr�s
 * GNU General Public License as published by the Free Software Foundation, version 3.
 */
public class RecursiveFunctions {
	
	/**
	 * The fiobonacci's function has an input a fib variable as index and dertermine the number in the fibonacci serie
	 * @param fib
	 * @return
	 */
	public static int fibonacci(int x) {
		if (x==0) {
			return 0;
		} else if (x==1) {
			return 1;	
		}else {
			return fibonacci(x-1)+(x-2);
		}
	}
		
					
			
	
	
	/**
	 * 
	 * @param fact
	 * @return
	 */
	public static int factorial(int fact) {
		if (fact>1) {
			return fact*factorial(fact-1);
		}else {
			return 1;
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
			int index=Integer.parseInt(br.readLine());
			bw.write("The fibonacci's number is "+fibonacci(index)+"\n\n");
			bw.flush();
			
			
			bw.write("FACTORIAL'S FUNCTION\n");	
			bw.write("Enter a number:\n");
			bw.flush();
			int facto=Integer.parseInt(br.readLine());
			int fact=factorial(facto);
			bw.write("El fatorial de "+facto+" es: "+fact);
			bw.flush();
			
			
		}catch(Exception ex) {
			ex.printStackTrace();
		}
	}
}