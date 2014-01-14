import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class MyFileInput {
		
			public String returnOpen (String TxtFile){
//				if (TxtFile.isEmpty() == true) {
//					exit;
//				}
//				
				String returnString = null;
			try {
				FileInputStream fis = new FileInputStream(TxtFile);
				InputStreamReader ios = new InputStreamReader(fis, "UTF-8");
				BufferedReader br = new BufferedReader(ios);
				StringBuilder inputStringBuilder = new StringBuilder();
				String read = br.readLine();

				while (read != null) {
					inputStringBuilder.append(read);
					inputStringBuilder.append("\n");
					read = br.readLine();
				}
				
				returnString = inputStringBuilder.toString();
				
				br.close();
				ios.close();
			} catch (Exception e) {
				System.out.println("Fehler aufgetreten!");
				e.printStackTrace();
			} 
		  return returnString; 
		  }

		} 
