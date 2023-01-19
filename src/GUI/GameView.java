package GUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.LineBorder;

public class GameView extends JFrame implements ActionListener {
	
	private static final long serialVersionUID = 1L;
	
	private JButton targetCity;
	private JPanel namePanel;
	private JPanel turnCountPanel;
	private JPanel resourcesPanel;
	private JTextArea text;
	private JTextArea turnText;
	private JTextArea resourcesText;
	private JPanel mapPanel;
	private JPanel cityPanel2;
	private JPanel cityPanel;
	private JLabel label;
	private JMenuItem ArcherItem;
	private JMenuItem saveItem;
	private JMenuItem exitItem;
	ImageIcon loadIcon;
	private JMenuItem ArcherItem1;
	private JTextArea text1;
	private JTextArea text2;
	private JTextArea text3;
	private JTextArea text4;
	private JTextArea text5;
	private JTextArea text6;
	private JTextArea text7;
	private JTextArea text8;
	private JTextArea text9;
	private JTextArea text10;
	private JTextArea text11;
	private JTextArea text12;
	private JTextArea text13;
	private JButton button;
	private JButton button1;
	private JButton button2;
	private JButton button3;
	private JButton button4;
	private JButton button5;
	private JButton button6;
	private JButton button7;
	private JButton button8;
	private JButton build;
	private JButton build1;
	private JButton build2;
	private JButton build3;
	private JButton build4;
	private JMenuBar armyMenuBar1;
	private JMenuBar armyMenuBar;
	private JMenu unitMenu;
	private JButton endTurnButton;
	private JMenuBar armyListMenuBar;
	private JMenu armyMenu;
	private JButton moveButton;
	private JMenuBar initiateButton;
	private JMenu initiateArmy;
	private JMenuBar moveMenuBar;
	private JMenu moveUnitsMenu;
	private JButton pressArcher;
	private JButton pressInfantry;
	private JButton pressCavalry;
	private JButton pressArcher1;
	private JButton pressInfantry1;
	private JButton pressCavalry1;
	private JMenu relocateMenu;
	
	//world map view
	private JMenuBar controlledMarching;
	private JMenuBar controlledBesieging;
	private JMenuBar controlledidle;
	
	private JButton choose1;
	
	
	
	
    private JMenu marchingMenu;
    private JMenu besiegingMenu;
    private JMenu idleMenu;
    
    private JMenu unitMenu1;
    private CityView cityView;
    
    private CityView  cityViewConquered2;
	
	
	


	public JMenu getUnitMenu1() {
		return unitMenu1;
	}
	public void setUnitMenu1(JMenu unitMenu1) {
		this.unitMenu1 = unitMenu1;
	}
	public JMenuBar getArmyMenuBar1() {
		return armyMenuBar1;
	}
	public JMenuBar getArmyMenuBar() {
		return armyMenuBar;
	}

