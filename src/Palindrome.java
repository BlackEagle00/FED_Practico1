import java.io.*;
/**
 * This program determine if a String is a palindrome or not 
 * @author Andrés Pájaro 
 * GNU General Public License as published by the Free Software Foundation, version 3.
 */
public class Palindrome {
	 
	/**
	 *
	 * @param args
	 */
	public static void main (String [] args) {
		
		BufferedReader br = new BufferedReader(new InputStreamReader (System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter (System.out));
		
		try {
			
			
			String string = br.readLine(); //The string variable contains the word to examine 
			String invertString = "";// This vairable for now is empty, but here will be saved the invert word
			
			
			for(int i=string.length()-1; i>=0;i--) { //This loop go trough the word form front to back
				
				invertString+=string.charAt(i); // The invert words is save in this var
				System.out.println(invertString);
			}
			
			if(string.equals(invertString)) { 
				bw.write("The word is a palindrome");
			}else {
				bw.write("The word isn't a palindrome");

				
			}
			
			bw.flush();
			
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}
