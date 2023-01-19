package GUI;
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import units.Army;
import units.Unit;
public class BattlePanel extends JPanel {
	

		private JTextArea attackingArmyText;
		private JTextArea defendingArmyText;
		private JTextArea battleViewText;
		private JTextArea turnCountText;
		private JPanel defendingArmyPanel;
		private JPanel attackingArmyPanel;
		
		private JButton attackButton;
		private JTextArea defendingDifference;
		private JTextArea attackingDifference;
		
		
		
		

		public BattlePanel()
		{
			setLayout(null);
		
			this.setVisible(true);
			//this.setBackground(Color.red);
		
			
			attackingArmyText = new JTextArea("Attacking Army");
			defendingArmyText = new JTextArea("Defending Army");
			defendingArmyText.setEditable(false);
			attackingArmyText.setBounds(0, 11, 80, 20);
			add(attackingArmyText);
			defendingArmyText.setBounds(270, 11, 85, 20);
			add(defendingArmyText);
			
			battleViewText = new JTextArea("BattleView");
			battleViewText.setBounds(140, 11, 60, 20);
			battleViewText.setEditable(false);
			add(battleViewText);
			
			turnCountText =  new JTextArea(" Turn : 0");
			turnCountText.setBounds(142, 49, 71, 20);
			turnCountText.setEditable(false);
			add(turnCountText);
			
			defendingDifference = new JTextArea("0");
			defendingDifference.setBounds(270,41,80,20);
			defendingDifference.setEditable(false);
			add(defendingDifference);
			
			attackingDifference = new JTextArea("0");
			attackingDifference.setBounds(1,41,80,20);
			attackingDifference.setEditable(false);
			add(attackingDifference);
			
			
			
			defendingArmyPanel = new JPanel();
			defendingArmyPanel.setBounds(250, 80, 240, 300);
			defendingArmyPanel.setLayout(new GridLayout(0,2));
			defendingArmyPanel.setOpaque(false);
			//defendingArmyPanel.setBackground(Color.BLUE);
			
			add(defendingArmyPanel);
			
			//JButton khara = new JButton("fsds");
			//defendingArmyPanel.add(khara);
			
			
			
			attackingArmyPanel=new JPanel();
			attackingArmyPanel.setBounds(0, 80, 220, 320);
			attackingArmyPanel.setLayout(new GridLayout(0,2));
			//attackingArmyPanel.setBackground(Color.green);
			
			add(attackingArmyPanel);
			
			this.revalidate();
			this.repaint();
			
			
			
		}
		public JTextArea getDefendingDifference() {
			return defendingDifference;
		}
		public void setDefendingDifference(JTextArea defendingDifference) {
			this.defendingDifference = defendingDifference;
		}
		public JTextArea getAttackingDifference() {
			return attackingDifference;
		}
		public void setAttackingDifference(JTextArea attackingDifference) {
			this.attackingDifference = attackingDifference;
		}
		public void battlePanel(Army army, JPanel panel) {
			int count=0;
			for(int j=0;j<army.getUnits().size();j++) {
				Unit unit=army.getUnits().get(j);
				unit.setCount(++count);
			}
			for(int i=0;i<army.getUnits().size();i++) {
				Unit unit=army.getUnits().get(i);
				
				JButton button=new JButton("Unit count "+unit.getCount()+" Unit Level"+unit.getLevel()+"Soldier Count:"+ unit.getCurrentSoldierCount()+ "Maximum soldier Count" + unit.getMaxSoldierCount());
				panel.add(button);
			}
			
		}



		public JTextArea getAttackingArmyText() {
			return attackingArmyText;
		}




		public void setAttackingArmyText(JTextArea attackingArmyText) {
			this.attackingArmyText = attackingArmyText;
		}




		public JTextArea getDefendingArmyText() {
			return defendingArmyText;
		}




		public void setDefendingArmyText(JTextArea defendingArmyText) {
			this.defendingArmyText = defendingArmyText;
		}




		public JTextArea getBattleViewText() {
			return battleViewText;
		}




		public void setBattleViewText(JTextArea battleViewText) {
			this.battleViewText = battleViewText;
		}




		public JTextArea getTurnCountText() {
			return turnCountText;
		}




		public void setTurnCountText(JTextArea turnCountText) {
			this.turnCountText = turnCountText;
		}




		public JPanel getDefendingArmyPanel() {
			return defendingArmyPanel;
		}




		public void setDefendingArmyPanel(JPanel defendingArmyPanel) {
			this.defendingArmyPanel = defendingArmyPanel;
		}




		public JPanel getAttackingArmyPanel() {
			return attackingArmyPanel;
		}




		public void setAttackingArmyPanel(JPanel attackingArmyPanel) {
			this.attackingArmyPanel = attackingArmyPanel;
		}




		public JButton getAttackButton() {
			return attackButton;
		}




		public void setAttackButton(JButton attackButton) {
			this.attackButton = attackButton;
		}
		
	
}