	public void setArmyMenuBar1(JMenuBar armyMenuBar1) {
		this.armyMenuBar1 = armyMenuBar1;
	}
	public GameView() {
		cityView = new CityView();
		cityView.setVisible(true);
		cityView.setBorder(new LineBorder(Color.black));
		cityView.setBounds(1, 768-290,350,250);
		cityView.setOpaque(false);
		add(cityView);
		
		
		cityViewConquered2 = new CityView();
		cityViewConquered2.setVisible(true);
		cityViewConquered2.setBorder(new LineBorder(Color.black));
		cityViewConquered2.setBounds(1366-365,40,350,250);
		cityViewConquered2.setOpaque(false);
		add(cityViewConquered2);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(null);
		setSize(1366,768);
		
		setResizable(false);
		setTitle("The Conquerer");
		ImageIcon icon20 = new ImageIcon("windowicon.png");
		setIconImage(icon20.getImage());
		
		cityPanel = new JPanel();
		cityPanel.setSize(new Dimension(350,250));
		//cityPanel.setBackground(Color.yellow);
		cityPanel.setBorder(new LineBorder(Color.black));
		cityPanel.setBounds(508, 250, 350, 250);
		cityPanel.setLayout(null);
		cityPanel.setOpaque(false);
		cityPanel.setSize(350,250);
		JLabel cityLabel = new JLabel();
		ImageIcon hi= new ImageIcon("afsfsa.jpg");
		cityLabel.setIcon(hi);
		cityLabel.setBounds(0, 0, 350, 250);
		//cityPanel.add(cityLabel);		
		
		//setMaximumSize(new Dimension(350,250));
		cityPanel.setPreferredSize(new Dimension(350,250));
		
		cityPanel.setVisible(true);
		//cityPanel.setAlignmentX(cityPanel.CENTER_ALIGNMENT);
		//cityPanel.setAlignmentY(cityPanel.CENTER_ALIGNMENT);
		//setResizable(false);
		
	

		
		
		
		
		
	
		moveMenuBar=new JMenuBar();
		relocateMenu = new JMenu("Relocate");
		moveMenuBar.setBounds(100,2 ,70, 20);

		pressArcher1= new JButton("Archer");
		pressArcher1.setVisible(true);
		pressArcher1.setBorder(new LineBorder(Color.black));
		pressArcher1.setFont(pressArcher1.getFont().deriveFont(10f));
		pressArcher1.setOpaque(false);
		
		pressCavalry1= new JButton("Cavalry");
		pressCavalry1.setVisible(true);
		pressCavalry1.setBorder(new LineBorder(Color.black));
		pressCavalry1.setFont(pressCavalry1.getFont().deriveFont(10f));
		pressCavalry1.setOpaque(false);
		
		pressInfantry1= new JButton("Infantry");
		pressInfantry1.setVisible(true);
		pressInfantry1.setBorder(new LineBorder(Color.black));
		pressInfantry1.setFont(pressInfantry1.getFont().deriveFont(10f));
		pressInfantry1.setOpaque(false);
		
		relocateMenu.add(pressArcher1);
		relocateMenu.add(pressCavalry1);
		relocateMenu.add(pressInfantry1);
		
		moveMenuBar.add(relocateMenu);
		//moveMenuBar.setOpaque(false);
		cityPanel.add(moveMenuBar);
		
		
		
		
		
		pressArcher= new JButton("Archer");
		pressArcher.setVisible(true);
		pressArcher.setBorder(new LineBorder(Color.black));
		pressArcher.setFont(pressArcher.getFont().deriveFont(10f));
		pressArcher.setOpaque(false);
		pressArcher.setOpaque(false);
		
		pressCavalry= new JButton("Cavalry");
		pressCavalry.setVisible(true);
		pressCavalry.setBorder(new LineBorder(Color.black));
		pressCavalry.setFont(pressCavalry.getFont().deriveFont(10f));
		pressCavalry.setOpaque(false);
		
		pressInfantry= new JButton("Infantry");
		pressInfantry.setVisible(true);
		pressInfantry.setBorder(new LineBorder(Color.black));
		pressInfantry.setFont(pressInfantry.getFont().deriveFont(10f));
		pressInfantry.setOpaque(false);
		
		
		
		
		
		
		
		JPanel panel1 = new JPanel();
		
		panel1.setPreferredSize(new Dimension(220,240));
		panel1.setBounds(1, 1, 240, 240);
		panel1.setLayout(null);
		panel1.setOpaque(false);
		//panel1.setBackground(Color.yellow);
		
		
		
	    text1 = new JTextArea();
		text1.setBounds(1,1,40,20);
		text1.setForeground(Color.white);
		//text1.setBorder(new LineBorder(Color.black));
		text1.setOpaque(false);
		
		text1.setEditable(false);
		//text1.setVisible(false);
		panel1.add(text1);
		
		
		JTextArea text2 = new JTextArea("Economy Buildings :");
		//text2.setPreferredSize(new Dimension(120,20));
		//text2.setBackground(Color.orange);
		text2.setEditable(false);
		text2.setAlignmentX((float) 0.5);
		text2.setAlignmentY((float) 0.5);text2.setForeground(Color.white);
		text2.setVisible(true);
		//text2.setBorder(new LineBorder(Color.black));
		text2.setBounds(1, 30, 120, 20);
		text2.setOpaque(false);
		panel1.add(text2);
		
		
		
	     text3 = new JTextArea("Farm");
		//text3.setBackground(Color.pink);
		text3.setEditable(false);
		text3.setVisible(false);
		text3.setBounds(1, 60, 60, 20);
		text3.setForeground(Color.white);
		//text3.setBorder(new LineBorder(Color.black));
		text3.setOpaque(false);
		panel1.add(text3);
		
		 text4 = new JTextArea("Market");
		//text4.setBackground(Color.green);
		text4.setEditable(false);
		text4.setVisible(false);
		text4.setBounds(1, 90, 60, 20);
		text4.setForeground(Color.white);
		//text4.setBorder(new LineBorder(Color.black));
		text4.setOpaque(false);
		panel1.add(text4);
		
		 text5 = new JTextArea("Military Buildings :");
		//text5.setBackground(Color.orange);
		text5.setEditable(false);
		text5.setVisible(true);
		text5.setBounds(1, 130, 120, 20);
		text5.setForeground(Color.white);
		//text5.setBorder(new LineBorder(Color.black));
		text5.setOpaque(false);
		panel1.add(text5);
		
		 text6 = new JTextArea("Archery Range");
		//text6.setBackground(Color.magenta);
		text6.setEditable(false);
		text6.setVisible(false);
		text6.setFont(text6.getFont().deriveFont(8f)); // will only change size to 12pt
		text6.setBounds(1, 160, 60, 20);
		//text6.setBorder(new LineBorder(Color.black));
		text6.setOpaque(false);
		text6.setForeground(Color.white);
		panel1.add(text6);
		
		 text7 = new JTextArea(" Barracks");
		//text7.setBackground(Color.cyan);
		text7.setEditable(false);
		text7.setVisible(false);
		//text6.setFont(text6.getFont().deriveFont(8f)); // will only change size to 12pt
		text7.setBounds(1, 190, 60, 20);
		//text7.setBorder(new LineBorder(Color.black));
		text7.setOpaque(false);text7.setForeground(Color.white);
		panel1.add(text7);
		
		 text8 = new JTextArea("  Stable");
		//text8.setBackground(Color.red);
		text8.setEditable(false);
		text8.setVisible(false);text8.setForeground(Color.white);
		//text6.setFont(text6.getFont().deriveFont(8f)); // will only change size to 12pt
		text8.setBounds(1, 220, 60, 20);
		//text8.setBorder(new LineBorder(Color.black));
		text8.setOpaque(false);
		panel1.add(text8);
		
		 text9 = new JTextArea("Level 1");
		//text9.setBackground(Color.orange);
		text9.setEditable(false);
		text9.setVisible(false);
		text9.setFont(text9.getFont().deriveFont(8f)); // will only change size to 12pt
		text9.setBounds(65, 60, 40, 20);text9.setForeground(Color.white);
		//text9.setBorder(new LineBorder(Color.black));
		text9.setOpaque(false);
		panel1.add(text9);
		
		 text10 = new JTextArea("Level 1");
		//text10.setBackground(Color.orange);
		text10.setEditable(false);
		text10.setVisible(false);text10.setForeground(Color.white);
		text10.setFont(text10.getFont().deriveFont(8f)); // will only change size to 12pt
		text10.setBounds(65, 90, 40, 20);
		//text10.setBorder(new LineBorder(Color.black));
		text10.setOpaque(false);
		panel1.add(text10);
		
		 text11 = new JTextArea("Level 1");
		//text11.setBackground(Color.orange);
		text11.setEditable(false);
		text11.setVisible(false);text11.setForeground(Color.white);
		text11.setFont(text11.getFont().deriveFont(8f)); // will only change size to 12pt
		text11.setBounds(65, 160, 40, 20);
		text11.setOpaque(false);
		//text11.setBorder(new LineBorder(Color.black));
		panel1.add(text11);
		
	    text12 = new JTextArea("Level 1");
		//text12.setBackground(Color.orange);
		text12.setEditable(false);
		text12.setVisible(false);
		text12.setFont(text11.getFont().deriveFont(8f)); // will only change size to 12pt
		text12.setBounds(65, 190, 40, 20);
		text12.setOpaque(false);text12.setForeground(Color.white);
		//text12.setBorder(new LineBorder(Color.black));
		panel1.add(text12);
		
	    text13 = new JTextArea("Level 1");
		//text13.setBackground(Color.orange);
		text13.setEditable(false);
		text13.setVisible(false);text13.setForeground(Color.white);
		text13.setFont(text11.getFont().deriveFont(8f)); // will only change size to 12pt
		text13.setBounds(65, 220, 40, 20);
		text13.setOpaque(false);
		//text13.setBorder(new LineBorder(Color.black));
		panel1.add(text13);
		
		
	     button = new JButton("Upgrade");
	    //button.setBackground(Color.gray);
		button.setBounds(110, 60, 60, 20);
		button.setVisible(false);
		button.setBorder(new LineBorder(Color.black));
		button.setOpaque(false);
		button.setFont(button.getFont().deriveFont(6f));
		button.setToolTipText("Upgrade Cost 500");
		panel1.add(button);
		
		 button1 = new JButton("Upgrade");
		//button1.setBackground(Color.orange);
		button1.setBounds(110, 90, 60, 20);
		button1.setVisible(false);
		button1.setBorder(new LineBorder(Color.black));
		button1.setFont(button.getFont().deriveFont(6f));
		button1.setOpaque(false);
		button1.setToolTipText("Upgrade Cost 700");
		panel1.add(button1);
		
		initiateButton = new JMenuBar();
		initiateButton.setBackground(Color.gray);
		initiateButton.setBounds(170, 2, 80, 20);
		initiateButton.setVisible(true);
		initiateButton.setBorder(new LineBorder(Color.black));
		initiateButton.setFont(initiateButton.getFont().deriveFont(10f));
		//moveButton.setOpaque(false);
		initiateButton.setToolTipText("Initiate new Idle Army");
	
		
		initiateArmy=new JMenu("Initiate Army");
		initiateArmy.setVisible(true);
	
		
		
		JMenuItem archer=new JMenuItem();
		JMenuItem cavalry=new JMenuItem();
		JMenuItem infantry=new JMenuItem();
		
		
		
		
		
		initiateArmy.add(archer);
		archer.add(pressArcher);
		
		initiateArmy.add(cavalry);
		cavalry.add(pressCavalry);
		
		initiateArmy.add(infantry);
		infantry.add(pressInfantry);
		
		initiateButton.add(initiateArmy);
		cityPanel.add(initiateButton);
		
		 button2 = new JButton("Upgrade");
		//button2.setBackground(Color.orange);
		button2.setBounds(110, 160, 60, 20);
		button2.setVisible(false);
		button2.setBorder(new LineBorder(Color.black));
		button2.setFont(button.getFont().deriveFont(6f));
		button.setOpaque(false);
		
		button2.setToolTipText("Upgrade Cost 800");
		panel1.add(button2);
		
		 button3 = new JButton("Upgrade");
		//button3.setBackground(Color.orange);
		button3.setOpaque(false);
		button3.setBorder(new LineBorder(Color.black));
		button3.setBounds(110, 160, 60, 20);
		button3.setFont(button.getFont().deriveFont(6f));
		button3.setToolTipText("Upgrade Cost 1000");
		//panel1.add(button3);
		
		
		button4 = new JButton("Upgrade");
		//button4.setBackground(Color.orange);
		button4.setVisible(false);
		button4.setOpaque(false);
		button4.setBounds(110, 190, 60, 20);
		button4.setBorder(new LineBorder(Color.black));
		button4.setFont(button.getFont().deriveFont(6f));
		button4.setToolTipText("Upgrade Cost 1000");
		panel1.add(button4);
		
		button5 = new JButton("Upgrade");
		//button5.setBackground(Color.orange);
		button5.setVisible(false);
		button5.setOpaque(false);
		button5.setBounds(110, 220, 60, 20);
		button5.setBorder(new LineBorder(Color.black));
		button5.setFont(button.getFont().deriveFont(6f));
		button5.setToolTipText("Upgrade Cost 1500");
		panel1.add(button5);
		
		button6 = new JButton("Recruit");
		///button6.setBackground(Color.orange);
		button6.setVisible(false);
		button6.setOpaque(false);
		button6.setBounds(180, 160, 60, 20);
		button6.setBorder(new LineBorder(Color.black));
		button6.setFont(button.getFont().deriveFont(6f));
		button6.setToolTipText("Recruitment Cost 400 ");
		panel1.add(button6);
		
		button7 = new JButton("Recruit");
		//button7.setBackground(Color.orange);
		button7.setBounds(180, 190, 60, 20);
		button7.setOpaque(false);
		button7.setVisible(false);
		button7.setBorder(new LineBorder(Color.black));
		button7.setFont(button.getFont().deriveFont(6f));
		button7.setToolTipText("Recruitment Cost 500");
		panel1.add(button7);
		
		button8 = new JButton("Recruit");
		//button8.setBackground(Color.orange);
		button8.setOpaque(false);
		button8.setVisible(false);
		button8.setBounds(180, 220, 60, 20);
		button8.setBorder(new LineBorder(Color.black));
		button8.setFont(button.getFont().deriveFont(6f));
		button8.setToolTipText("Recruitment Cost 600");
		panel1.add(button8);
		
		
		
		targetCity = new JButton("Target a city");
		targetCity.setBounds(260, 2, 80, 20);
		targetCity.setFont(targetCity.getFont().deriveFont(6f));
		targetCity.setVisible(true);
		cityPanel.add(targetCity);
		
		
		JLabel label2 = new JLabel();
		label2.setBounds(289, 0, 24, 24);
		//label2.setVisible(false);
		ImageIcon icon = new ImageIcon("City.png");
		label2.setIcon(icon);
		//cityPanel.add(label2);
		
		JLabel label3 = new JLabel();
		label3.setBounds(240-24, 30, 24, 24);
		label3.setVisible(false);
		ImageIcon icon2 = new ImageIcon("City.png");
		label3.setIcon(icon2);
		cityPanel.add(label3);
		
		JLabel label4 = new JLabel();
		label4.setVisible(false);
		label4.setBounds(240-24, 60, 24, 24);
		ImageIcon icon3 = new ImageIcon("City.png");
		label4.setIcon(icon3);
		cityPanel.add(label4);
		
		JLabel label5 = new JLabel();
		label5.setVisible(false);
		label5.setBounds(240-24, 90, 24, 24);
		ImageIcon icon4 = new ImageIcon("City.png");
		label5.setIcon(icon4);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		cityPanel.add(label5);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		cityPanel.add(panel1);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		namePanel=new JPanel();
		namePanel.setBounds(0, 0, 120, 40);
		//namePanel.setBackground(Color.red);
		namePanel.setBorder(new LineBorder(Color.black));
		namePanel.setOpaque(false);
		namePanel.setForeground(Color.white);
		
		turnCountPanel=new JPanel();
		turnCountPanel.setBounds(120,0 , 120, 40);
		//turnCountPanel.setBackground(Color.blue);
		turnCountPanel.setOpaque(false);
		turnCountPanel.setBorder(new LineBorder(Color.black));
		turnCountPanel.setOpaque(false);
		turnCountPanel.setForeground(Color.white);
		
		resourcesPanel=new JPanel();
		resourcesPanel.setLayout(null);
		resourcesPanel.setBounds(240, 0, 200, 40);
		resourcesPanel.setOpaque(false);
		resourcesPanel.setForeground(Color.white);
		//resourcesPanel.setBackground(Color.CYAN);
		resourcesPanel.setBorder(new LineBorder(Color.black));
		resourcesPanel.setOpaque(false);
		
		mapPanel=new JPanel();
		mapPanel.setBounds(900, 400, 470, 370);
		mapPanel.setLayout(null);
		//mapPanel.setBackground(Color.GREEN);
		mapPanel.setOpaque(false);
		mapPanel.setBorder(new LineBorder(Color.black));
		
		
		
		
		ImageIcon icon200 = new ImageIcon("windowicon.png");
		setIconImage(icon200.getImage());
		
		
		
		
		
		
		
		
	
	
		
		
		JPanel city2 = new JPanel();
		city2.setLayout(null);
		city2.setBounds(0, 245, 120, 90);
		city2.setBackground(Color.white);
		city2.setVisible(true);
		city2.setOpaque(false);
		//city2.setBorder(new LineBorder(Color.black));
		
		JTextArea cityName2 = new JTextArea(" SPARTA ");
		cityName2.setBounds(34, 1, 60, 26);
		cityName2.setBorder(new LineBorder(Color.black));
		//cityName2.setBorder(new LineBorder(Color.white));
		//cityName2.setBackground(Color.white);
		cityName2.setPreferredSize(new Dimension(60,24));
		cityName2.setEditable(false);
		city2.add(cityName2);
		

		
		JLabel labelCity2=new JLabel();
		labelCity2.setBounds(0, 0, 24, 24);
		ImageIcon icon26 = new ImageIcon("City.png");
		labelCity2.setIcon(icon26);
		city2.add(labelCity2);
		cityName2.setOpaque(false);
		cityName2.setForeground(Color.white);
		
		JPanel idleArmyPanel2=new JPanel();
		idleArmyPanel2.setLayout(new GridLayout(0,3));
		idleArmyPanel2.setBounds(0, 39, 120, 50);
		//idleArmyPanel2.setBackground(Color.cyan);
		idleArmyPanel2.setVisible(true);
		//city2.add(idleArmyPanel2);
		
		JTextArea textIdle2 = new JTextArea("Idle Armies:");
		textIdle2.setBounds(0, 24, 120, 15);
		//textIdle2.setBorder(new LineBorder(Color.black));
		//textIdle2.setBackground(Color.yellow);
		textIdle2.setPreferredSize(new Dimension(120,15));
		textIdle2.setEditable(false);
		//city2.add(textIdle2);
	
		
		JPanel city4 = new JPanel();
		city4.setLayout(null);
		city4.setBounds(335, 0, 120, 90);
		city4.setBackground(Color.white);
		city4.setVisible(true);
		city4.setOpaque(false);
		//city4.setBorder(new LineBorder(Color.black));
		
		JTextArea cityName4 = new JTextArea("  ROME ");
		cityName4.setBounds(34, 1, 60, 26);
		cityName4.setBorder(new LineBorder(Color.black));
		//cityName4.setBorder(new LineBorder(Color.white));
		//cityName4.setBackground(Color.white);
		cityName4.setPreferredSize(new Dimension(60,24));
		cityName4.setEditable(false);
		city4.add(cityName4);
		cityName4.setOpaque(false);
		cityName4.setForeground(Color.white);

		
		JLabel labelCity4=new JLabel();
		labelCity4.setBounds(0, 0, 24, 24);
		ImageIcon icon45 = new ImageIcon("City.png");
		labelCity4.setIcon(icon45);
		city4.add(labelCity4);
		
		JPanel idleArmyPanel4=new JPanel();
		idleArmyPanel4.setLayout(new GridLayout(0,3));
		idleArmyPanel4.setBounds(0, 39, 120, 50);
		//idleArmyPanel4.setBackground(Color.cyan);
		idleArmyPanel4.setVisible(true);
		//city4.add(idleArmyPanel4);
		
		JTextArea textIdle4= new JTextArea("Idle Armies:");
		textIdle4.setBounds(0, 24, 120, 15);
		//textIdle4.setBorder(new LineBorder(Color.black));
		//textIdle4.setBackground(Color.yellow);
		textIdle4.setPreferredSize(new Dimension(120,15));
		textIdle4.setEditable(false);
		//city4.add(textIdle4);
		
		
		JPanel city5 = new JPanel();
		city5.setLayout(null);
		city5.setBounds(140, 120, 120, 90);
		//city5.setBackground(Color.white);
		city5.setVisible(true);
		city5.setOpaque(false);
		//city5.setBorder(new LineBorder(Color.black));
		
		JTextArea cityName5 = new JTextArea(" CAIRO ");
		cityName5.setBounds(34, 1, 60, 26);
		//cityName5.setBorder(new LineBorder(Color.white));
		//cityName5.setBackground(Color.white);
		cityName5.setPreferredSize(new Dimension(60,24));
		cityName5.setEditable(false);
		cityName5.setOpaque(false);
		city5.add(cityName5);
		cityName5.setBorder(new LineBorder(Color.black));
		cityName5.setForeground(Color.white);

		
		JLabel labelCity5=new JLabel();
		labelCity5.setBounds(0, 0, 24, 24);
		ImageIcon icon5 = new ImageIcon("City.png");
		labelCity5.setIcon(icon5);
		city5.add(labelCity5);
		
		JPanel idleArmyPanel5=new JPanel();
		idleArmyPanel5.setLayout(new GridLayout(0,3));
		idleArmyPanel5.setBounds(0, 39, 120, 50);
		//idleArmyPanel5.setBackground(Color.cyan);
		idleArmyPanel5.setVisible(true);
		//city5.add(idleArmyPanel5);
		
		JTextArea textIdle5= new JTextArea("Idle Armies:");
		textIdle5.setBounds(0, 24, 120, 15);
		//textIdle5.setBorder(new LineBorder(Color.black));
		//textIdle5.setBackground(Color.yellow);
		textIdle5.setPreferredSize(new Dimension(120,15));
		textIdle5.setEditable(false);
		//city5.add(textIdle5);
		
		
		
		
		
		JPanel armyPanel2 = new JPanel();
		armyPanel2.setLayout(null);
		armyPanel2.setBounds(120, 253, 90, 80);
		armyPanel2.setBackground(Color.white);
		//armyPanel2.setVisible(true);
		//armyPanel2.setBorder(new LineBorder(Color.black));
		
		JTextArea armyText2 = new JTextArea(" SPARTA ");
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
		armyPanel4.setBounds(365, 10, 90, 80);
		armyPanel4.setBackground(Color.white);
		//armyPanel4.setVisible(true);
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
		//armyPanel5.setVisible(true);
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
		
		
		choose1 =new JButton("Choose");
		choose1.setBounds(300,190,100,40);
		choose1.setVisible(true);
		
		
		
		
		
		mapPanel.add(choose1);
		
		//add(city);
		mapPanel.add(city2);
		//add(city3);
		mapPanel.add(city4);
		mapPanel.add(city5);
		//add(armyPanel);
		//mapPanel.add(armyPanel2);
		//add(armyPanel3);
		//mapPanel.add(armyPanel4);
		//mapPanel.add(armyPanel5);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		cityPanel2 = new JPanel();
		cityPanel2.setBounds(50,300 , 300, 175);
		cityPanel2.setBackground(Color.black);


		
		ImageIcon icon100 = new ImageIcon("City1.png");
		label = new JLabel();
		label.setText("Cairo");
		label.setIcon(icon100);
		
		//cityPanel2.add(label);
		
		ImageIcon armyIcon = new ImageIcon("army.png");
		JLabel label8 = new JLabel();
		label8.setText("Defending Army");
		label8.setFont(label8.getFont().deriveFont(8f));
		label8.setIcon(armyIcon);
		
		JPanel defendingArmyPanel = new JPanel();
		defendingArmyPanel.setBounds(250,40,100,100);
		//defendingArmyPanel.setBackground(Color.yellow);
		defendingArmyPanel.add(label8);
		defendingArmyPanel.setVisible(true);
		defendingArmyPanel.setOpaque(false);
		defendingArmyPanel.add(label8);
		defendingArmyPanel.setBorder(new LineBorder(Color.black));
		
		
		
		armyMenuBar = new JMenuBar();
		armyMenuBar.setBorder(new LineBorder(Color.orange));
		unitMenu = new JMenu("Units");
		unitMenu.setVisible(true);
		//nada
		controlledMarching=new JMenuBar();
		controlledMarching.setBorder(new LineBorder(Color.pink));
		controlledMarching.setBounds(20, 10, 100, 40);
		controlledMarching.setVisible(true);
		
		controlledBesieging=new JMenuBar();
		controlledBesieging.setBorder(new LineBorder(Color.pink));
		controlledBesieging.setBounds(300, 150, 100, 40);
		controlledBesieging.setVisible(true);
		
		controlledidle=new JMenuBar();
		controlledidle.setBounds(200,250,100,40);
		controlledidle.setVisible(true);
		
		marchingMenu=new JMenu("Marching Army");
		controlledMarching.add(marchingMenu);
		
		besiegingMenu=new JMenu("Besieging Army");
		controlledBesieging.add(besiegingMenu);
		
		idleMenu=new JMenu("Idle Army");
		controlledidle.add(idleMenu);
		
		
		
		armyListMenuBar = new JMenuBar();
		armyListMenuBar.setBorder(new LineBorder(Color.orange));
		armyMenu = new JMenu("Armies");
		armyMenu.setVisible(true);
		armyListMenuBar.add(armyMenu);
		
		mapPanel.add(controlledMarching);
		mapPanel.add(controlledBesieging);
		mapPanel.add(controlledidle);		
		//JMenuItem ArcherItemNumber = new JMenuItem("200 Archer");
		//JMenuItem CavlaryItemNumber = new JMenuItem("30 Cavalary");
		//JMenuItem InfantryItemNumber = new JMenuItem("15 7omar");
		
		
		
		//unitMenu.add(ArcherItemNumber);
		//unitMenu.add(CavlaryItemNumber);
		//unitMenu.add(InfantryItemNumber); 
		
		
		//armyMenuBar.add(armyPanel);
		armyMenuBar.add(unitMenu);
	
		defendingArmyPanel.add(armyMenuBar);
		//armyMenu.setBounds(400, 450, 60, 60);
		cityPanel.add(defendingArmyPanel);
		
		ImageIcon armyIcon1 = new ImageIcon("army.png");
		JLabel label81 = new JLabel();
		label81.setText("Idle Army");
		label81.setIcon(armyIcon1);
		label81.setFont(label81.getFont().deriveFont(8f));
		
		JPanel stationaryArmyPanel = new JPanel();
		stationaryArmyPanel.setBounds(250,150,100,100);
		//defendingArmyPanel.setBackground(Color.yellow);
		stationaryArmyPanel.setBorder(new LineBorder(Color.black));
		stationaryArmyPanel.add(label81);
		stationaryArmyPanel.setVisible(true);
		stationaryArmyPanel.setOpaque(false);
		
		
		
		armyMenuBar1 = new JMenuBar();
		armyMenuBar1.setBorder(new LineBorder(Color.orange));
		unitMenu1 = new JMenu("Units");
		unitMenu1.setVisible(true);
		
		JMenuItem ArcherItemNumber1 = new JMenuItem("200 Archer");
		JMenuItem CavlaryItemNumber1 = new JMenuItem("30 Cavalary");
		JMenuItem InfantryItemNumber1 = new JMenuItem("15 7omar");
		
		
		
		//unitMenu1.add(ArcherItemNumber1);
		//unitMenu1.add(CavlaryItemNumber1);
		//unitMenu1.add(InfantryItemNumber1); 
		
		
		//armyMenuBar.add(armyPanel);
		armyMenuBar1.add(unitMenu1);
		stationaryArmyPanel.add(armyListMenuBar);
		stationaryArmyPanel.add(armyMenuBar1);
		//armyMenu.setBounds(400, 450, 60, 60);
		
		cityPanel.add(stationaryArmyPanel);
		
		
		
		JPanel idleArmyPanel = new JPanel();
		idleArmyPanel.setBounds(250,250 , 100, 100);
		idleArmyPanel.setBackground(Color.white);
		idleArmyPanel.setVisible(true);
		//idleArmyPanel.setAlignmentX(250);
		//idleArmyPanel.setAlignmentY(3);
		
		cityPanel2.add(idleArmyPanel);
		
		
		
		
		
		
	
		
		
		
		
		JMenuBar menuBar = new JMenuBar();
		
		
		this.setVisible(true);
		
		JMenu loadMenu = new JMenu("Recruit");
		
		
		JMenuItem ArcherItem = new JMenuItem("Archer 50 Gold");
		JMenuItem CavlaryItem = new JMenuItem("Cavalary 100 Gold");
		JMenuItem InfantryItem = new JMenuItem("7omar 200 Gold");
		
		ArcherItem.addActionListener(this);
		CavlaryItem.addActionListener(this);
		InfantryItem.addActionListener(this);
		
		
		
		loadMenu.add(ArcherItem);
		loadMenu.add(CavlaryItem);
		loadMenu.add(InfantryItem);
		
	
		
		loadIcon = new ImageIcon("ironman.png");
			ArcherItem.setIcon(loadIcon);
		
		
		menuBar.add(loadMenu);
		
		
JMenuBar menuBar2 = new JMenuBar();
		
		
		this.setVisible(true);
		
		JMenu loadMenu1 = new JMenu("Recruit");
		
		
		JMenuItem ArcherItem1 = new JMenuItem("Archer 50 Gold");
		JMenuItem CavlaryItem1 = new JMenuItem("Cavalary 100 Gold");
		JMenuItem InfantryItem1 = new JMenuItem("7omar 200 Gold");
		
		ArcherItem1.addActionListener(this);
		CavlaryItem1.addActionListener(this);
		InfantryItem1.addActionListener(this);
		
		
		loadMenu1.add(ArcherItem1);
		loadMenu1.add(CavlaryItem1);
		loadMenu1.add(InfantryItem1);
		
	
		
		//ImageIcon loadIcon1 = new ImageIcon("ironman.png");
		//	ArcherItem1.setIcon(loadIcon1);
		
		menuBar2.add(loadMenu1);
		
		
		menuBar2.setBounds(30, 80, 200, 200);
		menuBar2.setVisible(true);
		
		//add(menuBar2);
	
	
		
		
		cityPanel2.add(menuBar);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		text=new JTextArea();
		text.setPreferredSize(new Dimension(120, 40));
		//text.setText("Player Name= "+this.game.getPlayer().getName());
		text.setBounds(0, 0, 120, 40);
		text.setOpaque(false);
		text.setEditable(false);
		text.setForeground(Color.white);

		namePanel.add(text);
		
		turnText=new JTextArea();
		turnText.setPreferredSize(new Dimension(120, 40));
		//turnText.setText("Current Turn = "+ Integer.toString(game.getCurrentTurnCount()));
		turnText.setBounds(0, 0, 120, 40);
		turnText.setOpaque(false);
		turnText.setEditable(false);
		turnText.setForeground(Color.white);
		turnCountPanel.add(turnText);		
		
		resourcesText=new JTextArea();
		resourcesText.setPreferredSize(new Dimension(500, 20));
		//resourcesText.setText("Food ="+game.getPlayer().getFood() + "       "+"Gold = "+game.getPlayer().getTreasury());
		resourcesText.setBounds(1, 1, 500, 20);
		resourcesText.setOpaque(false);
		resourcesText.setForeground(Color.white);
		resourcesText.setEditable(false);
		resourcesText.setVisible(true);
		resourcesPanel.add(resourcesText);
		
		JLabel foodLabel = new JLabel();
		ImageIcon iconFood = new ImageIcon("Steak.png");
		foodLabel.setIcon(iconFood);
		foodLabel.setBounds(10,19 ,24 ,24 );
		foodLabel.setVisible(true);
		
		JLabel goldLabel = new JLabel();
		ImageIcon iconGold = new ImageIcon("Gold.png");
		goldLabel.setIcon(iconGold);
		goldLabel.setBounds(80,19 ,24 ,24 );
		goldLabel.setVisible(true);
		 
		

		build= new JButton("BUILD FARM");
		build.setBackground(Color.orange);
		build.setBounds(35, 60, 120, 20);
		build.setVisible(true);
		build.setBorder(new LineBorder(Color.black));
		build.setFont(button.getFont().deriveFont(10f));
		//build.setOpaque(false);
		build.setToolTipText("Farm costs 1000 ");
		panel1.add(build);
		
		build1= new JButton("BUILD MARKET");
		build1.setBackground(Color.orange);
		build1.setBounds(35, 90, 120, 20);
		build1.setVisible(true);
		build1.setBorder(new LineBorder(Color.black));
		build1.setFont(button.getFont().deriveFont(10f));
		//build.setOpaque(false);
		build1.setToolTipText("Market Costs 1500");
		panel1.setOpaque(false);
		panel1.add(build1);
		
		build2= new JButton("BUILD ARCHERY RANGE");
		build2.setBackground(Color.orange);
		build2.setBounds(35, 160, 120, 20);
		build2.setVisible(true);
		//build2.setOpaque(false);
		build2.setBorder(new LineBorder(Color.black));
		build2.setFont(button.getFont().deriveFont(8f));
		//build.setOpaque(false);
		build2.setToolTipText("ArcherRange costs 1500");
		panel1.add(build2);
		
		build3= new JButton("BUILD BARRACKS");
		build3.setBackground(Color.orange);
		build3.setBounds(35, 190, 120, 20);
		build3.setVisible(true);
		build3.setBorder(new LineBorder(Color.black));
		build3.setFont(button.getFont().deriveFont(10f));
		//build.setOpaque(false);
		build3.setToolTipText("Barracks costs 2000");
		panel1.add(build3);
		
		build4= new JButton("BUILD STABLE");
		build4.setBackground(Color.orange);
		build4.setBounds(35, 220, 120, 20);
		build4.setVisible(true);
		build4.setBorder(new LineBorder(Color.black));
		build4.setFont(button.getFont().deriveFont(10f));
		//build.setOpaque(false);
		build4.setToolTipText("Stable costs 2500");
		panel1.add(build4);
		
		endTurnButton= new JButton("END TURN");
		//endTurnButton.setBackground(Color.orange);
		endTurnButton.setBounds(1175, 0, 190, 40);
		endTurnButton.setVisible(true);
		endTurnButton.setBorder(new LineBorder(Color.black));
		endTurnButton.setFont(button.getFont().deriveFont(10f));
		//endTurnButton.setOpaque(false);
		endTurnButton.setToolTipText("This ends the turn");
		add(endTurnButton);
		
		
		resourcesPanel.add(goldLabel);
		resourcesPanel.add(foodLabel);
		
		
		
		
		
		
		
		
		add(namePanel);
		add(turnCountPanel);
		add(resourcesPanel);
		add(mapPanel);
		add(cityPanel);
		
		
		
		setVisible(false);
		
		
		
		
		ImageIcon hi1= new ImageIcon("gameView1.jpg");
		JLabel backGroundLabelMain = new JLabel("",hi1,JLabel.CENTER);
		backGroundLabelMain.setBounds(0,0,1366,768);
		add(backGroundLabelMain);
		
		
		
		
		
		
		revalidate();
		repaint();
		
	}








