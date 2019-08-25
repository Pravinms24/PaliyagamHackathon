package Exercise;

import java.io.BufferedReader;
import java.util.Map;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TamilStringRead {

	public static void main(String[] args) throws IOException {
		String tamil = "";
		FileReader tam = null;

		try {

			tam = new FileReader("C:/Users/Pravinms/Desktop/tamil.txt");
			int i;
			while ((i = tam.read()) != -1) {
				tamil = tamil + (char) i;

			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		} finally {
			if (tam != null)
				tam.close();

		}

		String[] tamilarray = tamil.split("\\s+");
		Map<String, String> hMap = new LinkedHashMap<String, String>();
		ArrayList<String> al = new ArrayList<>();
		for (int i = 0; i < tamilarray.length; i++) {
			if (!hMap.containsKey(tamilarray[i])) {
				al.add(tamilarray[i]);

			}
		}
		System.out.print(al);

	}
}
