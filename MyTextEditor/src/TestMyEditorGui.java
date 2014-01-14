import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class TestMyEditorGui extends JFrame {
	private JTextField txtNochIstNix;
	private JTextArea mainTextField;

	public TestMyEditorGui() {

		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		JMenu mnEdit = new JMenu("Edit");
		menuBar.add(mnEdit);

		JMenuItem mntmOpen = new JMenuItem("Open");
		mntmOpen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtNochIstNix.setText("Geaendert durch Open.");
				OpenFile of = new OpenFile();
				MyFileInput mfi = new MyFileInput();
				String FileName = of.NameOfFile();
				txtNochIstNix.setText(FileName);
				mainTextField.setText(mfi.returnOpen(FileName));
			}
		});
		mnEdit.add(mntmOpen);

		JMenuItem mntmSave = new JMenuItem("Save");
		mntmSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtNochIstNix.setText("Geaendert durch Save.");
				MyFileOutput mfo = new MyFileOutput();
//				mfo.writeTo(mainTextField.getText());
				SaveFileTryPopUp sf = new SaveFileTryPopUp();
				String FileNameSave = sf.SaveTo();
				txtNochIstNix.setText(FileNameSave);
				
			}
		});
		mnEdit.add(mntmSave);

		JMenuItem mntmSaveAs = new JMenuItem("Save as");
		mntmSaveAs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtNochIstNix.setText("Geaendert durch SaveAss.");
				SaveFile st2 = new SaveFile();
				MyFileOutput mfo = new MyFileOutput();
				String FileSaveTo = st2.doSaveAs();
				mfo.writeTo(mainTextField.getText(), FileSaveTo);
			}
		});

		mnEdit.add(mntmSaveAs);

		txtNochIstNix = new JTextField();
		txtNochIstNix.setText("Noch ist nix passiert.");
		getContentPane().add(txtNochIstNix, BorderLayout.SOUTH);
		txtNochIstNix.setColumns(10);
		
		mainTextField = new JTextArea();
//		mainTextField.setText("leer");
		getContentPane().add(mainTextField, BorderLayout.CENTER);
		mainTextField.setColumns(10);
	}

	public static void main(String[] args) {

		TestMyEditorGui mge = new TestMyEditorGui();
		mge.setSize(600, 400);
		mge.setTitle("Das ist das Editor Fenster");
		mge.setDefaultCloseOperation(EXIT_ON_CLOSE);
		mge.setVisible(true);
	}

}