	public JButton getChoose1() {
		return choose1;
	}
	public void setChoose1(JButton choose1) {
		this.choose1 = choose1;
	}
	public JButton getTargetCity() {
		return targetCity;
	}
	public void setTargetCity(JButton targetCity) {
		this.targetCity = targetCity;
	}
	public JButton getPressArcher1() {
		return pressArcher1;
	}
	public void setPressArcher1(JButton pressArcher1) {
		this.pressArcher1 = pressArcher1;
	}
	public JButton getPressInfantry1() {
		return pressInfantry1;
	}
	public void setPressInfantry1(JButton pressInfantry1) {
		this.pressInfantry1 = pressInfantry1;
	}
	public JButton getPressCavalry1() {
		return pressCavalry1;
	}
	public void setPressCavalry1(JButton pressCavalry1) {
		this.pressCavalry1 = pressCavalry1;
	}
	public JMenu getRelocateMenu() {
		return relocateMenu;
	}
	public void setRelocateMenu(JMenu relocateMenu) {
		this.relocateMenu = relocateMenu;
	}
	public JMenuBar getMoveMenuBar() {
		return moveMenuBar;
	}
	public void setMoveMenuBar(JMenuBar moveMenuBar) {
		this.moveMenuBar = moveMenuBar;
	}
	public CityView getCityView() {
		return cityView;
	}
	public void setCityView(CityView cityView) {
		this.cityView = cityView;
	}
	public CityView getCityViewConquered2() {
		return cityViewConquered2;
	}
	public void setCityViewConquered2(CityView cityViewConquered2) {
		this.cityViewConquered2 = cityViewConquered2;
	}
	public JMenu getMoveUnitsMenu() {
		return moveUnitsMenu;
	}
	public void setMoveUnitsMenu(JMenu moveUnitsMenu) {
		this.moveUnitsMenu = moveUnitsMenu;
	}
	public JMenu getArmyMenu() {
		return armyMenu;
	}
	public void setArmyMenu(JMenu armyMenu) {
		this.armyMenu = armyMenu;
	}
	public JButton getBuild() {
		return build;
	}








