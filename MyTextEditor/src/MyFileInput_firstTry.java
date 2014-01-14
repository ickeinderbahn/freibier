import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class MyFileInput_firstTry {

		{
			try {
				FileInputStream fis = new FileInputStream("InputTestText.txt");
				InputStreamReader ios = new InputStreamReader(fis, "UTF-8");
				BufferedReader br = new BufferedReader(ios);

				System.out.println("firstTry");
				
				while (br.read() != -1) {
					System.out.println(br.readLine());
					System.getProperty("line.separator");
				}
				br.close();
				ios.close();
			} catch (Exception e) {
				System.out.println("Fehler aufgetreten!");
				e.printStackTrace();
			} 
		}  

	}
