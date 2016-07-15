package langcompdatabase;

import java.awt.EventQueue;
import java.awt.TextField;

import javax.swing.JFrame;
import javax.swing.JComboBox;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.FileNotFoundException;
import java.io.IOException;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Component;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.layout.FormSpecs;

public class DataEntryApp {

	private JFrame frame;
	private BasicDatabase dat;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DataEntryApp window = new DataEntryApp();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public DataEntryApp() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		try {dat = new BasicDatabase("data/database.txt");}
		catch (FileNotFoundException e) {System.out.println("Database file not found... " + e);}
		catch (IOException i) {System.out.println("File I/O error... " + i);}
		frame = new JFrame();
		frame.setBounds(100, 100, 600, 350);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel lblDialects = new JLabel("Dialects:");
		lblDialects.setSize(50, 20);
		lblDialects.setLocation(5, 10);
		frame.getContentPane().add(lblDialects);
		
		JLabel lblEnglish = new JLabel("Word in English");
		lblEnglish.setSize(50, 20);
		lblEnglish.setLocation(5, 115);
		frame.getContentPane().add(lblEnglish);
		
		JLabel lblArabi = new JLabel("Word in Arabic");
		lblArabi.setSize(50, 20);
		lblArabi.setLocation(5, 225);
		frame.getContentPane().add(lblArabi);
		
		JComboBox<String> dialectSelect = new JComboBox<>(dat.getDialects());
		dialectSelect.setSize(150, 30);
		dialectSelect.setLocation(75, 10);
		frame.getContentPane().add(dialectSelect);
		
		JTextField textFieldEnglise = new JTextField();
		textFieldEnglise.setSize(150, 20);
		textFieldEnglise.setLocation(75, 115);
		frame.getContentPane().add(textFieldEnglise);
		
		JTextField textFieldKalima = new JTextField();
		textFieldKalima.setSize(150, 20);
		textFieldKalima.setLocation(75, 225);
		frame.getContentPane().add(textFieldKalima);
	}
	
	public void addDlct(String s) {
		
	}

}
