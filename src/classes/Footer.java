package classes;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class Footer extends JPanel{
	
	JButton addTask;
	JButton clear;
	JButton time;
	
	Border emptyBorder = BorderFactory.createEmptyBorder();
	
	Footer()
	{
		this.setPreferredSize(new Dimension(400,60));
		
		addTask = new JButton("Add a Task");
		addTask.setBorder(emptyBorder);
		addTask.setFont(new Font("Sans-serif",Font.PLAIN, 20));
		addTask.setVerticalAlignment(JButton.BOTTOM);
		// addTask.setBackground(Color.white);
		this.add(addTask);
		
		
		this.add(Box.createHorizontalStrut(20)); // Space between buttons
		clear = new JButton("Clear Finished Tasks");
		clear.setFont(new Font("Sans-serif",Font.PLAIN, 20));
		clear.setBorder(emptyBorder);
		// clear.setBackground();
		this.add(clear);
		
		time = new JButton("Add free slots");
		time.setFont(new Font("Sans-serif",Font.PLAIN, 20));
	}
	
	public JButton getNewTask(){
		return addTask;
	}
	
	public JButton getClear() {
		return clear;
	}
	public JButton time(){
		return time;
	}
}