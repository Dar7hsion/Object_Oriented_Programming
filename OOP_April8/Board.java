import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Board extends JPanel implements ActionListener
{
	
	private final int WIDTH = 800; //final = all caps
	private final int HEIGHT = 400;
	private final int INITIAL_X = 1;
	private final int INITIAL_Y = 1;
	private final int DELAY = 25;
	
	private final int BOXWIDTH = 50;
	private final int BOXHEIGHT = 50;
	private int velocity_X = 2;
	private int velocity_Y = 2;
	
	private Timer timer;
	private int x, y;
	
	public Board()
	{
		initBoard();
	}
	
	private void initBoard()
	{
		setBackground(Color.black);
		setPreferredSize(new Dimension(WIDTH, HEIGHT));
		
		x = INITIAL_X;
		y = INITIAL_Y;
		
		timer = new Timer(DELAY, this);
		timer.start();
	}
	
	public void drawBox(Graphics g)
	{
		g.setColor(Color.blue);
		g.fillRect(x, y, BOXWIDTH, BOXHEIGHT);
	}
	
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		drawBox(g);
		
	}
	//try to make the cube instead of bounce around, have it snake across the screen
	@Override
	public void actionPerformed(ActionEvent e) // what happens each frame
	{
//		x += velocity_X;
//		y += velocity_Y;
//		
//		if((y>HEIGHT-BOXHEIGHT) || y<0)
//		{
//			velocity_Y *=-1;
//		}
//		
//		if((x>WIDTH-BOXWIDTH) || x<0)
//		{
//			velocity_X *= -1;
//		}
		
		x = x=velocity_X;
		if(x>WIDTH-BOXWIDTH || x,0)
		{
			y = 
		}
		repaint();
	}

}
