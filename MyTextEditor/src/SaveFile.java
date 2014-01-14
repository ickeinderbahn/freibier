import java.io.File;

import javax.swing.JFileChooser;
import javax.swing.JFrame;

public class SaveFile extends JFrame {
	public String doSaveAs(){
		JFrame parentFrame = new JFrame();
		 
		String fileToSave = null;
		JFileChooser fileChooser = new JFileChooser();
		fileChooser.setDialogTitle("Bitte speichern als ...");   
		 
		int userSelection = fileChooser.showSaveDialog(parentFrame);
		 
		if (userSelection == JFileChooser.APPROVE_OPTION) {
		    fileToSave = fileChooser.getSelectedFile().getPath();
		} return fileToSave;
	}
}
