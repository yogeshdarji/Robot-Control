


import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class RobotMethods extends JPanel implements ActionListener, KeyListener 
        {
    Timer tm = new Timer(5,this);
    static int x=0,y = 0, velX = 0, velY = 0;
    
    
    public RobotMethods()
    {
        tm.start();
        addKeyListener(this);
        setFocusable(true);
        setFocusTraversalKeysEnabled(false);
        
    }
    
    public void actionPerformed(ActionEvent e)
    {
        x = x+ velX;
        y = y + velY;
          repaint();
          
          
    }
    
    public static void upPressed()
            
    {
     x++;
    }
            
    public void keyPressed(KeyEvent e)
    {
        int c = e.getKeyCode();
        
        if (c == KeyEvent.VK_LEFT)
        {
            velX = -1;
            velY = 0;
        }
        
        if(c == KeyEvent.VK_UP)
        {
            velX = 0;
            velY = -1;
        }
            
            if(c == KeyEvent.VK_RIGHT)
        {
            velX = 1;
            velY = 0;
        }
            
            if(c == KeyEvent.VK_DOWN)
        {
            velX = 0;
            velY = 1;
        }
        
        
    }
    
    
    public void keyTyped(KeyEvent e){
        
    }
    
    public void keyReleased(KeyEvent e)
    {
    }
    
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
       // g.setColor(Color.BLUE);
      //  g.fillRect(x, y, 50, 30);    
        
    }
            
            
            
//    public static void main(String[] args) {
//     
//// TODO code application logic here
//
//RobotMethods d = new RobotMethods();
//JFrame jf = new JFrame();
//jf.setTitle("Demos");
//jf.setSize(600, 500);
//jf.setVisible(true);
////jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//jf.add(d);
//
//    }
    
}


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.AbstractAction;
import javax.swing.ActionMap;
import javax.swing.InputMap;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.KeyStroke;
import javax.swing.Timer;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/*
public class JavaApplication4 {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Train Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 400);
        frame.setLocationRelativeTo(null);
        frame.add(new TrainCanvas());
        frame.setVisible(true);
    }

}

class TrainCanvas extends JComponent {

    private int lastX = 0;

    public TrainCanvas() {
        Thread animationThread = new Thread(new Runnable() {
            public void run() {
                while (true) {
                    repaint();
                    try {Thread.sleep(10);} catch (Exception ex) {}
                }
            }
        });

        animationThread.start();
    }

    public void paintComponent(Graphics g) {
        Graphics2D gg = (Graphics2D) g;

        int w = getWidth();
        int h = getHeight();

        int trainW = 100;
        int trainH = 10;
        int trainSpeed = 3;

        int x = lastX + trainSpeed;

        if (x > w + trainW) {
            x = -trainW;
        }

        gg.setColor(Color.BLACK);
        gg.fillRect(x, h/2 + trainH, trainW, trainH);

        lastX = x;
    }

}

*/

/*
import java.awt.BasicStroke;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.RenderingHints;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.AbstractAction;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.KeyStroke;


public class RobotMethods extends JPanel {

    private MouseHandler mouseHandler = new MouseHandler();
    private Point p1 = new Point(100, 100);
    private Point p2 = new Point(540, 380);
    private boolean drawing;

    public RobotMethods() {
        this.setPreferredSize(new Dimension(100,100));
        this.addMouseListener(mouseHandler);
        this.addMouseMotionListener(mouseHandler);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(Color.blue);
        g2d.setRenderingHint(
            RenderingHints.KEY_ANTIALIASING,
            RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setStroke(new BasicStroke(8,
            BasicStroke.CAP_ROUND, BasicStroke.JOIN_BEVEL));
        g.drawLine(p1.x, p1.y, p2.x, p2.y);
    }

    private class MouseHandler extends MouseAdapter {

        @Override
        public void mousePressed(MouseEvent e) {
            drawing = true;
            p1 = e.getPoint();
            p2 = p1;
            repaint();
        }

        @Override
        public void mouseReleased(MouseEvent e) {
            drawing = false;
            p2 = e.getPoint();
            repaint();
        }

        @Override
        public void mouseDragged(MouseEvent e) {
            if (drawing) {
                p2 = e.getPoint();
                repaint();
            }
        }
    }

    private class ControlPanel extends JPanel {

        private static final int DELTA = 10;

        public ControlPanel() {
            this.add(new MoveButton("\u2190", KeyEvent.VK_LEFT, -DELTA, 0));
            this.add(new MoveButton("\u2191", KeyEvent.VK_UP, 0, -DELTA));
            this.add(new MoveButton("\u2192", KeyEvent.VK_RIGHT, DELTA, 0));
            this.add(new MoveButton("\u2193", KeyEvent.VK_DOWN, 0, DELTA));
            
            
            
        }

        private class MoveButton extends JButton {

            KeyStroke k;
            int dx, dy;

            public MoveButton(String name, int code, final int dx, final int dy) {
                super(name);
                this.k = KeyStroke.getKeyStroke(code, 0);
                this.dx = dx;
                this.dy = dy;
                this.setAction(new AbstractAction(this.getText()) {

                    @Override
                    public void actionPerformed(ActionEvent e) {
                        RobotMethods.this.p1.translate(dx, dy);
                        RobotMethods.this.p2.translate(dx, dy);
                        RobotMethods.this.repaint();
                    }
                });
                ControlPanel.this.getInputMap(
                    WHEN_IN_FOCUSED_WINDOW).put(k, k.toString());
                ControlPanel.this.getActionMap().put(k.toString(), new AbstractAction() {

                    @Override
                    public void actionPerformed(ActionEvent e) {
                        MoveButton.this.doClick();
                    }
                });
            }
        }
    }

    private void display() {
        JFrame f = new JFrame("LinePanel");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.add(this);
        f.add(new ControlPanel(), BorderLayout.SOUTH);
        f.pack();
        f.setLocationRelativeTo(null);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                new RobotMethods().display();
            }
        });
    }
}


*/