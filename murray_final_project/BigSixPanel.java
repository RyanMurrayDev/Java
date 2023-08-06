package murray_final_project;

import java.awt.GridLayout;
import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class BigSixPanel extends javax.swing.JPanel implements CurrentMoneyInterface {

    private Die die1;
    private Die die2;
    private Die die3;
    private int dieOne;
    private int dieTwo;
    private int dieThree;
    private int betOne;
    private int betTwo;
    private int betThree;
    private int betFour;
    private int betFive;
    private int betSix;

    public BigSixPanel() {
        initComponents();
        die1 = new Die();
        die2 = new Die();
        die3 = new Die();
        currentMoneyJLabel.setText("Current money: " + MainPanel.getCurrentMoney());
    }

    public JLabel getCurrentMoneyJLabel() {
        return currentMoneyJLabel;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dieImage1 = new javax.swing.JLabel();
        dieImage2 = new javax.swing.JLabel();
        rollButton = new javax.swing.JButton();
        messageLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        dieImage3 = new javax.swing.JLabel();
        returnButton = new javax.swing.JButton();
        oneJLabel = new javax.swing.JLabel();
        twoJLabel = new javax.swing.JLabel();
        threeJLabel = new javax.swing.JLabel();
        fourJLabel = new javax.swing.JLabel();
        fiveJLabel = new javax.swing.JLabel();
        sixJLabel = new javax.swing.JLabel();
        oneJTextField = new javax.swing.JTextField();
        twoJTextField = new javax.swing.JTextField();
        threeJTextField = new javax.swing.JTextField();
        fourJTextField = new javax.swing.JTextField();
        fiveJTextField = new javax.swing.JTextField();
        sixJTextField = new javax.swing.JTextField();
        currentMoneyJLabel = new javax.swing.JLabel();

        dieImage1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/murray_final_project/dice1.gif"))); // NOI18N

        dieImage2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/murray_final_project/dice1.gif"))); // NOI18N

        rollButton.setText("Roll");
        rollButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rollButtonActionPerformed(evt);
            }
        });

        messageLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        messageLabel.setText("Place a bet!");

        jLabel1.setFont(new java.awt.Font("Lucida Handwriting", 0, 12)); // NOI18N
        jLabel1.setText("Play Big Six");

        dieImage3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/murray_final_project/dice1.gif"))); // NOI18N

        returnButton.setText("Return");
        returnButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnButtonActionPerformed(evt);
            }
        });

        oneJLabel.setText("1");

        twoJLabel.setText("2");

        threeJLabel.setText("3");

        fourJLabel.setText("4");

        fiveJLabel.setText("5");

        sixJLabel.setText("6");

        oneJTextField.setText("0");

        twoJTextField.setText("0");

        threeJTextField.setText("0");

        fourJTextField.setText("0");

        fiveJTextField.setText("0");

        sixJTextField.setText("0");

        currentMoneyJLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap(74, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(88, 88, 88)
                        .addComponent(returnButton))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(dieImage1)
                                .addGap(41, 41, 41)
                                .addComponent(rollButton))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(8, 8, 8)
                                        .addComponent(messageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(dieImage2))
                                    .addGroup(layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(dieImage3)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(twoJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(twoJTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(oneJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(oneJTextField))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(sixJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(sixJTextField))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(fourJLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 14, Short.MAX_VALUE)
                                                .addComponent(threeJLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addComponent(fiveJLabel))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(fourJTextField)
                                            .addComponent(threeJTextField)
                                            .addComponent(fiveJTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)))))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(currentMoneyJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(returnButton)
                    .addComponent(jLabel1))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(oneJLabel)
                    .addComponent(oneJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(messageLabel))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(rollButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(dieImage2)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(twoJLabel)
                                .addComponent(twoJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(threeJLabel)
                                    .addComponent(threeJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(fourJLabel)
                                    .addComponent(fourJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(28, 28, 28)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(fiveJLabel)
                                    .addComponent(fiveJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(dieImage1)
                                .addGap(18, 18, 18)
                                .addComponent(dieImage3)))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sixJLabel)
                    .addComponent(sixJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(currentMoneyJLabel)
                .addContainerGap(28, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
  public void updatesCurrentMoneyLabel()
    {
        
        MainPanel parent = (MainPanel)this.getParent();
        try{
            ArrayList<JPanel> panels = parent.getPanels();
            for(int i=0; i<panels.size();i++)
            {
            try{
                CurrentMoneyInterface cmi = (CurrentMoneyInterface) panels.get(i);
            JLabel label = cmi.getCurrentMoneyJLabel();
            label.setText("Current money: " + MainPanel.getCurrentMoney());
            }
            catch (Exception ex){
                System.out.println("Error in update currentMoneyLabel");
            }
            }
        }
        catch (Exception ex){
            System.out.println("no parent found");
        }
        
    }
    private void rollButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rollButtonActionPerformed
        if (oneJTextField.getText().equals("") || twoJTextField.getText().equals("")
                || threeJTextField.getText().equals("") || fourJTextField.getText().equals("")
                || fiveJTextField.getText().equals("") || sixJTextField.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Please type a number in every box. Type 0 if "
                    + "you do not want to place a bet on that number.\n"
                    + "Please only place a bet on one number."
                    + "(Only your first non zero bet will be counted)");
        } 
        else {
            try{
            betOne= Integer.parseInt(oneJTextField.getText());
            betTwo= Integer.parseInt(twoJTextField.getText());
            betThree= Integer.parseInt(threeJTextField.getText());
            betFour= Integer.parseInt(fourJTextField.getText());
            betFive= Integer.parseInt(fiveJTextField.getText());
            betSix= Integer.parseInt(sixJTextField.getText());
            }
            catch(Exception ex)
            {
                JOptionPane.showMessageDialog(this , "Please enter a numeric value.");
            }
                
            
            
            if(betOne+betTwo+betThree+betFour+betFive+betSix > MainPanel.getCurrentMoney())
            {
                JOptionPane.showMessageDialog(this, "You bet more money then you currently have.");
            }
            else{
            dieOne = die1.roll();
            dieTwo = die2.roll();
            dieThree = die3.roll();
            //insert rolling noise
            dieImage1.setIcon(new javax.swing.ImageIcon(getClass().
                    getResource("/murray_final_project/dice" + die1.getFace() + ".gif")));
            dieImage2.setIcon(new javax.swing.ImageIcon(getClass().
                    getResource("/murray_final_project/dice" + die2.getFace() + ".gif")));
            dieImage3.setIcon(new javax.swing.ImageIcon(getClass().
                    getResource("/murray_final_project/dice" + die3.getFace() + ".gif")));
            messageLabel.setText("The dealer rolled a " + dieOne + " " + dieTwo + " " + dieThree);
            if(betOne!=0)
            {
                if(dieOne==1 && dieTwo ==1 && dieThree == 1)
                {
                   MainPanel.setCurrentMoney( MainPanel.getCurrentMoney() + betOne*3);
                    messageLabel.setText("You won " + betOne*3);
                    if(MainPanel.getCurrentMoney()>MainPanel.getHighScore())
                    {
                        MainPanel.setHighScore(MainPanel.getCurrentMoney());
                    }
                }
                else if(dieOne==1 && dieTwo !=1 && dieThree != 1)
                {
                    MainPanel.setCurrentMoney( MainPanel.getCurrentMoney() + betOne);
                    messageLabel.setText("You won " + betOne);
                     if(MainPanel.getCurrentMoney()>MainPanel.getHighScore())
                    {
                        MainPanel.setHighScore(MainPanel.getCurrentMoney());
                    }
                }
                else if(dieOne==1 && dieTwo ==1 && dieThree != 1)
                {
                    MainPanel.setCurrentMoney( MainPanel.getCurrentMoney() + betOne*2);
                    messageLabel.setText("You won " + betOne*2);
                     if(MainPanel.getCurrentMoney()>MainPanel.getHighScore())
                    {
                        MainPanel.setHighScore(MainPanel.getCurrentMoney());
                    }
                }
                else if(dieOne==1 && dieTwo !=1 && dieThree == 1)
                {
                    MainPanel.setCurrentMoney( MainPanel.getCurrentMoney() + betOne*2);
                    messageLabel.setText("You won " + betOne*2);
                     if(MainPanel.getCurrentMoney()>MainPanel.getHighScore())
                    {
                       MainPanel.setHighScore(MainPanel.getCurrentMoney());
                    }
                }
                else if(dieOne!=1 && dieTwo ==1 && dieThree == 1)
                {
                    MainPanel.setCurrentMoney( MainPanel.getCurrentMoney() + betOne*2);
                    messageLabel.setText("You won " + betOne*2);
                     if(MainPanel.getCurrentMoney()>MainPanel.getHighScore())
                    {
                        MainPanel.setHighScore(MainPanel.getCurrentMoney());
                    }
                }
                else if(dieOne!=1 && dieTwo !=1 && dieThree == 1)
                {
                    MainPanel.setCurrentMoney( MainPanel.getCurrentMoney() + betOne);
                    messageLabel.setText("You won " + betOne);
                     if(MainPanel.getCurrentMoney()>MainPanel.getHighScore())
                    {
                        MainPanel.setHighScore(MainPanel.getCurrentMoney());
                    }
                }
                else{
                 MainPanel.setCurrentMoney( MainPanel.getCurrentMoney() - betOne);
                 messageLabel.setText("You lost " + betOne);
                 if(MainPanel.getCurrentMoney()<=0)
                {
                    MainPanel.getManager().goToPanel(4);
                }
                }
            }
            else if(betTwo!=0)
            {
                if(dieOne==2 && dieTwo ==2 && dieThree == 2)
                {
                    MainPanel.setCurrentMoney( MainPanel.getCurrentMoney() + betTwo*3);
                    messageLabel.setText("You won " + betTwo*3);
                     if(MainPanel.getCurrentMoney()>MainPanel.getHighScore())
                    {
                        MainPanel.setHighScore(MainPanel.getCurrentMoney());
                    }
                }
                else if(dieOne==2 && dieTwo !=2 && dieThree != 2)
                {
                    MainPanel.setCurrentMoney( MainPanel.getCurrentMoney() + betTwo);
                    messageLabel.setText("You won " + betTwo);
                     if(MainPanel.getCurrentMoney()>MainPanel.getHighScore())
                    {
                        MainPanel.setHighScore(MainPanel.getCurrentMoney());
                    }
                }
                else if(dieOne==2 && dieTwo ==2 && dieThree != 2)
                {
                    MainPanel.setCurrentMoney( MainPanel.getCurrentMoney() + betTwo*2);
                    messageLabel.setText("You won " + betTwo*2);
                     if(MainPanel.getCurrentMoney()>MainPanel.getHighScore())
                    {
                        MainPanel.setHighScore(MainPanel.getCurrentMoney());
                    }
                }
                else if(dieOne==2 && dieTwo !=2 && dieThree == 2)
                {
                    MainPanel.setCurrentMoney( MainPanel.getCurrentMoney() + betTwo*2);
                    messageLabel.setText("You won " + betTwo*2);
                     if(MainPanel.getCurrentMoney()>MainPanel.getHighScore())
                    {
                        MainPanel.setHighScore(MainPanel.getCurrentMoney());
                    }
                }
                else if(dieOne!=2 && dieTwo ==2 && dieThree == 2)
                {
                    MainPanel.setCurrentMoney( MainPanel.getCurrentMoney() + betTwo*2);
                    messageLabel.setText("You won " + betTwo*2);
                     if(MainPanel.getCurrentMoney()>MainPanel.getHighScore())
                    {
                        MainPanel.setHighScore(MainPanel.getCurrentMoney());
                    }
                }
                else if(dieOne!=2 && dieTwo !=2 && dieThree == 2)
                {
                    MainPanel.setCurrentMoney( MainPanel.getCurrentMoney() + betTwo);
                    messageLabel.setText("You won " + betTwo);
                     if(MainPanel.getCurrentMoney()>MainPanel.getHighScore())
                    {
                        MainPanel.setHighScore(MainPanel.getCurrentMoney());
                    }
                }
                else{
                 MainPanel.setCurrentMoney( MainPanel.getCurrentMoney() - betTwo);
                 messageLabel.setText("You lost " + betTwo);
                 if(MainPanel.getCurrentMoney()<=0)
                {
                    MainPanel.getManager().goToPanel(4);
                }
                }
            }
            else if(betThree!=0)
            {
                  if(dieOne==3 && dieTwo ==3 && dieThree == 3)
                {
                    MainPanel.setCurrentMoney( MainPanel.getCurrentMoney() + betThree*3);
                    messageLabel.setText("You won " + betThree*3);
                     if(MainPanel.getCurrentMoney()>MainPanel.getHighScore())
                    {
                        MainPanel.setHighScore(MainPanel.getCurrentMoney());
                    }
                }
                else if(dieOne==3 && dieTwo !=3 && dieThree != 3)
                {
                    MainPanel.setCurrentMoney( MainPanel.getCurrentMoney() + betThree);
                    messageLabel.setText("You won " + betThree);
                     if(MainPanel.getCurrentMoney()>MainPanel.getHighScore())
                    {
                        MainPanel.setHighScore(MainPanel.getCurrentMoney());
                    }
                }
                else if(dieOne==3 && dieTwo ==3 && dieThree != 3)
                {
                    MainPanel.setCurrentMoney( MainPanel.getCurrentMoney() + betThree*2);
                    messageLabel.setText("You won " + betThree*2);
                     if(MainPanel.getCurrentMoney()>MainPanel.getHighScore())
                    {
                        MainPanel.setHighScore(MainPanel.getCurrentMoney());
                    }
                }
                else if(dieOne==3 && dieTwo !=3 && dieThree == 3)
                {
                    MainPanel.setCurrentMoney( MainPanel.getCurrentMoney() + betThree*2);
                    messageLabel.setText("You won " + betThree*2);
                     if(MainPanel.getCurrentMoney()>MainPanel.getHighScore())
                    {
                        MainPanel.setHighScore(MainPanel.getCurrentMoney());
                    }
                }
                else if(dieOne!=3 && dieTwo ==3 && dieThree == 3)
                {
                    MainPanel.setCurrentMoney( MainPanel.getCurrentMoney() + betThree*2);
                    messageLabel.setText("You won " + betThree*2);
                     if(MainPanel.getCurrentMoney()>MainPanel.getHighScore())
                    {
                        MainPanel.setHighScore(MainPanel.getCurrentMoney());
                    }
                }
                else if(dieOne!=3 && dieTwo !=3 && dieThree == 3)
                {
                    MainPanel.setCurrentMoney( MainPanel.getCurrentMoney() + betThree);
                    messageLabel.setText("You won " + betThree);
                     if(MainPanel.getCurrentMoney()>MainPanel.getHighScore())
                    {
                        MainPanel.setHighScore(MainPanel.getCurrentMoney());
                    }
                }
                else{
                 MainPanel.setCurrentMoney( MainPanel.getCurrentMoney() - betThree);
                 messageLabel.setText("You lost " + betThree);
                 if(MainPanel.getCurrentMoney()<=0)
                {
                    MainPanel.getManager().goToPanel(4);
                }
                }
            }
            else if(betFour!=0)
            {
                  if(dieOne==4 && dieTwo ==4 && dieThree == 4)
                {
                    MainPanel.setCurrentMoney( MainPanel.getCurrentMoney() + betFour*3);
                    messageLabel.setText("You won " + betFour*3);
                     if(MainPanel.getCurrentMoney()>MainPanel.getHighScore())
                    {
                        MainPanel.setHighScore(MainPanel.getCurrentMoney());
                    }
                }
                else if(dieOne==4 && dieTwo !=4 && dieThree != 4)
                {
                    MainPanel.setCurrentMoney( MainPanel.getCurrentMoney() + betFour);
                    messageLabel.setText("You won " + betFour);
                     if(MainPanel.getCurrentMoney()>MainPanel.getHighScore())
                    {
                        MainPanel.setHighScore(MainPanel.getCurrentMoney());
                    }
                }
                else if(dieOne==4 && dieTwo ==4 && dieThree != 4)
                {
                    MainPanel.setCurrentMoney( MainPanel.getCurrentMoney() + betFour*2);
                    messageLabel.setText("You won " + betFour*2);
                     if(MainPanel.getCurrentMoney()>MainPanel.getHighScore())
                    {
                        MainPanel.setHighScore(MainPanel.getCurrentMoney());
                    }
                }
                else if(dieOne==4 && dieTwo !=4 && dieThree == 4)
                {
                    MainPanel.setCurrentMoney( MainPanel.getCurrentMoney() + betFour*2);
                    messageLabel.setText("You won " + betFour*2);
                     if(MainPanel.getCurrentMoney()>MainPanel.getHighScore())
                    {
                        MainPanel.setHighScore(MainPanel.getCurrentMoney());
                    }
                }
                else if(dieOne!=4 && dieTwo ==4 && dieThree == 4)
                {
                    MainPanel.setCurrentMoney( MainPanel.getCurrentMoney() + betFour*2);
                    messageLabel.setText("You won " + betFour*2);
                     if(MainPanel.getCurrentMoney()>MainPanel.getHighScore())
                    {
                        MainPanel.setHighScore(MainPanel.getCurrentMoney());
                    }
                }
                else if(dieOne!=4 && dieTwo !=4 && dieThree == 4)
                {
                    MainPanel.setCurrentMoney( MainPanel.getCurrentMoney() + betFour);
                    messageLabel.setText("You won " + betFour);
                     if(MainPanel.getCurrentMoney()>MainPanel.getHighScore())
                    {
                        MainPanel.setHighScore(MainPanel.getCurrentMoney());
                    }
                }
                else{
                 MainPanel.setCurrentMoney( MainPanel.getCurrentMoney() - betFour);
                 messageLabel.setText("You lost " + betFour);
                 if(MainPanel.getCurrentMoney()<=0)
                {
                    MainPanel.getManager().goToPanel(4);
                }
                }
            }
            else if(betFive!=0)
            {
                  if(dieOne==5 && dieTwo ==5 && dieThree == 5)
                {
                    MainPanel.setCurrentMoney( MainPanel.getCurrentMoney() + betFive*3);
                    messageLabel.setText("You won " + betFive*3);
                     if(MainPanel.getCurrentMoney()>MainPanel.getHighScore())
                    {
                        MainPanel.setHighScore(MainPanel.getCurrentMoney());
                    }
                }
                else if(dieOne==5 && dieTwo !=5 && dieThree != 5)
                {
                    MainPanel.setCurrentMoney( MainPanel.getCurrentMoney() + betFive);
                    messageLabel.setText("You won " + betFive);
                     if(MainPanel.getCurrentMoney()>MainPanel.getHighScore())
                    {
                        MainPanel.setHighScore(MainPanel.getCurrentMoney());
                    }
                }
                else if(dieOne==5 && dieTwo ==5 && dieThree != 5)
                {
                    MainPanel.setCurrentMoney( MainPanel.getCurrentMoney() + betFive*2);
                    messageLabel.setText("You won " + betFive*2);
                     if(MainPanel.getCurrentMoney()>MainPanel.getHighScore())
                    {
                        MainPanel.setHighScore(MainPanel.getCurrentMoney());
                    }
                }
                else if(dieOne==5 && dieTwo !=5 && dieThree == 5)
                {
                    MainPanel.setCurrentMoney(MainPanel.getCurrentMoney() + betFive*2);
                    messageLabel.setText("You won " + betFive*2);
                     if(MainPanel.getCurrentMoney()>MainPanel.getHighScore())
                    {
                        MainPanel.setHighScore(MainPanel.getCurrentMoney());
                    }
                }
                else if(dieOne!=5 && dieTwo ==5 && dieThree == 5)
                {
                    MainPanel.setCurrentMoney( MainPanel.getCurrentMoney() + betFive*2);
                    messageLabel.setText("You won " + betFive*2);
                     if(MainPanel.getCurrentMoney()>MainPanel.getHighScore())
                    {
                        MainPanel.setHighScore(MainPanel.getCurrentMoney());
                    }
                }
                else if(dieOne!=5 && dieTwo !=5 && dieThree == 5)
                {
                    MainPanel.setCurrentMoney( MainPanel.getCurrentMoney() + betFive);
                    messageLabel.setText("You won " + betFive);
                     if(MainPanel.getCurrentMoney()>MainPanel.getHighScore())
                    {
                        MainPanel.setHighScore(MainPanel.getCurrentMoney());
                    }
                }
                else{
                 MainPanel.setCurrentMoney( MainPanel.getCurrentMoney() - betFive);
                 messageLabel.setText("You lost " + betFive);
                 if(MainPanel.getCurrentMoney()<=0)
                {
                    MainPanel.getManager().goToPanel(4);
                }
                }
            }
            else{
              if(dieOne==6 && dieTwo ==6 && dieThree == 6)
                {
                    MainPanel.setCurrentMoney( MainPanel.getCurrentMoney() + betSix*3);
                    messageLabel.setText("You won " + betSix*3);
                     if(MainPanel.getCurrentMoney()>MainPanel.getHighScore())
                    {
                        MainPanel.setHighScore(MainPanel.getCurrentMoney());
                    }
                }
                else if(dieOne==6 && dieTwo !=6 && dieThree != 6)
                {
                    MainPanel.setCurrentMoney( MainPanel.getCurrentMoney() + betSix);
                    messageLabel.setText("You won " + betSix);
                     if(MainPanel.getCurrentMoney()>MainPanel.getHighScore())
                    {
                        MainPanel.setHighScore(MainPanel.getCurrentMoney());
                    }
                }
                else if(dieOne==6 && dieTwo ==6 && dieThree != 6)
                {
                    MainPanel.setCurrentMoney( MainPanel.getCurrentMoney() + betSix*2);
                    messageLabel.setText("You won " + betSix*2);
                     if(MainPanel.getCurrentMoney()>MainPanel.getHighScore())
                    {
                        MainPanel.setHighScore(MainPanel.getCurrentMoney());
                    }
                }
                else if(dieOne==6 && dieTwo !=6 && dieThree == 6)
                {
                    MainPanel.setCurrentMoney( MainPanel.getCurrentMoney() + betSix*2);
                    messageLabel.setText("You won " + betSix*2);
                     if(MainPanel.getCurrentMoney()>MainPanel.getHighScore())
                    {
                        MainPanel.setHighScore(MainPanel.getCurrentMoney());
                    }
                }
                else if(dieOne!=6 && dieTwo ==6 && dieThree == 6)
                {
                    MainPanel.setCurrentMoney( MainPanel.getCurrentMoney() + betSix*2);
                    messageLabel.setText("You won " + betSix*2);
                     if(MainPanel.getCurrentMoney()>MainPanel.getHighScore())
                    {
                        MainPanel.setHighScore(MainPanel.getCurrentMoney());
                    }
                }
                else if(dieOne!=6 && dieTwo !=6 && dieThree == 6)
                {
                    MainPanel.setCurrentMoney( MainPanel.getCurrentMoney() + betSix);
                    messageLabel.setText("You won " + betSix);
                     if(MainPanel.getCurrentMoney()>MainPanel.getHighScore())
                    {
                        MainPanel.setHighScore(MainPanel.getCurrentMoney());
                    }
                }
                else{
                 MainPanel.setCurrentMoney( MainPanel.getCurrentMoney() - betSix);
                 messageLabel.setText("You lost " + betSix);
                 if(MainPanel.getCurrentMoney()<=0)
                {
                    MainPanel.getManager().goToPanel(4);
                }
                }
            }
        }
        
        }
      updatesCurrentMoneyLabel();
    }//GEN-LAST:event_rollButtonActionPerformed

    private void returnButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnButtonActionPerformed
       MainPanel.getManager().goToPanel(0);
    }//GEN-LAST:event_returnButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel currentMoneyJLabel;
    private javax.swing.JLabel dieImage1;
    private javax.swing.JLabel dieImage2;
    private javax.swing.JLabel dieImage3;
    private javax.swing.JLabel fiveJLabel;
    private javax.swing.JTextField fiveJTextField;
    private javax.swing.JLabel fourJLabel;
    private javax.swing.JTextField fourJTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel messageLabel;
    private javax.swing.JLabel oneJLabel;
    private javax.swing.JTextField oneJTextField;
    private javax.swing.JButton returnButton;
    private javax.swing.JButton rollButton;
    private javax.swing.JLabel sixJLabel;
    private javax.swing.JTextField sixJTextField;
    private javax.swing.JLabel threeJLabel;
    private javax.swing.JTextField threeJTextField;
    private javax.swing.JLabel twoJLabel;
    private javax.swing.JTextField twoJTextField;
    // End of variables declaration//GEN-END:variables
}
