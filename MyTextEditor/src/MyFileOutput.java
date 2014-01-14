import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;


public class MyFileOutput {
	public void writeTo (String str, String fileName) {
	try {
		File file = new File(fileName);
		FileOutputStream fos = new FileOutputStream(file);
		OutputStreamWriter osw = new OutputStreamWriter(fos, "UTF-8");
		osw.write(str);
		osw.flush();
		osw.close();
		
	} catch (Exception e) {e.printStackTrace();}
	}
}
