package GUI;
	
import java.awt.BorderLayout;
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

public class StartMapView extends JFrame {

	
	JTextArea chooseCity;
	JPanel panel;
	JButton button;
	JButton button1;
	JButton button2;
	JPanel city4;
	JTextArea cityName5;
	JPanel city5 ;
	JPanel city2;
	JTextArea cityName2 ;
	JTextArea cityName4;

		public StartMapView()
		{
			
			this.setSize(800,600);
			//this.setVisible(true);
			this.setLayout(null);
			setPreferredSize(new Dimension(800,600));
			setResizable(false);
			setLocationRelativeTo(null);
			ImageIcon icon20 = new ImageIcon("windowicon.png");
			setIconImage(icon20.getImage());
			
		
			ImageIcon icon0 = new ImageIcon("greenMap.jpg");
			
			JLabel backGroundLabel = new JLabel("",icon0,JLabel.CENTER);
			backGroundLabel.setBounds(0,0,800,600);
		
			
			
			
			
			
			
		
		
			
			
		    city2 = new JPanel();
			city2.setLayout(null);
			city2.setBounds(115, 210, 180, 180);
			city2.setBackground(Color.white);
			city2.setVisible(true);
			city2.setOpaque(false);
			//city2.setBorder(new LineBorder(Color.black));
			
		    cityName2 = new JTextArea("  Sparta");
			cityName2.setBounds(1, 1, 88, 31);
			//cityName2.setBorder(new LineBorder(Color.black));
			//cityName2.setBackground(Color.white);
			cityName2.setPreferredSize(new Dimension(60,24));
			cityName2.setEditable(false);
			cityName2.setOpaque(false);
			cityName2.setFont(cityName2.getFont().deriveFont(18f));
			city2.add(cityName2);
			

			
			JLabel labelCity2=new JLabel();
			labelCity2.setBounds(32, 42, 128, 128);
			ImageIcon icon2 = new ImageIcon("sparaIcon128.png");
			labelCity2.setIcon(icon2);
			city2.add(labelCity2);
			
            button = new JButton("Select");
			button.setBackground(Color.gray);
			button.setBounds(98, 0, 91, 31);
			button.setFont(button.getFont().deriveFont(12f));
			city2.add(button);
			
			
			
			
			
		    city4 = new JPanel();
			city4.setLayout(null);
			city4.setBounds(305, 210, 180, 180);
			city4.setBackground(Color.white);
			city4.setVisible(true);
			city4.setOpaque(false);
			//city4.setBorder(new LineBorder(Color.black));
			
			cityName4 = new JTextArea("  Cairo");
			cityName4.setBounds(1, 1, 88, 31);
			//cityName4.setBorder(new LineBorder(Color.white));
			cityName4.setBackground(Color.white);
			cityName4.setPreferredSize(new Dimension(60,24));
			cityName4.setEditable(false);
			cityName4.setOpaque(false);
			cityName4.setFont(cityName4.getFont().deriveFont(18f));
			city4.add(cityName4);
			

			
			JLabel labelCity4=new JLabel();
			labelCity4.setBounds(32, 42, 128, 128);
			ImageIcon icon4 = new ImageIcon("cairoIcon.png");
			labelCity4.setIcon(icon4);
			city4.add(labelCity4);
			
            button1 = new JButton("Select");
			button1.setBackground(Color.gray);
			button1.setBounds(98, 0, 91, 31);
			button1.setFont(button.getFont().deriveFont(12f));
			city4.add(button1);
			
			
			
		    city5 = new JPanel();
			city5.setLayout(null);
			city5.setBounds(495, 210, 180, 180);
			city5.setBackground(Color.white);
			city5.setVisible(true);
			city5.setOpaque(false);
			//city5.setBorder(new LineBorder(Color.black));
			
			cityName5 = new JTextArea("  Rome");
			cityName5.setBounds(1, 1, 88, 31);
			//cityName5.setBorder(new LineBorder(Color.white));
			cityName5.setBackground(Color.white);
			cityName5.setPreferredSize(new Dimension(60,24));
			cityName5.setEditable(false);
			cityName5.setOpaque(false);
			cityName5.setFont(cityName5.getFont().deriveFont(18f));
			city5.add(cityName5);
			

			
			JLabel labelCity5=new JLabel();
			labelCity5.setBounds(32, 42, 128, 128);
			ImageIcon icon5 = new ImageIcon("rpmeIcon.png");
			labelCity5.setIcon(icon5);
			city5.add(labelCity5);
			
            button2 = new JButton("Select");
			button2.setBackground(Color.gray);
			button2.setBounds(98, 0, 91, 31);
			button2.setFont(button.getFont().deriveFont(12f));
			city5.add(button2);
			
			
		    panel=new JPanel();
			panel.setLayout(null);
			panel.setBounds(115, 50, 560, 150);
			//panel.setBackground(Color.white);
			panel.setVisible(true);
			panel.setOpaque(false);
			//panel.setBorder(new LineBorder(Color.black));
			
			
			
			
			
		   chooseCity=new JTextArea("  CHOOSE YOUR CITY ");
		   chooseCity.setBounds(34, 40, 560, 150);
		   //chooseCity.setBorder(new LineBorder(Color.white));
		   //chooseCity.setBackground(Color.white);
		   chooseCity.setPreferredSize(new Dimension(60,24));
		   chooseCity.setOpaque(false);
		   //chooseCity.setFont(chooseCity.getFont().deriveFont(40f));
		   chooseCity.setFont(new Font(Font.DIALOG_INPUT,Font.PLAIN,40));
		   chooseCity.setEditable(false);
		   panel.add(chooseCity,BorderLayout.CENTER);
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			add(city2);
			add(city4);
			add(city5);
			add(panel);
			add(backGroundLabel);
			
			
			this.repaint();
			this.revalidate();
			
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


		public JPanel getCity4() {
			return city4;
		}


		public void setCity4(JPanel city4) {
			this.city4 = city4;
		}


		public JTextArea getCityName5() {
			return cityName5;
		}


		public void setCityName5(JTextArea cityName5) {
			this.cityName5 = cityName5;
		}


		public JPanel getCity5() {
			return city5;
		}


		public void setCity5(JPanel city5) {
			this.city5 = city5;
		}


		public JPanel getCity2() {
			return city2;
		}


		public void setCity2(JPanel city2) {
			this.city2 = city2;
		}


		public JTextArea getCityName2() {
			return cityName2;
		}


		public void setCityName2(JTextArea cityName2) {
			this.cityName2 = cityName2;
		}


		public JTextArea getCityName4() {
			return cityName4;
		}


		public void setCityName4(JTextArea cityName4) {
			this.cityName4 = cityName4;
		}


		public JTextArea getChooseCity() {
			return chooseCity;
		}


		public void setChooseCity(JTextArea chooseCity) {
			this.chooseCity = chooseCity;
		}


		public JPanel getPanel() {
			return panel;
		}


		public void setPanel(JPanel panel) {
			this.panel = panel;
		}
	


}
