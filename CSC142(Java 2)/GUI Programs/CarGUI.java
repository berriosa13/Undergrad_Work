import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CarGUI {

    private static JFrame window;
    private static JFrame window2;
    private static JPanel panel;

    private static final int WINDOW_DIM = 700;

    static Car c;
    static Graphics g;

    public static void main (String[] args) {
	JButton button;

	window = new JFrame ("Car GUI");
	window.setSize (WINDOW_DIM, WINDOW_DIM);
	window.setVisible(true);
	window.setLayout (new BoxLayout(window.getContentPane(), BoxLayout.Y_AXIS));
	window2 = new JFrame ("Car GUI");
	window2.setSize (WINDOW_DIM, WINDOW_DIM);
	window2.setVisible(true);

	/*panel = new JPanel();
	panel.setPreferredSize (new Dimension(300,300));
	panel.setBorder(BorderFactory.createTitledBorder("Car simulation"));
	window.add(panel);*/

	g = window2.getGraphics();
	//System.out.println (g);

	button = new JButton ("Exit");
        button.addActionListener (new ActionListener() {
                public void actionPerformed (ActionEvent e) {
                    System.exit(0);
                }
            });
	window.add(button);

	button = new JButton ("Show");
        button.addActionListener (new ActionListener() {
                public void actionPerformed (ActionEvent e) {
		    c.paint(g);
                }
            });
	window.add(button);

	button = new JButton ("x++");
        button.addActionListener (new ActionListener() {
                public void actionPerformed (ActionEvent e) {
		    g.clearRect(0,0,WINDOW_DIM,WINDOW_DIM);
		    c.setXPos(c.getXPos()+1);
		    c.paint(g);
                }
            });
	window.add(button);

	button = new JButton ("x--");
        button.addActionListener (new ActionListener() {
                public void actionPerformed (ActionEvent e) {
		    g.clearRect(0,0,WINDOW_DIM,WINDOW_DIM);
		    c.setXPos(c.getXPos()-1);
		    c.paint(g);
                }
            });
	window.add(button);

	button = new JButton ("y++");
        button.addActionListener (new ActionListener() {
                public void actionPerformed (ActionEvent e) {
		    g.clearRect(0,0,WINDOW_DIM,WINDOW_DIM);
		    c.setYPos(c.getYPos()+1);
		    c.paint(g);
                }
            });
	window.add(button);

	button = new JButton ("y--");
        button.addActionListener (new ActionListener() {
                public void actionPerformed (ActionEvent e) {
		    g.clearRect(0,0,WINDOW_DIM,WINDOW_DIM);
		    c.setYPos(c.getYPos()-1);
		    c.paint(g);
                }
            });
	window.add(button);

	button = new JButton ("Run");
        button.addActionListener (new ActionListener() {
                public void actionPerformed (ActionEvent e) {
		    Random random = new Random();
		    int dir = 0;
		    int dist = 0;
		    for ( int i = 0; i < 500; i++ ) {
			try {
			    Thread.sleep(10);
			} catch (Exception ex) {
			}
			if ( dist == 0 ) {
			    dir = random.nextInt(4);
			    dist = random.nextInt(10)+10;
			}
			int x = c.getXPos();
			int y = c.getYPos();
			switch (dir) {
			case 0:
			    x++;
			    break;
			case 1:
			    x--;
			    break;
			case 2:
			    y++;
			    break;
			case 3:
			    y--;
			    break;
			}
			dist--;
			g.clearRect(0,0,WINDOW_DIM,WINDOW_DIM);
			c.setPos(x,y);
			c.paint(g);
		    }
                }
            });
	window.add(button);

	c = new Car ();
	c.setPos (WINDOW_DIM/2,WINDOW_DIM/2);
	c.paint(g);

	window.pack();

    }

}