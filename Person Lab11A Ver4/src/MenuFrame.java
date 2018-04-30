import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class MenuFrame  extends JFrame{
	private final int FRAME_WIDTH = 400;
	private final int FRAME_HEIGHT = 350;
	
	private DataArray arr;
	
	private JList<String> personList;
	
	private JLabel statuslabel;
	
	private JPanel buttonsPanel;
	
	private JButton populateButton;
	private JButton sortButton;
	private JButton deleteAllButton;
	private JButton deleteButton;
	private JButton addButton;
	
		private void updateList() {
			
			arr.displayAll();
		}
		
		private void deleteAll() {
			
		}
		
		private void deletePerson() {
			
			if (arr.delete("Williams")) {
				System.out.print("Williams was deleted..");
			}
			else {
				System.out.print("Couldnt find Williams");
			}
			if (arr.delete("Ming")) {
				System.out.print("Ming was deleted..");
			}
			else {
				System.out.print("Couldnt find Ming");
			}
			
		}
		private void sort() {
			
			arr.bubbleSort();
		}
		
		private void addPerson() {
			
		}
}
public MenuFrame(DataArray arr) {
	super("Person Menu");
	this.arr = arr;
	
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	this.setLayout(new FlowLayout());
	
	Dimension framesize = new Dimension(FRAME_WIDTH, FRAME_HEIGHT);
	this.setMinimumSize(framesize);
	
	populateButton = new JButton("Populate");
	populateButton.addActionListener(new ActionListener);
}

