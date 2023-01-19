package GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import buildings.ArcheryRange;
import buildings.Barracks;
import buildings.Farm;
import buildings.Market;
import buildings.Stable;
import engine.City;
import engine.Game;
import exceptions.BuildingInCoolDownException;
import exceptions.FriendlyCityException;
import exceptions.FriendlyFireException;
import exceptions.MaxCapacityException;
import exceptions.MaxLevelException;
import exceptions.MaxRecruitedException;
import exceptions.NotEnoughGoldException;
import exceptions.TargetNotReachedException;
import units.Archer;
import units.Army;
import units.Cavalry;
import units.Infantry;
import units.Status;
import units.Unit;


public class Controller implements ActionListener {
	private JButton UpgradeButtonCity1;
	
	private JPanel relocatePanel;
	private LogPanel logPanel;
	private static int count=0;
	private JButton UpgradeButton;
	private JButton UpgradeButton1;
	private JButton UpgradeButton2;
	private JButton UpgradeButton4;
	private JButton UpgradeButton5;
	private JButton recruitButton6;
	private JButton recruitButton7;
	private JButton recruitButton8;
	private Game game;
	
	JTextArea nameText;
	JTextArea turnText;
	JTextArea resourcesText;
	JMenuItem itemArmy;
	
	private Unit tempAttack;
	private Unit tempDefend;
	
	
	private JButton buildFarm;
	private JButton buildMarket;
	private JButton buildArcheryRange;
	private JButton buildBarracks;
	private JButton buildStable;
	private JButton endTurn;
	private JButton initiateArmyButton;
	private ArrayList<JButton> defendingbuttons;
	private ArrayList<JButton> attackingbuttons;
	
	private JTextArea farmText;
	private JTextArea marketText;
	private JTextArea cityText;
	private JTextArea archeryRangeText;
	private JTextArea barracksText;
	private JTextArea stableText;
	private Army chosenArmy;
	private JTextArea levelFarm;
	private JTextArea levelMarket;
	private JTextArea levelArcheryRange;
	private JTextArea levelBarracks;
	private JTextArea levelStable;
	
	private JMenu armyMenu;
	private JMenu unitsMenu;
	 
	//world View
	private JMenuBar defendingarmyUnits;
	private JMenu defendingarmyUnitsName;
	private JMenu moveUnitsMenu;
	private JMenuItem Archer2MenuItem;
	private City citytemp;
	
	private JMenu besiegingMenu;
	private JMenu marchingMenu;
	private JMenu idleMenu;
	private GameView gameView;
	private EndGameView endGameView;
	
	private JButton pressArcher;
	private JButton pressInfantry;
	private JButton pressCavalry;
	
	
	private JMenuBar initiateMenuBar;
	private JMenu initiateMenu;
	
	private ArrayList<Unit> defendingArmyArchers;
	private ArrayList<Unit> defendingArmyCavalries;
	private ArrayList<Unit> defendingArmyInfantries;
	
	private ArrayList<Army> IdleArmiescontrolled;
	
	private JMenu ArcherMenu;
	private JMenu InfantryMenu;
	private JMenu cavalryMenu;
	
	private JButton pressArcher1;
	private JButton pressInfantry1;
	private JButton pressCavalry1;
	
	private JButton targetCity;
	
	private BattlePanel battlePanel;
	private Main main;
	
	private JButton attackButton;
	private JButton resolveButton;
	private JButton quitButton;
	private JButton archerUnit;
	private JButton infantryUnit;
	private JButton cavalaryUnit;
	private JButton archerUnit1;
	private JButton cavalaryUnit1;
	private JButton infantryUnit1;
	
	private JButton choose1;
	private Army siegingArmy;
	private Army opponentArmy;
	
	private JPanel attackinArmyPanel;
	private JPanel defendingArmyPanel;
	
	private JTextArea defendingDifference;
	private JTextArea attackingDifference;
	private JTextArea turnCountText;
	
	private JButton laySiege;
	private CityView cityView1;
	private CityView cityView2;
	private JTextArea city1Name;
	private JTextArea city2Name;
	
	private JButton attack1;
	private boolean attack2=true;
	private boolean defend1=false;
	int soldierAttackafter;
	int soliderDefendafter;
	private static int countAttack=0;
	private JPanel log;
	private ArrayList<JTextArea> logText;
	public Controller(Game game) 
	{ 
		
		battlePanel= new BattlePanel();
		main =new Main(this,battlePanel);
		
		//main.setVisible(false);
		this.game=game;
		game.setController(this);
		logPanel=new LogPanel();
		log=logPanel.getPanel();
		logText= new ArrayList<>();
		IdleArmiescontrolled=new ArrayList<>();
		//System.out.println(game.getPlayer().getControlledCities().get(0).getDefendingArmy().getUnits().size());
		defendingArmyArchers= new ArrayList<Unit>();
		defendingArmyCavalries= new ArrayList<Unit>();
		defendingArmyInfantries= new ArrayList<Unit>();
		gameView=new GameView();
		gameView.setVisible(true);
		endGameView= new EndGameView(game);
		endGameView.setVisible(false);
		buildFarm=gameView.getBuild();
		buildMarket=gameView.getBuild1();
		buildArcheryRange=gameView.getBuild2();
		buildBarracks=gameView.getBuild3();
		buildStable=gameView.getBuild4();
		nameText = gameView.getText();
		nameText.setText(game.getPlayer().getName());
		cityText = gameView.getText1();
		cityText.setText(game.getPlayer().getControlledCities().get(0).getName());
		
		turnText=gameView.getTurnText();
		resourcesText= gameView.getResourcesText();
		
		turnText.setText("Current Turn = "+ Integer.toString(game.getCurrentTurnCount()));
		resourcesText.setText("Food ="+game.getPlayer().getFood() + "       "+"Gold = "+game.getPlayer().getTreasury());
		 buildFarm.addActionListener(this);
		 buildMarket.addActionListener(this);
		 
		 buildArcheryRange.addActionListener(this);
		 buildBarracks.addActionListener(this);
		 buildStable.addActionListener(this);
		 	 unitsMenu=gameView.getUnitMenu1();
		 
		  	 UpgradeButton = gameView.getButton();
		  	 UpgradeButton.addActionListener(this);
		  	
		  	
			 UpgradeButton1 = gameView.getButton1();
			 UpgradeButton1.addActionListener(this);
			 
			 UpgradeButton2 = gameView.getButton2();
			 UpgradeButton2.addActionListener(this);
			 
			 UpgradeButton4 = gameView.getButton4();
			 UpgradeButton4.addActionListener(this);
			 
			 UpgradeButton5 = gameView.getButton5();
			 UpgradeButton5.addActionListener(this);
			 
			 recruitButton6 = gameView.getButton6();
			 recruitButton6.addActionListener(this);
			 
			 recruitButton7 = gameView.getButton7();
			 recruitButton7.addActionListener(this);
			 
			 recruitButton8 = gameView.getButton8();
			 recruitButton8.addActionListener(this);
			 
		turnCountText =  battlePanel.getTurnCountText();
		
		
			 
			 
			// initiateArmyButton=gameView.getInitiateButton();
			 //initiateArmyButton.addActionListener(this);
			 armyMenu = gameView.getArmyMenu();

		  
		 farmText=gameView.getText3();
		 marketText=gameView.getText4();
		 archeryRangeText=gameView.getText6();
		 barracksText=gameView.getText7();
		 stableText=gameView.getText8();
		 
		 levelFarm=gameView.getText9();
		 levelMarket=gameView.getText10();
		 levelArcheryRange=gameView.getText11();
		 levelBarracks=gameView.getText12();
		 levelStable=gameView.getText13();
		 
		 defendingarmyUnits = gameView.getArmyMenuBar();
		 defendingarmyUnitsName=gameView.getUnitMenu();
		 
		
		 endTurn=gameView.getEndTurnButton();
		 endTurn.addActionListener(this);
		 
		 
		 besiegingMenu=gameView.getBesiegingMenu();
		 marchingMenu=gameView.getMarchingMenu();
		 idleMenu=gameView.getIdleMenu();
		  
		 pressArcher=gameView.getPressArcher();
		 pressArcher.addActionListener(this);
		 pressCavalry=gameView.getPressCavalry();
		 pressCavalry.addActionListener(this);
		 pressInfantry=gameView.getPressInfantry();
		 pressInfantry.addActionListener(this);
		  
		 choose1=gameView.getChoose1();
		 choose1.addActionListener(this);
		 
		 initiateMenu=new JMenu();
		 initiateMenu=gameView.getInitiateArmy();
		 initiateMenu.addActionListener(this);
		 
		 attack1=new JButton();
		 attack1=main.getAttack1();
		 attack1.addActionListener(this);
		 defendingbuttons= new ArrayList<>();
		 attackingbuttons= new ArrayList<>();

		 
		
		
		 
		// JMenuItem ArcherItemNumber = new JMenuItem("200 Archer");
		 //JMenuItem CavlaryItemNumber = new JMenuItem("30 Cavalary");
		 //JMenuItem InfantryItemNumber = new JMenuItem("15 7omar");
		 moveUnitsMenu=gameView.getRelocateMenu();
		 
		 
		// this.loadArmyMenu(defendingarmyUnitsName,game.getAvailableCities().get(0).getDefendingArmy());
		
		 
		////////////////////////////////////////////////////////////////////////////////////////////////////////////// 
		 UpgradeButtonCity1=gameView.getCityView().getBuildCity1();
		 UpgradeButtonCity1.addActionListener(this);
		 
		 
		 pressArcher1=gameView.getPressArcher1();
		 pressArcher1.addActionListener(this);
		 
		 pressCavalry1=gameView.getPressCavalry1();
		 pressCavalry1.addActionListener(this);
		 
		 pressInfantry1=gameView.getPressInfantry1();
		 pressInfantry1.addActionListener(this);
		 
		 targetCity=gameView.getTargetCity();
		 targetCity.addActionListener(this);
			
		 attackButton=main.getAttack();
		 resolveButton=main.getAutoResolve();
		 quitButton=main.getMove();
		 
		 attackButton.addActionListener(this);
		 resolveButton.addActionListener(this);
		 quitButton.addActionListener(this);
			
		 attackinArmyPanel=battlePanel.getAttackingArmyPanel();
		 defendingArmyPanel= battlePanel.getDefendingArmyPanel();
		 
		 //battlePanel(game.getAvailableCities().get(0).getDefendingArmy(),defendingArmyPanel);
		 //battlePanel1(game.getAvailableCities().get(0).getDefendingArmy(),attackinArmyPanel);
		 
		 defendingDifference = battlePanel.getDefendingDifference();
		 attackingDifference = battlePanel.getAttackingDifference();
		 
		 
		 
		 laySiege=main.getLaySiege();
		 laySiege.addActionListener(this);
		 
		 cityView1 = gameView.getCityView();
		 cityView2 = gameView.getCityViewConquered2();
		 cityView1.setVisible(false);
		 cityView2.setVisible(false);
		 
		 city1Name = cityView1.getTextCity1();
		 city2Name = cityView2.getTextCity1();
		 
		 
		 
		 
		
		
	}
	public BattlePanel getBattlePanel() {
		return battlePanel;
	}
	public void setBattlePanel(BattlePanel battlePanel) {
		this.battlePanel = battlePanel;
	}
	public void refresh()
	{
		turnText.setText("Current Turn = "+ Integer.toString(game.getCurrentTurnCount()));
		resourcesText.setText("Food ="+game.getPlayer().getFood() + "       "+"Gold = "+game.getPlayer().getTreasury());
	}
	public void fillLogPanel(Unit attack,Unit defend) {
		String name=game.getPlayer().getName();
		JTextArea text=new JTextArea("Unit "+ attack.getCount()+" lost " + soldierAttackafter +" AND "+"Unit "+defend.getCount()+ " lost "+ soliderDefendafter );
		text.setEditable(false);
		logText.add(text);
		log.add(text);
		//System.out.println("hiiiii ");
		
	}
	
	
	
