package classes;

import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JLabel; // Used to fit text, image or both in a short space
import javax.swing.JPanel; // Used to fit components in a precise manner, in a GUI

public class TitleBar extends JPanel{

	TitleBar()
	{
		this.setPreferredSize(new Dimension(400,80));
		
		JLabel titleText = new JLabel("LifeAlign");
		titleText.setPreferredSize(new Dimension(200,60));
		titleText.setFont(new Font("Sans-serif",Font.BOLD, 20));
		titleText.setHorizontalAlignment(JLabel.CENTER);
		this.add(titleText);
	}
}