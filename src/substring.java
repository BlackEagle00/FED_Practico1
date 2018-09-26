import java.io.*;

public class substring{
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	public static int substring_occurences(String total, String sub)
	{
		int counter =0;
		for(int i =0; i<=(total.length()-sub.length());i++)
			if(total.substring(i, 1+sub.length()).equals(sub))
				counter  +=1;
		return counter;
	}
	
	public static void All_Substring(String total){
		try {
			int max =Integer.MIN_VALUE;
			String winner = "";
			String temp ="";
			for(int i=2;i<=total.length();i++) {
				for(int j=0;j<=total.length()-i;j++) {
					if(substring_occurences(total,total.substring(j,j+i))>max) {
						max = substring_occurences(total,total.substring(j,j+i));
						winner = total.substring(j,j+i);
						bw.write("La subcadena que mas se repite es: "+winner);
						bw.flush();
					}
				}
			}
		}catch(Exception ex){
			ex.printStackTrace();
		}
		
		
	}
	public static void main(String[]args){
	
		String input;
		try {
			input = br.readLine();
			All_Substring(input);
		
		}catch (Exception ex) {
			
		}
	}	
}
	

		
	
	

	