
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.util.Random;
import javax.swing.JPanel;
import javax.swing.*;

public class RobotGUI extends javax.swing.JFrame implements ActionListener {

    Timer tm = new Timer(100,this);
    boolean up, left, right, down, armuprobo, armdownrobo,turn;
    int armopen = 0, armclose = 0;
    double radArm=1;
    
  
    
    ImageIcon armDownIcon = new ImageIcon("./CloseClaw11.jpg");
        Image armDownImg = armDownIcon.getImage();
        Image newFarArmDownImg = armDownImg.getScaledInstance(100, 100,  java.awt.Image.SCALE_SMOOTH);
        ImageIcon newFaraDownIcon = new ImageIcon(newFarArmDownImg);
       // lblClaw.setIcon(newFaraDownIcon);
        
        
        
        ImageIcon armUpIcon = new ImageIcon("./OpenClaw11.jpg");
        Image armUpImg = armUpIcon.getImage();
        Image newFarArmUpImg = armUpImg.getScaledInstance(100, 100,  java.awt.Image.SCALE_SMOOTH);
        ImageIcon newFaraUpIcon = new ImageIcon(newFarArmUpImg);
      //  lblClaw.setIcon(newFaraUpIcon);
    
    
    /**
     * Creates new form RobotGUI
     */
    public RobotGUI() {
        initComponents();   
       // setFocusable(true);
       // setFocusTraversalKeysEnabled(false);
    }
    
    

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGrpTemp = new javax.swing.ButtonGroup();
        btnGrpClaw = new javax.swing.ButtonGroup();
        btnLeft = new javax.swing.JButton();
        btnRight = new javax.swing.JButton();
        btnUp = new javax.swing.JButton();
        btnDown = new javax.swing.JButton();
        jSlider1 = new javax.swing.JSlider();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        radC = new javax.swing.JRadioButton();
        radF = new javax.swing.JRadioButton();
        txtTemperature = new javax.swing.JTextField();
        robotMethods1 = new RobotMethods();
        jSlider1.setValue(20);
        obj = new javax.swing.JLabel();
        lblCamImage = new javax.swing.JLabel();
        lblCamLarge = new javax.swing.JLabel();
        btnStop = new javax.swing.JButton();
        btnCamera = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        radOpenClaw = new javax.swing.JRadioButton();
        radCloseClaw = new javax.swing.JRadioButton();
        lblClaw = new javax.swing.JLabel();
        btnTurn = new javax.swing.JButton();
        btnArmUp = new javax.swing.JButton();
        btnArmDown = new javax.swing.JButton();
        btnCameraLarge = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Robot Automation");

