import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public abstract class FileOperationUtilities {

	public static boolean saveAs(File fileToSave, String content) {

		FileOutputStream fOs = null;
		OutputStreamWriter oSw = null;
		try {
			fOs = new FileOutputStream(fileToSave);
			oSw = new OutputStreamWriter(fOs, "UTF-8");
			oSw.write(content);
			oSw.flush();
			return true;
		} catch (IOException e) {
			e.printStackTrace();
			return false;
		} finally {
			try {
				if (fOs != null)
					fOs.close();
				if (oSw != null)
					oSw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}

}
