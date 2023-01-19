package GUI;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.LineBorder;

import engine.Game;

public class StartView extends JFrame
{
	//private ButtonListener buttonListener;
	public JLabel getLabel() {
		return label;
	}

	public void setLabel(JLabel label) {
		this.label = label;
	}

	public JPanel getStartPanel() {
		return startPanel;
	}

	public void setStartPanel(JPanel startPanel) {
		this.startPanel = startPanel;
	}

	public JPanel getNamePanel() {
		return namePanel;
	}

	public void setNamePanel(JPanel namePanel) {
		this.namePanel = namePanel;
	}

	public JTextArea getGameName() {
		return gameName;
	}

	public void setGameName(JTextArea gameName) {
		this.gameName = gameName;
	}

	public JTextArea getNameText() {
		return nameText;
	}

	public void setNameText(JTextArea nameText) {
		this.nameText = nameText;
	}

	public JTextArea getPlayerName() {
		return playerName;
	}

	public void setPlayerName(JTextArea playerName) {
		this.playerName = playerName;
	}

	public JButton getButton() {
		return button;
	}

	public void setButton(JButton button) {
		this.button = button;
	}

	private JLabel label;
	private JPanel startPanel;
	private JPanel namePanel;
	private JTextArea gameName;
	private JTextArea nameText;
	private JTextArea playerName;
	private JButton button;
	
	public StartView() {
		
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
		
		
		gameName = new JTextArea(" THE CONQUERER ");
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
		namePanel.setBounds(105, 462, 590,100);
		//namePanel.setBackground(Color.black);
		namePanel.setVisible(true);
		namePanel.setOpaque(false);
		//namePanel.setBorder(new LineBorder(Color.black));
		
		nameText = new JTextArea("Please Enter Your Name: ");
		nameText.setBounds(0,0,232,50);
		nameText.setPreferredSize(new Dimension(232,50));
		nameText.setFont(nameText.getFont().deriveFont(20f));
		//nameText.setBackground(Color.lightGray);
		//nameText.setBorder(new LineBorder(Color.black));
		nameText.setForeground(Color.GREEN);
		nameText.setEditable(false);
		nameText.setOpaque(false);
		namePanel.add(nameText);
		
		playerName = new JTextArea("");
		playerName.setBounds(232,0,232,50);
		playerName.setPreferredSize(new Dimension(232,50));
		playerName.setFont(nameText.getFont().deriveFont(20f));
		//playerName.setBackground(Color.green);
		playerName.setOpaque(false);
		playerName.setBorder(new LineBorder(Color.blue));
		namePanel.add(playerName);
		
		button = new JButton("START");
		//button.setBackground(Color.gray);
		button.setBounds(260, 60, 60, 20);
		button.setFont(button.getFont().deriveFont(8f));
		button.setForeground(Color.green);
		namePanel.add(button);
		
		
		
		//public void setListener(ButtonListener buttonListener) {
		//	this.buttonListener=buttonListener;
		//}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		add(startPanel);
		add(namePanel);
		
		
		add(backGroundLabel);
		
		
		
		this.repaint();
		this.revalidate();
		
	}
}
