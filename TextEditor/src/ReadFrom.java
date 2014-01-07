import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadFrom {

	public static void main(String[] args) {

		try {
			File file = new File("ReadFrom.txt");
			FileInputStream fis = new FileInputStream(file);
			InputStreamReader isr = new InputStreamReader(fis, "UTF-8");

			BufferedReader br = new BufferedReader(isr);

			// br.readLine();
			// System.out.println(br.readLine());
			// System.out.println(br.readLine());

			while (br.read() != -1) {
				System.out.println(br.readLine());

			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