        btnLeft.setText("Left");
        btnLeft.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLeftActionPerformed(evt);
            }
        });

        btnRight.setText("Right");
        btnRight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRightActionPerformed(evt);
            }
        });

        btnUp.setText("Up");
        btnUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpActionPerformed(evt);
            }
        });

        btnDown.setText("Down");
        btnDown.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDownActionPerformed(evt);
            }
        });

        jSlider1.setMaximum(20);
        jSlider1.setValue(10);

        jLabel1.setText("Slow");

        jLabel2.setText("Medium");

        jLabel3.setText("Fast");

        jLabel4.setText("Current Temperature");

        btnGrpTemp.add(radC);
        radC.setText("Centigrade");
        radC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radCActionPerformed(evt);
            }
        });

        btnGrpTemp.add(radF);
        radF.setText("Fahrenheit");
        radF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radFActionPerformed(evt);
            }
        });

        robotMethods1.setBackground(new java.awt.Color(204, 204, 255));
        robotMethods1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout robotMethods1Layout = new javax.swing.GroupLayout(robotMethods1);
        robotMethods1.setLayout(robotMethods1Layout);
        robotMethods1Layout.setHorizontalGroup(
            robotMethods1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(robotMethods1Layout.createSequentialGroup()
                .addGap(160, 160, 160)
                .addComponent(obj, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(robotMethods1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblCamImage, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 161, Short.MAX_VALUE)
                .addComponent(lblCamLarge, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        robotMethods1Layout.setVerticalGroup(
            robotMethods1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(robotMethods1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(robotMethods1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCamImage, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCamLarge, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(84, 84, 84)
                .addComponent(obj, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(89, Short.MAX_VALUE))
        );

        btnStop.setText("Stop");
        btnStop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStopActionPerformed(evt);
            }
        });

        btnCamera.setText("Small Image");
        btnCamera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCameraActionPerformed(evt);
            }
        });
        btnCamera.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnCameraKeyPressed(evt);
            }
        });

        jLabel5.setText("CLAW");

        btnGrpClaw.add(radOpenClaw);
        radOpenClaw.setText("Open Claw");
        radOpenClaw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radOpenClawActionPerformed(evt);
            }
        });

        btnGrpClaw.add(radCloseClaw);
        radCloseClaw.setText("Close Claw");
        radCloseClaw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radCloseClawActionPerformed(evt);
            }
        });

        btnTurn.setText("Turn");
        btnTurn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTurnActionPerformed(evt);
            }
        });

        btnArmUp.setText("ARM UP");
        btnArmUp.setPreferredSize(new java.awt.Dimension(89, 23));
        btnArmUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnArmUpActionPerformed(evt);
            }
        });

        btnArmDown.setText("ARM DOWN");
        btnArmDown.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnArmDownActionPerformed(evt);
            }
        });

        btnCameraLarge.setText("Large Image");
        btnCameraLarge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCameraLargeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addComponent(robotMethods1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(84, 84, 84)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnDown, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnLeft, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnStop, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addComponent(btnRight, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnTurn, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(40, 40, 40)
                                .addComponent(jLabel2))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel3)
                                .addComponent(jSlider1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel4)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(radC)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel5)
                                        .addComponent(txtTemperature, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(radOpenClaw)
                                        .addComponent(radCloseClaw))
                                    .addComponent(radF, javax.swing.GroupLayout.Alignment.LEADING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblClaw))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(76, 76, 76)
                                .addComponent(btnArmUp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnArmDown))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(169, 169, 169)
                        .addComponent(btnUp, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addComponent(btnCamera)
                        .addGap(73, 73, 73)
                        .addComponent(btnCameraLarge)))
                .addContainerGap(64, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnCamera)
                    .addComponent(btnCameraLarge))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jSlider1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(34, 34, 34)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(radC)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(radF)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtTemperature, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(radOpenClaw)
                            .addComponent(lblClaw))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radCloseClaw))
                    .addComponent(robotMethods1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addComponent(btnUp)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnStop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnLeft)
                    .addComponent(btnRight)
                    .addComponent(btnTurn)
                    .addComponent(btnArmUp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnArmDown))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDown)
                .addGap(27, 27, 27))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

   //For rotating the robot arm
    
    public void rotate(double radian, JLabel lb,Image imgnew,ImageIcon iconnew)// rotate function is used to turn the robo
  {
      int height = imgnew.getHeight(lb);
      int width = imgnew.getWidth(lb);
      double cos = Math.abs(Math.cos(radian));
      double sin = Math.abs(Math.sin(radian));
      int w = (int)(width * cos + height * sin);
      int h = (int)(width * sin + height * cos);
      BufferedImage bim = new BufferedImage(h, w, BufferedImage.TYPE_INT_RGB);
      Graphics2D g2 = bim.createGraphics();
     // g2.setTransform(g2.getTransform()); 
        g2.setPaint(UIManager.getColor("white"));
        g2.fillRect(0,0,w,h);
        double x = w/2;
        double y = h/2;
       AffineTransform at = AffineTransform.getRotateInstance(radian, x, y);
        x = (w - width)/2;
        y = (h - height)/2;
        at.translate(x, y);
       g2.drawImage(imgnew, at, obj);
        iconnew = new ImageIcon(bim);
       // lb.setBounds(robot.getX(), robot.getY(), width, height);
        lb.setIcon(iconnew);
        //rad++; 
        btnCamera.requestFocus();
        
    }
    
    private void btnDownActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDownActionPerformed
