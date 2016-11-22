


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
            
