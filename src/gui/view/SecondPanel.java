package gui.view;

import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import gui.controller.GUIController;
import javax.swing.*;// * imports everything at that default level
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SecondPanel extends JPanel
{
	private GUIController appController;
	private JLabel firstLabel;
	private JButton firstButton;
	private SpringLayout appLayout;
	
	public SecondPanel(GUIController appController)
	{
		super();
		this.appController = appController;
		
		//initialize in constructor
		firstLabel = new JLabel("This is a Label");
		firstButton = new JButton("This is a button");
		appLayout = new SpringLayout();
		
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	
	private void changeBackground()
	{
		int red = (int) (Math.random() * 256);
		int green = (int) (Math.random() * 256);
		int blue = (int) (Math.random() * 256);
		
		this.setBackground(new Color(red, green, blue));
	}
	
	
	
	//install components in setupPanel method
	public void setupPanel()
	{
		this.setLayout(appLayout);
		this.add(firstButton);
		this.add(firstLabel);
	}
	
	public void setupLayout()
	{
		appLayout.putConstraint(SpringLayout.NORTH, firstLabel, 70, SpringLayout.NORTH, this);
		appLayout.putConstraint(SpringLayout.EAST, firstLabel, -90, SpringLayout.EAST, this);
		appLayout.putConstraint(SpringLayout.WEST, firstLabel, 175, SpringLayout.WEST, this);
		appLayout.putConstraint(SpringLayout.SOUTH, firstLabel, -135, SpringLayout.SOUTH, this);
	}
	
	public void setupListeners()
	{
		firstButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent mouseClick)
			{
				changeBackground();
			}
		});
	}

}
