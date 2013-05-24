package model.entities.menu.welcome;


import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.geom.Dimension2D;
import java.awt.geom.Point2D;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.UnsupportedAudioFileException;

import model.entities.Entity;

public class ButtonWater extends Entity
{
	public ButtonWater()
	{
		super();
		position.setLocation(30, 100);
	}
	
	@Override
	public Point2D getRotationPoint()
	{
		// TODO Auto-generated method stub
		return new Point2D.Double(getDimensions().getWidth()/2,getDimensions().getHeight()/2);
	}
	@Override
	public Dimension2D getDimensions()
	{
		// TODO Auto-generated method stub
		return new Dimension(128, 128);
	}
	@Override
	public List<Image> getImages()
	{
		// TODO Auto-generated method stub
		ArrayList<Image> images = new ArrayList<Image>();
		images.add(Toolkit.getDefaultToolkit().getImage("./images/menu/128_dutchFlag.png"));
		return images;
		
	}
	@Override
	public AudioInputStream getSound() throws UnsupportedAudioFileException,
			IOException
	{
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public AudioInputStream getHitSound() throws UnsupportedAudioFileException,
			IOException
	{
		// TODO Auto-generated method stub
		return null;
	}

}