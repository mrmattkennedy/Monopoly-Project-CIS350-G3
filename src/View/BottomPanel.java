package View;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class BottomPanel extends JPanel {
	
	private JButton menu;
	private JButton build;
	private JButton sell;
	private JButton mortgage;
	private JButton trade;
	int x;

	private GamePanel parent;

	
	public BottomPanel(GamePanel parent) {
		x = 0;
		setLayout(new FlowLayout());
		setSize(700, 100);
		this.parent = parent;

		
		menu = new JButton("Menu");
		build = new JButton("Build");
		sell = new JButton("Sell");
		mortgage = new JButton("Mortgage");
		trade = new JButton("Trade");

		add(menu);
		add(build);
		add(sell);
		add(mortgage);
		add(trade);
	}
}
