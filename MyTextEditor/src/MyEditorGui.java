import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class MyEditorGui extends JFrame {
	private JTextField txtNochIstNix;
	private JTextArea mainTextField;

	public MyEditorGui() {

		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		JMenu mnEdit = new JMenu("Edit");
		menuBar.add(mnEdit);

		JMenuItem mntmOpen = new JMenuItem("Open");
		mntmOpen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MyFileInput mfi = new MyFileInput();
				txtNochIstNix.setText("Geaendert durch Open.");
				mainTextField.setText("Nun Text eingefuegt.");
//				while mfi.
				mainTextField.append(mfi.toString());
				
			}
		});
		mnEdit.add(mntmOpen);

		JMenuItem mntmSave = new JMenuItem("Save");
		mntmSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtNochIstNix.setText("Geaendert durch Save.");
			}
		});
		mnEdit.add(mntmSave);

		JMenuItem mntmSaveAs = new JMenuItem("Save as");
		mntmSaveAs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtNochIstNix.setText("Geaendert durch SaveAss.");
			}
		});

		mnEdit.add(mntmSaveAs);

		txtNochIstNix = new JTextField();
		txtNochIstNix.setText("Noch ist nix passiert.");
		getContentPane().add(txtNochIstNix, BorderLayout.SOUTH);
		txtNochIstNix.setColumns(10);
		
		mainTextField = new JTextArea();
		mainTextField.setText("leer");
		getContentPane().add(mainTextField, BorderLayout.CENTER);
		mainTextField.setColumns(10);
	}

	public static void main(String[] args) {

		MyEditorGui mge = new MyEditorGui();
		mge.setSize(600, 400);
		mge.setTitle("Das ist das Editor Fenster");
		mge.setDefaultCloseOperation(EXIT_ON_CLOSE);
		mge.setVisible(true);
	}

}
