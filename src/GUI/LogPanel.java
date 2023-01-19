package GUI;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.LineBorder;

public class LogPanel extends JFrame {
	JPanel panel;
	
	public LogPanel() {
		this.setSize(400,400);
		
		//this.setLayout(new GridLayout(1,0));
		this.setResizable(false);
		this.setLayout(null);
		this.setVisible(false);
		
		panel = new JPanel();
		
		//panel.setBackground(Color.yellow);
		panel.setBorder(new LineBorder(Color.black));
		panel.setBounds(0, 0, 400, 400);
		
		panel.setLayout(new GridLayout(0,1));
		
		//JTextArea x=new JTextArea("nada");
	
		//panel.add(x);
		panel.setVisible(true);
		this.add(panel);
		
		
		
		
	}

	public JPanel getPanel() {
		return panel;
	}

	public void setPanel(JPanel panel) {
		this.panel = panel;
	}
	

}