import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.Timer;

public class Board extends JPanel implements ActionListener
{
	Box b1;
	Box b2;
	Box b3;
	private final int WIDTH = 800;
	private final int HEIGHT = 400;

	private final int DELAY = 25;

	private int i = 0;
	
	private Timer timer;

	
	public Board()
	{
		initBoard();
	}
	
	private void initBoard()
	{
		setBackground(Color.black);
		setPreferredSize(new Dimension(WIDTH, HEIGHT));
		
		b1 = new Box(1, 1, 4, 4, 75, 75);
		b2 = new Box(600, 1, 4, 4, 75, 75);
		b3 = new Box(60, 1, 0, 0, 75, 100);
		
		timer = new Timer(DELAY, this);
		timer.start();
	}
	
	public void drawBox(Graphics g)
	{
		g.setColor(Color.blue);
		g.fillRect(b1.x, b1.y, b1.width, b1.height);
		g.fillRect(b2.x, b2.y, b2.width, b2.height);
		g.fillRect(b3.x, b3.y, b3.width, b3.height);
	}
	
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		drawBox(g);
	}
	//create an set of obstacles for you box, that are stationary
	@Override
	public void actionPerformed(ActionEvent e) 
	{
//		SCREEN SAVER
		b1.moveIt();
		b2.moveIt();
		
		b1.checkBoundHit(HEIGHT, WIDTH);
		b2.checkBoundHit(HEIGHT, WIDTH);
		
		if(b1.checkBoxHit(b2))
			b1.handleBoxHit(b2);
		
		if(b2.checkBoxHit(b1))
		{
			b2.handleBoxHit(b1);
		}
			
		repaint(); 
		
			
	}
	
	
	

}