//      int x = obj.getX();
//      int y = obj.getY();
//      int js =   jSlider1.getValue();
//        
//        obj.setBounds(x, y+js, obj.getWidth(), obj.getHeight());
        down=true;
        up=false;
        left=false;
        right=false;
        armuprobo=false;
        armdownrobo=false;
        turn=false;
        tm.start();
        btnCamera.requestFocus();
              
// TODO add your handling code here:
    }//GEN-LAST:event_btnDownActionPerformed

        
    private void radCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radCActionPerformed
 
        Random rn = new Random();
        int answer = rn.nextInt(10) + 1;
        double t;
       
        t = (double)answer;
        double r;
        if(radC.isSelected()){
                 r = ((t * 9)/5)+32;
                 String result = String.format("%.2f",r);
                 txtTemperature.setText(result);
             }
                     // TODO add your handling code here:
    }//GEN-LAST:event_radCActionPerformed

    private void radFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radFActionPerformed

        double t;
        Random rn = new Random();
        int answer = rn.nextInt(150) + 1;
        t = (double)answer;
        double r;
        if(radF.isSelected()){
                r = ((t - 32)*5)/9;
                 String result = String.format("%.2f",r);
                 txtTemperature.setText(result);
             }        
// TODO add your handling code here:
    }//GEN-LAST:event_radFActionPerformed

    //For going up
    private void btnUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpActionPerformed
//        int x = obj.getX();
//        int y = obj.getY();
//        int js =   jSlider1.getValue();
//        obj.setBounds(x, y-js, obj.getWidth(), obj.getHeight());
        down=false;
        up=true;
        left=false;
        right=false;
        armuprobo=false;
        armdownrobo=false;
        turn=false;
        tm.start();     
        
        btnCamera.requestFocus();
// TODO add your handling code here:
    }//GEN-LAST:event_btnUpActionPerformed

    private void radOpenClawActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radOpenClawActionPerformed
        // TODO add your handling code here:
        lblClaw.setIcon(new ImageIcon("./OpenClaw11.jpg"));
        armopen = 1;
        armclose = 0;
        
    }//GEN-LAST:event_radOpenClawActionPerformed

    private void radCloseClawActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radCloseClawActionPerformed

        lblClaw.setIcon(new ImageIcon("./CloseClaw11.jpg"));
         armopen = 0;
        armclose = 1;
        // TODO add your handling code here:
    }//GEN-LAST:event_radCloseClawActionPerformed

    private void btnRightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRightActionPerformed
        // TODO add your handling code here:
  //    int x = obj.getX();
 //int y = obj.getY();
//       int js =   jSlider1.getValue();
//        
  //   obj.setBounds(10, 10, 10, 10);
   //  obj.setBounds(x, y, y, y);
        
        down=false;
        up=false;
        left=false;
        right=true;
        armuprobo=false;
        armdownrobo=false;
        turn=false;
        tm.start();
        btnCamera.requestFocus();
    }//GEN-LAST:event_btnRightActionPerformed

    private void btnLeftActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLeftActionPerformed
        // TODO add your handling code here:
