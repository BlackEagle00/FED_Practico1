import java.io.*;

public class substring {
	
	public static void main (String [] args) { 
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		
		try {
			

			String word=br.readLine();
			
			for(int j=0;j<word.length();j++) {
					
				for(int i=word.length();i>=0;i--){
					
					bw.write(word.substring(j,i)+"\n");
					bw.flush();
						
				}
				
			}

			
	}catch(Exception ex) {
		ex.printStackTrace();}
	}
}
