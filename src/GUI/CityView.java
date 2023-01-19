package GUI;

import java.awt.Color;
import java.awt.Dimension;

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

import engine.Game;

public class CityView extends JPanel {
	
	private JMenuBar moveMenuBarCity1;
	private JMenu moveUnitsMenuCity1;
	private JPanel cityPanelCity1;
	private JButton pressArcherCity1;
	private JButton pressCavalryCity1;
	private JButton pressInfantryCity1;
	private JTextArea textCity1;
	private JTextArea text3City1;
	private JTextArea text4City1;
	private JTextArea text5City1;
	private JTextArea text6City1;
	private JTextArea text7City1;
	private JTextArea text8City1;
	private JTextArea text9City1;
	private JTextArea text10City1;
	private JTextArea text11City1;
	private JTextArea text12City1;
	private JTextArea text13City1;
	private JButton buttonCity1;
	private JButton button1City1;
	private JButton button2City1;
	private JButton button4City1;
	private JButton button3City1;
	private JButton button5City1;
	private JButton button6City1;
	private JButton button7City1;
	private JButton button8City1;
	private JMenuBar armyMenuBarCity1;
	private JMenu UnitMenuCity1;
	private JMenuBar armyMenuBar1City1;
	private JMenu UnitMenu1City1;
	private JMenuBar armyListMenuBarCity1;
	private JButton buildCity1;
	private JButton build1City1;
	private JButton buil2City1;
	private JButton build3City1;
	private JButton build4City1;
	private JButton targetCity;
	private JMenu armyMenuCity1;
	private JMenuBar initiateButtonCity1;
	private JMenu initiateArmyCity1;
	
	private JMenuBar moveMenuBar;
	private JMenu moveUnitsMenu;
	//private JButton pressArcher;
	//private JButton pressInfantry;
//	private JButton pressCavalry;
	private JButton pressArcher1;
	private JButton pressInfantry1;
	private JButton pressCavalry1;
	private JMenu relocateMenu;
	
	
	
	
	
	

	public CityView()
	
