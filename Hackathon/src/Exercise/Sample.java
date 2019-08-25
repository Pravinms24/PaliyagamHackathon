package Exercise;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Sample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader tamil = null ;
	
		
		try {
			tamil = new BufferedReader (new FileReader("C:/Users/Pravinms/Desktop/tamil.txt"));

			String tam ;				
			while ((tam = tamil.readLine())!=null){
				System.out.println(tam);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		
	}
		finally
		{
			if(tamil != null)
			tamil.close();
			}

	}
	
}