//        int x = obj.getX();
//        int y = obj.getY();
//       int js =   jSlider1.getValue();
//        
//        obj.setBounds(x-js, y, obj.getWidth(), obj.getHeight());
        
        down=false;
        up=false;
        left=true;
        right=false;
        armuprobo=false;
        armdownrobo=false;
        turn=false;
        tm.start();
        btnCamera.requestFocus();
        
    }//GEN-LAST:event_btnLeftActionPerformed

     

    
    public void actionPerformed(ActionEvent e)
{
    ImageIcon arrowIcon = new ImageIcon("./arrow.png");
Image arrowImg = arrowIcon.getImage();
Image newFarImg = arrowImg.getScaledInstance(42, 30,  java.awt.Image.SCALE_SMOOTH);
ImageIcon newFarIcon = new ImageIcon(newFarImg);
obj.setIcon(newFarIcon);

    
    int x=obj.getX();
    int y=obj.getY();
    int i=1;
     int s = jSlider1.getValue();
    if (left)
        if(x>0)
        {
    obj.setBounds(x-s-i, y, obj.getWidth(), obj.getHeight());  
        }
        else
        {
            left = false;
            right = true;
        }
    
    else if (right)
        if(x<340)
        {
    obj.setBounds(x+s+i, y, obj.getWidth(), obj.getHeight());
        }
        else
        {
            right = false;
            left = true;
        }
        
    else if (up)
        if(y>0)
        {
    obj.setBounds(x,y-s-i, obj.getWidth(), obj.getHeight());
        }
        else
        {
            up = false;
            down = true;
        }
    else if (down)
        if(y<260)
        {
    obj.setBounds(x,y+s+i, obj.getWidth(), obj.getHeight());
        }
        else
        {
            down = false;
            up = true;
        }
    
//     if (left && x > -12  ){//This is to rotate the robot in anti clockwise direction
//    
//    radArm=radArm-2;
//    double theta= Math.toRadians(radArm);
//           rotate(theta,obj,img,poleImage);
//            btnCamera.requestFocus();
//    }
//    else if (right  && x< 600  ){//This is to rotate the robot in clockwise direction
//       
//           double theta= Math.toRadians(rad);
//           rotate(theta,obj,img,poleImage);
//            btnCamera.requestFocus();
//    }
    
  
    else if(armuprobo && radArm !=90){// perform robo arm rotation
        double theta= Math.toRadians(radArm);
      if(armclose==1)
      {
      rotate(theta,lblClaw,armDownImg,newFaraDownIcon); 
      
      radArm++;
     // clawstatus.setText("Arm at: "+rad1);
      } 
      else if(armopen==1)
      {
        rotate(theta,lblClaw,armUpImg,newFaraUpIcon);
       
        radArm++;
        // clawstatus.setText("Arm at: "+rad1);
      }
         
        btnCamera.requestFocus(); 
    }
    else if(armdownrobo && radArm!=0){// perform robo arm rotation
          radArm=radArm-2;
        // double theta= Math.toRadians(rad1);
      double theta= Math.toRadians(radArm);
      if(armclose==1)
      {
      rotate(theta,lblClaw,armDownImg,newFaraDownIcon); 
      
      radArm++;
     // clawstatus.setText("Arm at: "+rad1);
      } 
      else if(armopen==1)
      {
        rotate(theta,lblClaw,armUpImg,newFaraUpIcon);
       
        radArm++;
        // clawstatus.setText("Arm at: "+rad1);
      }
         
        btnCamera.requestFocus(); 
    
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    else if(turn){
        double theta= Math.toRadians(rad);
        rotate(theta,obj,arrowImg,newFarIcon);
        rad++;
    }
    
}
  
    
    protected ImageIcon poleImage = new ImageIcon("./arrow.png");
    protected Image img = Toolkit.getDefaultToolkit().getImage("./arrow.png");
    double rad=1;
    
    private void btnTurnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTurnActionPerformed

        
      Image image;  
      ImageIcon icon;
      image = img;
      icon = poleImage;
       down=false;
        up=false;
        left=false;
        right=false;
        armuprobo=false;
        armdownrobo=false;
        turn=true;
        tm.start();
        btnCamera.requestFocus();
      
      
// TODO add your handling code here:
    }//GEN-LAST:event_btnTurnActionPerformed

    private void btnCameraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCameraActionPerformed

        ImageIcon imageIcon = new ImageIcon("./landscape.jpg");
        Image landscapeImg = imageIcon.getImage();
        Image newFar1Img = landscapeImg.getScaledInstance(90, 51,  java.awt.Image.SCALE_SMOOTH);
        ImageIcon newFaraIcon = new ImageIcon(newFar1Img);
        lblCamImage.setIcon(newFaraIcon);
