import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


public class PopMeUp extends JFrame {
	
		JDialog dialog = new JDialog();
		
		public void PopMeUp()
		{
			JOptionPane jop = new JOptionPane("Schreib das raus!");
			dialog.add(jop);
			dialog.setVisible(true);
			dialog.setSize(200, 100);
			dialog.setDefaultCloseOperation(EXIT_ON_CLOSE);
		}
		
		public static void main(String[] args) {
			PopMeUp pmu = new PopMeUp();
			pmu.PopMeUp();
		}

}
