package gui.controller;

import gui.model.Dog;
import gui.view.SecondFrame;

public class GUIController
{
	private Dog jasper;
	private SecondFrame appFrame;
	
	public GUIController()
	{
		jasper = new Dog();
		appFrame = new SecondFrame(this);
	}
	
	
	public void start()
	{
		
	}

}