	{
		this.setLayout(null);
		
		
		cityPanelCity1 = new JPanel();
		cityPanelCity1.setSize(new Dimension(350,250));
		//cityPanel1.setBackground(Color.yellow);
		cityPanelCity1.setBorder(new LineBorder(Color.black));
		cityPanelCity1.setBounds(508, 250, 350, 250);
		cityPanelCity1.setLayout(null);
		cityPanelCity1.setSize(350,250);
		JLabel cityLabelCity1 = new JLabel();
		ImageIcon hi1= new ImageIcon("afsfsa.jpg");
		cityLabelCity1.setIcon(hi1);
		cityLabelCity1.setBounds(0, 0, 350, 250);
		//cityPanel1.add(cityLabel);		
		
		//setMaximumSize(new Dimension(350,250));
		cityPanelCity1.setPreferredSize(new Dimension(350,250));
		
		cityPanelCity1.setVisible(true);
		//cityPanel1.setAlignmentX(cityPanel.CENTER_ALIGNMENT);
		//cityPanel1.setAlignmentY(cityPanel.CENTER_ALIGNMENT);
		//setResizable(false);
		
	
	//	moveButton = new JButton("Move");
		//moveButton.setBackground(Color.gray);
		
		//moveButton.setVisible(true);
		//moveButton.setBorder(new LineBorder(Color.black));
		//moveButton.setFont(moveButton.getFont().deriveFont(10f));
		//moveButton.setOpaque(false);
		//moveButton.setToolTipText("Move unit from Defending Army to currently selected Idle Army");
		//cityPanel.add(moveButton);
		moveMenuBarCity1 = new JMenuBar();
		moveMenuBarCity1.setBorder(new LineBorder(Color.orange));
		moveUnitsMenuCity1 = new JMenu("Initiate");
		moveUnitsMenuCity1.setBackground(Color.gray);
		moveMenuBarCity1.setBounds(80, 2, 50, 20);
		moveMenuBarCity1.setVisible(true);
		moveMenuBarCity1.add(moveUnitsMenuCity1);
		//add(moveMenuBarCity1);
		cityPanelCity1.setOpaque(false);
		
		
		pressArcherCity1= new JButton("Archer");
		pressArcherCity1.setVisible(true);
		pressArcherCity1.setBorder(new LineBorder(Color.black));
		pressArcherCity1.setFont(pressArcherCity1.getFont().deriveFont(10f));
		pressArcherCity1.setOpaque(false);
		
		pressCavalryCity1= new JButton("Cavalry");
		pressCavalryCity1.setVisible(true);
		pressCavalryCity1.setBorder(new LineBorder(Color.black));
		pressCavalryCity1.setFont(pressCavalryCity1.getFont().deriveFont(10f));
		pressCavalryCity1.setOpaque(false);
		
		pressInfantryCity1= new JButton("Infantry");
		pressInfantryCity1.setVisible(true);
		pressInfantryCity1.setBorder(new LineBorder(Color.black));
		pressInfantryCity1.setFont(pressInfantryCity1.getFont().deriveFont(10f));
		pressInfantryCity1.setOpaque(false);
		
		
		
		
		
		
		
		JPanel panelCity1 = new JPanel();
		
		panelCity1.setPreferredSize(new Dimension(220,240));
		panelCity1.setBounds(1, 1, 240, 240);
		panelCity1.setLayout(null);
		//panel1.setBackground(Color.yellow);
		
		
		
	    textCity1 = new JTextArea("eliane");
		textCity1.setBounds(1,1,80,20);
		//text1.setBackground(Color.green);
		//text1.setBorder(new LineBorder(Color.black));
		textCity1.setOpaque(false);
		
		textCity1.setEditable(false);
		//text1.setVisible(false);
		panelCity1.add(textCity1);
		
		
		JTextArea text2City1 = new JTextArea("Economy Buildings :");
		//text2.setPreferredSize(new Dimension(120,20));
		//text2.setBackground(Color.orange);
		text2City1.setEditable(false);
		text2City1.setAlignmentX((float) 0.5);
		text2City1.setAlignmentY((float) 0.5);
		text2City1.setVisible(true);
		//text2.setBorder(new LineBorder(Color.black));
		text2City1.setBounds(1, 30, 120, 20);
		text2City1.setOpaque(false);
		panelCity1.add(text2City1);
		
		
		
	     text3City1 = new JTextArea("Farm");
		//text3.setBackground(Color.pink);
		text3City1.setEditable(false);
		text3City1.setVisible(false);
		text3City1.setBounds(1, 60, 60, 20);
		//text3.setBorder(new LineBorder(Color.black));
		text3City1.setOpaque(false);
		panelCity1.add(text3City1);
		
		 text4City1 = new JTextArea("Market");
		//text4.setBackground(Color.green);
		 text4City1.setEditable(false);
		 text4City1.setVisible(false);
		 text4City1.setBounds(1, 90, 60, 20);
		//text4.setBorder(new LineBorder(Color.black));
		 text4City1.setOpaque(false);
		panelCity1.add(text4City1);
		
		 text5City1 = new JTextArea("Military Buildings :");
		//text5.setBackground(Color.orange);
		 text5City1.setEditable(false);
		 text5City1.setVisible(true);
		 text5City1.setBounds(1, 130, 120, 20);
		//text5.setBorder(new LineBorder(Color.black));
		 text5City1.setOpaque(false);
		panelCity1.add(text5City1);
		
		 text6City1 = new JTextArea("Archery Range");
		//text6.setBackground(Color.magenta);
		 text6City1.setEditable(false);
		 text6City1.setVisible(false);
		 text6City1.setFont(text6City1.getFont().deriveFont(8f)); // will only change size to 12pt
		 text6City1.setBounds(1, 160, 60, 20);
		//text6.setBorder(new LineBorder(Color.black));
		 text6City1.setOpaque(false);
		panelCity1.add(text6City1);
		
		 text7City1 = new JTextArea(" Barracks");
		//text7.setBackground(Color.cyan);
		 text7City1.setEditable(false);
		 text7City1.setVisible(false);
		//text6.setFont(text6.getFont().deriveFont(8f)); // will only change size to 12pt
		 text7City1.setBounds(1, 190, 60, 20);
		//text7.setBorder(new LineBorder(Color.black));
		 text7City1.setOpaque(false);
		panelCity1.add(text7City1);
		
		 text8City1 = new JTextArea("  Stable");
		//text8.setBackground(Color.red);
		 text8City1.setEditable(false);
		 text8City1.setVisible(false);
		//text6.setFont(text6.getFont().deriveFont(8f)); // will only change size to 12pt
		 text8City1.setBounds(1, 220, 60, 20);
		//text8.setBorder(new LineBorder(Color.black));
		 text8City1.setOpaque(false);
		panelCity1.add(text8City1);
		
		 text9City1 = new JTextArea("Level 1");
		//text9.setBackground(Color.orange);
		 text9City1.setEditable(false);
		 text9City1.setVisible(false);
		 text9City1.setFont(text9City1.getFont().deriveFont(8f)); // will only change size to 12pt
		 text9City1.setBounds(65, 60, 40, 20);
		//text9.setBorder(new LineBorder(Color.black));
		 text9City1.setOpaque(false);
		panelCity1.add(text9City1);
		
		 text10City1 = new JTextArea("Level 1");
		//text10.setBackground(Color.orange);
		 text10City1.setEditable(false);
		 text10City1.setVisible(false);
		 text10City1.setFont(text10City1.getFont().deriveFont(8f)); // will only change size to 12pt
		 text10City1.setBounds(65, 90, 40, 20);
		//text10.setBorder(new LineBorder(Color.black));
		 text10City1.setOpaque(false);
		panelCity1.add(text10City1);
		
		 text11City1 = new JTextArea("Level 1");
		//text11.setBackground(Color.orange);
		text11City1.setEditable(false);
		text11City1.setVisible(false);
		text11City1.setFont(text11City1.getFont().deriveFont(8f)); // will only change size to 12pt
		text11City1.setBounds(65, 160, 40, 20);
		text11City1.setOpaque(false);
		//text11.setBorder(new LineBorder(Color.black));
		panelCity1.add(text11City1);
		
	    text12City1 = new JTextArea("Level 1");
		//text12.setBackground(Color.orange);
		text12City1.setEditable(false);
		text12City1.setVisible(false);
		text12City1.setFont(text11City1.getFont().deriveFont(8f)); // will only change size to 12pt
		text12City1.setBounds(65, 190, 40, 20);
		text12City1.setOpaque(false);
		//text12.setBorder(new LineBorder(Color.black));
		panelCity1.add(text12City1);
		
	    text13City1 = new JTextArea("Level 1");
		//text13.setBackground(Color.orange);
		text13City1.setEditable(false);
		text13City1.setVisible(false);
		text13City1.setFont(text11City1.getFont().deriveFont(8f)); // will only change size to 12pt
		text13City1.setBounds(65, 220, 40, 20);
		text13City1.setOpaque(false);
		//text13.setBorder(new LineBorder(Color.black));
		panelCity1.add(text13City1);
		
		
	    buttonCity1 = new JButton("Upgrade");
	    //button.setBackground(Color.gray);
		buttonCity1.setBounds(110, 60, 60, 20);
		buttonCity1.setVisible(false);
		buttonCity1.setBorder(new LineBorder(Color.black));
		buttonCity1.setOpaque(false);
		buttonCity1.setFont(buttonCity1.getFont().deriveFont(6f));
		buttonCity1.setToolTipText("Upgrade Cost 500");
		panelCity1.add(buttonCity1);
		
		 button1City1 = new JButton("Upgrade");
		//button1.setBackground(Color.orange);
		button1City1.setBounds(110, 90, 60, 20);
		button1City1.setVisible(false);
		button1City1.setBorder(new LineBorder(Color.black));
		button1City1.setFont(buttonCity1.getFont().deriveFont(6f));
		button1City1.setOpaque(false);
		button1City1.setToolTipText("Upgrade Cost 700");
		panelCity1.add(button1City1);
		
		initiateButtonCity1 = new JMenuBar();
		initiateButtonCity1.setBackground(Color.gray);
		initiateButtonCity1.setBounds(170, 2, 80, 20);
		initiateButtonCity1.setVisible(true);
		initiateButtonCity1.setBorder(new LineBorder(Color.black));
		initiateButtonCity1.setFont(initiateButtonCity1.getFont().deriveFont(10f));
		//moveButton.setOpaque(false);
		initiateButtonCity1.setToolTipText("Initiate new Idle Army");
	
		
		initiateArmyCity1=new JMenu("Initiate Army");
		initiateArmyCity1.setVisible(true);
	
		
		
		JMenuItem archer1=new JMenuItem();
		JMenuItem cavalry1=new JMenuItem();
		JMenuItem infantry1=new JMenuItem();
		
		
		
		
		
		initiateArmyCity1.add(archer1);
		archer1.add(pressArcherCity1);
		
		initiateArmyCity1.add(cavalry1);
		cavalry1.add(pressCavalryCity1);
		
		initiateArmyCity1.add(infantry1);
		infantry1.add(pressInfantryCity1);
		
		initiateButtonCity1.add(initiateArmyCity1);
		add(initiateButtonCity1);
		
		button2City1 = new JButton("Upgrade");
		//button2.setBackground(Color.orange);
		button2City1.setBounds(110, 160, 60, 20);
		button2City1.setVisible(false);
		button2City1.setBorder(new LineBorder(Color.black));
		button2City1.setFont(buttonCity1.getFont().deriveFont(6f));
		buttonCity1.setOpaque(false);
		
		button2City1.setToolTipText("Upgrade Cost 800");
		panelCity1.add(button2City1);
		
		 button3City1 = new JButton("Upgrade");
		//button3.setBackground(Color.orange);
		button3City1.setOpaque(false);
		button3City1.setBorder(new LineBorder(Color.black));
		button3City1.setBounds(110, 160, 60, 20);
		button3City1.setFont(buttonCity1.getFont().deriveFont(6f));
		button3City1.setToolTipText("Upgrade Cost 1000");
		//panel1.add(button3);
		
		
		button4City1 = new JButton("Upgrade");
		//button4.setBackground(Color.orange);
		button4City1.setVisible(false);
		button4City1.setOpaque(false);
		button4City1.setBounds(110, 190, 60, 20);
		button4City1.setBorder(new LineBorder(Color.black));
		button4City1.setFont(buttonCity1.getFont().deriveFont(6f));
		button4City1.setToolTipText("Upgrade Cost 1000");
		panelCity1.add(button4City1);
		
		button5City1 = new JButton("Upgrade");
		//button5.setBackground(Color.orange);
		button5City1.setVisible(false);
		button5City1.setOpaque(false);
		button5City1.setBounds(110, 220, 60, 20);
		button5City1.setBorder(new LineBorder(Color.black));
		button5City1.setFont(buttonCity1.getFont().deriveFont(6f));
		button5City1.setToolTipText("Upgrade Cost 1500");
		panelCity1.add(button5City1);
		
		button6City1 = new JButton("Recruit");
		///button6.setBackground(Color.orange);
		button6City1.setVisible(false);
		button6City1.setOpaque(false);
		button6City1.setBounds(180, 160, 60, 20);
		button6City1.setBorder(new LineBorder(Color.black));
		button6City1.setFont(buttonCity1.getFont().deriveFont(6f));
		button6City1.setToolTipText("Recruitment Cost 400 ");
		panelCity1.add(button6City1);
		
		button7City1 = new JButton("Recruit");
		//button7.setBackground(Color.orange);
		button7City1.setBounds(180, 190, 60, 20);
		button7City1.setOpaque(false);
		button7City1.setVisible(false);
		button7City1.setBorder(new LineBorder(Color.black));
		button7City1.setFont(buttonCity1.getFont().deriveFont(6f));
		button7City1.setToolTipText("Recruitment Cost 500");
		panelCity1.add(button7City1);
		
		button8City1 = new JButton("Recruit");
		//button8.setBackground(Color.orange);
		button8City1.setOpaque(false);
		button8City1.setVisible(false);
		button8City1.setBounds(180, 220, 60, 20);
		button8City1.setBorder(new LineBorder(Color.black));
		button8City1.setFont(buttonCity1.getFont().deriveFont(6f));
		button8City1.setToolTipText("Recruitment Cost 600");
		panelCity1.add(button8City1);
		
		
		JLabel label2 = new JLabel();
		label2.setBounds(289, 0, 24, 24);
		//label2.setVisible(false);
		ImageIcon icon = new ImageIcon("City.png");
		label2.setIcon(icon);
		cityPanelCity1.add(label2);
		
		JLabel label3 = new JLabel();
		label3.setBounds(240-24, 30, 24, 24);
		label3.setVisible(false);
		ImageIcon icon2 = new ImageIcon("City.png");
		label3.setIcon(icon2);
		cityPanelCity1.add(label3);
		
		JLabel label4 = new JLabel();
		label4.setVisible(false);
		label4.setBounds(240-24, 60, 24, 24);
		ImageIcon icon3 = new ImageIcon("City.png");
		label4.setIcon(icon3);
		cityPanelCity1.add(label4);
		
		JLabel label5 = new JLabel();
		label5.setVisible(false);
		label5.setBounds(240-24, 90, 24, 24);
		ImageIcon icon4 = new ImageIcon("City.png");
		label5.setIcon(icon4);
		
		ImageIcon armyIcon = new ImageIcon("army.png");
		JLabel label8 = new JLabel();
		label8.setText("Defending Army");
		label8.setFont(label8.getFont().deriveFont(8f));
		label8.setIcon(armyIcon);
		
		JPanel defendingArmyPanelCity1 = new JPanel();
		defendingArmyPanelCity1.setBounds(250,40,100,100);
		//defendingArmyPanel.setBackground(Color.yellow);
		defendingArmyPanelCity1.add(label8);
		defendingArmyPanelCity1.setVisible(true);
		defendingArmyPanelCity1.setOpaque(false);
		defendingArmyPanelCity1.add(label8);
		defendingArmyPanelCity1.setBorder(new LineBorder(Color.black));
		
		armyMenuBarCity1 = new JMenuBar();
		armyMenuBarCity1.setBorder(new LineBorder(Color.orange));
		UnitMenuCity1 = new JMenu("Units");
		UnitMenuCity1.setVisible(true);
		
		armyMenuBarCity1.add(UnitMenuCity1);
		
		defendingArmyPanelCity1.add(armyMenuBarCity1);
		//armyMenu.setBounds(400, 450, 60, 60);
		cityPanelCity1.add(defendingArmyPanelCity1);
		
		ImageIcon armyIcon1 = new ImageIcon("army.png");
		JLabel label81 = new JLabel();
		label81.setText("Army Name");
		label81.setIcon(armyIcon1);
		label81.setFont(label81.getFont().deriveFont(8f));
		
		JPanel stationaryArmyPanelCity1 = new JPanel();
		stationaryArmyPanelCity1.setBounds(250,150,100,100);
		//defendingArmyPanel.setBackground(Color.yellow);
		stationaryArmyPanelCity1.setBorder(new LineBorder(Color.black));
		stationaryArmyPanelCity1.add(label81);
		stationaryArmyPanelCity1.setVisible(true);
		stationaryArmyPanelCity1.setOpaque(false);
		
		
		
		armyMenuBar1City1 = new JMenuBar();
		armyMenuBar1City1.setBorder(new LineBorder(Color.orange));
		UnitMenu1City1 = new JMenu("Units");
		UnitMenu1City1.setVisible(true);
		armyMenuBar1City1.add(UnitMenu1City1);
		
		
		armyListMenuBarCity1 = new JMenuBar();
		armyListMenuBarCity1.setBorder(new LineBorder(Color.orange));
		armyMenuCity1 = new JMenu("Armies");
		armyMenuCity1.setVisible(true);
		armyListMenuBarCity1.add(armyMenuCity1);
		
		
		
		JMenuItem ArcherItemNumber1 = new JMenuItem("200 Archer");
		JMenuItem CavlaryItemNumber1 = new JMenuItem("30 Cavalary");
		JMenuItem InfantryItemNumber1 = new JMenuItem("15 7omar");
		
		
		
		//unitMenu1.add(ArcherItemNumber1);
		//unitMenu1.add(CavlaryItemNumber1);
		//unitMenu1.add(InfantryItemNumber1); 
		
		
		//armyMenuBar.add(armyPanel);
		defendingArmyPanelCity1.add(armyMenuBarCity1);
		stationaryArmyPanelCity1.add(armyListMenuBarCity1);
		stationaryArmyPanelCity1.add(armyMenuBar1City1);
		//armyMenu.setBounds(400, 450, 60, 60);
		
		cityPanelCity1.add(stationaryArmyPanelCity1);
		
		buildCity1= new JButton("BUILD FARM");
		buildCity1.setBackground(Color.orange);
		buildCity1.setBounds(35, 60, 120, 20);
		buildCity1.setVisible(true);
		buildCity1.setBorder(new LineBorder(Color.black));
		buildCity1.setFont(button1City1.getFont().deriveFont(10f));
		//build.setOpaque(false);
		buildCity1.setToolTipText("3at 200 gneeh");
		panelCity1.add(buildCity1);
		
		build1City1= new JButton("BUILD MARKET");
		build1City1.setBackground(Color.orange);
		build1City1.setBounds(35, 90, 120, 20);
		build1City1.setVisible(true);
		build1City1.setBorder(new LineBorder(Color.black));
		build1City1.setFont(button1City1.getFont().deriveFont(10f));
		//build.setOpaque(false);
		build1City1.setToolTipText("nekteb");
		
		panelCity1.add(build1City1);
		
		buil2City1= new JButton("BUILD ARCHERY RANGE");
		buil2City1.setBackground(Color.orange);
		buil2City1.setBounds(35, 160, 120, 20);
		buil2City1.setVisible(true);
		buil2City1.setBorder(new LineBorder(Color.black));
		buil2City1.setFont(button1City1.getFont().deriveFont(8f));
		//build.setOpaque(false);
		buil2City1.setToolTipText("nekteb");
		panelCity1.add(buil2City1);
		
		
		targetCity = new JButton("Target a city");
		targetCity.setBounds(260, 2, 80, 20);
		targetCity.setFont(targetCity.getFont().deriveFont(6f));
		targetCity.setVisible(true);
		add(targetCity);
		
		build3City1= new JButton("BUILD BARRACKS");
		build3City1.setBackground(Color.orange);
		build3City1.setBounds(35, 190, 120, 20);
		build3City1.setVisible(true);
		build3City1.setBorder(new LineBorder(Color.black));
		build3City1.setFont(button1City1.getFont().deriveFont(10f));
		//build.setOpaque(false);
		build3City1.setToolTipText("3at 200 gneeh");
		panelCity1.add(build3City1);
		
		build4City1= new JButton("BUILD STABLE");
		build4City1.setBackground(Color.orange);
		build4City1.setBounds(35, 220, 120, 20);
		build4City1.setVisible(true);
		build4City1.setBorder(new LineBorder(Color.black));
		build4City1.setFont(button1City1.getFont().deriveFont(10f));
		//build.setOpaque(false);
		build4City1.setToolTipText("3at 200 gneeh");
		panelCity1.add(build4City1);
		
		
		

		
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
		panelCity1.add(moveMenuBar);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		cityPanelCity1.add(label5);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		add(cityPanelCity1);
		add(panelCity1);
		add(defendingArmyPanelCity1);
		add(stationaryArmyPanelCity1);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		revalidate();
		repaint();
		
	}







