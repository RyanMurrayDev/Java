package murray_final_project;

import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class BeatTheDealerPanel extends javax.swing.JPanel implements CurrentMoneyInterface {

    private Die die1;
    private Die die2;
    private static int dealerRoll;
    private static int userRoll;
    private int currentMoney;
    private int highScore;
    private int bet;
    private int count; 

    public BeatTheDealerPanel() {
        initComponents();
        die1 = new Die();
        die2 = new Die();
        currentMoneyLabel.setText("Current money: " + MainPanel.getCurrentMoney());
    }

    public JLabel getCurrentMoneyJLabel() {
        return currentMoneyLabel;
    }

   

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dieImage1 = new javax.swing.JLabel();
        dieImage2 = new javax.swing.JLabel();
        rollButton = new javax.swing.JButton();
        messageLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        returnButton = new javax.swing.JButton();
        userBetTextField = new javax.swing.JTextField();
        userRollButton = new javax.swing.JButton();
        currentMoneyLabel = new javax.swing.JLabel();
        messageLabel2 = new javax.swing.JLabel();

        dieImage1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/murray_final_project/dice1.gif"))); // NOI18N

        dieImage2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/murray_final_project/dice1.gif"))); // NOI18N

        rollButton.setText("Dealer Roll");
        rollButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rollButtonActionPerformed(evt);
            }
        });

        messageLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        messageLabel.setText("Place a bet!");

        jLabel1.setFont(new java.awt.Font("Lucida Handwriting", 0, 12)); // NOI18N
        jLabel1.setText("Play Beat the Dealer");

        returnButton.setText("Return");
        returnButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnButtonActionPerformed(evt);
            }
        });

        userRollButton.setText("User Roll");
        userRollButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userRollButtonActionPerformed(evt);
            }
        });

        currentMoneyLabel.setText("jLabel2");

        messageLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(currentMoneyLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(returnButton)
                .addGap(40, 40, 40))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(dieImage1)
                            .addGap(90, 90, 90)
                            .addComponent(dieImage2))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(26, 26, 26)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(userRollButton)
                                .addComponent(rollButton)))
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(messageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(messageLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(userBetTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(123, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(dieImage2)
                    .addComponent(dieImage1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addComponent(rollButton)
                .addGap(18, 18, 18)
                .addComponent(userRollButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userBetTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(messageLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(messageLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(returnButton)
                    .addComponent(currentMoneyLabel))
                .addGap(25, 25, 25))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void rollButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rollButtonActionPerformed
        //fixed problem where user roll cannot be pressed bsck to back but did
        //not fix that same problem with dealer roll yet. fix it a very similar way
        if (userBetTextField.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Please place a bet.");
        } else {
            try{
            bet= Integer.parseInt(userBetTextField.getText());
            }
            catch(Exception ex)
            {
                JOptionPane.showMessageDialog(this , "Please enter a numeric value.");
            }
            userBetTextField.setEditable(false);
            if(bet>MainPanel.getCurrentMoney())
            {
              JOptionPane.showMessageDialog(this, "You bet more money than you currently have."); 
              userBetTextField.setEditable(true);
              count--;
            }
            dealerRoll = die1.roll() + die2.roll();
            //insert rolling noise
            messageLabel.setText("The dealer rolled a " + dealerRoll);
            dieImage1.setIcon(new javax.swing.ImageIcon(getClass().
                    getResource("/murray_final_project/dice" + die1.getFace() + ".gif")));

            dieImage2.setIcon(new javax.swing.ImageIcon(getClass().
                    getResource("/murray_final_project/dice" + die2.getFace() + ".gif")));
            count++;
        }
    }//GEN-LAST:event_rollButtonActionPerformed

    private void userRollButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userRollButtonActionPerformed
       if(count==1)
       {
        if (dealerRoll == 0) {
            JOptionPane.showMessageDialog(this, "The dealer must roll first.");
        } else {
            userRoll = die1.roll() + die2.roll();
            //insert rolling noise
            dieImage1.setIcon(new javax.swing.ImageIcon(getClass().
                    getResource("/murray_final_project/dice" + die1.getFace() + ".gif")));

            dieImage2.setIcon(new javax.swing.ImageIcon(getClass().
                    getResource("/murray_final_project/dice" + die2.getFace() + ".gif")));
            currentMoney = MainPanel.getCurrentMoney();
            bet = Integer.parseInt(userBetTextField.getText());
            if (dealerRoll > userRoll) {
                MainPanel.setCurrentMoney(currentMoney - bet);
                messageLabel2.setText("You lost $" + bet);
                  //insert sad noise
                count--;
                 if(MainPanel.getCurrentMoney()<=0)
                {
                    MainPanel.getManager().goToPanel(4);
                }
            } else if (dealerRoll < userRoll) {
                MainPanel.setCurrentMoney(currentMoney + bet);
                messageLabel2.setText("You won $" + bet);
                count--;
                //insert happy noise
                 if(MainPanel.getCurrentMoney()>MainPanel.getHighScore())
                    {
                        MainPanel.setHighScore(MainPanel.getCurrentMoney());
                    }
            } else {
                MainPanel.setCurrentMoney(currentMoney - bet);
                messageLabel2.setText("You lost $" + bet);
                count--;
                //insert sad noise
                if(MainPanel.getCurrentMoney()<=0)
                {
                    MainPanel.getManager().goToPanel(4);
                }
            }
            userBetTextField.setEditable(true);
            updatesCurrentMoneyLabel();
        }
       }
       else{
        JOptionPane.showMessageDialog(this, "The dealer must roll first.");
       }
        
    }//GEN-LAST:event_userRollButtonActionPerformed
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
    private void returnButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnButtonActionPerformed
        MainPanel.getManager().goToPanel(0);
    }//GEN-LAST:event_returnButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel currentMoneyLabel;
    private javax.swing.JLabel dieImage1;
    private javax.swing.JLabel dieImage2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel messageLabel;
    private javax.swing.JLabel messageLabel2;
    private javax.swing.JButton returnButton;
    private javax.swing.JButton rollButton;
    private javax.swing.JTextField userBetTextField;
    private javax.swing.JButton userRollButton;
    // End of variables declaration//GEN-END:variables
}