// TODO add your handling code here:
    }//GEN-LAST:event_btnCameraActionPerformed

    private void btnArmDownActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnArmDownActionPerformed
        // TODO add your handling code here:
        
        
        down=false;
        up=false;
        left=false;
        right=false;
        armuprobo=false;
        armdownrobo=true;
        turn=false;
        tm.start();
        btnCamera.requestFocus();
        
        
        
//      Image image;  
//      ImageIcon icon;
//      if(armopen == 1)
//      { image = armUpImg;
//      icon = newFaraUpIcon;
//      }
//      
//      else
//      {
//          image = armDownImg;
//      icon = newFaraDownIcon;
//      }
//      
//      int height = image.getHeight(lblClaw);
//      int width = image.getWidth(lblClaw);
//      double theta= Math.toRadians(radArm);
//     // theta=theta+theta*0.0174532925;
//     // theta=theta*0.0174532925;
//     // theta++;
//      double cos = Math.abs(Math.cos(theta));
//      double sin = Math.abs(Math.sin(theta));
//      int w = (int)(width * cos + height * sin);
//      int h = (int)(width * sin + height * cos);
//      BufferedImage bim = new BufferedImage(h, w, BufferedImage.TYPE_INT_RGB);
//      Graphics2D g2 = bim.createGraphics();
//        g2.setPaint(UIManager.getColor("Panel.background"));
//        g2.fillRect(0,0,w,h);
//        double x = w/2;
//        double y = h/2;
//       AffineTransform at = AffineTransform.getRotateInstance(theta, x, y);
//        x = (w - width)/2;
//        y = (h - height)/2;
//        at.translate(x, y);
//       g2.drawImage(image, at, lblClaw);
//       // g2.drawImage(image, 0, 0, w, h, robot);
//        icon = new ImageIcon(bim);
//        lblClaw.setIcon(icon);
//        //System.
//       radArm = radArm -2; 
        
    }//GEN-LAST:event_btnArmDownActionPerformed

    private void btnArmUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnArmUpActionPerformed

      
        down=false;
        up=false;
        left=false;
        right=false;
        armuprobo=true;
        armdownrobo=false;
        turn=false;
        tm.start();
        btnCamera.requestFocus();
//        ImageIcon armDownIcon = new ImageIcon("./CloseClaw11.jpg");
//        Image armDownImg = armDownIcon.getImage();
//        Image newFarArmDownImg = armDownImg.getScaledInstance(100, 100,  java.awt.Image.SCALE_SMOOTH);
//        ImageIcon newFaraDownIcon = new ImageIcon(newFarArmDownImg);
//        lblClaw.setIcon(newFaraDownIcon);
//        
//        
//        
//        ImageIcon armUpIcon = new ImageIcon("./OpenClaw11.jpg");
//        Image armUpImg = armUpIcon.getImage();
//        Image newFarArmUpImg = armUpImg.getScaledInstance(100, 100,  java.awt.Image.SCALE_SMOOTH);
//        ImageIcon newFaraUpIcon = new ImageIcon(newFarArmUpImg);
//        lblClaw.setIcon(newFaraUpIcon);
//        
//        
//        
//      Image image;  
//      ImageIcon icon;
//      if(armopen == 1 && radArm!=90)
//      { image = armUpImg;
//      icon = newFaraUpIcon;
//      }
//      
//      else if(armopen == 0 && radArm!=90)
//      {
//          image = armDownImg;
//      icon = newFaraDownIcon;
//      }
//      else{
//          image=armDownImg;
//      }
//      
//      int height = image.getHeight(lblClaw);
//      int width = image.getWidth(lblClaw);
//      double theta= Math.toRadians(radArm);
//     // theta=theta+theta*0.0174532925;
//     // theta=theta*0.0174532925;
//     // theta++;
//      double cos = Math.abs(Math.cos(theta));
//      double sin = Math.abs(Math.sin(theta));
//      int w = (int)(width * cos + height * sin);
//      int h = (int)(width * sin + height * cos);
//      BufferedImage bim = new BufferedImage(h, w, BufferedImage.TYPE_INT_RGB);
//      Graphics2D g2 = bim.createGraphics();
//        g2.setPaint(UIManager.getColor("Panel.background"));
//        g2.fillRect(0,0,w,h);
//        double x = w/2;
//        double y = h/2;
//       AffineTransform at = AffineTransform.getRotateInstance(theta, x, y);
//        x = (w - width)/2;
//        y = (h - height)/2;
//        at.translate(x, y);
//       g2.drawImage(image, at, lblClaw);
//       // g2.drawImage(image, 0, 0, w, h, robot);
//        icon = new ImageIcon(bim);
//        lblClaw.setIcon(icon);
//        //System.
//        radArm++;
        // TODO add your handling code here:
    }//GEN-LAST:event_btnArmUpActionPerformed

    private void btnStopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStopActionPerformed
        tm.stop();
        