	public JButton getTargetCity() {
		return targetCity;
	}







	public void setTargetCity(JButton targetCity) {
		this.targetCity = targetCity;
	}







	public JMenuBar getMoveMenuBar() {
		return moveMenuBar;
	}







	public void setMoveMenuBar(JMenuBar moveMenuBar) {
		this.moveMenuBar = moveMenuBar;
	}







	public JMenu getMoveUnitsMenu() {
		return moveUnitsMenu;
	}







	public void setMoveUnitsMenu(JMenu moveUnitsMenu) {
		this.moveUnitsMenu = moveUnitsMenu;
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







	public JMenuBar getMoveMenuBarCity1() {
		return moveMenuBarCity1;
	}







	public void setMoveMenuBarCity1(JMenuBar moveMenuBarCity1) {
		this.moveMenuBarCity1 = moveMenuBarCity1;
	}







	public JMenu getMoveUnitsMenuCity1() {
		return moveUnitsMenuCity1;
	}







	public void setMoveUnitsMenuCity1(JMenu moveUnitsMenuCity1) {
		this.moveUnitsMenuCity1 = moveUnitsMenuCity1;
	}







	public JPanel getCityPanelCity1() {
		return cityPanelCity1;
	}







	public void setCityPanelCity1(JPanel cityPanelCity1) {
		this.cityPanelCity1 = cityPanelCity1;
	}







	public JButton getPressArcherCity1() {
		return pressArcherCity1;
	}







	public void setPressArcherCity1(JButton pressArcherCity1) {
		this.pressArcherCity1 = pressArcherCity1;
	}







	public JButton getPressCavalryCity1() {
		return pressCavalryCity1;
	}







	public void setPressCavalryCity1(JButton pressCavalryCity1) {
		this.pressCavalryCity1 = pressCavalryCity1;
	}







	public JButton getPressInfantryCity1() {
		return pressInfantryCity1;
	}







	public void setPressInfantryCity1(JButton pressInfantryCity1) {
		this.pressInfantryCity1 = pressInfantryCity1;
	}







	public JTextArea getTextCity1() {
		return textCity1;
	}







	public void setTextCity1(JTextArea textCity1) {
		this.textCity1 = textCity1;
	}







	public JTextArea getText3City1() {
		return text3City1;
	}







	public void setText3City1(JTextArea text3City1) {
		this.text3City1 = text3City1;
	}







	public JTextArea getText4City1() {
		return text4City1;
	}







	public void setText4City1(JTextArea text4City1) {
		this.text4City1 = text4City1;
	}







	public JTextArea getText5City1() {
		return text5City1;
	}







	public void setText5City1(JTextArea text5City1) {
		this.text5City1 = text5City1;
	}







	public JTextArea getText6City1() {
		return text6City1;
	}







	public void setText6City1(JTextArea text6City1) {
		this.text6City1 = text6City1;
	}







	public JTextArea getText7City1() {
		return text7City1;
	}







	public void setText7City1(JTextArea text7City1) {
		this.text7City1 = text7City1;
	}







	public JTextArea getText8City1() {
		return text8City1;
	}







	public void setText8City1(JTextArea text8City1) {
		this.text8City1 = text8City1;
	}







	public JTextArea getText9City1() {
		return text9City1;
	}







	public void setText9City1(JTextArea text9City1) {
		this.text9City1 = text9City1;
	}







	public JTextArea getText10City1() {
		return text10City1;
	}







	public void setText10City1(JTextArea text10City1) {
		this.text10City1 = text10City1;
	}







	public JTextArea getText11City1() {
		return text11City1;
	}







	public void setText11City1(JTextArea text11City1) {
		this.text11City1 = text11City1;
	}







	public JTextArea getText12City1() {
		return text12City1;
	}







	public void setText12City1(JTextArea text12City1) {
		this.text12City1 = text12City1;
	}







	public JTextArea getText13City1() {
		return text13City1;
	}







	public void setText13City1(JTextArea text13City1) {
		this.text13City1 = text13City1;
	}







	public JButton getButtonCity1() {
		return buttonCity1;
	}







	public void setButtonCity1(JButton buttonCity1) {
		this.buttonCity1 = buttonCity1;
	}







	public JButton getButton1City1() {
		return button1City1;
	}







	public void setButton1City1(JButton button1City1) {
		this.button1City1 = button1City1;
	}







	public JButton getButton2City1() {
		return button2City1;
	}







	public void setButton2City1(JButton button2City1) {
		this.button2City1 = button2City1;
	}







	public JButton getButton4City1() {
		return button4City1;
	}







	public void setButton4City1(JButton button4City1) {
		this.button4City1 = button4City1;
	}







	public JButton getButton3City1() {
		return button3City1;
	}







	public void setButton3City1(JButton button3City1) {
		this.button3City1 = button3City1;
	}







	public JButton getButton5City1() {
		return button5City1;
	}







	public void setButton5City1(JButton button5City1) {
		this.button5City1 = button5City1;
	}







	public JButton getButton6City1() {
		return button6City1;
	}







	public void setButton6City1(JButton button6City1) {
		this.button6City1 = button6City1;
	}







	public JButton getButton7City1() {
		return button7City1;
	}







	public void setButton7City1(JButton button7City1) {
		this.button7City1 = button7City1;
	}







	public JButton getButton8City1() {
		return button8City1;
	}







	public void setButton8City1(JButton button8City1) {
		this.button8City1 = button8City1;
	}







	public JMenuBar getArmyMenuBarCity1() {
		return armyMenuBarCity1;
	}







	public void setArmyMenuBarCity1(JMenuBar armyMenuBarCity1) {
		this.armyMenuBarCity1 = armyMenuBarCity1;
	}







	public JMenu getUnitMenuCity1() {
		return UnitMenuCity1;
	}







	public void setUnitMenuCity1(JMenu unitMenuCity1) {
		UnitMenuCity1 = unitMenuCity1;
	}







	public JMenuBar getArmyMenuBar1City1() {
		return armyMenuBar1City1;
	}







	public void setArmyMenuBar1City1(JMenuBar armyMenuBar1City1) {
		this.armyMenuBar1City1 = armyMenuBar1City1;
	}







	public JMenu getUnitMenu1City1() {
		return UnitMenu1City1;
	}







	public void setUnitMenu1City1(JMenu unitMenu1City1) {
		UnitMenu1City1 = unitMenu1City1;
	}







	public JMenuBar getArmyListMenuBarCity1() {
		return armyListMenuBarCity1;
	}







	public void setArmyListMenuBarCity1(JMenuBar armyListMenuBarCity1) {
		this.armyListMenuBarCity1 = armyListMenuBarCity1;
	}







	public JButton getBuildCity1() {
		return buildCity1;
	}







	public void setBuildCity1(JButton buildCity1) {
		this.buildCity1 = buildCity1;
	}







	public JButton getBuild1City1() {
		return build1City1;
	}







	public void setBuild1City1(JButton build1City1) {
		this.build1City1 = build1City1;
	}







	public JButton getBuil2City1() {
		return buil2City1;
	}







	public void setBuil2City1(JButton buil2City1) {
		this.buil2City1 = buil2City1;
	}







	public JButton getBuild3City1() {
		return build3City1;
	}







	public void setBuild3City1(JButton build3City1) {
		this.build3City1 = build3City1;
	}







	public JButton getBuild4City1() {
		return build4City1;
	}







	public void setBuild4City1(JButton build4City1) {
		this.build4City1 = build4City1;
	}







	public JMenu getArmyMenuCity1() {
		return armyMenuCity1;
	}







	public void setArmyMenuCity1(JMenu armyMenuCity1) {
		this.armyMenuCity1 = armyMenuCity1;
	}







	public JMenuBar getInitiateButtonCity1() {
		return initiateButtonCity1;
	}







	public void setInitiateButtonCity1(JMenuBar initiateButtonCity1) {
		this.initiateButtonCity1 = initiateButtonCity1;
	}







	public JMenu getInitiateArmyCity1() {
		return initiateArmyCity1;
	}







	public void setInitiateArmyCity1(JMenu initiateArmyCity1) {
		this.initiateArmyCity1 = initiateArmyCity1;
	}


	
}
