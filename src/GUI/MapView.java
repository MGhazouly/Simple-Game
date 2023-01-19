package GUI;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import engine.Game;

public class MapView extends JFrame 
{
private Game game;


	public MapView()
	{
		
		this.setSize(470,370);
		this.setVisible(true);
		this.setLayout(null);
		setPreferredSize(new Dimension(470,370));
		setResizable(false);
		ImageIcon icon20 = new ImageIcon("windowicon.png");
		setIconImage(icon20.getImage());
		
		
		
		
		
		
		
		
	
	
		
		
		JPanel city2 = new JPanel();
		city2.setLayout(null);
		city2.setBounds(0, 245, 120, 90);
		city2.setBackground(Color.white);
		city2.setVisible(true);
		//city2.setBorder(new LineBorder(Color.black));
		
		JTextArea cityName2 = new JTextArea("  cairo");
		cityName2.setBounds(34, 1, 60, 26);
		//cityName2.setBorder(new LineBorder(Color.white));
		cityName2.setBackground(Color.white);
		cityName2.setPreferredSize(new Dimension(60,24));
		cityName2.setEditable(false);
		city2.add(cityName2);
		

		
		JLabel labelCity2=new JLabel();
		labelCity2.setBounds(0, 0, 24, 24);
		ImageIcon icon2 = new ImageIcon("City.png");
		labelCity2.setIcon(icon2);
		city2.add(labelCity2);
		
		JPanel idleArmyPanel2=new JPanel();
		idleArmyPanel2.setLayout(new GridLayout(0,3));
		idleArmyPanel2.setBounds(0, 39, 120, 50);
		idleArmyPanel2.setBackground(Color.cyan);
		idleArmyPanel2.setVisible(true);
		city2.add(idleArmyPanel2);
		
		JTextArea textIdle2 = new JTextArea("Idle Armies:");
		textIdle2.setBounds(0, 24, 120, 15);
		//textIdle2.setBorder(new LineBorder(Color.black));
		//textIdle2.setBackground(Color.yellow);
		textIdle2.setPreferredSize(new Dimension(120,15));
		textIdle2.setEditable(false);
		city2.add(textIdle2);
	
		
		JPanel city4 = new JPanel();
		city4.setLayout(null);
		city4.setBounds(335, 0, 120, 90);
		city4.setBackground(Color.white);
		city4.setVisible(true);
		//city4.setBorder(new LineBorder(Color.black));
		
		JTextArea cityName4 = new JTextArea("  cairo");
		cityName4.setBounds(34, 1, 60, 26);
		//cityName4.setBorder(new LineBorder(Color.white));
		cityName4.setBackground(Color.white);
		cityName4.setPreferredSize(new Dimension(60,24));
		cityName4.setEditable(false);
		city4.add(cityName4);
		

		
		JLabel labelCity4=new JLabel();
		labelCity4.setBounds(0, 0, 24, 24);
		ImageIcon icon4 = new ImageIcon("City.png");
		labelCity4.setIcon(icon4);
		city4.add(labelCity4);
		
		JPanel idleArmyPanel4=new JPanel();
		idleArmyPanel4.setLayout(new GridLayout(0,3));
		idleArmyPanel4.setBounds(0, 39, 120, 50);
		idleArmyPanel4.setBackground(Color.cyan);
		idleArmyPanel4.setVisible(true);
		city4.add(idleArmyPanel4);
		
		JTextArea textIdle4= new JTextArea("Idle Armies:");
		textIdle4.setBounds(0, 24, 120, 15);
		//textIdle4.setBorder(new LineBorder(Color.black));
		//textIdle4.setBackground(Color.yellow);
		textIdle4.setPreferredSize(new Dimension(120,15));
		textIdle4.setEditable(false);
		city4.add(textIdle4);
		
		
		JPanel city5 = new JPanel();
		city5.setLayout(null);
		city5.setBounds(140, 120, 120, 90);
		city5.setBackground(Color.white);
		city5.setVisible(true);
		//city5.setBorder(new LineBorder(Color.black));
		
		JTextArea cityName5 = new JTextArea("  cairo");
		cityName5.setBounds(34, 1, 60, 26);
		//cityName5.setBorder(new LineBorder(Color.white));
		cityName5.setBackground(Color.white);
		cityName5.setPreferredSize(new Dimension(60,24));
		cityName5.setEditable(false);
		city5.add(cityName5);
		

		
		JLabel labelCity5=new JLabel();
		labelCity5.setBounds(0, 0, 24, 24);
		ImageIcon icon5 = new ImageIcon("City.png");
		labelCity5.setIcon(icon5);
		city5.add(labelCity5);
		
		JPanel idleArmyPanel5=new JPanel();
		idleArmyPanel5.setLayout(new GridLayout(0,3));
		idleArmyPanel5.setBounds(0, 39, 120, 50);
		idleArmyPanel5.setBackground(Color.cyan);
		idleArmyPanel5.setVisible(true);
		city5.add(idleArmyPanel5);
		
		JTextArea textIdle5= new JTextArea("Idle Armies:");
		textIdle5.setBounds(0, 24, 120, 15);
		//textIdle5.setBorder(new LineBorder(Color.black));
		//textIdle5.setBackground(Color.yellow);
		textIdle5.setPreferredSize(new Dimension(120,15));
		textIdle5.setEditable(false);
		city5.add(textIdle5);
		
		
		
		
		
		JPanel armyPanel2 = new JPanel();
		armyPanel2.setLayout(null);
		armyPanel2.setBounds(120, 253, 90, 80);
		armyPanel2.setBackground(Color.white);
		armyPanel2.setVisible(true);
		//armyPanel2.setBorder(new LineBorder(Color.black));
		
		JTextArea armyText2 = new JTextArea("  cairo");
		armyText2.setBounds(34, 1, 60, 20);
		//armyText2.setBorder(new LineBorder(Color.white));
		armyText2.setBackground(Color.white);
		armyText2.setPreferredSize(new Dimension(60,24));
		armyText2.setEditable(false);
		armyPanel2.add(armyText2);
		
		JTextArea armyStatus2 = new JTextArea("Marching");
		armyStatus2.setBounds(0, 60, 90, 20);
		//armyStatus2.setBorder(new LineBorder(Color.white));
		armyStatus2.setBackground(Color.white);
		armyStatus2.setPreferredSize(new Dimension(60,24));
		armyStatus2.setEditable(false);
		armyPanel2.add(armyStatus2);
		
		
		JMenuBar armyMenuBar2 = new JMenuBar();
		
		
		JMenu armyMenu2 = new JMenu("Recruit");
		armyMenu2.setVisible(true);
		
		JMenuItem archer2 = new JMenuItem("Archers = 200");
		JMenuItem cavalry2 = new JMenuItem("Cavalry = 200");
		JMenuItem infantry2 = new JMenuItem("Infantry = 200");
		
		armyMenu2.add(archer2);
		armyMenu2.add(cavalry2);
		armyMenu2.add(infantry2);
		armyMenuBar2.add(armyMenu2);
		
		armyMenuBar2.setBounds(0, 30, 50, 24);
		armyPanel2.add(armyMenuBar2);
		
		
		JPanel armyPanel4 = new JPanel();
		armyPanel4.setLayout(null);
		armyPanel4.setBounds(245, 10, 90, 80);
		armyPanel4.setBackground(Color.white);
		armyPanel4.setVisible(true);
		//armyPanel4.setBorder(new LineBorder(Color.black));
		
		JTextArea armyText4 = new JTextArea("  cairo");
		armyText4.setBounds(34, 1, 60, 20);
		//armyText4.setBorder(new LineBorder(Color.white));
		armyText4.setBackground(Color.white);
		armyText4.setPreferredSize(new Dimension(60,24));
		armyText4.setEditable(false);
		armyPanel4.add(armyText4);
		
		JTextArea armyStatus4 = new JTextArea("Marching");
		armyStatus4.setBounds(0, 60, 90, 20);
		//armyStatus4.setBorder(new LineBorder(Color.white));
		armyStatus4.setBackground(Color.white);
		armyStatus4.setPreferredSize(new Dimension(60,24));
		armyStatus4.setEditable(false);
		armyPanel4.add(armyStatus4);
		
		
		JMenuBar armyMenuBar4 = new JMenuBar();
		
		
		JMenu armyMenu4 = new JMenu("Recruit");
		armyMenu4.setVisible(true);
		
		JMenuItem archer4 = new JMenuItem("Archers = 200");
		JMenuItem cavalry4 = new JMenuItem("Cavalry = 200");
		JMenuItem infantry4 = new JMenuItem("Infantry = 200");
		
		armyMenu4.add(archer4);
		armyMenu4.add(cavalry4);
		armyMenu4.add(infantry4);
		armyMenuBar4.add(armyMenu4);
		
		armyMenuBar4.setBounds(0, 30, 50, 24);
		armyPanel4.add(armyMenuBar4);
		
		JPanel armyPanel5 = new JPanel();
		armyPanel5.setLayout(null);
		armyPanel5.setBounds(260, 130, 90, 80);
		armyPanel5.setBackground(Color.white);
		armyPanel5.setVisible(true);
		//armyPanel5.setBorder(new LineBorder(Color.black));
		
		JTextArea armyText5 = new JTextArea("  cairo");
		armyText5.setBounds(34, 1, 60, 20);
		//armyText5.setBorder(new LineBorder(Color.white));
		armyText5.setBackground(Color.white);
		armyText5.setPreferredSize(new Dimension(60,24));
		armyText5.setEditable(false);
		armyPanel5.add(armyText5);
		
		JTextArea armyStatus5 = new JTextArea("Marching");
		armyStatus5.setBounds(0, 60, 90, 20);
		//armyStatus5.setBorder(new LineBorder(Color.white));
		armyStatus5.setBackground(Color.white);
		armyStatus5.setPreferredSize(new Dimension(60,24));
		armyStatus5.setEditable(false);
		armyPanel5.add(armyStatus5);
		
		
		JMenuBar armyMenuBar5 = new JMenuBar();
		
		
		JMenu armyMenu5 = new JMenu("Recruit");
		armyMenu5.setVisible(true);
		
		JMenuItem archer5 = new JMenuItem("Archers = 200");
		JMenuItem cavalry5 = new JMenuItem("Cavalry = 200");
		JMenuItem infantry5 = new JMenuItem("Infantry = 200");
		
		armyMenu5.add(archer5);
		armyMenu5.add(cavalry5);
		armyMenu5.add(infantry5);
		armyMenuBar5.add(armyMenu5);
		
		armyMenuBar5.setBounds(0, 30, 50, 24);
		armyPanel5.add(armyMenuBar5);
		
		
		
		
		
		
		
		
		
		
		//add(city);
		add(city2);
		//add(city3);
		add(city4);
		add(city5);
		//add(armyPanel);
		add(armyPanel2);
		//add(armyPanel3);
		add(armyPanel4);
		add(armyPanel5);
		
		
		this.repaint();
		this.revalidate();
		
	}
}
