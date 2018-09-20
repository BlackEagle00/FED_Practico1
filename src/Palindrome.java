import java.io.*;
/**
 * This program determine if a String is a palindrome or not 
 * @author Andrés Pájaro 
 * This Palindrome determiner is free software: you can redistribute it and/or modify it under the terms of the 
 * GNU General Public License as published by the Free Software Foundation, version 3
 */
public class Palindrome {
	 
	/**
	 * 
	 * @param palabra
	 * @param long_
	 * @return
	 */
	public static String palindrome (String palabra, int long_) {
		
		if(long_==0) { 
			
			return palabra.charAt(long_)+"";//If the long is 0, return the String
			
		}else {
			
			return palabra.charAt(long_)+palindrome(palabra, long_-1);//Else, concatenate the String with the call of function with decrement in the long_
			
		}
		
		
	}
	
	/**
	 *
	 * @param args
	 */
	public static void main (String [] args) {
		
		BufferedReader br = new BufferedReader(new InputStreamReader (System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter (System.out));
		
		try {
			
			
			String string = br.readLine(); //The string variable contains the word to examine 
			int longS=string.length();// This variable contains the lenght of the String
			
			String palindrome=palindrome(string, longS-1);//This variable calls the "palindrome" function
			bw.write(palindrome+"\n");//Show in the console the inverse of the String
			bw.flush();
			
			if(string.equalsIgnoreCase(palindrome)) {//In this conditional, compares the string with the palindrome 
				
				bw.write("The word is a palindrome");//If are equals, the String is a palindorme 
				
			}else {
				
				bw.write("The word isn't a palindrome");//If are differents, the String is't a palindrome
				
			}
			
			bw.flush();
			
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}
