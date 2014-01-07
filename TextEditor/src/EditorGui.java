import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTextField;


public class EditorGui extends JFrame {
	private JTextField textField;
	public EditorGui() {
		getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(37, 179, 152, 50);
		getContentPane().add(textField);
		textField.setColumns(10);
		textField.setText("dit is da text ohne äktschn");
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("File");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmOpen = new JMenuItem("Open");
		mntmOpen.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
				textField.setText("Open gekliggt.");
			}
		});
		mnNewMenu.add(mntmOpen);
		
		JMenuItem mntmSave = new JMenuItem("Save");
		mntmSave.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
				textField.setText("Save gekliggt.");
			}
		});
		mnNewMenu.add(mntmSave);
		
		JMenuItem mntmSaveAss = new JMenuItem("Save as");
		mntmSaveAss.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
				textField.setText("Save ass gekliggt.");
			}
		});
		mnNewMenu.add(mntmSaveAss);
	
	}
	
	
	private void saveUnder() {
	}
	
	private void open() {
	}
	
	static public void saveFileContent(String file, String content) {
	}	

	
	public static void main(String[] args) {
		EditorGui eGui = new EditorGui();
		eGui.setDefaultCloseOperation(EXIT_ON_CLOSE);
		eGui.setSize(600, 400);
		eGui.setVisible(true);

	}
}
