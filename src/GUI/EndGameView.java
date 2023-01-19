package GUI;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import engine.Game;

public class EndGameView extends JFrame{
private JPanel startPanel;
private JPanel valuesPanel;
private JTextArea gameName;
private JLabel label;
private JTextArea EngameText;
private JTextArea playerName;
private Game game;
	public EndGameView(Game game) {

		this.game=game;
		this.setSize(800,600);
		this.setVisible(true);
		this.setLayout(null);
		setPreferredSize(new Dimension(800,600));
		setResizable(false);
		setLocationRelativeTo(null);
		
		ImageIcon icon20 = new ImageIcon("windowicon.png");
		setIconImage(icon20.getImage());
		
		ImageIcon icon0 = new ImageIcon("startBackground.jpg");
		
		JLabel backGroundLabel = new JLabel("",icon0,JLabel.CENTER);
		backGroundLabel.setBounds(0,0,800,600);
	
		

		startPanel = new JPanel();
		startPanel.setLayout(null);
		startPanel.setBounds(105, 10, 590,452);
		//startPanel.setBackground(Color.white);
		startPanel.setVisible(true);
		startPanel.setOpaque(false);
		//city2.setBorder(new LineBorder(Color.black));
		
		
		gameName = new JTextArea("   GAME OVER ");
		gameName.setFont(new Font(Font.DIALOG_INPUT,Font.PLAIN,60));
		
		gameName.setBounds(25, 11, 543, 104);
		//gameName.setBorder(new LineBorder(Color.white));
		//gameName.setBackground(Color.black);
		gameName.setPreferredSize(new Dimension(60,24));
		gameName.setEditable(false);
		gameName.setOpaque(false);
		startPanel.add(gameName);
		
		ImageIcon icon = new ImageIcon("City2.png");
		label = new JLabel();
		label.setSize(new Dimension(256,256));
		label.setBounds(160, 150, 256, 256);
		//label.setIcon(icon);
		
		
		
		
		startPanel.add(label);
		
		
		
		
		JPanel namePanel = new JPanel();
		namePanel.setLayout(null);
		namePanel.setBounds(105, 150, 800,100);
		//namePanel.setBackground(Color.black);
		namePanel.setVisible(true);
		namePanel.setOpaque(false);
		//namePanel.setBorder(new LineBorder(Color.black));
		
		
		EngameText = new JTextArea();
		EngameText.setBounds(50,50,800,50);
		EngameText.setPreferredSize(new Dimension(232,50));
		EngameText.setFont(EngameText.getFont().deriveFont(40f));
		//EngameText.setBackground(Color.lightGray);
		//EngameText.setBorder(new LineBorder(Color.black));
		EngameText.setForeground(Color.GREEN);
		EngameText.setEditable(false);
		EngameText.setOpaque(false);
		namePanel.add(EngameText);
	
		
		
		//public void setListener(ButtonListener buttonListener) {
		//	this.buttonListener=buttonListener;
		//}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		add(startPanel);
		add(namePanel);
		
		
		add(backGroundLabel);
		
		
		
		this.repaint();
		this.revalidate();
		
	
}
	public JTextArea getEngameText() {
		return EngameText;
	}
	public void setEngameText(JTextArea engameText) {
		EngameText = engameText;
	}
}
