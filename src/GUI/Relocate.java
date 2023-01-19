package GUI;

import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class Relocate extends JFrame{
	
	JPanel from;
	JPanel to;
	
	public Relocate() {
	this.setResizable(false);
	this.setSize(400,400);
	this.setLayout(null);
	this.setVisible(false);
	
	from = new JPanel();
	from.setBounds(0,0,200,400);
	from.setVisible(true);
	JTextArea textFrom=new JTextArea("FROM");
	textFrom.setFont(textFrom.getFont().deriveFont(8f));
	from.add(textFrom);
	from.setLayout(new GridLayout(0,3));
	
	
	
	
	
	to = new JPanel();
	from.setBounds(200,0,200,400);
	JTextArea textTo=new JTextArea("TO");
	textTo.setFont(textTo.getFont().deriveFont(8f));
	to.add(textTo);
	to.setLayout(new GridLayout(0,3));
	
	
	}

}
