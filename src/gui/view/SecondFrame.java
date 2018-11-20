package gui.view;

import javax.swing.JFrame;
import gui.controller.GUIController;

public class SecondFrame extends JFrame
{
	private GUIController appController;
	private SecondPanel appPanel;
	
	public SecondFrame(GUIController appController)
	{
		super();
		
		this.appController = appController;
		this.appPanel = new SecondPanel(appController);
		
		
	}
	
	public void setupFrame()
	{
		this.setContentPane(appPanel);
		this.setSize(420,420);
		this.setTitle("This is a frame");
		this.setResizable(true);
		this.setVisible(true);
	}

}
