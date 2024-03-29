package model;

import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;

import javax.swing.ImageIcon;

import org.OpenNI.Point3D;
import org.OpenNI.SceneMap;
import org.OpenNI.UserGenerator;

public class User implements Comparable<User>
{
	private int id, score;
	private UserGenerator userGenerator;
	private Point2D head, neck, leftShoulder, rightShoulder, torso, leftElbow, rightElbow, leftHand, rightHand, leftHip, rightHip, leftKnee, rightKnee, leftFoot, rightFoot, midpoint;
	private String name;
	private boolean visible;
	
	private ImageIcon capture;

	private Point3D rightHandWorld;

	public User(int id, UserGenerator userGenerator)
	{
		this.id = id;
		this.userGenerator = userGenerator;
		this.name = null;
		this.visible = true;
	}

	public int getId()
	{
		return id;
	}

	public SceneMap getUserPixels()
	{
		return userGenerator.getUserPixels(id).getData();
	}

	public Point2D getMidpoint()
	{
		return midpoint;
	}

	public Point2D getHead()
	{
		return head;
	}

	public Point2D getNeck()
	{
		return neck;
	}

	public Point2D getLeftShoulder()
	{
		return leftShoulder;
	}

	public Point2D getRightShoulder()
	{
		return rightShoulder;
	}

	public Point2D getTorso()
	{
		return torso;
	}

	public Point2D getLeftElbow()
	{
		return leftElbow;
	}

	public Point2D getRightElbow()
	{
		return rightElbow;
	}

	public Rectangle2D.Double getLeftHand()
	{
		return new Rectangle2D.Double(leftHand.getX() - 10, leftHand.getY() - 10, 20, 20);
	}

	public Rectangle2D.Double getRightHand()
	{
		return new Rectangle2D.Double(rightHand.getX() - 10, rightHand.getY() - 10, 20, 20);
	}

	public Point2D getLeftHip()
	{
		return leftHip;
	}

	public Point2D getRightHip()
	{
		return rightHip;
	}

	public Point2D getLeftKnee()
	{
		return leftKnee;
	}

	public Point2D getRightKnee()
	{
		return rightKnee;
	}

	public Point2D getLeftFoot()
	{
		return leftFoot;
	}

	public Point2D getRightFoot()
	{
		return rightFoot;
	}

	public void setHead(Point2D head)
	{
		this.head = head;
	}

	public void setNeck(Point2D neck)
	{
		this.neck = neck;
	}

	public void setLeftShoulder(Point2D leftShoulder)
	{
		this.leftShoulder = leftShoulder;
	}

	public void setRightShoulder(Point2D rightShoulder)
	{
		this.rightShoulder = rightShoulder;
	}

	public void setTorso(Point2D torso)
	{
		this.torso = torso;
	}

	public void setLeftElbow(Point2D leftElbow)
	{
		this.leftElbow = leftElbow;
	}

	public void setRightElbow(Point2D rightElbow)
	{
		this.rightElbow = rightElbow;
	}

	public void setLeftHand(Point2D leftHand)
	{
		this.leftHand = leftHand;
	}

	public void setRightHand(Point2D rightHand)
	{
		this.rightHand = rightHand;
	}

	public void setLeftHip(Point2D leftHip)
	{
		this.leftHip = leftHip;
	}

	public void setRightHip(Point2D rightHip)
	{
		this.rightHip = rightHip;
	}

	public void setLeftKnee(Point2D leftKnee)
	{
		this.leftKnee = leftKnee;
	}

	public void setRightKnee(Point2D rightKnee)
	{
		this.rightKnee = rightKnee;
	}

	public void setLeftFoot(Point2D leftFoot)
	{
		this.leftFoot = leftFoot;
	}

	public void setRightFoot(Point2D rightFoot)
	{
		this.rightFoot = rightFoot;
	}

	public void setMidpoint(Point2D midpoint)
	{
		this.midpoint = midpoint;
	}

	public Point3D getRightHandWorld()
	{
		return rightHandWorld;
	}

	public void setRightHandWorld(Point3D rightHandWorld)
	{
		this.rightHandWorld = rightHandWorld;
	}

	public int getScore()
	{
		return score;
	}

	public void setScore(int score)
	{
		this.score = score;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public boolean isVisible()
	{
		return visible;
	}

	public void setVisible(boolean visible)
	{
		this.visible = visible;
	}

	@Override
	public int compareTo(User u)
	{
		double ownX = getHead().getX();
		double otherX = u.getHead().getX();
		return (int) (ownX - otherX);
	}

	public ImageIcon getCapture()
	{
		return capture;
	}

	public void setCapture(ImageIcon capture)
	{
		this.capture = capture;
	}

}