	public void refreshLogPanel(JPanel panel) {
		panel.removeAll();
		for(int i=0;i<logText.size();i++) {
			panel.add(logText.get(i));
		}
		logPanel.revalidate();
		logPanel.repaint();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public void loadArmyMenu(JMenu menu,Army army)
	{
		//menu.setVisible(true);
		menu.removeAll();
		ArcherMenu = new JMenu("Archers");
		InfantryMenu = new JMenu("Infantries");
		cavalryMenu = new JMenu("Cavalries");
		//Archer1Menu = new JMenu();
		//Infantry1Menu = new JMenu();
		//cavalry1Menu = new JMenu();
		int archerCount1=0;
		int archerCount2=0;
		int archerCount3=0;
		int infantryCount1=0;
		int infantryCount2=0;
		int infantryCount3=0;
		int cavalryCount1=0;
		int cavalryCount2=0;
		int cavalryCount3=0;
		int archerMax1=0;
		int archerMax2=0;
		int archerMax3=0;
		int infantryMax1=0;
		int infantryMax2=0;
		int infantryMax3=0;
		int cavalryMax1=0;
		int cavalryMax2=0;
		int cavalryMax3=0;
		
		ArcherMenu.setVisible(true);
		InfantryMenu.setVisible(true);
		cavalryMenu.setVisible(true);
		
		int countArcher=0;
		int countInfantry=0;
		int countCavalry=0;

	  
		for (int i=0 ;i<army.getUnits().size();i++) 
		{
			
			Unit u = army.getUnits().get(i);
			if (u instanceof Archer) 
			{
				if(u.getLevel()==1) 
				{
					
					 Archer2MenuItem =  new JMenuItem("Unit number :" + (++countArcher) + " Archer Level 1 "+" Soldier Count = "+u.getCurrentSoldierCount()+" Maximum Soldier Count = "+u.getMaxSoldierCount());
					 ArcherMenu.add(Archer2MenuItem);
					 defendingArmyArchers.add(u);
					 //Archer2MenuItem.add(u);
					
				}
				if (u.getLevel()==2) 
				{
					
					 Archer2MenuItem =  new JMenuItem("Unit number :" + (++countArcher) + " Archer Level 2 "+" Soldier Count = "+u.getCurrentSoldierCount()+" Maximum Soldier Count = "+u.getMaxSoldierCount());
					 ArcherMenu.add(Archer2MenuItem);
					 defendingArmyArchers.add(u);
					 Archer2MenuItem.addActionListener(this);
				}
				if (u.getLevel()==3) 
				{
					 Archer2MenuItem =  new JMenuItem("Unit number :" + (++countArcher) + " Archer Level 3 "+" Soldier Count = "+u.getCurrentSoldierCount()+" Maximum Soldier Count = "+u.getMaxSoldierCount());
					 ArcherMenu.add(Archer2MenuItem);
					 defendingArmyArchers.add(u);
				}
			}
			if (u instanceof Infantry) 
			{
				if(u.getLevel()==1) 
				{
					 Archer2MenuItem =  new JMenuItem("Unit number :" + (++countInfantry) + " Infantry Level 1 "+" Soldier Count = "+u.getCurrentSoldierCount()+" Maximum Soldier Count = "+u.getMaxSoldierCount());
					 InfantryMenu.add(Archer2MenuItem);
					 defendingArmyInfantries.add(u);
				}
				if (u.getLevel()==2) 
				{
					 Archer2MenuItem =  new JMenuItem("Unit number :" + (++countInfantry)+ " Infantry Level 2 "+" Soldier Count = "+u.getCurrentSoldierCount()+" Maximum Soldier Count = "+u.getMaxSoldierCount());
					 InfantryMenu.add(Archer2MenuItem);
					 defendingArmyInfantries.add(u);
					
				}
				if (u.getLevel()==3) 
				{
					 Archer2MenuItem =  new JMenuItem("Unit number :" + (++countInfantry)+ " Infantry Level 3 "+" Soldier Count = "+u.getCurrentSoldierCount()+" Maximum Soldier Count = "+u.getMaxSoldierCount());
					 InfantryMenu.add(Archer2MenuItem);
					 defendingArmyInfantries.add(u);
				}
			}
			if (u instanceof Cavalry) 
			{
				if(u.getLevel()==1) 
				{
					 Archer2MenuItem =  new JMenuItem("Unit number :" + (++countCavalry)+ " Cavalary Level 1 "+" Soldier Count = "+u.getCurrentSoldierCount()+" Maximum Soldier Count = "+u.getMaxSoldierCount());
					 cavalryMenu.add(Archer2MenuItem);
					 defendingArmyCavalries.add(u);
					
				}
				if (u.getLevel()==2) 
				{
					 Archer2MenuItem =  new JMenuItem("Unit number :" + (++countCavalry)+" Cavalary Level 2 "+" Soldier Count = "+u.getCurrentSoldierCount()+" Maximum Soldier Count = "+u.getMaxSoldierCount());
					 cavalryMenu.add(Archer2MenuItem);
					 defendingArmyCavalries.add(u);
					
				}
				if (u.getLevel()==3) 
				{
					 Archer2MenuItem =  new JMenuItem("Unit number :" + (++countCavalry) +" Cavalary Level 3 "+" Soldier Count = "+u.getCurrentSoldierCount()+" Maximum Soldier Count = "+u.getMaxSoldierCount());
					 cavalryMenu.add(Archer2MenuItem);
					 defendingArmyCavalries.add(u);
					
				}
		
			}
		
		}
		
		
		
		
		
		menu.add(ArcherMenu);
		menu.add(InfantryMenu);
		menu.add(cavalryMenu);
		
		
		
		
	}
	public void battlePanel(Army army, JPanel panel) {
		int count=0;
		panel.removeAll();
		for(int j=0;j<army.getUnits().size();j++) {
			Unit unit=army.getUnits().get(j);
			unit.setCount(++count);
		}
		attackingbuttons.clear();
	    for(int k=0;k<army.getUnits().size();k++) {
	    	Unit unit=army.getUnits().get(k);
	    	if(army.getUnits().get(k) instanceof Archer) {
	    		archerUnit =new JButton( unit.getCount()+" Archer Level:"+ unit.getLevel()+ "Soldier Count:" + unit.getCurrentSoldierCount()+ "Maximum soldier Count" + unit.getMaxSoldierCount());
	    		archerUnit.setToolTipText("Unit count "+unit.getCount()+" Unit Level"+unit.getLevel()+"Soldier Count:"+ unit.getCurrentSoldierCount()+ "Maximum soldier Count" + unit.getMaxSoldierCount());
				archerUnit.addActionListener(this);
				attackingbuttons.add(archerUnit);
				//System.out.println("hi");
				panel.add(archerUnit);
				
	    	}
	    	if(army.getUnits().get(k) instanceof Cavalry) {
	    		 cavalaryUnit =new JButton(unit.getCount()+" Cavalry Level:"+ unit.getLevel()+ "Soldier Count:" + unit.getCurrentSoldierCount()+ "Maximum soldier Count" + unit.getMaxSoldierCount());
	    		cavalaryUnit.setToolTipText("Unit count "+unit.getCount()+" Unit Level"+unit.getLevel()+"Soldier Count:"+ unit.getCurrentSoldierCount()+ "Maximum soldier Count" + unit.getMaxSoldierCount());
				panel.add(cavalaryUnit);
				cavalaryUnit.addActionListener(this);
				attackingbuttons.add(cavalaryUnit);
	    	}
	    	if(army.getUnits().get(k) instanceof Infantry) {
	    		 infantryUnit =new JButton(unit.getCount()+" Infantry Level:"+ unit.getLevel()+ "Soldier Count:" + unit.getCurrentSoldierCount()+ "Maximum soldier Count" + unit.getMaxSoldierCount());
	    		infantryUnit.setToolTipText("Unit count "+unit.getCount()+" Unit Level"+unit.getLevel()+"Soldier Count:"+ unit.getCurrentSoldierCount()+ "Maximum soldier Count" + unit.getMaxSoldierCount());
				panel.add(infantryUnit);
				infantryUnit.addActionListener(this);
				attackingbuttons.add(infantryUnit);
				
	    	}
	    }
	}
	public void battlePanel1(Army army, JPanel panel) {
		panel.removeAll();
		int count=0;
		for(int j=0;j<army.getUnits().size();j++) {
			Unit unit=army.getUnits().get(j);
			unit.setCount(++count);
		}
		
		defendingbuttons.clear();
	    for(int k=0;k<army.getUnits().size();k++) {
	    	Unit unit=army.getUnits().get(k);
	    	if(army.getUnits().get(k) instanceof Archer) {
	    		 archerUnit1 =new JButton( unit.getCount()+" Archer Level:"+ unit.getLevel()+ "Soldier Count:" + unit.getCurrentSoldierCount()+ "Maximum soldier Count" + unit.getMaxSoldierCount());
	    		archerUnit1.setToolTipText("Unit count "+unit.getCount()+" Unit Level"+unit.getLevel()+"Soldier Count:"+ unit.getCurrentSoldierCount()+ "Maximum soldier Count" + unit.getMaxSoldierCount());
				panel.add(archerUnit1);
				
				archerUnit1.addActionListener(this);
				defendingbuttons.add(archerUnit1);
	    	}
	    	if(army.getUnits().get(k) instanceof Cavalry) {
	    		 cavalaryUnit1 =new JButton(unit.getCount()+" Cavalry Level:"+ unit.getLevel()+ "Soldier Count:" + unit.getCurrentSoldierCount()+ "Maximum soldier Count" + unit.getMaxSoldierCount());
	    		cavalaryUnit1.setToolTipText("Unit count "+unit.getCount()+" Unit Level"+unit.getLevel()+"Soldier Count:"+ unit.getCurrentSoldierCount()+ "Maximum soldier Count" + unit.getMaxSoldierCount());
				panel.add(cavalaryUnit1);
				cavalaryUnit1.addActionListener(this);
				defendingbuttons.add(cavalaryUnit1);
	    	}
	    	if(army.getUnits().get(k) instanceof Infantry) {
	    		 infantryUnit1 =new JButton(unit.getCount()+" Infantry Level:"+ unit.getLevel()+ "Soldier Count:" + unit.getCurrentSoldierCount()+ "Maximum soldier Count" + unit.getMaxSoldierCount());
	    		infantryUnit1.setToolTipText("Unit count "+unit.getCount()+" Unit Level"+unit.getLevel()+"Soldier Count:"+ unit.getCurrentSoldierCount()+ "Maximum soldier Count" + unit.getMaxSoldierCount());
				panel.add(infantryUnit1);
				infantryUnit1.addActionListener(this);
				defendingbuttons.add(infantryUnit1);
				
	    	}
	    }
	}
	public void fillControlledMarching(JMenu marching) {
		marching.removeAll();
		for(int i=0;i<game.getPlayer().getControlledArmies().size();i++) {
			
			Army army =game.getPlayer().getControlledArmies().get(i);
					if(army.getCurrentStatus().equals(Status.MARCHING)) {
						System.out.println("ok");
						int x= army.getCount();	
						System.out.println(x);
						JMenu Army1=new JMenu("Army"+ (x));
						JMenu units=new JMenu("Units ");
						JMenuItem target=new JMenuItem("Target City "+ army.getTarget() + "Turns Left To Target: " + army.getDistancetoTarget());
						loadArmyMenu(units, army);
						
						
						Army1.add(units);
						Army1.add(target);
						marching.add(Army1);
						
				
					}
					
					
		}
	}
	public void fillControlledBesieging(JMenu besieging) {
		besieging.removeAll();
		for(int i=0;i<game.getPlayer().getControlledArmies().size();i++) {
			Army army =game.getPlayer().getControlledArmies().get(i);
					if(army.getCurrentStatus().equals(Status.BESIEGING)) {
						JMenu Army1=new JMenu("Army"+ (count));
						JMenu units=new JMenu("Units ");
						for(int j=0;j<game.getAvailableCities().size();j++) 
						{
							
							if(game.getAvailableCities().get(i).getName().equals(army.getCurrentLocation())) {
								 citytemp=game.getAvailableCities().get(i);
							}
							
						}
						JMenuItem target=new JMenuItem("Besieging "+ army.getCurrentLocation() + "Turns Left for siege: " + citytemp.getTurnsUnderSiege());
						loadArmyMenu(units, army);
						
						
						Army1.add(units);
						Army1.add(target);
						besieging.add(Army1);
						
				
					}
					
					
		}
	}
	
	public void fillControlledIdle(JMenu idle) {
		idle.removeAll();
		for(int i=0;i<game.getPlayer().getControlledArmies().size();i++) {
			Army army =game.getPlayer().getControlledArmies().get(i);
					if(army.getCurrentStatus().equals(Status.IDLE)) {
						JMenu Army1=new JMenu("Army"+ count);
						//ookkpkIdleArmiescontrolled.add(army);
						JMenu units=new JMenu("Units ");
						loadArmyMenu(units, army);
						
						
						Army1.add(units);
						idle.add(Army1);
						
				
					}
					
					
		}
	}
	public void fillArmiesUnits(JMenu menu) {
		menu.removeAll();
		JMenu Menu1=null;
		for(int i=0;i<game.getPlayer().getControlledArmies().size();i++)
		{
			Army army=game.getPlayer().getControlledArmies().get(i);
			Menu1=new JMenu("Army "+ army.getCount());
			JMenuItem item = null;
			for (int j=0;j<game.getPlayer().getControlledArmies().get(i).getUnits().size();j++) {
				Unit u=game.getPlayer().getControlledArmies().get(i).getUnits().get(j);
				u.setCount(j+1);
				if (u instanceof Archer) {
					 item= new JMenuItem(u.getCount()+ " Archer Level"+u.getLevel()+" Soldier Count = "+u.getCurrentSoldierCount()+" Maximum Soldier Count = "+u.getMaxSoldierCount());
				}
				if (u instanceof Cavalry) {
					 item= new JMenuItem(u.getCount()+ " Cavalry Level"+u.getLevel()+" Soldier Count = "+u.getCurrentSoldierCount()+" Maximum Soldier Count = "+u.getMaxSoldierCount());
				}
				if (u instanceof Infantry) {
					 item= new JMenuItem(u.getCount()+ " Infantry Level"+u.getLevel()+" Soldier Count = "+u.getCurrentSoldierCount()+" Maximum Soldier Count = "+u.getMaxSoldierCount());
				}
				
				Menu1.add(item);
			}
		}
		menu.add(Menu1);
	}
	
	public void fillArmies(JMenu menu)
	{	
		menu.removeAll();
		int count=0;
		for(int i=0;i<game.getPlayer().getControlledArmies().size();i++)
		{
			Army army=game.getPlayer().getControlledArmies().get(i);
			IdleArmiescontrolled.add(army);
			itemArmy=new JMenuItem("Army"+ (++count));
			itemArmy.addActionListener(this);
			menu.add(itemArmy);
			
			
		}
	}
	public void actionPerformed(ActionEvent e) 
	
	{
		if (e.getSource()==gameView.getCityViewConquered2().getButton6City1()) {
			for (int i=0;i<game.getPlayer().getControlledCities().get(2).getMilitaryBuildings().size();i++) {
				if(game.getPlayer().getControlledCities().get(2).getMilitaryBuildings().get(i) instanceof Stable) {
					try {
						game.getPlayer().recruitUnit("Cavalry", game.getPlayer().getControlledCities().get(2).getName());
						this.loadArmyMenu(gameView.getCityViewConquered2().getUnitMenuCity1(), game.getPlayer().getControlledCities().get(2).getDefendingArmy());
						resourcesText.setText("Food ="+game.getPlayer().getFood() + "       "+"Gold = "+game.getPlayer().getTreasury());
						fillArmies(armyMenu);
						 //this.loadArmyMenu(armyMenu,game.getPlayer().getControlledCities().get(0).getDefendingArmy());
					} catch (BuildingInCoolDownException | MaxRecruitedException | NotEnoughGoldException e1) {
						// TODO Auto-generated catch block
						//e1.printStackTrace();
						if(e1 instanceof NotEnoughGoldException) {
							JFrame f=new JFrame();   
						   JOptionPane.showMessageDialog(f,"not enough gold");

						}
						if(e1 instanceof BuildingInCoolDownException) {
							JFrame f=new JFrame();   
							JOptionPane.showMessageDialog(f,"Building is cooling down, please wait for the next turn"); 
						}
						
						if(e1 instanceof MaxRecruitedException) {
							JFrame f=new JFrame();   
							JOptionPane.showMessageDialog(f,"Max recruited units reached, please wait till next turn. ");
						}
					}
				}
			}
			
		}
	    if (e.getSource()==gameView.getCityViewConquered2().getButton7City1()) 
	    {
			for (int i=0;i<game.getPlayer().getControlledCities().get(2).getMilitaryBuildings().size();i++) {
				if(game.getPlayer().getControlledCities().get(2).getMilitaryBuildings().get(i) instanceof Stable) {
					try {
						game.getPlayer().recruitUnit("Cavalry", game.getPlayer().getControlledCities().get(2).getName());
						this.loadArmyMenu(gameView.getCityViewConquered2().getUnitMenuCity1(), game.getPlayer().getControlledCities().get(2).getDefendingArmy());
						resourcesText.setText("Food ="+game.getPlayer().getFood() + "       "+"Gold = "+game.getPlayer().getTreasury());
						fillArmies(armyMenu);
						 //this.loadArmyMenu(armyMenu,game.getPlayer().getControlledCities().get(0).getDefendingArmy());
					} catch (BuildingInCoolDownException | MaxRecruitedException | NotEnoughGoldException e1) {
						// TODO Auto-generated catch block
						//e1.printStackTrace();
						if(e1 instanceof NotEnoughGoldException) {
							JFrame f=new JFrame();   
						   JOptionPane.showMessageDialog(f,"not enough gold");

						}
						if(e1 instanceof BuildingInCoolDownException) {
							JFrame f=new JFrame();   
							JOptionPane.showMessageDialog(f,"Building is cooling down, please wait for the next turn"); 
						}
						
						if(e1 instanceof MaxRecruitedException) {
							JFrame f=new JFrame();   
							JOptionPane.showMessageDialog(f,"Max recruited units reached, please wait till next turn. ");
						}
					}
				}
			}
			
		}
	    if (e.getSource()==gameView.getCityViewConquered2().getButton8City1()) 
	    {
	 		for (int i=0;i<game.getPlayer().getControlledCities().get(2).getMilitaryBuildings().size();i++) {
	 			if(game.getPlayer().getControlledCities().get(2).getMilitaryBuildings().get(i) instanceof Stable) {
	 				try {
	 					game.getPlayer().recruitUnit("Cavalry", game.getPlayer().getControlledCities().get(2).getName());
	 					this.loadArmyMenu(gameView.getCityViewConquered2().getUnitMenuCity1(), game.getPlayer().getControlledCities().get(2).getDefendingArmy());
	 					resourcesText.setText("Food ="+game.getPlayer().getFood() + "       "+"Gold = "+game.getPlayer().getTreasury());
	 					fillArmies(armyMenu);
	 					 //this.loadArmyMenu(armyMenu,game.getPlayer().getControlledCities().get(0).getDefendingArmy());
	 				} catch (BuildingInCoolDownException | MaxRecruitedException | NotEnoughGoldException e1) {
	 					// TODO Auto-generated catch block
	 					//e1.printStackTrace();
	 					if(e1 instanceof NotEnoughGoldException) {
	 						JFrame f=new JFrame();   
	 					   JOptionPane.showMessageDialog(f,"not enough gold");

	 					}
	 					if(e1 instanceof BuildingInCoolDownException) {
	 						JFrame f=new JFrame();   
	 						JOptionPane.showMessageDialog(f,"Building is cooling down, please wait for the next turn"); 
	 					}
	 					
	 					if(e1 instanceof MaxRecruitedException) {
	 						JFrame f=new JFrame();   
	 						JOptionPane.showMessageDialog(f,"Max recruited units reached, please wait till next turn. ");
	 					}
	 				}
	 			}
	 		}
	 		
	 	}
	    if (e.getSource()==gameView.getCityView().getButton6City1()) 
	    {
			for (int i=0;i<game.getPlayer().getControlledCities().get(1).getMilitaryBuildings().size();i++) {
				if(game.getPlayer().getControlledCities().get(1).getMilitaryBuildings().get(i) instanceof ArcheryRange) {
					try {
						game.getPlayer().recruitUnit("Archer", game.getPlayer().getControlledCities().get(1).getName());
						this.loadArmyMenu(gameView.getCityView().getUnitMenuCity1(), game.getPlayer().getControlledCities().get(1).getDefendingArmy());
						resourcesText.setText("Food ="+game.getPlayer().getFood() + "       "+"Gold = "+game.getPlayer().getTreasury());
						// this.loadArmyMenu(moveUnitsMenu,game.getPlayer().getControlledCities().get(0).getDefendingArmy());
					} catch (BuildingInCoolDownException | MaxRecruitedException | NotEnoughGoldException e1) {
						// TODO Auto-generated catch block
						//e1.printStackTrace();
						if(e1 instanceof NotEnoughGoldException) {
							JFrame f=new JFrame();   
						   JOptionPane.showMessageDialog(f,"not enough gold");

						}
						if(e1 instanceof BuildingInCoolDownException) {
							JFrame f=new JFrame();   
							JOptionPane.showMessageDialog(f,"Building is cooling down, please wait for the next turn"); 
						}
						
						if(e1 instanceof MaxRecruitedException) {
							JFrame f=new JFrame();   
							JOptionPane.showMessageDialog(f,"Max recruited units reached, please wait till next turn. ");
						}
					}
				}
			}
	    
	    
	    
	}
	    if (e.getSource()==gameView.getCityView().getButton7City1()) 
	    {
			for (int i=0;i<game.getPlayer().getControlledCities().get(1).getMilitaryBuildings().size();i++) {
				if(game.getPlayer().getControlledCities().get(1).getMilitaryBuildings().get(i) instanceof Barracks) {
					try {
						game.getPlayer().recruitUnit("Infantry", game.getPlayer().getControlledCities().get(1).getName());
						this.loadArmyMenu(gameView.getCityView().getUnitMenuCity1(), game.getPlayer().getControlledCities().get(1).getDefendingArmy());
						resourcesText.setText("Food ="+game.getPlayer().getFood() + "       "+"Gold = "+game.getPlayer().getTreasury());
						 //this.loadArmyMenu(moveUnitsMenu,game.getPlayer().getControlledCities().get(0).getDefendingArmy());
					} catch (BuildingInCoolDownException | MaxRecruitedException | NotEnoughGoldException e1) {
						// TODO Auto-generated catch block
						//e1.printStackTrace();
						if(e1 instanceof NotEnoughGoldException) {
							JFrame f=new JFrame();   
						   JOptionPane.showMessageDialog(f,"not enough gold");

						}
						if(e1 instanceof BuildingInCoolDownException) {
							JFrame f=new JFrame();   
							JOptionPane.showMessageDialog(f,"Building is cooling down, please wait for the next turn"); 
						}
						
						if(e1 instanceof MaxRecruitedException) {
							JFrame f=new JFrame();   
							JOptionPane.showMessageDialog(f,"Max recruited units reached, please wait till next turn. ");
						}
					}
				}
			}
		}
	    if (e.getSource()==gameView.getCityView().getButton8City1()) {
			for (int i=0;i<game.getPlayer().getControlledCities().get(1).getMilitaryBuildings().size();i++) {
				if(game.getPlayer().getControlledCities().get(1).getMilitaryBuildings().get(i) instanceof Stable) {
					try {
						game.getPlayer().recruitUnit("Cavalry", game.getPlayer().getControlledCities().get(1).getName());
						this.loadArmyMenu(gameView.getCityView().getUnitMenuCity1(), game.getPlayer().getControlledCities().get(1).getDefendingArmy());
						resourcesText.setText("Food ="+game.getPlayer().getFood() + "       "+"Gold = "+game.getPlayer().getTreasury());
						fillArmies(armyMenu);
						 //this.loadArmyMenu(armyMenu,game.getPlayer().getControlledCities().get(0).getDefendingArmy());
					} catch (BuildingInCoolDownException | MaxRecruitedException | NotEnoughGoldException e1) {
						// TODO Auto-generated catch block
						//e1.printStackTrace();
						if(e1 instanceof NotEnoughGoldException) {
							JFrame f=new JFrame();   
						   JOptionPane.showMessageDialog(f,"not enough gold");

						}
						if(e1 instanceof BuildingInCoolDownException) {
							JFrame f=new JFrame();   
							JOptionPane.showMessageDialog(f,"Building is cooling down, please wait for the next turn"); 
						}
						
						if(e1 instanceof MaxRecruitedException) {
							JFrame f=new JFrame();   
							JOptionPane.showMessageDialog(f,"Max recruited units reached, please wait till next turn. ");
						}
					}
				}
			}
			
		}
		
		
		
		 if(e.getSource()==attackButton) {
			 attackButton.setVisible(false);
			 resolveButton.setVisible(false);
			 quitButton.setVisible(false);
			 laySiege.setVisible(false);
			 main.getBattlePanel().setVisible(true);
		     attack1.setVisible(true);
		     //siegingArmy=game.getAvailableCities().get(0).getDefendingArmy();
		     //opponentArmy=game.getAvailableCities().get(1).getDefendingArmy();
	 	
		     battlePanel(siegingArmy,attackinArmyPanel);
			  battlePanel1(opponentArmy,defendingArmyPanel);
			 
			 
		 }
		 //if(e.getSource()==gameView.getCityView().geta) {
		//	 attackButton.setVisible(false);
			// resolveButton.setVisible(false);
			// quitButton.setVisible(false);
			// laySiege.setVisible(false);
			// main.getBattlePanel().setVisible(true);
		  //   attack1.setVisible(true);
		    ////// //siegingArmy=game.getAvailableCities().get(0).getDefendingArmy();
		    /// //opponentArmy=game.getAvailableCities().get(1).getDefendingArmy();
	 	
		   //  battlePanel(siegingArmy,attackinArmyPanel);
			//  battlePanel1(opponentArmy,defendingArmyPanel);
			 
			 
		/// }
		int o = -1;
		if(!defendingbuttons.isEmpty()) {
			o = defendingbuttons.indexOf((JButton) e.getSource());
		}
		int o1=-1;
		if(!attackingbuttons.isEmpty()) {
			o1 = attackingbuttons.indexOf((JButton) e.getSource());
		}
		//if (e.getSource()==itemArmy)
		//{
			
			//for (int i=0;i<IdleArmiescontrolled.size();i++) {
				
			//}
		//}
		
		if(o1!=-1)
		{
			tempAttack=siegingArmy.getUnits().get(o1);
		}
		if(o!=-1)
		{
			
			tempDefend=opponentArmy.getUnits().get(o);
		}
		if(e.getSource()==cavalaryUnit)
		{
			char x= cavalaryUnit.getText().charAt(0);
			String y=""+ x;
			int z=Integer.parseInt(y);
			System.out.println("hi");
			tempAttack=siegingArmy.getUnits().get(z-1);
		
		}
		
		if(e.getSource()==infantryUnit)
		{
			char x= infantryUnit.getText().charAt(0);
			String y=""+ x;
			int z=Integer.parseInt(y);
			tempAttack=siegingArmy.getUnits().get(z-1);
		
		}
		
		if(e.getSource()==archerUnit1)
		{
			int z=defendingbuttons.indexOf(archerUnit1);
			System.out.println("hi");
			tempDefend=opponentArmy.getUnits().get(z);
		
		}
		if(e.getSource()==cavalaryUnit1)
		{
			char x= cavalaryUnit1.getText().charAt(0);
			String y=""+ x;
			int z=Integer.parseInt(y);
			tempDefend=opponentArmy.getUnits().get(z-1);
		
		}

		if(e.getSource()==infantryUnit1)
		{
			char x= infantryUnit1.getText().charAt(0);
			String y=""+ x;
			int z=Integer.parseInt(y);
			tempDefend=opponentArmy.getUnits().get(z-1);
		
		}
		
		
		
		if(e.getSource()==buildFarm) 
		{
			
			try {
				game.getPlayer().build("Farm",game.getPlayer().getControlledCities().get(0).getName());
				buildFarm.setVisible(false);
				farmText.setVisible(true);
				levelFarm.setVisible(true);
			
				UpgradeButton.setVisible(true);
				//System.out.println(game.getPlayer().getTreasury());
				
				resourcesText.setText("Food ="+game.getPlayer().getFood() + "       "+"Gold = "+game.getPlayer().getTreasury());
				System.out.println("hi");
				//System.out.println(game.getPlayer().getTreasury());
				
			} catch (NotEnoughGoldException e1) {
				// TODO Auto-generated catch block
				if (e1 instanceof NotEnoughGoldException) {
					JFrame f=new JFrame();   
			         JOptionPane.showMessageDialog(f,"Not enough Gold");
				}
				//e1.printStackTrace();
			}
			
			
		}
		if(e.getSource()==gameView.getCityView().getBuildCity1()) 
		{
			
			try {
				game.getPlayer().build("Farm",game.getPlayer().getControlledCities().get(1).getName());
				gameView.getCityView().getBuildCity1().setVisible(false);
				gameView.getCityView().getText13City1().setVisible(true);
				gameView.getCityView().getText9City1().setVisible(true);
			
				gameView.getCityView().getButtonCity1().setVisible(true);
				//System.out.println(game.getPlayer().getTreasury());
				
				resourcesText.setText("Food ="+game.getPlayer().getFood() + "       "+"Gold = "+game.getPlayer().getTreasury());
				
				//System.out.println(game.getPlayer().getTreasury());
				
			} catch (NotEnoughGoldException e1) {
				// TODO Auto-generated catch block
				//e1.printStackTrace();
				if (e1 instanceof NotEnoughGoldException) {
					JFrame f=new JFrame();   
			         JOptionPane.showMessageDialog(f,"Not enough Gold");
				}
			}
			
			
		}
		if(e.getSource()==gameView.getCityViewConquered2().getBuildCity1()) 
		{
			
			try {
				game.getPlayer().build("Farm",game.getPlayer().getControlledCities().get(2).getName());
				gameView.getCityViewConquered2().getBuildCity1().setVisible(false);
				gameView.getCityViewConquered2().getText13City1().setVisible(true);
				gameView.getCityViewConquered2().getText9City1().setVisible(true);
			
				gameView.getCityViewConquered2().getButtonCity1().setVisible(true);
				//System.out.println(game.getPlayer().getTreasury());
				
				resourcesText.setText("Food ="+game.getPlayer().getFood() + "       "+"Gold = "+game.getPlayer().getTreasury());
				
				//System.out.println(game.getPlayer().getTreasury());
				
			} catch (NotEnoughGoldException e1) {
				// TODO Auto-generated catch block
				//e1.printStackTrace();
				if (e1 instanceof NotEnoughGoldException) {
					JFrame f=new JFrame();   
			         JOptionPane.showMessageDialog(f,"Not enough Gold");
				}
			}
			
			
		}
		
	
		if(e.getSource()==buildMarket)
		{
			
			try {
				game.getPlayer().build("Market", game.getPlayer().getControlledCities().get(0).getName());
				buildMarket.setVisible(false);
				marketText.setVisible(true);
				levelMarket.setVisible(true);
			
				UpgradeButton1.setVisible(true);
				//System.out.println(game.getPlayer().getTreasury());
				
				resourcesText.setText("Food ="+game.getPlayer().getFood() + "       "+"Gold = "+game.getPlayer().getTreasury());
				System.out.println("hi");
				//System.out.println(game.getPlayer().getTreasury());
				
			} catch (NotEnoughGoldException e1) {
				// TODO Auto-generated catch block
				//e1.printStackTrace();
				if (e1 instanceof NotEnoughGoldException) {
					JFrame f=new JFrame();   
			         JOptionPane.showMessageDialog(f,"Not enough Gold");
				}
			}
			
			
		}
		if(e.getSource()==gameView.getCityView().getBuild1City1())
		{
			
			try {
				game.getPlayer().build("Market", game.getPlayer().getControlledCities().get(1).getName());
				gameView.getCityView().getBuild1City1().setVisible(false);
				gameView.getCityView().getText4City1().setVisible(true);
				gameView.getCityView().getText10City1().setVisible(true);
			
				gameView.getCityView().getButton1City1().setVisible(true);
				//System.out.println(game.getPlayer().getTreasury());
				
				resourcesText.setText("Food ="+game.getPlayer().getFood() + "       "+"Gold = "+game.getPlayer().getTreasury());
				//System.out.println(game.getPlayer().getTreasury());
				
			} catch (NotEnoughGoldException e1) {
				// TODO Auto-generated catch block
				//e1.printStackTrace();
				if (e1 instanceof NotEnoughGoldException) {
					JFrame f=new JFrame();   
			         JOptionPane.showMessageDialog(f,"Not enough Gold");
				}
			}
			
			
		}
		if(e.getSource()==gameView.getCityViewConquered2().getBuild1City1())
		{
			
			try {
				game.getPlayer().build("Market", game.getPlayer().getControlledCities().get(1).getName());
				gameView.getCityViewConquered2().getBuild1City1().setVisible(false);
				gameView.getCityViewConquered2().getText4City1().setVisible(true);
				gameView.getCityViewConquered2().getText10City1().setVisible(true);
			
				gameView.getCityViewConquered2().getButton1City1().setVisible(true);
				//System.out.println(game.getPlayer().getTreasury());
				
				resourcesText.setText("Food ="+game.getPlayer().getFood() + "       "+"Gold = "+game.getPlayer().getTreasury());
				//System.out.println(game.getPlayer().getTreasury());
				
			} catch (NotEnoughGoldException e1) {
				// TODO Auto-generated catch block
				//e1.printStackTrace();
				if (e1 instanceof NotEnoughGoldException) {
					JFrame f=new JFrame();   
			         JOptionPane.showMessageDialog(f,"Not enough Gold");
				}
			}
			
			
		}
		if(e.getSource()==buildBarracks) 
		{
			
			try
			{
				game.getPlayer().build("Barracks", game.getPlayer().getControlledCities().get(0).getName());
				buildBarracks.setVisible(false);
				barracksText.setVisible(true);
				levelBarracks.setVisible(true);
				recruitButton7.setVisible(true);
			
				UpgradeButton4.setVisible(true);
				//System.out.println(game.getPlayer().getTreasury());
				
				resourcesText.setText("Food ="+game.getPlayer().getFood() + "       "+"Gold = "+game.getPlayer().getTreasury());
				System.out.println("hi");
				//System.out.println(game.getPlayer().getTreasury());
				
			} 
			catch (NotEnoughGoldException e1) 
			{
			
				// TODO Auto-generated catch block
				//e1.printStackTrace();
				if (e1 instanceof NotEnoughGoldException) {
					JFrame f=new JFrame();   
			         JOptionPane.showMessageDialog(f,"Not enough Gold");
				}
			}
			
			
		}
		if(e.getSource()==gameView.getCityView().getBuild4City1()) 
		{
			
			try
			{
				game.getPlayer().build("Barracks", game.getPlayer().getControlledCities().get(1).getName());
				gameView.getCityView().getBuild4City1().setVisible(false);
				gameView.getCityView().getText7City1().setVisible(true);
				gameView.getCityView().getText12City1().setVisible(true);
				gameView.getCityView().getButton7City1().setVisible(true);
			
				gameView.getCityView().getButton4City1().setVisible(true);
				//System.out.println(game.getPlayer().getTreasury());
				
				resourcesText.setText("Food ="+game.getPlayer().getFood() + "       "+"Gold = "+game.getPlayer().getTreasury());
				
				//System.out.println(game.getPlayer().getTreasury());
				
			} 
			catch (NotEnoughGoldException e1) 
			{
			
				// TODO Auto-generated catch block
				//e1.printStackTrace();
				if (e1 instanceof NotEnoughGoldException) {
					JFrame f=new JFrame();   
			         JOptionPane.showMessageDialog(f,"Not enough Gold");
				}
			}
		}
			if(e.getSource()==gameView.getCityViewConquered2().getBuild4City1()) 
			{
				
				try
				{
					game.getPlayer().build("Barracks", game.getPlayer().getControlledCities().get(2).getName());
					gameView.getCityViewConquered2().getBuild4City1().setVisible(false);
					gameView.getCityViewConquered2().getText7City1().setVisible(true);
					gameView.getCityViewConquered2().getText12City1().setVisible(true);
					gameView.getCityViewConquered2().getButton7City1().setVisible(true);
				
					gameView.getCityViewConquered2().getButton4City1().setVisible(true);
					//System.out.println(game.getPlayer().getTreasury());
					
					resourcesText.setText("Food ="+game.getPlayer().getFood() + "       "+"Gold = "+game.getPlayer().getTreasury());
					
					//System.out.println(game.getPlayer().getTreasury());
					
				} 
				catch (NotEnoughGoldException e1) 
				{
				
					// TODO Auto-generated catch block
					//e1.printStackTrace();
					if (e1 instanceof NotEnoughGoldException) {
						JFrame f=new JFrame();   
				         JOptionPane.showMessageDialog(f,"Not enough Gold");
					}
				}
			
			
		}
		if(e.getSource()==buildArcheryRange) {
			
			try {
				game.getPlayer().build("ArcheryRange", game.getPlayer().getControlledCities().get(0).getName());
				buildArcheryRange.setVisible(false);
				archeryRangeText.setVisible(true);
				levelArcheryRange.setVisible(true);
				recruitButton6.setVisible(true);
				UpgradeButton2.setVisible(true);
				//System.out.println(game.getPlayer().getTreasury());
				
				resourcesText.setText("Food ="+game.getPlayer().getFood() + "       "+"Gold = "+game.getPlayer().getTreasury());
				//System.out.println(game.getPlayer().getTreasury());
				
			} catch (NotEnoughGoldException e1) {
				// TODO Auto-generated catch block
				//e1.printStackTrace();
				if (e1 instanceof NotEnoughGoldException) {
					JFrame f=new JFrame();   
			         JOptionPane.showMessageDialog(f,"Not enough Gold");
				}
			}
			
			
		}
if(e.getSource()==gameView.getCityView().getBuil2City1()) {
			
			try {
				game.getPlayer().build("ArcheryRange", game.getPlayer().getControlledCities().get(1).getName());
				gameView.getCityView().getBuil2City1().setVisible(false);
				gameView.getCityView().getText6City1().setVisible(true);
				gameView.getCityView().getText11City1().setVisible(true);
				gameView.getCityView().getButton6City1().setVisible(true);
				gameView.getCityView().getButton2City1().setVisible(true);
				//System.out.println(game.getPlayer().getTreasury());
				
				resourcesText.setText("Food ="+game.getPlayer().getFood() + "       "+"Gold = "+game.getPlayer().getTreasury());
				//System.out.println(game.getPlayer().getTreasury());
				
			} catch (NotEnoughGoldException e1) {
				// TODO Auto-generated catch block
				//e1.printStackTrace();
				if (e1 instanceof NotEnoughGoldException) {
					JFrame f=new JFrame();   
			         JOptionPane.showMessageDialog(f,"Not enough Gold");
				}
			}
			
			
		}
if(e.getSource()==gameView.getCityViewConquered2().getBuil2City1()) {
	
	try {
		game.getPlayer().build("ArcheryRange", game.getPlayer().getControlledCities().get(2).getName());
		gameView.getCityViewConquered2().getBuil2City1().setVisible(false);
		gameView.getCityViewConquered2().getText6City1().setVisible(true);
		gameView.getCityViewConquered2().getText11City1().setVisible(true);
		gameView.getCityViewConquered2().getButton6City1().setVisible(true);
		gameView.getCityViewConquered2().getButton2City1().setVisible(true);
		//System.out.println(game.getPlayer().getTreasury());
		
		resourcesText.setText("Food ="+game.getPlayer().getFood() + "       "+"Gold = "+game.getPlayer().getTreasury());
		//System.out.println(game.getPlayer().getTreasury());
		
	} catch (NotEnoughGoldException e1) {
		// TODO Auto-generated catch block
		//e1.printStackTrace();
		if (e1 instanceof NotEnoughGoldException) {
			JFrame f=new JFrame();   
	         JOptionPane.showMessageDialog(f,"Not enough Gold");
		}
	}
	
	
}
		if(e.getSource()==buildStable) {
			
			try {
				game.getPlayer().build("Stable", game.getPlayer().getControlledCities().get(0).getName());
				buildStable.setVisible(false);
				stableText.setVisible(true);
				levelStable.setVisible(true);
				recruitButton8.setVisible(true);
				UpgradeButton5.setVisible(true);
				//System.out.println(game.getPlayer().getTreasury());
				
				resourcesText.setText("Food ="+game.getPlayer().getFood() + "       "+"Gold = "+game.getPlayer().getTreasury());
				//System.out.println("hi");
				//System.out.println(game.getPlayer().getTreasury());
				
			} catch (NotEnoughGoldException e1) {
				// TODO Auto-generated catch block
				//e1.printStackTrace();
				if (e1 instanceof NotEnoughGoldException) {
					JFrame f=new JFrame();   
			         JOptionPane.showMessageDialog(f,"Not enough Gold");
				}
			}
			
			
		}
if(e.getSource()==gameView.getCityView().getBuild4City1()) {
			
			try {
				game.getPlayer().build("Stable", game.getPlayer().getControlledCities().get(0).getName());
				gameView.getCityView().getBuild4City1().setVisible(false);
				gameView.getCityView().getText8City1().setVisible(true);
				gameView.getCityView().getText13City1().setVisible(true);
				gameView.getCityView().getButton8City1().setVisible(true);
				gameView.getCityView().getButton5City1().setVisible(true);
				//System.out.println(game.getPlayer().getTreasury());
				
				resourcesText.setText("Food ="+game.getPlayer().getFood() + "       "+"Gold = "+game.getPlayer().getTreasury());
				//System.out.println("hi");
				//System.out.println(game.getPlayer().getTreasury());
				
			} catch (NotEnoughGoldException e1) {
				// TODO Auto-generated catch block
				//e1.printStackTrace();
				if (e1 instanceof NotEnoughGoldException) {
					JFrame f=new JFrame();   
			         JOptionPane.showMessageDialog(f,"Not enough Gold");
				}
			}
			
			
		}
if(e.getSource()==gameView.getCityViewConquered2().getBuild4City1()) {
	
	try {
		game.getPlayer().build("Stable", game.getPlayer().getControlledCities().get(0).getName());
		gameView.getCityViewConquered2().getBuild4City1().setVisible(false);
		gameView.getCityViewConquered2().getText8City1().setVisible(true);
		gameView.getCityViewConquered2().getText13City1().setVisible(true);
		gameView.getCityViewConquered2().getButton8City1().setVisible(true);
		gameView.getCityViewConquered2().getButton5City1().setVisible(true);
		//System.out.println(game.getPlayer().getTreasury());
		
		resourcesText.setText("Food ="+game.getPlayer().getFood() + "       "+"Gold = "+game.getPlayer().getTreasury());
		//System.out.println("hi");
		//System.out.println(game.getPlayer().getTreasury());
		
	} catch (NotEnoughGoldException e1) {
		// TODO Auto-generated catch block
		//e1.printStackTrace();
		if (e1 instanceof NotEnoughGoldException) {
			JFrame f=new JFrame();   
	         JOptionPane.showMessageDialog(f,"Not enough Gold");
		}
	}
	
	
}
		
		if(e.getSource()==	UpgradeButton) {
			
			for(int i=0;i<game.getPlayer().getControlledCities().get(0).getEconomicalBuildings().size();i++) {
				if(game.getPlayer().getControlledCities().get(0).getEconomicalBuildings().get(i) instanceof Farm) {
					try {
						game.getPlayer().upgradeBuilding(game.getPlayer().getControlledCities().get(0).getEconomicalBuildings().get(i));
						UpgradeButton.setToolTipText("Upgrade Cost "+game.getPlayer().getControlledCities().get(0).getEconomicalBuildings().get(i).getUpgradeCost());
						resourcesText.setText("Food ="+game.getPlayer().getFood() + "       "+"Gold = "+game.getPlayer().getTreasury());
						levelFarm.setText("Level "+game.getPlayer().getControlledCities().get(0).getEconomicalBuildings().get(i).getLevel());
						
					} catch (NotEnoughGoldException | BuildingInCoolDownException | MaxLevelException e1) {
						if(game.getPlayer().getControlledCities().get(0).getEconomicalBuildings().get(i).isCoolDown()){
							JFrame f=new JFrame();   
						    JOptionPane.showMessageDialog(f,"Building is cooling down, please wait for the next turn"); 
						}
						if(game.getPlayer().getControlledCities().get(0).getEconomicalBuildings().get(i).getLevel()==3) {
							JFrame f=new JFrame();   
							JOptionPane.showMessageDialog(f,"Maximum level reached!!");
						}
						if(game.getPlayer().getTreasury()<game.getPlayer().getControlledCities().get(0).getEconomicalBuildings().get(i).getUpgradeCost()) {
							JFrame f=new JFrame();   
							JOptionPane.showMessageDialog(f,"not enough gold");

						}
						// TODO Auto-generated catch block
						//e1.printStackTrace();
					}
				}
			}
			
		}
if(e.getSource()==	gameView.getCityView().getButtonCity1()) {
			
			for(int i=0;i<game.getPlayer().getControlledCities().get(1).getEconomicalBuildings().size();i++) {
				if(game.getPlayer().getControlledCities().get(1).getEconomicalBuildings().get(i) instanceof Farm) {
					try {
						game.getPlayer().upgradeBuilding(game.getPlayer().getControlledCities().get(1).getEconomicalBuildings().get(i));
						gameView.getCityView().getButtonCity1().setToolTipText("Upgrade Cost "+game.getPlayer().getControlledCities().get(1).getEconomicalBuildings().get(i).getUpgradeCost());
						resourcesText.setText("Food ="+game.getPlayer().getFood() + "       "+"Gold = "+game.getPlayer().getTreasury());
						gameView.getCityView().getText9City1().setText("Level "+game.getPlayer().getControlledCities().get(1).getEconomicalBuildings().get(i).getLevel());
						
					} catch (NotEnoughGoldException | BuildingInCoolDownException | MaxLevelException e1) {
						if(game.getPlayer().getControlledCities().get(1).getEconomicalBuildings().get(i).isCoolDown()){
							JFrame f=new JFrame();   
						    JOptionPane.showMessageDialog(f,"Building is cooling down, please wait for the next turn"); 
						}
						if(game.getPlayer().getControlledCities().get(1).getEconomicalBuildings().get(i).getLevel()==3) {
							JFrame f=new JFrame();   
							JOptionPane.showMessageDialog(f,"Maximum level reached!!");
						}
						if(game.getPlayer().getTreasury()<game.getPlayer().getControlledCities().get(1).getEconomicalBuildings().get(i).getUpgradeCost()) {
							JFrame f=new JFrame();   
							JOptionPane.showMessageDialog(f,"not enough gold");

						}
						// TODO Auto-generated catch block
						//e1.printStackTrace();
					}
				}
			}
			
		}
if(e.getSource()==	gameView.getCityViewConquered2().getButtonCity1()) {
	
	for(int i=0;i<game.getPlayer().getControlledCities().get(2).getEconomicalBuildings().size();i++) {
		if(game.getPlayer().getControlledCities().get(1).getEconomicalBuildings().get(i) instanceof Farm) {
			try {
				game.getPlayer().upgradeBuilding(game.getPlayer().getControlledCities().get(2).getEconomicalBuildings().get(i));
				gameView.getCityViewConquered2().getButtonCity1().setToolTipText("Upgrade Cost "+game.getPlayer().getControlledCities().get(2).getEconomicalBuildings().get(i).getUpgradeCost());
				resourcesText.setText("Food ="+game.getPlayer().getFood() + "       "+"Gold = "+game.getPlayer().getTreasury());
				gameView.getCityViewConquered2().getText9City1().setText("Level "+game.getPlayer().getControlledCities().get(2).getEconomicalBuildings().get(i).getLevel());
				
			} catch (NotEnoughGoldException | BuildingInCoolDownException | MaxLevelException e1) {
				if(game.getPlayer().getControlledCities().get(2).getEconomicalBuildings().get(i).isCoolDown()){
					JFrame f=new JFrame();   
				    JOptionPane.showMessageDialog(f,"Building is cooling down, please wait for the next turn"); 
				}
				if(game.getPlayer().getControlledCities().get(2).getEconomicalBuildings().get(i).getLevel()==3) {
					JFrame f=new JFrame();   
					JOptionPane.showMessageDialog(f,"Maximum level reached!!");
				}
				if(game.getPlayer().getTreasury()<game.getPlayer().getControlledCities().get(2).getEconomicalBuildings().get(i).getUpgradeCost()) {
					JFrame f=new JFrame();   
					JOptionPane.showMessageDialog(f,"not enough gold");

				}
				// TODO Auto-generated catch block
				//e1.printStackTrace();
			}
		}
	}
	
}
		
		
		if(e.getSource()==	UpgradeButton1) {
			for(int i=0;i<game.getPlayer().getControlledCities().get(0).getEconomicalBuildings().size();i++) {
				if(game.getPlayer().getControlledCities().get(0).getEconomicalBuildings().get(i) instanceof Market) {
					try {
						game.getPlayer().upgradeBuilding(game.getPlayer().getControlledCities().get(0).getEconomicalBuildings().get(i));
						resourcesText.setText("Food ="+game.getPlayer().getFood() + "       "+"Gold = "+game.getPlayer().getTreasury());
						levelMarket.setText("Level "+game.getPlayer().getControlledCities().get(0).getEconomicalBuildings().get(i).getLevel());
						
					} catch (NotEnoughGoldException | BuildingInCoolDownException | MaxLevelException e1) {
						// TODO Auto-generated catch block
						//e1.printStackTrace();
						if(game.getPlayer().getControlledCities().get(0).getEconomicalBuildings().get(i).isCoolDown()){
							JFrame f=new JFrame();   
						    JOptionPane.showMessageDialog(f,"Building is cooling down, please wait for the next turn"); 
						}
						if(game.getPlayer().getControlledCities().get(0).getEconomicalBuildings().get(i).getLevel()==3) {
							JFrame f=new JFrame();   
							JOptionPane.showMessageDialog(f,"Maximum level reached!!");
						}
						if(game.getPlayer().getTreasury()<game.getPlayer().getControlledCities().get(0).getEconomicalBuildings().get(i).getUpgradeCost()) {
							JFrame f=new JFrame();   
							JOptionPane.showMessageDialog(f,"not enough gold");

						}
					}
				}
			}
			
		}
		if(e.getSource()==	gameView.getCityView().getButton1City1()) {
			for(int i=0;i<game.getPlayer().getControlledCities().get(1).getEconomicalBuildings().size();i++) {
				if(game.getPlayer().getControlledCities().get(1).getEconomicalBuildings().get(i) instanceof Market) {
					try {
						game.getPlayer().upgradeBuilding(game.getPlayer().getControlledCities().get(1).getEconomicalBuildings().get(i));
						resourcesText.setText("Food ="+game.getPlayer().getFood() + "       "+"Gold = "+game.getPlayer().getTreasury());
						gameView.getCityView().getText10City1().setText("Level "+game.getPlayer().getControlledCities().get(1).getEconomicalBuildings().get(i).getLevel());
						
					} catch (NotEnoughGoldException | BuildingInCoolDownException | MaxLevelException e1) {
						// TODO Auto-generated catch block
						//e1.printStackTrace();
						if(game.getPlayer().getControlledCities().get(1).getEconomicalBuildings().get(i).isCoolDown()){
							JFrame f=new JFrame();   
						    JOptionPane.showMessageDialog(f,"Building is cooling down, please wait for the next turn"); 
						}
						if(game.getPlayer().getControlledCities().get(1).getEconomicalBuildings().get(i).getLevel()==3) {
							JFrame f=new JFrame();   
							JOptionPane.showMessageDialog(f,"Maximum level reached!!");
						}
						if(game.getPlayer().getTreasury()<game.getPlayer().getControlledCities().get(1).getEconomicalBuildings().get(i).getUpgradeCost()) {
							JFrame f=new JFrame();   
							JOptionPane.showMessageDialog(f,"not enough gold");

						}
					}
				}
			}
			
		}
		if(e.getSource()==	gameView.getCityViewConquered2().getButton1City1()) {
			for(int i=0;i<game.getPlayer().getControlledCities().get(1).getEconomicalBuildings().size();i++) {
				if(game.getPlayer().getControlledCities().get(2).getEconomicalBuildings().get(i) instanceof Market) {
					try {
						game.getPlayer().upgradeBuilding(game.getPlayer().getControlledCities().get(2).getEconomicalBuildings().get(i));
						resourcesText.setText("Food ="+game.getPlayer().getFood() + "       "+"Gold = "+game.getPlayer().getTreasury());
						gameView.getCityViewConquered2().getText10City1().setText("Level "+game.getPlayer().getControlledCities().get(2).getEconomicalBuildings().get(i).getLevel());
						
					} catch (NotEnoughGoldException | BuildingInCoolDownException | MaxLevelException e1) {
						// TODO Auto-generated catch block
						//e1.printStackTrace();
						if(game.getPlayer().getControlledCities().get(2).getEconomicalBuildings().get(i).isCoolDown()){
							JFrame f=new JFrame();   
						    JOptionPane.showMessageDialog(f,"Building is cooling down, please wait for the next turn"); 
						}
						if(game.getPlayer().getControlledCities().get(2).getEconomicalBuildings().get(i).getLevel()==3) {
							JFrame f=new JFrame();   
							JOptionPane.showMessageDialog(f,"Maximum level reached!!");
						}
						if(game.getPlayer().getTreasury()<game.getPlayer().getControlledCities().get(2).getEconomicalBuildings().get(i).getUpgradeCost()) {
							JFrame f=new JFrame();   
							JOptionPane.showMessageDialog(f,"not enough gold");

						}
					}
				}
			}
			
		}
		if(e.getSource()==	UpgradeButton2) {
			for(int i=0;i<game.getPlayer().getControlledCities().get(0).getMilitaryBuildings().size();i++) {
				if(game.getPlayer().getControlledCities().get(0).getMilitaryBuildings().get(i) instanceof ArcheryRange) {
					try {
						game.getPlayer().upgradeBuilding(game.getPlayer().getControlledCities().get(0).getMilitaryBuildings().get(i));
						resourcesText.setText("Food ="+game.getPlayer().getFood() + "       "+"Gold = "+game.getPlayer().getTreasury());
						levelArcheryRange.setText("Level "+game.getPlayer().getControlledCities().get(0).getMilitaryBuildings().get(i).getLevel());
						
					} catch (NotEnoughGoldException | BuildingInCoolDownException | MaxLevelException e1) {
						// TODO Auto-generated catch block
						//e1.printStackTrace();
						if(game.getPlayer().getControlledCities().get(0).getEconomicalBuildings().get(i).isCoolDown()){
							JFrame f=new JFrame();   
						    JOptionPane.showMessageDialog(f,"Building is cooling down, please wait for the next turn"); 
						}
						if(game.getPlayer().getControlledCities().get(0).getEconomicalBuildings().get(i).getLevel()==3) {
							JFrame f=new JFrame();   
							JOptionPane.showMessageDialog(f,"Maximum level reached!!");
						}
						if(game.getPlayer().getTreasury()<game.getPlayer().getControlledCities().get(0).getEconomicalBuildings().get(i).getUpgradeCost()) {
							JFrame f=new JFrame();   
							JOptionPane.showMessageDialog(f,"not enough gold");

						}
					}
				}
			}
			
		}	
		if(e.getSource()==	gameView.getCityView().getButton2City1()) {
			for(int i=0;i<game.getPlayer().getControlledCities().get(1).getEconomicalBuildings().size();i++) {
				if(game.getPlayer().getControlledCities().get(1).getMilitaryBuildings().get(i) instanceof ArcheryRange) {
					try {
						game.getPlayer().upgradeBuilding(game.getPlayer().getControlledCities().get(1).getMilitaryBuildings().get(i));
						resourcesText.setText("Food ="+game.getPlayer().getFood() + "       "+"Gold = "+game.getPlayer().getTreasury());
						gameView.getCityView().getText11City1().setText("Level "+game.getPlayer().getControlledCities().get(1).getMilitaryBuildings().get(i).getLevel());
						
					} catch (NotEnoughGoldException | BuildingInCoolDownException | MaxLevelException e1) {
						// TODO Auto-generated catch block
						//e1.printStackTrace();
						if(game.getPlayer().getControlledCities().get(1).getMilitaryBuildings().get(i).isCoolDown()){
							JFrame f=new JFrame();   
						    JOptionPane.showMessageDialog(f,"Building is cooling down, please wait for the next turn"); 
						}
						if(game.getPlayer().getControlledCities().get(1).getMilitaryBuildings().get(i).getLevel()==3) {
							JFrame f=new JFrame();   
							JOptionPane.showMessageDialog(f,"Maximum level reached!!");
						}
						if(game.getPlayer().getTreasury()<game.getPlayer().getControlledCities().get(1).getMilitaryBuildings().get(i).getUpgradeCost()) {
							JFrame f=new JFrame();   
							JOptionPane.showMessageDialog(f,"not enough gold");

						}
					}
				}
			}
			
		}
		if(e.getSource()==	gameView.getCityViewConquered2().getButton2City1()) {
			for(int i=0;i<game.getPlayer().getControlledCities().get(2).getEconomicalBuildings().size();i++) {
				if(game.getPlayer().getControlledCities().get(2).getMilitaryBuildings().get(i) instanceof ArcheryRange) {
					try {
						game.getPlayer().upgradeBuilding(game.getPlayer().getControlledCities().get(2).getMilitaryBuildings().get(i));
						resourcesText.setText("Food ="+game.getPlayer().getFood() + "       "+"Gold = "+game.getPlayer().getTreasury());
						gameView.getCityViewConquered2().getText11City1().setText("Level "+game.getPlayer().getControlledCities().get(2).getMilitaryBuildings().get(i).getLevel());
						
					} catch (NotEnoughGoldException | BuildingInCoolDownException | MaxLevelException e1) {
						// TODO Auto-generated catch block
						//e1.printStackTrace();
						if(game.getPlayer().getControlledCities().get(2).getMilitaryBuildings().get(i).isCoolDown()){
							JFrame f=new JFrame();   
						    JOptionPane.showMessageDialog(f,"Building is cooling down, please wait for the next turn"); 
						}
						if(game.getPlayer().getControlledCities().get(2).getMilitaryBuildings().get(i).getLevel()==3) {
							JFrame f=new JFrame();   
							JOptionPane.showMessageDialog(f,"Maximum level reached!!");
						}
						if(game.getPlayer().getTreasury()<game.getPlayer().getControlledCities().get(2).getMilitaryBuildings().get(i).getUpgradeCost()) {
							JFrame f=new JFrame();   
							JOptionPane.showMessageDialog(f,"not enough gold");

						}
					}
				}
			}
			
		}
		if(e.getSource()==	UpgradeButton4) {
			for(int i=0;i<game.getPlayer().getControlledCities().get(0).getMilitaryBuildings().size();i++) {
				if(game.getPlayer().getControlledCities().get(0).getMilitaryBuildings().get(i) instanceof Barracks) {
					try {
						game.getPlayer().upgradeBuilding(game.getPlayer().getControlledCities().get(0).getMilitaryBuildings().get(i));
						resourcesText.setText("Food ="+game.getPlayer().getFood() + "       "+"Gold = "+game.getPlayer().getTreasury());
						levelBarracks.setText("Level "+game.getPlayer().getControlledCities().get(0).getMilitaryBuildings().get(i).getLevel());
						
					} catch (NotEnoughGoldException | BuildingInCoolDownException | MaxLevelException e1) {
						// TODO Auto-generated catch block
						//e1.printStackTrace();
						if(game.getPlayer().getControlledCities().get(0).getEconomicalBuildings().get(i).isCoolDown()){
							JFrame f=new JFrame();   
						    JOptionPane.showMessageDialog(f,"Building is cooling down, please wait for the next turn"); 
						}
						if(game.getPlayer().getControlledCities().get(0).getEconomicalBuildings().get(i).getLevel()==3) {
							JFrame f=new JFrame();   
							JOptionPane.showMessageDialog(f,"Maximum level reached!!");
						}
						if(game.getPlayer().getTreasury()<game.getPlayer().getControlledCities().get(0).getEconomicalBuildings().get(i).getUpgradeCost()) {
							JFrame f=new JFrame();   
							JOptionPane.showMessageDialog(f,"not enough gold");

						}
					}
				}
			}
			
		}
		if(e.getSource()==	gameView.getCityView().getButton4City1()) {
			for(int i=0;i<game.getPlayer().getControlledCities().get(1).getEconomicalBuildings().size();i++) {
				if(game.getPlayer().getControlledCities().get(1).getMilitaryBuildings().get(i) instanceof Barracks) {
					try {
						game.getPlayer().upgradeBuilding(game.getPlayer().getControlledCities().get(1).getMilitaryBuildings().get(i));
						resourcesText.setText("Food ="+game.getPlayer().getFood() + "       "+"Gold = "+game.getPlayer().getTreasury());
						gameView.getCityView().getText12City1().setText("Level "+game.getPlayer().getControlledCities().get(1).getMilitaryBuildings().get(i).getLevel());
						
					} catch (NotEnoughGoldException | BuildingInCoolDownException | MaxLevelException e1) {
						// TODO Auto-generated catch block
						//e1.printStackTrace();
						if(game.getPlayer().getControlledCities().get(1).getMilitaryBuildings().get(i).isCoolDown()){
							JFrame f=new JFrame();   
						    JOptionPane.showMessageDialog(f,"Building is cooling down, please wait for the next turn"); 
						}
						if(game.getPlayer().getControlledCities().get(1).getMilitaryBuildings().get(i).getLevel()==3) {
							JFrame f=new JFrame();   
							JOptionPane.showMessageDialog(f,"Maximum level reached!!");
						}
						if(game.getPlayer().getTreasury()<game.getPlayer().getControlledCities().get(1).getMilitaryBuildings().get(i).getUpgradeCost()) {
							JFrame f=new JFrame();   
							JOptionPane.showMessageDialog(f,"not enough gold");

						}
					}
				}
			}
			
		}
		if(e.getSource()==	gameView.getCityViewConquered2().getButton4City1()) {
			for(int i=0;i<game.getPlayer().getControlledCities().get(2).getEconomicalBuildings().size();i++) {
				if(game.getPlayer().getControlledCities().get(2).getMilitaryBuildings().get(i) instanceof ArcheryRange) {
					try {
						game.getPlayer().upgradeBuilding(game.getPlayer().getControlledCities().get(2).getMilitaryBuildings().get(i));
						resourcesText.setText("Food ="+game.getPlayer().getFood() + "       "+"Gold = "+game.getPlayer().getTreasury());
						gameView.getCityViewConquered2().getText12City1().setText("Level "+game.getPlayer().getControlledCities().get(2).getMilitaryBuildings().get(i).getLevel());
						
					} catch (NotEnoughGoldException | BuildingInCoolDownException | MaxLevelException e1) {
						// TODO Auto-generated catch block
						//e1.printStackTrace();
						if(game.getPlayer().getControlledCities().get(2).getMilitaryBuildings().get(i).isCoolDown()){
							JFrame f=new JFrame();   
						    JOptionPane.showMessageDialog(f,"Building is cooling down, please wait for the next turn"); 
						}
						if(game.getPlayer().getControlledCities().get(2).getMilitaryBuildings().get(i).getLevel()==3) {
							JFrame f=new JFrame();   
							JOptionPane.showMessageDialog(f,"Maximum level reached!!");
						}
						if(game.getPlayer().getTreasury()<game.getPlayer().getControlledCities().get(2).getMilitaryBuildings().get(i).getUpgradeCost()) {
							JFrame f=new JFrame();   
							JOptionPane.showMessageDialog(f,"not enough gold");

						}
					}
				}
			}
			
		}
		if(e.getSource()==	UpgradeButton5) {
			for(int i=0;i<game.getPlayer().getControlledCities().get(0).getMilitaryBuildings().size();i++) {
				if(game.getPlayer().getControlledCities().get(0).getMilitaryBuildings().get(i) instanceof Stable) {
					try {
						game.getPlayer().upgradeBuilding(game.getPlayer().getControlledCities().get(0).getMilitaryBuildings().get(i));
						resourcesText.setText("Food ="+game.getPlayer().getFood() + "       "+"Gold = "+game.getPlayer().getTreasury());
						levelStable.setText("Level "+game.getPlayer().getControlledCities().get(0).getMilitaryBuildings().get(i).getLevel());
						
					} catch (NotEnoughGoldException | BuildingInCoolDownException | MaxLevelException e1) {
						// TODO Auto-generated catch block
						//e1.printStackTrace();
						if(game.getPlayer().getControlledCities().get(0).getEconomicalBuildings().get(i).isCoolDown()){
							JFrame f=new JFrame();   
						    JOptionPane.showMessageDialog(f,"Building is cooling down, please wait for the next turn"); 
						}
						if(game.getPlayer().getControlledCities().get(0).getEconomicalBuildings().get(i).getLevel()==3) {
							JFrame f=new JFrame();   
							JOptionPane.showMessageDialog(f,"Maximum level reached!!");
						}
						if(game.getPlayer().getTreasury()<game.getPlayer().getControlledCities().get(0).getEconomicalBuildings().get(i).getUpgradeCost()) {
							JFrame f=new JFrame();   
							JOptionPane.showMessageDialog(f,"not enough gold");

						}
					}
				}
			}
			
		}
		if(e.getSource()==	gameView.getCityView().getButton5City1()) {
			for(int i=0;i<game.getPlayer().getControlledCities().get(1).getEconomicalBuildings().size();i++) {
				if(game.getPlayer().getControlledCities().get(1).getMilitaryBuildings().get(i) instanceof Barracks) {
					try {
						game.getPlayer().upgradeBuilding(game.getPlayer().getControlledCities().get(1).getMilitaryBuildings().get(i));
						resourcesText.setText("Food ="+game.getPlayer().getFood() + "       "+"Gold = "+game.getPlayer().getTreasury());
						gameView.getCityView().getText13City1().setText("Level "+game.getPlayer().getControlledCities().get(1).getMilitaryBuildings().get(i).getLevel());
						
					} catch (NotEnoughGoldException | BuildingInCoolDownException | MaxLevelException e1) {
						// TODO Auto-generated catch block
						//e1.printStackTrace();
						if(game.getPlayer().getControlledCities().get(1).getMilitaryBuildings().get(i).isCoolDown()){
							JFrame f=new JFrame();   
						    JOptionPane.showMessageDialog(f,"Building is cooling down, please wait for the next turn"); 
						}
						if(game.getPlayer().getControlledCities().get(1).getMilitaryBuildings().get(i).getLevel()==3) {
							JFrame f=new JFrame();   
							JOptionPane.showMessageDialog(f,"Maximum level reached!!");
						}
						if(game.getPlayer().getTreasury()<game.getPlayer().getControlledCities().get(1).getMilitaryBuildings().get(i).getUpgradeCost()) {
							JFrame f=new JFrame();   
							JOptionPane.showMessageDialog(f,"not enough gold");

						}
					}
				}
			}
			
		}
		if(e.getSource()==	gameView.getCityViewConquered2().getButton5City1()) {
			for(int i=0;i<game.getPlayer().getControlledCities().get(2).getEconomicalBuildings().size();i++) {
				if(game.getPlayer().getControlledCities().get(2).getMilitaryBuildings().get(i) instanceof ArcheryRange) {
					try {
						game.getPlayer().upgradeBuilding(game.getPlayer().getControlledCities().get(2).getMilitaryBuildings().get(i));
						resourcesText.setText("Food ="+game.getPlayer().getFood() + "       "+"Gold = "+game.getPlayer().getTreasury());
						gameView.getCityViewConquered2().getText13City1().setText("Level "+game.getPlayer().getControlledCities().get(2).getMilitaryBuildings().get(i).getLevel());
						
					} catch (NotEnoughGoldException | BuildingInCoolDownException | MaxLevelException e1) {
						// TODO Auto-generated catch block
						//e1.printStackTrace();
						if(game.getPlayer().getControlledCities().get(2).getMilitaryBuildings().get(i).isCoolDown()){
							JFrame f=new JFrame();   
						    JOptionPane.showMessageDialog(f,"Building is cooling down, please wait for the next turn"); 
						}
						if(game.getPlayer().getControlledCities().get(2).getMilitaryBuildings().get(i).getLevel()==3) {
							JFrame f=new JFrame();   
							JOptionPane.showMessageDialog(f,"Maximum level reached!!");
						}
						if(game.getPlayer().getTreasury()<game.getPlayer().getControlledCities().get(2).getMilitaryBuildings().get(i).getUpgradeCost()) {
							JFrame f=new JFrame();   
							JOptionPane.showMessageDialog(f,"not enough gold");

						}
					}
				}
			}
			
		}
		if (e.getSource()==recruitButton6) {
			for (int i=0;i<game.getPlayer().getControlledCities().get(0).getMilitaryBuildings().size();i++) {
				if(game.getPlayer().getControlledCities().get(0).getMilitaryBuildings().get(i) instanceof ArcheryRange) {
					try {
						game.getPlayer().recruitUnit("Archer", game.getPlayer().getControlledCities().get(0).getName());
						this.loadArmyMenu(defendingarmyUnitsName, game.getPlayer().getControlledCities().get(0).getDefendingArmy());
						resourcesText.setText("Food ="+game.getPlayer().getFood() + "       "+"Gold = "+game.getPlayer().getTreasury());
						// this.loadArmyMenu(moveUnitsMenu,game.getPlayer().getControlledCities().get(0).getDefendingArmy());
					} catch (BuildingInCoolDownException | MaxRecruitedException | NotEnoughGoldException e1) {
						// TODO Auto-generated catch block
						//e1.printStackTrace();
						if(game.getPlayer().getControlledCities().get(0).getMilitaryBuildings().get(i).getRecruitmentCost()>game.getPlayer().getTreasury()) {
							JFrame f=new JFrame();   
						   JOptionPane.showMessageDialog(f,"not enough gold");

						}
						if(game.getPlayer().getControlledCities().get(0).getMilitaryBuildings().get(i).isCoolDown()) {
							JFrame f=new JFrame();   
							JOptionPane.showMessageDialog(f,"Building is cooling down, please wait for the next turn"); 
						}
						
						if(game.getPlayer().getControlledCities().get(0).getMilitaryBuildings().get(i).getCurrentRecruit()==(game.getPlayer().getControlledCities().get(0).getMilitaryBuildings().get(i).getMaxRecruit())) {
							JFrame f=new JFrame();   
							JOptionPane.showMessageDialog(f,"Max recruited units reached, please wait till next turn. ");
						}
					}
				}
			}
		}
		if (e.getSource()==recruitButton7) {
			for (int i=0;i<game.getPlayer().getControlledCities().get(0).getMilitaryBuildings().size();i++) {
				if(game.getPlayer().getControlledCities().get(0).getMilitaryBuildings().get(i) instanceof Barracks) {
					try {
						game.getPlayer().recruitUnit("Infantry", game.getPlayer().getControlledCities().get(0).getName());
						this.loadArmyMenu(defendingarmyUnitsName, game.getPlayer().getControlledCities().get(0).getDefendingArmy());
						resourcesText.setText("Food ="+game.getPlayer().getFood() + "       "+"Gold = "+game.getPlayer().getTreasury());
						 //this.loadArmyMenu(moveUnitsMenu,game.getPlayer().getControlledCities().get(0).getDefendingArmy());
					} catch (BuildingInCoolDownException | MaxRecruitedException | NotEnoughGoldException e1) {
						// TODO Auto-generated catch block
						//e1.printStackTrace();
						if(game.getPlayer().getControlledCities().get(0).getMilitaryBuildings().get(i).getRecruitmentCost()>game.getPlayer().getTreasury()) {
							JFrame f=new JFrame();   
						   JOptionPane.showMessageDialog(f,"not enough gold");

						}
						if(game.getPlayer().getControlledCities().get(0).getMilitaryBuildings().get(i).isCoolDown()) {
							JFrame f=new JFrame();   
							JOptionPane.showMessageDialog(f,"Building is cooling down, please wait for the next turn"); 
						}
						
						if(game.getPlayer().getControlledCities().get(0).getMilitaryBuildings().get(i).getCurrentRecruit()==(game.getPlayer().getControlledCities().get(0).getMilitaryBuildings().get(i).getMaxRecruit())) {
							JFrame f=new JFrame();   
							JOptionPane.showMessageDialog(f,"Max recruited units reached, please wait till next turn. ");
						}
					}
				}
			}
		}
		if (e.getSource()==recruitButton8) {
			for (int i=0;i<game.getPlayer().getControlledCities().get(0).getMilitaryBuildings().size();i++) {
				if(game.getPlayer().getControlledCities().get(0).getMilitaryBuildings().get(i) instanceof Stable) {
					try {
						game.getPlayer().recruitUnit("Cavalry", game.getPlayer().getControlledCities().get(0).getName());
						this.loadArmyMenu(defendingarmyUnitsName, game.getPlayer().getControlledCities().get(0).getDefendingArmy());
						resourcesText.setText("Food ="+game.getPlayer().getFood() + "       "+"Gold = "+game.getPlayer().getTreasury());
						fillArmies(armyMenu);
						 //this.loadArmyMenu(armyMenu,game.getPlayer().getControlledCities().get(0).getDefendingArmy());
					} catch (BuildingInCoolDownException | MaxRecruitedException | NotEnoughGoldException e1) {
						// TODO Auto-generated catch block
						//e1.printStackTrace();
						if(game.getPlayer().getControlledCities().get(0).getMilitaryBuildings().get(i).getRecruitmentCost()>game.getPlayer().getTreasury()) {
							JFrame f=new JFrame();   
						   JOptionPane.showMessageDialog(f,"not enough gold");

						}
						if(game.getPlayer().getControlledCities().get(0).getMilitaryBuildings().get(i).isCoolDown()) {
							JFrame f=new JFrame();   
							JOptionPane.showMessageDialog(f,"Building is cooling down, please wait for the next turn"); 
						}
						
						if(game.getPlayer().getControlledCities().get(0).getMilitaryBuildings().get(i).getCurrentRecruit()==(game.getPlayer().getControlledCities().get(0).getMilitaryBuildings().get(i).getMaxRecruit())) {
							JFrame f=new JFrame();   
							JOptionPane.showMessageDialog(f,"Max recruited units reached, please wait till next turn. ");
						}
					}
				}
			}
			
		}
		if (e.getSource()==pressArcher)
		{
			
			JFrame f=new JFrame();   
		    String name=JOptionPane.showInputDialog(f,"Choose your Archer Number from defending Army's Units :"); 
		    for (int i=0;i<defendingArmyArchers.size();i++) {
		    	if (name.equals(Integer.toString(i+1))) {
		    		game.getPlayer().initiateArmy(game.getPlayer().getControlledCities().get(0),defendingArmyArchers.get(i));
		    		JMenu Army =new JMenu("Army" + (++count));
		    		Army army = game.getPlayer().getControlledArmies().get(count-1);
		    		army.setCount(count);
		    		//army.getUnits().add(defendingArmyArchers.get(i));
		    		JMenuItem item = ArcherMenu.getItem(i);
		    		Army.add(item);
		    		armyMenu.add(Army);
		    		ArcherMenu.remove(i);
		    		defendingArmyArchers.remove(i);
		    		//unitsMenu.add(item);
		    		this.loadArmyMenu(defendingarmyUnitsName,game.getPlayer().getControlledCities().get(0).getDefendingArmy());
		    		//loadArmyMenu(armyMenu,game.getPlayer().getControlledArmies().get(0));
		    		fillArmies(armyMenu);
		    		fillControlledIdle(idleMenu);
		    		
		    	}
		    }
			//game.getPlayer().initiateArmy(game.getPlayer().getControlledCities().get(0), new Archer(1, 20, 30, 40, 50));
			//loadArmyMenu(armyMenu,game.getPlayer().getControlledArmies().get(0));
			loadArmyMenu(idleMenu,game.getPlayer().getControlledArmies().get(0));
		}
		if (e.getSource()==gameView.getCityView().getPressArcherCity1())
		{
			
			JFrame f=new JFrame();   
		    String name=JOptionPane.showInputDialog(f,"Choose your Archer Number from defending Army's Units :"); 
		    for (int i=0;i<defendingArmyArchers.size();i++) {
		    	if (name.equals(Integer.toString(i+1))) {
		    		game.getPlayer().initiateArmy(game.getPlayer().getControlledCities().get(1),defendingArmyArchers.get(i));
		    		JMenu Army =new JMenu("Army" + (++count));
		    		Army army = game.getPlayer().getControlledArmies().get(count-1);
		    		army.setCount(count);
		    		//army.getUnits().add(defendingArmyArchers.get(i));
		    		JMenuItem item = ArcherMenu.getItem(i);
		    		Army.add(item);
		    		armyMenu.add(Army);
		    		ArcherMenu.remove(i);
		    		defendingArmyArchers.remove(i);
		    		//unitsMenu.add(item);
		    		this.loadArmyMenu(defendingarmyUnitsName,game.getPlayer().getControlledCities().get(1).getDefendingArmy());
		    		//loadArmyMenu(armyMenu,game.getPlayer().getControlledArmies().get(0));
		    		fillArmies(armyMenu);
		    		fillControlledIdle(idleMenu);
		    		
		    	}
		    }
			//game.getPlayer().initiateArmy(game.getPlayer().getControlledCities().get(0), new Archer(1, 20, 30, 40, 50));
			//loadArmyMenu(armyMenu,game.getPlayer().getControlledArmies().get(0));
			loadArmyMenu(idleMenu,game.getPlayer().getControlledArmies().get(1));
		}
		if (e.getSource()==gameView.getCityViewConquered2().getPressArcherCity1())
		{
			
			JFrame f=new JFrame();   
		    String name=JOptionPane.showInputDialog(f,"Choose your Archer Number from defending Army's Units :"); 
		    for (int i=0;i<defendingArmyArchers.size();i++) {
		    	if (name.equals(Integer.toString(i+1))) {
		    		game.getPlayer().initiateArmy(game.getPlayer().getControlledCities().get(2),defendingArmyArchers.get(i));
		    		JMenu Army =new JMenu("Army" + (++count));
		    		Army army = game.getPlayer().getControlledArmies().get(count-1);
		    		army.setCount(count);
		    		//army.getUnits().add(defendingArmyArchers.get(i));
		    		JMenuItem item = ArcherMenu.getItem(i);
		    		Army.add(item);
		    		armyMenu.add(Army);
		    		ArcherMenu.remove(i);
		    		defendingArmyArchers.remove(i);
		    		//unitsMenu.add(item);
		    		this.loadArmyMenu(defendingarmyUnitsName,game.getPlayer().getControlledCities().get(2).getDefendingArmy());
		    		//loadArmyMenu(armyMenu,game.getPlayer().getControlledArmies().get(0));
		    		fillArmies(armyMenu);
		    		fillControlledIdle(idleMenu);
		    		
		    	}
		    }
			//game.getPlayer().initiateArmy(game.getPlayer().getControlledCities().get(0), new Archer(1, 20, 30, 40, 50));
			//loadArmyMenu(armyMenu,game.getPlayer().getControlledArmies().get(0));
			loadArmyMenu(idleMenu,game.getPlayer().getControlledArmies().get(2));
		}
		
		if (e.getSource()==pressCavalry)
		{
			JFrame f=new JFrame();   
		    String name=JOptionPane.showInputDialog(f,"Choose your Cavalry Number from defending Army's Units :"); 
		    for (int i=0;i<defendingArmyCavalries.size();i++) {
		    	if (name.equals(Integer.toString(i+1))) {
		    		System.out.println("Hi");
		    		game.getPlayer().initiateArmy(game.getPlayer().getControlledCities().get(0),defendingArmyCavalries.get(i));
		    		JMenu Army =new JMenu("Army"+ (++count));
		    		JMenuItem item = cavalryMenu.getItem(i);
		    		Army.add(item);
		    		armyMenu.add(Army);
		    		cavalryMenu.remove(i);
		    		defendingArmyCavalries.remove(i);
		    		//unitsMenu.add(item);
		    		this.loadArmyMenu(defendingarmyUnitsName,game.getPlayer().getControlledCities().get(0).getDefendingArmy());
		    		//loadArmyMenu(armyMenu,game.getPlayer().getControlledArmies().get(0));
		    		fillArmies(armyMenu);
		    		fillControlledIdle(idleMenu);
		    		
		    	}
		    }
		    loadArmyMenu(idleMenu,game.getPlayer().getControlledArmies().get(0));
		}
		if (e.getSource()==gameView.getCityView().getPressCavalryCity1())
		{
			
			JFrame f=new JFrame();   
		    String name=JOptionPane.showInputDialog(f,"Choose your Cavalry Number from defending Army's Units :"); 
		    for (int i=0;i<defendingArmyCavalries.size();i++) {
		    	if (name.equals(Integer.toString(i+1))) {
		    		game.getPlayer().initiateArmy(game.getPlayer().getControlledCities().get(1),defendingArmyCavalries.get(i));
		    		JMenu Army =new JMenu("Army" + (++count));
		    		Army army = game.getPlayer().getControlledArmies().get(count-1);
		    		army.setCount(count);
		    		//army.getUnits().add(defendingArmyArchers.get(i));
		    		JMenuItem item = cavalryMenu.getItem(i);
		    		Army.add(item);
		    		armyMenu.add(Army);
		    		cavalryMenu.remove(i);
		    		defendingArmyCavalries.remove(i);
		    		//unitsMenu.add(item);
		    		this.loadArmyMenu(defendingarmyUnitsName,game.getPlayer().getControlledCities().get(1).getDefendingArmy());
		    		//loadArmyMenu(armyMenu,game.getPlayer().getControlledArmies().get(0));
		    		fillArmies(armyMenu);
		    		fillControlledIdle(idleMenu);
		    		
		    	}
		    }
			//game.getPlayer().initiateArmy(game.getPlayer().getControlledCities().get(0), new Archer(1, 20, 30, 40, 50));
			//loadArmyMenu(armyMenu,game.getPlayer().getControlledArmies().get(0));
			loadArmyMenu(idleMenu,game.getPlayer().getControlledArmies().get(1));
		}
		if (e.getSource()==gameView.getCityViewConquered2().getPressCavalryCity1())
		{
			
			JFrame f=new JFrame();   
		    String name=JOptionPane.showInputDialog(f,"Choose your Cavalry Number from defending Army's Units :"); 
		    for (int i=0;i<defendingArmyCavalries.size();i++) {
		    	if (name.equals(Integer.toString(i+1))) {
		    		game.getPlayer().initiateArmy(game.getPlayer().getControlledCities().get(2),defendingArmyCavalries.get(i));
		    		JMenu Army =new JMenu("Army" + (++count));
		    		Army army = game.getPlayer().getControlledArmies().get(count-1);
		    		army.setCount(count);
		    		//army.getUnits().add(defendingArmyArchers.get(i));
		    		JMenuItem item = cavalryMenu.getItem(i);
		    		Army.add(item);
		    		armyMenu.add(Army);
		    		cavalryMenu.remove(i);
		    		defendingArmyCavalries.remove(i);
		    		//unitsMenu.add(item);
		    		this.loadArmyMenu(defendingarmyUnitsName,game.getPlayer().getControlledCities().get(2).getDefendingArmy());
		    		//loadArmyMenu(armyMenu,game.getPlayer().getControlledArmies().get(0));
		    		fillArmies(armyMenu);
		    		fillControlledIdle(idleMenu);
		    		
		    	}
		    }
			//game.getPlayer().initiateArmy(game.getPlayer().getControlledCities().get(0), new Archer(1, 20, 30, 40, 50));
			//loadArmyMenu(armyMenu,game.getPlayer().getControlledArmies().get(0));
			loadArmyMenu(idleMenu,game.getPlayer().getControlledArmies().get(2));
		}
		
		if (e.getSource()==pressInfantry)
		{
			JFrame f=new JFrame();   
		    String name=JOptionPane.showInputDialog(f,"Choose your Infantry Number from defending Army's Units :"); 
		    for (int i=0;i<defendingArmyInfantries.size();i++) {
		    	if (name.equals(Integer.toString(i+1))) {
		    		//System.out.println("Hi");
		    		game.getPlayer().initiateArmy(game.getPlayer().getControlledCities().get(0),defendingArmyInfantries.get(i));
		    		JMenu Army =new JMenu("Army"+(++count));
		    		JMenuItem item =InfantryMenu.getItem(i);
		    		Army.add(item);
		    		armyMenu.add(Army);
		    		InfantryMenu.remove(i);
		    		defendingArmyInfantries.remove(i);
		    		//unitsMenu.add(item);
		    		this.loadArmyMenu(defendingarmyUnitsName,game.getPlayer().getControlledCities().get(0).getDefendingArmy());
		    		//loadArmyMenu(armyMenu,game.getPlayer().getControlledArmies().get(0));
		    		fillArmies(armyMenu);
		    		fillControlledIdle(idleMenu);
		    		
		    	}
		    }
		    loadArmyMenu(idleMenu,game.getPlayer().getControlledArmies().get(0));
		}
		if (e.getSource()==gameView.getCityView().getPressInfantryCity1())
		{
			JFrame f=new JFrame();   
		    String name=JOptionPane.showInputDialog(f,"Choose your Infantry Number from defending Army's Units :"); 
		    for (int i=0;i<defendingArmyInfantries.size();i++) {
		    	if (name.equals(Integer.toString(i+1))) {
		    		//System.out.println("Hi");
		    		game.getPlayer().initiateArmy(game.getPlayer().getControlledCities().get(1),defendingArmyInfantries.get(i));
		    		JMenu Army =new JMenu("Army"+(++count));
		    		JMenuItem item =InfantryMenu.getItem(i);
		    		Army.add(item);
		    		armyMenu.add(Army);
		    		InfantryMenu.remove(i);
		    		defendingArmyInfantries.remove(i);
		    		//unitsMenu.add(item);
		    		this.loadArmyMenu(defendingarmyUnitsName,game.getPlayer().getControlledCities().get(1).getDefendingArmy());
		    		//loadArmyMenu(armyMenu,game.getPlayer().getControlledArmies().get(0));
		    		fillArmies(armyMenu);
		    		fillControlledIdle(idleMenu);
		    		
		    	}
		    }
		    loadArmyMenu(idleMenu,game.getPlayer().getControlledArmies().get(1));
		}
		if (e.getSource()==gameView.getCityViewConquered2().getPressInfantryCity1())
		{
			JFrame f=new JFrame();   
		    String name=JOptionPane.showInputDialog(f,"Choose your Infantry Number from defending Army's Units :"); 
		    for (int i=0;i<defendingArmyInfantries.size();i++) {
		    	if (name.equals(Integer.toString(i+1))) {
		    		//System.out.println("Hi");
		    		game.getPlayer().initiateArmy(game.getPlayer().getControlledCities().get(2),defendingArmyInfantries.get(i));
		    		JMenu Army =new JMenu("Army"+(++count));
		    		JMenuItem item =InfantryMenu.getItem(i);
		    		Army.add(item);
		    		armyMenu.add(Army);
		    		InfantryMenu.remove(i);
		    		defendingArmyInfantries.remove(i);
		    		//unitsMenu.add(item);
		    		this.loadArmyMenu(defendingarmyUnitsName,game.getPlayer().getControlledCities().get(2).getDefendingArmy());
		    		//loadArmyMenu(armyMenu,game.getPlayer().getControlledArmies().get(0));
		    		fillArmies(armyMenu);
		    		fillControlledIdle(idleMenu);
		    		
		    	}
		    }
		    loadArmyMenu(idleMenu,game.getPlayer().getControlledArmies().get(2));
		}
		
		
		
	 if(e.getSource()==endTurn)
	 {
		String armyNumber=" ";
		 for (int i =0;i<game.getPlayer().getControlledArmies().size();i++) {
			 Army army=game.getPlayer().getControlledArmies().get(i);
			 if (army.getCurrentStatus().equals(Status.MARCHING)) {
				 if (army.getDistancetoTarget()==1) {
					 JFrame f=new JFrame();   
					    armyNumber=JOptionPane.showInputDialog(f,"Choose the army to laysiege"); 
					    main.setVisible(true);
					    for(int j=0;j<game.getPlayer().getControlledArmies().size();j++) {
					    	if(game.getPlayer().getControlledArmies().get(j).getCount()==Integer.parseInt(armyNumber)) {
					    		siegingArmy=game.getPlayer().getControlledArmies().get(j);
					    	}
					    } 
				 }
			 }
		 }
		 System.out.println(game.getPlayer().getControlledArmies().size());
		 for (int i=0;i<game.getPlayer().getControlledArmies().size();i++) {
			 City city=null;
			 Army army=game.getPlayer().getControlledArmies().get(i);
			
			 System.out.println(army.getCurrentLocation());
			 if (army.getCurrentStatus().equals(Status.BESIEGING)) {
				 System.out.println("eliane");
				 for (int j=0;j<game.getAvailableCities().size();j++) {
					 if (game.getAvailableCities().get(j).getName().equals(army.getCurrentLocation())) {
						 city=game.getAvailableCities().get(j);
						 System.out.println(city.getName());
					 }
				 }
				 System.out.println(city.getTurnsUnderSiege());
				 if (city.getTurnsUnderSiege()==2) {
					 System.out.println("OKKKK");
					 main.setVisible(true);
					 main.requestFocus();
					 laySiege.setVisible(false);
					 quitButton.setVisible(false);
				 }
			 }
		 }
		 game.endTurn();
		 if (!armyNumber.equals(" ")) {
		 int number=Integer.parseInt(armyNumber)-1;
		 String location=game.getPlayer().getControlledArmies().get(number).getCurrentLocation();
		 for (int i =0;i<game.getPlayer().getControlledArmies().size();i++) {
			 Army army=game.getPlayer().getControlledArmies().get(i);
			 if (army.getCurrentStatus().equals(Status.IDLE) && army.getCount()==number) {
				 siegingArmy=army;
			 }
		 }
		 for (int i=0;i<game.getAvailableCities().size();i++) {
			 if (game.getAvailableCities().get(i).getName().equals(location)) {
				 opponentArmy=game.getAvailableCities().get(i).getDefendingArmy();
			 }
		 }
		 }
		 
		
		 
			resourcesText.setText("Food ="+game.getPlayer().getFood() + "       "+"Gold = "+game.getPlayer().getTreasury());
			turnText.setText("Current Turn: "+game.getCurrentTurnCount());
			fillControlledMarching(marchingMenu);
			fillControlledIdle(idleMenu);
			fillControlledBesieging(besiegingMenu);
			
		if (game.isGameOver()) {
			gameView.setVisible(false);
			endGameView.setVisible(true);
			JTextArea textendgame = endGameView.getEngameText();
			if (game.getPlayer().getControlledCities().size()==3) {
				textendgame.setText("YOU HAVE WON");
			}else {
				textendgame.setText("YOU HAVE LOST");
			}
		}
	 }
	 if (e.getSource()==targetCity) 
	 {
		 JFrame f=new JFrame();   
		 String army=JOptionPane.showInputDialog(f,"Choose your Army to attack from idle Army");
		 String target=JOptionPane.showInputDialog(f,"Choose your target City from the world map");
		  Army army1= game.getPlayer().getControlledArmies().get(count-1);
		  army1.setCount(Integer.parseInt(army));
		  target.toLowerCase();
		  if (target.equals("cairo")) {
			  game.targetCity(army1, "Cairo");
			  
			  
		  }
		  if (target.equals("rome")) {
			  game.targetCity(army1, "Rome");
			  
		  }
		  if (target.equals("sparta")) {
			  game.targetCity(army1, "Sparta");
			  
		  }
		 // fillArmies(armyMenu);
			 
		 
		 
	 }
	 
	 if (e.getSource()==gameView.getCityView().getTargetCity()) 
	 {
		 JFrame f=new JFrame();   
		 String army=JOptionPane.showInputDialog(f,"Choose your Army to attack from idle Army");
		 String target=JOptionPane.showInputDialog(f,"Choose your target City from the world map");
		  Army army1= game.getPlayer().getControlledArmies().get(count-1);
		  army1.setCount(Integer.parseInt(army));
		  target.toLowerCase();
		  if (target.equals("cairo")) {
			  game.targetCity(army1, "Cairo");
			  
			  
		  }
		  if (target.equals("rome")) {
			  game.targetCity(army1, "Rome");
			  
		  }
		  if (target.equals("sparta")) {
			  game.targetCity(army1, "Sparta");
			  
		  }
		 // fillArmies(armyMenu);
			 
		 
		 
	 }
	 if (e.getSource()==gameView.getCityViewConquered2().getTargetCity()) 
	 {
		 JFrame f=new JFrame();   
		 String army=JOptionPane.showInputDialog(f,"Choose your Army to attack from idle Army");
		 String target=JOptionPane.showInputDialog(f,"Choose your target City from the world map");
		  Army army1= game.getPlayer().getControlledArmies().get(count-1);
		  army1.setCount(Integer.parseInt(army));
		  target.toLowerCase();
		  if (target.equals("cairo")) {
			  game.targetCity(army1, "Cairo");
			  
			  
		  }
		  if (target.equals("rome")) {
			  game.targetCity(army1, "Rome");
			  
		  }
		  if (target.equals("sparta")) {
			  game.targetCity(army1, "Sparta");
			  
		  }
		 // fillArmies(armyMenu);
			 
		 
		 
	 }
    if(e.getSource()==choose1) {
    	JFrame f=new JFrame();   
	    String name=JOptionPane.showInputDialog(f,"Choose the army to laysiege with"); 
	    main.setVisible(true);
	    laySiege.setVisible(false);
	    quitButton.setVisible(false);
	    //main.setVisible(true);
	   // battlePanel(siegingArmy,attackinArmyPanel);
	   // battlePanel1(opponentArmy,defendingArmyPanel);
    }
    if (e.getSource()==resolveButton) {
    	try {
    		
			game.autoResolve(siegingArmy,opponentArmy);
			if (siegingArmy.getUnits().size()==0) {
				JFrame f= new JFrame();
				JOptionPane.showMessageDialog(f,"YOU LOST THE BATTLE",
					    "A plain message",
					    JOptionPane.PLAIN_MESSAGE);
				main.setVisible(false);

			}
			else {
				JFrame f= new JFrame();
				JOptionPane.showMessageDialog(f,"YOU WON THE BATTLE",
					    "A plain message",
					    JOptionPane.PLAIN_MESSAGE);
				game.occupy(siegingArmy, siegingArmy.getCurrentLocation());
				cityView1.setVisible(true);
 				city1Name.setText(siegingArmy.getCurrentLocation());
 				main.setVisible(false);
			}
		} catch (FriendlyFireException e1) {
			// TODO Auto-generated catch block
			//e1.printStackTrace();
			if (e1 instanceof FriendlyFireException) {
				JFrame f=new JFrame();   
				JOptionPane.showMessageDialog(f,"you are trying to attack a friendly army");
			}
		}
    }
    if(e.getSource()==attack1) {
    	try {
     		int soldierAttack;
     		int soliderDefend;
     		logPanel.setVisible(true);
 			
 			if(attack2==true) {
 				soldierAttack=tempAttack.getCurrentSoldierCount();
 	    		soliderDefend=tempDefend.getCurrentSoldierCount();
 				tempAttack.attack(tempDefend);
 				soldierAttackafter=soldierAttack-tempAttack.getCurrentSoldierCount();
 	    		soliderDefendafter= soliderDefend - tempDefend.getCurrentSoldierCount();
 				attackingDifference.setText(" " +soldierAttackafter);
 				defendingDifference.setText(" " +soliderDefendafter);
 				attack2=false;
 				defend1=true;
 			}else if (defend1==true) {
 				Random rand= new Random();
 				int x=rand.nextInt(siegingArmy.getUnits().size());
 				int y=rand.nextInt(opponentArmy.getUnits().size());
 				tempAttack=opponentArmy.getUnits().get(y);
 				tempDefend=siegingArmy.getUnits().get(x);
 				soldierAttack=tempAttack.getCurrentSoldierCount();
 	    		soliderDefend=tempDefend.getCurrentSoldierCount();
 				tempAttack.attack(tempDefend);
 				soldierAttackafter=soldierAttack-tempAttack.getCurrentSoldierCount();
 	    		soliderDefendafter= soliderDefend - tempDefend.getCurrentSoldierCount();
 				attack2=true;
 				defend1=false;
 				
 				attackingDifference.setText(" " +soliderDefendafter);
 				defendingDifference.setText(" " +soldierAttackafter);
 			}
 			
     		turnCountText.setText((++countAttack) +"");
     		 battlePanel(siegingArmy,attackinArmyPanel);
    		 battlePanel1(opponentArmy,defendingArmyPanel);
    		 fillLogPanel(tempAttack, tempDefend);
    		 refreshLogPanel(log);
    		 
    		 if(siegingArmy.getUnits().size()==0)
    		 {
    			 JFrame f= new JFrame();
 				JOptionPane.showMessageDialog(f,"YOU LOST THE BATTLE",
 					    "A plain message",
 					    JOptionPane.PLAIN_MESSAGE);
 				logPanel.setVisible(false);
 				main.setVisible(false);
 				
 				
    		 }
    		 if(opponentArmy.getUnits().size()==0)
    		 {
    			
    			 JFrame f= new JFrame();
 				JOptionPane.showMessageDialog(f,"YOU WON THE BATTLE",
 					    "A plain message",
 					    JOptionPane.PLAIN_MESSAGE);
 				game.occupy(siegingArmy, siegingArmy.getCurrentLocation());
 				cityView1.setVisible(true);
 				city1Name.setText(siegingArmy.getCurrentLocation());
 			
    		 }
		} catch (FriendlyFireException e1) {
			// TODO Auto-generated catch block
			//e1.printStackTrace();
			if (e1 instanceof FriendlyFireException) {
				JFrame f=new JFrame();   
				JOptionPane.showMessageDialog(f,"you are trying to attack a friendly army");
			}
		}
    }
    if (e.getSource()==laySiege) {
    	City city=null;
    	for (int i=0;i<game.getAvailableCities().size();i++) {
    		if (siegingArmy.getCurrentLocation().equals(game.getAvailableCities().get(i).getName())) {
    			System.out.println(siegingArmy.getCurrentLocation());
    			city=game.getAvailableCities().get(i);
    		}
    	}
		try {
			game.getPlayer().laySiege(siegingArmy,city);
			fillControlledMarching(marchingMenu);
			fillControlledBesieging(besiegingMenu);
		} catch (TargetNotReachedException | FriendlyCityException e1) {
			// TODO Auto-generated catch block
			//e1.printStackTrace();
			if (e1 instanceof FriendlyCityException) {
				JFrame f=new JFrame();   
				JOptionPane.showMessageDialog(f,"you are trying to attack a friendly city");
			}
			else if (e1 instanceof TargetNotReachedException) {
				JFrame f=new JFrame();   
				JOptionPane.showMessageDialog(f,"target not reached yet");
			}
		}
		main.setVisible(false);
	}
    if (e.getSource()==pressArcher1) 
    {
    	JFrame f=new JFrame();   
	    String from=JOptionPane.showInputDialog(f,"Choose your Archer Number from defending Army's Units :"); 
	    String to = JOptionPane.showInputDialog(f,"Choose your destinated Army from the Idle Armies :"); 
	    for (int i=0;i<game.getPlayer().getControlledCities().get(0).getDefendingArmy().getUnits().size();i++) 
	    {
	    	Unit u= game.getPlayer().getControlledCities().get(0).getDefendingArmy().getUnits().get(i);
	    	if (u instanceof Archer) 
	    	{
	    		if (u.getCount()==((Integer.parseInt(from))-1)) {
	    			for (int j=0;j<game.getPlayer().getControlledArmies().size();j++) {
	    				Army army= game.getPlayer().getControlledArmies().get(j);
	    				//System.out.println(army.getCount());
	    				if (army.getCount()==((Integer.parseInt(to)))) {
	    					try {
								army.relocateUnit(u);
								loadArmyMenu(defendingarmyUnitsName,game.getPlayer().getControlledCities().get(0).getDefendingArmy());
								fillArmiesUnits(armyMenu);
								ArcherMenu.remove(i);
					    		defendingArmyArchers.remove(i);
					    		//System.out.println("gubjb");
							} catch (MaxCapacityException e1) {
								if(e1 instanceof MaxCapacityException)
								{
									JFrame f1=new JFrame();   
							         JOptionPane.showMessageDialog(f1,"Max Capacity of Units reached");
								}
								//e1.printStackTrace();
							}
	    				}
	    			}
	    		}
	    	}
	    }
    }
    if (e.getSource()==gameView.getCityView().getPressArcher1()) 
    {
    	JFrame f=new JFrame();   
	    String from=JOptionPane.showInputDialog(f,"Choose your Archer Number from defending Army's Units :"); 
	    String to = JOptionPane.showInputDialog(f,"Choose your destinated Army from the Idle Armies :"); 
	    for (int i=0;i<game.getPlayer().getControlledCities().get(1).getDefendingArmy().getUnits().size();i++) 
	    {
	    	Unit u= game.getPlayer().getControlledCities().get(1).getDefendingArmy().getUnits().get(i);
	    	if (u instanceof Archer) 
	    	{
	    		if (u.getCount()==((Integer.parseInt(from))-1)) {
	    			for (int j=0;j<game.getPlayer().getControlledArmies().size();j++) {
	    				Army army= game.getPlayer().getControlledArmies().get(j);
	    				//System.out.println(army.getCount());
	    				if (army.getCount()==((Integer.parseInt(to)))) {
	    					try {
								army.relocateUnit(u);
								loadArmyMenu(defendingarmyUnitsName,game.getPlayer().getControlledCities().get(1).getDefendingArmy());
								fillArmiesUnits(armyMenu);
								ArcherMenu.remove(i);
					    		defendingArmyArchers.remove(i);
					    		//System.out.println("gubjb");
							} catch (MaxCapacityException e1) {
								if(e1 instanceof MaxCapacityException)
								{
									JFrame f1=new JFrame();   
							         JOptionPane.showMessageDialog(f1,"Max Capacity of Units reached");
								}
								//e1.printStackTrace();
							}
	    				}
	    			}
	    		}
	    	}
	    }
    }
    if (e.getSource()==gameView.getCityViewConquered2().getPressArcher1()) 
    {
    	JFrame f=new JFrame();   
	    String from=JOptionPane.showInputDialog(f,"Choose your Archer Number from defending Army's Units :"); 
	    String to = JOptionPane.showInputDialog(f,"Choose your destinated Army from the Idle Armies :"); 
	    for (int i=0;i<game.getPlayer().getControlledCities().get(2).getDefendingArmy().getUnits().size();i++) 
	    {
	    	Unit u= game.getPlayer().getControlledCities().get(2).getDefendingArmy().getUnits().get(i);
	    	if (u instanceof Archer) 
	    	{
	    		if (u.getCount()==((Integer.parseInt(from))-1)) {
	    			for (int j=0;j<game.getPlayer().getControlledArmies().size();j++) {
	    				Army army= game.getPlayer().getControlledArmies().get(j);
	    				//System.out.println(army.getCount());
	    				if (army.getCount()==((Integer.parseInt(to)))) {
	    					try {
								army.relocateUnit(u);
								loadArmyMenu(defendingarmyUnitsName,game.getPlayer().getControlledCities().get(2).getDefendingArmy());
								fillArmiesUnits(armyMenu);
								ArcherMenu.remove(i);
					    		defendingArmyArchers.remove(i);
					    		//System.out.println("gubjb");
							} catch (MaxCapacityException e1) {
								if(e1 instanceof MaxCapacityException)
								{
									JFrame f1=new JFrame();   
							         JOptionPane.showMessageDialog(f1,"Max Capacity of Units reached");
								}
								//e1.printStackTrace();
							}
	    				}
	    			}
	    		}
	    	}
	    }
    }
    if (e.getSource()==pressCavalry1) {
    	JFrame f=new JFrame();   
	    String from=JOptionPane.showInputDialog(f,"Choose your Cavalry Number from defending Army's Units :"); 
	    String to = JOptionPane.showInputDialog(f,"Choose your destinated Army from the Idle Armies :"); 
	    for (int i=0;i<game.getPlayer().getControlledCities().get(0).getDefendingArmy().getUnits().size();i++) 
	    {
	    	Unit u= game.getPlayer().getControlledCities().get(0).getDefendingArmy().getUnits().get(i);
	    	if (u instanceof Cavalry) 
	    	{
	    		if (u.getCount()==((Integer.parseInt(from))-1)) {
	    			for (int j=0;j<game.getPlayer().getControlledArmies().size();j++) {
	    				Army army= game.getPlayer().getControlledArmies().get(j);
	    				System.out.println(army.getCount());
	    				if (army.getCount()==((Integer.parseInt(to)))) {
	    					try {
								army.relocateUnit(u);
								loadArmyMenu(defendingarmyUnitsName,game.getPlayer().getControlledCities().get(0).getDefendingArmy());
								fillArmiesUnits(armyMenu);
								cavalryMenu.remove(i);
					    		defendingArmyCavalries.remove(i);
					    		//System.out.println("gubjb");
							} catch (MaxCapacityException e1) 
	    					{
								if(e1 instanceof MaxCapacityException)
								{
									JFrame f1=new JFrame();   
							         JOptionPane.showMessageDialog(f1,"Max Capacity of Units reached");
								}
								//e1.printStackTrace();
							}
	    				}
	    			}
	    		}
	    	}
	    }
    }
    if (e.getSource()==gameView.getCityView().getPressInfantry1()) {
    	JFrame f=new JFrame();   
	    String from=JOptionPane.showInputDialog(f,"Choose your Cavalry Number from defending Army's Units :"); 
	    String to = JOptionPane.showInputDialog(f,"Choose your destinated Army from the Idle Armies :"); 
	    for (int i=0;i<game.getPlayer().getControlledCities().get(1).getDefendingArmy().getUnits().size();i++) 
	    {
	    	Unit u= game.getPlayer().getControlledCities().get(1).getDefendingArmy().getUnits().get(i);
	    	if (u instanceof Cavalry) 
	    	{
	    		if (u.getCount()==((Integer.parseInt(from))-1)) {
	    			for (int j=0;j<game.getPlayer().getControlledArmies().size();j++) {
	    				Army army= game.getPlayer().getControlledArmies().get(j);
	    				System.out.println(army.getCount());
	    				if (army.getCount()==((Integer.parseInt(to)))) {
	    					try {
								army.relocateUnit(u);
								loadArmyMenu(defendingarmyUnitsName,game.getPlayer().getControlledCities().get(1).getDefendingArmy());
								fillArmiesUnits(armyMenu);
								cavalryMenu.remove(i);
					    		defendingArmyCavalries.remove(i);
					    		//System.out.println("gubjb");
							} catch (MaxCapacityException e1) 
	    					{
								if(e1 instanceof MaxCapacityException)
								{
									JFrame f1=new JFrame();   
							         JOptionPane.showMessageDialog(f1,"Max Capacity of Units reached");
								}
								//e1.printStackTrace();
							}
	    				}
	    			}
	    		}
	    	}
	    }
    }
    if (e.getSource()==gameView.getCityViewConquered2().getPressCavalry1()) {
    	JFrame f=new JFrame();   
	    String from=JOptionPane.showInputDialog(f,"Choose your Cavalry Number from defending Army's Units :"); 
	    String to = JOptionPane.showInputDialog(f,"Choose your destinated Army from the Idle Armies :"); 
	    for (int i=0;i<game.getPlayer().getControlledCities().get(2).getDefendingArmy().getUnits().size();i++) 
	    {
	    	Unit u= game.getPlayer().getControlledCities().get(2).getDefendingArmy().getUnits().get(i);
	    	if (u instanceof Cavalry) 
	    	{
	    		if (u.getCount()==((Integer.parseInt(from))-1)) {
	    			for (int j=0;j<game.getPlayer().getControlledArmies().size();j++) {
	    				Army army= game.getPlayer().getControlledArmies().get(j);
	    				System.out.println(army.getCount());
	    				if (army.getCount()==((Integer.parseInt(to)))) {
	    					try {
								army.relocateUnit(u);
								loadArmyMenu(defendingarmyUnitsName,game.getPlayer().getControlledCities().get(2).getDefendingArmy());
								fillArmiesUnits(armyMenu);
								cavalryMenu.remove(i);
					    		defendingArmyCavalries.remove(i);
					    		//System.out.println("gubjb");
							} catch (MaxCapacityException e1) 
	    					{
								if(e1 instanceof MaxCapacityException)
								{
									JFrame f1=new JFrame();   
							         JOptionPane.showMessageDialog(f1,"Max Capacity of Units reached");
								}
								//e1.printStackTrace();
							}
	    				}
	    			}
	    		}
	    	}
	    }
    }
    if (e.getSource()==pressInfantry1) {
    	JFrame f=new JFrame();   
	    String from=JOptionPane.showInputDialog(f,"Choose your Infantry Number from defending Army's Units :"); 
	    String to = JOptionPane.showInputDialog(f,"Choose your destinated Army from the Idle Armies :"); 
	    for (int i=0;i<game.getPlayer().getControlledCities().get(0).getDefendingArmy().getUnits().size();i++) 
	    {
	    	Unit u= game.getPlayer().getControlledCities().get(0).getDefendingArmy().getUnits().get(i);
	    	if (u instanceof Infantry) 
	    	{
	    		if (u.getCount()==((Integer.parseInt(from))-1)) 
	    		{
	    			for (int j=0;j<game.getPlayer().getControlledArmies().size();j++) 
	    			{
	    				Army army= game.getPlayer().getControlledArmies().get(j);
	    				System.out.println(army.getCount());
	    				if (army.getCount()==((Integer.parseInt(to)))) 
	    				{
	    					try {
								army.relocateUnit(u);
								loadArmyMenu(defendingarmyUnitsName,game.getPlayer().getControlledCities().get(0).getDefendingArmy());
								fillArmiesUnits(armyMenu);
								InfantryMenu.remove(i);
					    		defendingArmyInfantries.remove(i);
					    		//System.out.println("gubjb");
							} catch (MaxCapacityException e1) 
	    					{
								if(e1 instanceof MaxCapacityException)
								{
									JFrame f1=new JFrame();   
							         JOptionPane.showMessageDialog(f1,"Max Capacity of Units reached");
								}
								//e1.printStackTrace();
							}
	    				}
	    			}
	    		}
	    	}
	    }
	    
	    
    }
    if (e.getSource()==gameView.getCityView().getPressInfantry1()) {
    	JFrame f=new JFrame();   
	    String from=JOptionPane.showInputDialog(f,"Choose your Infantry Number from defending Army's Units :"); 
	    String to = JOptionPane.showInputDialog(f,"Choose your destinated Army from the Idle Armies :"); 
	    for (int i=0;i<game.getPlayer().getControlledCities().get(1).getDefendingArmy().getUnits().size();i++) 
	    {
	    	Unit u= game.getPlayer().getControlledCities().get(1).getDefendingArmy().getUnits().get(i);
	    	if (u instanceof Infantry) 
	    	{
	    		if (u.getCount()==((Integer.parseInt(from))-1)) 
	    		{
	    			for (int j=0;j<game.getPlayer().getControlledArmies().size();j++) 
	    			{
	    				Army army= game.getPlayer().getControlledArmies().get(j);
	    				System.out.println(army.getCount());
	    				if (army.getCount()==((Integer.parseInt(to)))) 
	    				{
	    					try {
								army.relocateUnit(u);
								loadArmyMenu(defendingarmyUnitsName,game.getPlayer().getControlledCities().get(1).getDefendingArmy());
								fillArmiesUnits(armyMenu);
								InfantryMenu.remove(i);
					    		defendingArmyInfantries.remove(i);
					    		//System.out.println("gubjb");
							} catch (MaxCapacityException e1) 
	    					{
								if(e1 instanceof MaxCapacityException)
								{
									JFrame f1=new JFrame();   
							         JOptionPane.showMessageDialog(f1,"Max Capacity of Units reached");
								}
								//e1.printStackTrace();
							}
	    				}
	    			}
	    		}
	    	}
	    }
	    
	    
    }
    if (e.getSource()==gameView.getCityViewConquered2().getPressInfantry1()) {
    	JFrame f=new JFrame();   
	    String from=JOptionPane.showInputDialog(f,"Choose your Infantry Number from defending Army's Units :"); 
	    String to = JOptionPane.showInputDialog(f,"Choose your destinated Army from the Idle Armies :"); 
	    for (int i=0;i<game.getPlayer().getControlledCities().get(2).getDefendingArmy().getUnits().size();i++) 
	    {
	    	Unit u= game.getPlayer().getControlledCities().get(2).getDefendingArmy().getUnits().get(i);
	    	if (u instanceof Infantry) 
	    	{
	    		if (u.getCount()==((Integer.parseInt(from))-1)) 
	    		{
	    			for (int j=0;j<game.getPlayer().getControlledArmies().size();j++) 
	    			{
	    				Army army= game.getPlayer().getControlledArmies().get(j);
	    				System.out.println(army.getCount());
	    				if (army.getCount()==((Integer.parseInt(to)))) 
	    				{
	    					try {
								army.relocateUnit(u);
								loadArmyMenu(defendingarmyUnitsName,game.getPlayer().getControlledCities().get(2).getDefendingArmy());
								fillArmiesUnits(armyMenu);
								InfantryMenu.remove(i);
					    		defendingArmyInfantries.remove(i);
					    		//System.out.println("gubjb");
							} catch (MaxCapacityException e1) 
	    					{
								if(e1 instanceof MaxCapacityException)
								{
									JFrame f1=new JFrame();   
							         JOptionPane.showMessageDialog(f1,"Max Capacity of Units reached");
								}
								//e1.printStackTrace();
							}
	    				}
	    			}
	    		}
	    	}
	    }
	    
	    
    }
    
    
    
    
    
    
    
}
	public Main getMain() {
		return main;
	}
	public void setMain(Main main) {
		this.main = main;
	}
}