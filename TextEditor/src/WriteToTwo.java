import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class WriteToTwo {

	public static void main(String[] args) {

		try {
			File outFile = new File("fileWriter2.txt");
			FileOutputStream fOs = new FileOutputStream(outFile);
			OutputStreamWriter osw = new OutputStreamWriter(fOs, "UTF-8");

			osw.write("los!");
			osw.append(System.getProperty("line.separator"));
			osw.write("das ist die andere Zeile.");
			osw.flush();
			
			osw.close();
			fOs.close();

		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	
}
