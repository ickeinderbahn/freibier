import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class SaveFileTryPopUp extends JFrame {
	
	JFileChooser jfc = new JFileChooser();
	PopMeUp pmu = new PopMeUp();
	
	public String SaveTo(){
		int checkReturn = 0;
		String ergebnis = null;
		checkReturn = jfc.showSaveDialog(jfc);
		
//		System.out.println(checkReturn);
		if (checkReturn == JFileChooser.APPROVE_OPTION)
		{
			ergebnis = jfc.getSelectedFile().getPath();
//			pmu.PopMeUp();
		}
//		if (checkReturn == JFileChooser.CANCEL_OPTION)
//		{
//			ergebnis = "Cancel";
//			pmu.PopMeUp();
//		}
//		if (checkReturn == JFileChooser.ERROR_OPTION)
//		{
//			ergebnis = "Error";
//			pmu.PopMeUp();
//		}	
		return ergebnis;
	} 
}