	public void setBuild(JButton build) {
		this.build = build;
	}








	public JButton getBuild1() {
		return build1;
	}








	public void setBuild1(JButton build1) {
		this.build1 = build1;
	}








	public JButton getBuild2() {
		return build2;
	}








	public void setBuild2(JButton build2) {
		this.build2 = build2;
	}








	public JButton getBuild3() {
		return build3;
	}








	public void setBuild3(JButton build3) {
		this.build3 = build3;
	}








	public JButton getBuild4() {
		return build4;
	}








	public void setBuild4(JButton build4) {
		this.build4 = build4;
	}








	public JButton getPressArcher() {
		return pressArcher;
	}
	public void setPressArcher(JButton pressArcher) {
		this.pressArcher = pressArcher;
	}
	public JButton getPressInfantry() {
		return pressInfantry;
	}
	public void setPressInfantry(JButton pressInfantry) {
		this.pressInfantry = pressInfantry;
	}
	public JButton getPressCavalry() {
		return pressCavalry;
	}
	public void setPressCavalry(JButton pressCavalry) {
		this.pressCavalry = pressCavalry;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		
			if(e.getSource()==ArcherItem)
			{
				
				System.out.println("safra");
			}
			if(e.getSource()==this.saveItem)
			{
				System.out.println("khadra");
			}
			if(e.getSource()==this.exitItem)
			{
				System.exit(0);
			}
			if(e.getSource()==(ArcherItem1))
			{
				
				System.out.println("safra");
			}
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public JPanel getNamePanel() {
		return namePanel;
	}








	public void setNamePanel(JPanel namePanel) {
		this.namePanel = namePanel;
	}








	public JPanel getTurnCountPanel() {
		return turnCountPanel;
	}








	public void setTurnCountPanel(JPanel turnCountPanel) {
		this.turnCountPanel = turnCountPanel;
	}








	public JPanel getResourcesPanel() {
		return resourcesPanel;
	}








	public void setResourcesPanel(JPanel resourcesPanel) {
		this.resourcesPanel = resourcesPanel;
	}








	public JTextArea getText() {
		return text;
	}








	public void setText(JTextArea text) {
		this.text = text;
	}








	public JTextArea getTurnText() {
		return turnText;
	}








	public void setTurnText(JTextArea turnText) {
		this.turnText = turnText;
	}








	public JTextArea getResourcesText() {
		return resourcesText;
	}








	public void setResourcesText(JTextArea resourcesText) {
		this.resourcesText = resourcesText;
	}








	public JPanel getMapPanel() {
		return mapPanel;
	}








	public void setMapPanel(JPanel mapPanel) {
		this.mapPanel = mapPanel;
	}






















	public JPanel getCityPanel2() {
		return cityPanel2;
	}








	public void setCityPanel2(JPanel cityPanel2) {
		this.cityPanel2 = cityPanel2;
	}








	public JPanel getCityPanel() {
		return cityPanel;
	}








	public void setCityPanel(JPanel cityPanel) {
		this.cityPanel = cityPanel;
	}








	public JLabel getLabel() {
		return label;
	}








	public void setLabel(JLabel label) {
		this.label = label;
	}








	public JMenuItem getArcherItem() {
		return ArcherItem;
	}








	public void setArcherItem(JMenuItem archerItem) {
		ArcherItem = archerItem;
	}








	public JMenuItem getSaveItem() {
		return saveItem;
	}








	public void setSaveItem(JMenuItem saveItem) {
		this.saveItem = saveItem;
	}








	public JMenuItem getExitItem() {
		return exitItem;
	}








	public void setExitItem(JMenuItem exitItem) {
		this.exitItem = exitItem;
	}








	public ImageIcon getLoadIcon() {
		return loadIcon;
	}








	public void setLoadIcon(ImageIcon loadIcon) {
		this.loadIcon = loadIcon;
	}








	public JMenuItem getArcherItem1() {
		return ArcherItem1;
	}








	public void setArcherItem1(JMenuItem archerItem1) {
		ArcherItem1 = archerItem1;
	}








	public JTextArea getText1() {
		return text1;
	}








	public void setText1(JTextArea text1) {
		this.text1 = text1;
	}








	public JTextArea getText2() {
		return text2;
	}








	public void setText2(JTextArea text2) {
		this.text2 = text2;
	}








	public JTextArea getText3() {
		return text3;
	}








	public void setText3(JTextArea text3) {
		this.text3 = text3;
	}








	public JMenuBar getArmyListMenuBar() {
		return armyListMenuBar;
	}
	public void setArmyListMenuBar(JMenuBar armyListMenuBar) {
		this.armyListMenuBar = armyListMenuBar;
	}
	public JButton getMoveButton() {
		return moveButton;
	}
	public void setMoveButton(JButton moveButton) {
		this.moveButton = moveButton;
	}
	
	
	public JMenuBar getInitiateButton() {
		return initiateButton;
	}
	public JTextArea getText4() {
		return text4;
	}








	public void setText4(JTextArea text4) {
		this.text4 = text4;
	}








	public JTextArea getText5() {
		return text5;
	}








	public void setText5(JTextArea text5) {
		this.text5 = text5;
	}








	public JTextArea getText6() {
		return text6;
	}








	public void setText6(JTextArea text6) {
		this.text6 = text6;
	}








	public JTextArea getText7() {
		return text7;
	}








	public void setText7(JTextArea text7) {
		this.text7 = text7;
	}








	public JTextArea getText8() {
		return text8;
	}








	public void setText8(JTextArea text8) {
		this.text8 = text8;
	}








	public JTextArea getText9() {
		return text9;
	}








	public void setText9(JTextArea text9) {
		this.text9 = text9;
	}








	public JTextArea getText10() {
		return text10;
	}








	public void setText10(JTextArea text10) {
		this.text10 = text10;
	}








	public JTextArea getText11() {
		return text11;
	}








	public void setText11(JTextArea text11) {
		this.text11 = text11;
	}








	public JTextArea getText12() {
		return text12;
	}








	public void setText12(JTextArea text12) {
		this.text12 = text12;
	}








	public JTextArea getText13() {
		return text13;
	}








	public void setText13(JTextArea text13) {
		this.text13 = text13;
	}








	public JButton getButton() {
		return button;
	}








	public void setButton(JButton button) {
		this.button = button;
	}








	public JButton getButton1() {
		return button1;
	}








	public void setButton1(JButton button1) {
		this.button1 = button1;
	}








	public JButton getButton2() {
		return button2;
	}








	public void setButton2(JButton button2) {
		this.button2 = button2;
	}








	public JButton getButton3() {
		return button3;
	}








	public void setButton3(JButton button3) {
		this.button3 = button3;
	}








	public JButton getButton4() {
		return button4;
	}








	public void setButton4(JButton button4) {
		this.button4 = button4;
	}








	public JButton getButton5() {
		return button5;
	}








	public void setButton5(JButton button5) {
		this.button5 = button5;
	}








	public JButton getButton6() {
		return button6;
	}








	public void setButton6(JButton button6) {
		this.button6 = button6;
	}








	public JButton getButton7() {
		return button7;
	}








	public void setButton7(JButton button7) {
		this.button7 = button7;
	}








	public JButton getButton8() {
		return button8;
	}








	public void setButton8(JButton button8) {
		this.button8 = button8;
	}



    




	public JMenuBar getControlledMarching() {
		return controlledMarching;
	}
	public void setControlledMarching(JMenuBar controlledMarching) {
		this.controlledMarching = controlledMarching;
	}
	public JMenuBar getControlledBesieging() {
		return controlledBesieging;
	}
	public void setControlledBesieging(JMenuBar controlledBesieging) {
		this.controlledBesieging = controlledBesieging;
	}
	public JMenuBar getControlledidle() {
		return controlledidle;
	}
	public void setControlledidle(JMenuBar controlledidle) {
		this.controlledidle = controlledidle;
	}
	public JMenu getMarchingMenu() {
		return marchingMenu;
	}
	public void setMarchingMenu(JMenu marchingMenu) {
		this.marchingMenu = marchingMenu;
	}
	public JMenu getBesiegingMenu() {
		return besiegingMenu;
	}
	public void setBesiegingMenu(JMenu besiegingMenu) {
		this.besiegingMenu = besiegingMenu;
	}
	public JMenu getIdleMenu() {
		return idleMenu;
	}
	public void setIdleMenu(JMenu idleMenu) {
		this.idleMenu = idleMenu;
	}
	public JButton getEndTurnButton() {
		return endTurnButton;
	}
	public void setEndTurnButton(JButton endTurnButton) {
		this.endTurnButton = endTurnButton;
	}
	public JMenu getUnitMenu() {
		return unitMenu;
	}
	public void setUnitMenu(JMenu unitMenu) {
		this.unitMenu = unitMenu;
	}
	public void setArmyMenuBar(JMenuBar armyMenuBar) {
		this.armyMenuBar = armyMenuBar;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public JMenu getInitiateArmy() {
		return initiateArmy;
	}
	public void setInitiateArmy(JMenu initiateArmy) {
		this.initiateArmy = initiateArmy;
	}
	public void setInitiateButton(JMenuBar initiateButton) {
		this.initiateButton = initiateButton;
	}
	
	
	
}