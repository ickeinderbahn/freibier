import javax.swing.JFileChooser;
import javax.swing.JFrame;


public class OpenFile extends JFrame {
	
	JFileChooser jfc = new JFileChooser();
		
	public String NameOfFile() {
	String NameOfFile = null;
	int reeturn = jfc.showOpenDialog(jfc);
	if (reeturn == JFileChooser.APPROVE_OPTION) 
	{
		NameOfFile = jfc.getSelectedFile().getPath();
	}
	return NameOfFile;
	}
}