// TODO add your handling code here:
    }//GEN-LAST:event_btnStopActionPerformed

    private void btnCameraKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnCameraKeyPressed
        // TODO add your handling code here:
        
        int code = evt.getKeyCode();
	if (code == KeyEvent.VK_DOWN){
            btnDown.doClick();
	}
	if (code == KeyEvent.VK_UP){
	btnUp.doClick();
        }
	if (code == KeyEvent.VK_LEFT){
	btnLeft.doClick();
        }
	if (code == KeyEvent.VK_RIGHT){
	btnRight.doClick();
        }

        if (code == KeyEvent.VK_SPACE){
            
            btnStop.doClick();
        }
    }//GEN-LAST:event_btnCameraKeyPressed

    private void btnCameraLargeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCameraLargeActionPerformed
        // TODO add your handling code here:
        boolean small=false;
        ImageIcon imageIcon = new ImageIcon("./landscape2.jpg");
        Image landscape2Img = imageIcon.getImage();
        Image newFar12Img = landscape2Img.getScaledInstance(120, 70,  java.awt.Image.SCALE_SMOOTH);
        ImageIcon newFara2Icon = new ImageIcon(newFar12Img);
        lblCamLarge.setIcon(newFara2Icon);
        lblCamImage.setVisible(small);
        
    }//GEN-LAST:event_btnCameraLargeActionPerformed

    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(RobotGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RobotGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RobotGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RobotGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RobotGUI().setVisible(true);
            }
        });
    }

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnArmDown;
    private javax.swing.JButton btnArmUp;
    private javax.swing.JButton btnCamera;
    private javax.swing.JButton btnCameraLarge;
    private javax.swing.JButton btnDown;
    private javax.swing.ButtonGroup btnGrpClaw;
    private javax.swing.ButtonGroup btnGrpTemp;
    private javax.swing.JButton btnLeft;
    private javax.swing.JButton btnRight;
    private javax.swing.JButton btnStop;
    private javax.swing.JButton btnTurn;
    private javax.swing.JButton btnUp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JSlider jSlider1;
    private javax.swing.JLabel lblCamImage;
    private javax.swing.JLabel lblCamLarge;
    private javax.swing.JLabel lblClaw;
    private javax.swing.JLabel obj;
    private javax.swing.JRadioButton radC;
    private javax.swing.JRadioButton radCloseClaw;
    private javax.swing.JRadioButton radF;
    private javax.swing.JRadioButton radOpenClaw;
    private RobotMethods robotMethods1;
    private javax.swing.JTextField txtTemperature;
    // End of variables declaration//GEN-END:variables
}

