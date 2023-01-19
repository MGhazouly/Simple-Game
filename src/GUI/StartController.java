package GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import engine.City;
import engine.Game;
import exceptions.NotEnoughGoldException;

public class StartController implements ActionListener
{

	private StartMapView startMapView;
	private StartView startView;
	private GameView gameView;
	private MapView mapView;
	//private CityView cityView;
	String playerName;
	private JPanel cityPanel;
	String cityName;
	Game game;
	private JButton startButton;
	private JButton spartaButton;
	private JButton cairoButton;
	private JButton romeButton;
	private JTextArea playerCity1;
	private EndGameView endGameView;
	City Cairo;
	City Rome;
	City Sparta;
	boolean flag = false;

	

	
	public StartController()
	{
		
		 startView = new StartView();
		// endGameView= new EndGameView();
		
		 startMapView = new StartMapView();
		 //playerCity1 = new JTextArea();
		 gameView = new GameView();
		//mapView = new MapView();
		 
		
		 
		  Cairo =  new City("Cairo");
		  Rome = new City("Rome");
		  Sparta = new City("Sparta");
		 
		 
		 startButton = startView.getButton();
		 startButton.addActionListener(this);
		 
		 spartaButton = startMapView.getButton();
		 spartaButton.addActionListener(this);
		 
		 cairoButton = startMapView.getButton1();
		 cairoButton.addActionListener(this);
		 
		 romeButton = startMapView.getButton2();
		 romeButton.addActionListener(this);
		 
		 
		
		
		 
		 
	}
	
	
	
	public static void main(String [] args) throws IOException
	{
		new StartController();
		
		
		
	}

	
	
	public void actionPerformed(ActionEvent e)
	{
		flag = false;
		if(e.getSource()==startView.getButton())
		{
			if(!(startView.getPlayerName().getText().equals(""))) 
			{
				startView.setVisible(false);
				 playerName=startView.getPlayerName().getText();
				startMapView.setVisible(true);
			}
		}
	
		if(e.getSource()==startMapView.getButton())
		{
			cityName = "Sparta";
			startMapView.setVisible(false);
	
			try {
				 game = new Game(playerName,cityName);
				 new Controller(game);
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
			
		if(e.getSource()==cairoButton)
		{
			cityName = "Cairo";
			startMapView.setVisible(false);
	
			try {
				 game = new Game(playerName,cityName);
				 new Controller(game);
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			
		}
		if(e.getSource()==romeButton)
		{
			cityName = "Rome";
			startMapView.setVisible(false);
	
			try {
				 game = new Game(playerName,cityName);
				 new Controller(game);
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
	
		
	
		
		
}
	
}

