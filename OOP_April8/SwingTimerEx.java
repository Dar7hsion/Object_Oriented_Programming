import java.awt.EventQueue;
import javax.swing.JFrame;
public class SwingTimerEx extends JFrame
{
	public SwingTimerEx() 
	{
		init();
	}
	
	public void init()
	{
		add(new Board());
		
		setResizable(false);
		pack();
		
		setTitle("ScreenSaver");
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}

	public static void main(String[] args) 
	{
		EventQueue.invokeLater(() ->
		{
			SwingTimerEx ex = new SwingTimerEx();
			ex.setVisible(true);
		});
	}

}
