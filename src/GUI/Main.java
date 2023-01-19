package GUI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Main extends JFrame {
	private JButton attack;
	private JButton attack1;
	private JButton autoResolve;
	private JButton move;
	private Controller controller;
	private BattlePanel battlePanel;
	private JButton laySiege;
	
	public Main(Controller controller,BattlePanel battlePanel) {
		this.controller=controller;
		this.battlePanel=battlePanel;
		setLayout(null);
		this.setResizable(false);
		this.setSize(500,500);
		this.setVisible(false);
		
	    battlePanel.setBounds(0,90,485,370);
		add(battlePanel);
		attack=new JButton("ATTACK");
		autoResolve=new JButton("AUTORESOLVE");
		move=new JButton("MOVE");
		laySiege=new JButton("LAYSIEGE");
		
		attack1=new JButton("ATTACK Units");
		attack1.setBounds(100,60,80,30);
		attack1.setVisible(false);
		attack1.setFont(attack.getFont().deriveFont(8f));
		
		attack.setBounds(100,60,80,30);
		autoResolve.setBounds(200, 60, 80, 30);
		move.setBounds(300,60,80,30);
		laySiege.setBounds(400, 60, 80, 30);
		
		attack.setFont(attack.getFont().deriveFont(8f));
		autoResolve.setFont(autoResolve.getFont().deriveFont(8f));
		move.setFont(move.getFont().deriveFont(8f));
		laySiege.setFont(laySiege.getFont().deriveFont(8f));
		
		add(attack);
		add(attack1);
		add(autoResolve);
		add(move);
		add(laySiege);
		add(battlePanel);
		
		
	}
	

	public JButton getLaySiege() {
		return laySiege;
	}


	public void setLaySiege(JButton laySiege) {
		this.laySiege = laySiege;
	}


	public JButton getAttack1() {
		return attack1;
	}

	public void setAttack1(JButton attack1) {
		this.attack1 = attack1;
	}

	public JButton getAttack() {
		return attack;
	}

	public JButton getMove() {
		return move;
	}

	public void setMove(JButton move) {
		this.move = move;
	}

	public void setAttack(JButton attack) {
		this.attack = attack;
	}

	public JButton getAutoResolve() {
		return autoResolve;
	}

	public void setAutoResolve(JButton autoResolve) {
		this.autoResolve = autoResolve;
	}

	public Controller getController() {
		return controller;
	}

	public void setController(Controller controller) {
		this.controller = controller;
	}

	public BattlePanel getBattlePanel() {
		return battlePanel;
	}

	public void setBattlePanel(BattlePanel battlePanel) {
		this.battlePanel = battlePanel;
	}
}

