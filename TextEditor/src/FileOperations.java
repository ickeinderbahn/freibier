 
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class FileOperations {

	public static void main(String[] args) {

		FileOutputStream fOS = null;
		OutputStreamWriter oSW = null;
		try {

			File outFile = new File("fileWriter2.txt");
			fOS = new FileOutputStream(outFile);
			oSW = new OutputStreamWriter(fOS, "UTF8");
			// BufferedOutputStream bOS = new BufferedOutputStream(fOS);

			oSW.write("Zwei Hirsche treffen sich...");
			oSW.append(System.getProperty("line.separator")); // e.g. "\n"
			oSW.write("... im Wald");
			oSW.flush();

		} catch (IOException e) {
			System.err.println("Konnte Datei nicht erstellen");
			e.printStackTrace();
		} finally {
			if (fOS != null)
				try {
					fOS.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
		}
		if (oSW != null)
			try {
				oSW.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
	}

}
