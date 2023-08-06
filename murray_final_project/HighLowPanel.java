package murray_final_project;

import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class HighLowPanel extends javax.swing.JPanel implements CurrentMoneyInterface  {

    private Die die1;
    private Die die2;
    private int bet;

    public HighLowPanel() {
        initComponents();
        die1 = new Die();
        die2 = new Die();
       
    }

    public JLabel getCurrentMoneyJLabel() {
        return currentMoneyLabel;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        dieImage1 = new javax.swing.JLabel();
        dieImage2 = new javax.swing.JLabel();
        messageLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        returnButton = new javax.swing.JButton();
        userBetJTextField = new javax.swing.JTextField();
        sevenRadioButton = new javax.swing.JRadioButton();
        highRadioButton = new javax.swing.JRadioButton();
        lowRadioButton = new javax.swing.JRadioButton();
        currentMoneyLabel = new javax.swing.JLabel();

        dieImage1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/murray_final_project/dice1.gif"))); // NOI18N

        dieImage2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/murray_final_project/dice1.gif"))); // NOI18N

        messageLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        messageLabel.setText("Place a bet!");

        jLabel1.setFont(new java.awt.Font("Lucida Handwriting", 0, 12)); // NOI18N
        jLabel1.setText("Play High Low");

        returnButton.setText("Return");
        returnButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnButtonActionPerformed(evt);
            }
        });

        userBetJTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        userBetJTextField.setText("0");

        buttonGroup2.add(sevenRadioButton);
        sevenRadioButton.setText("Seven");
        sevenRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sevenRadioButtonActionPerformed(evt);
            }
        });

        buttonGroup2.add(highRadioButton);
        highRadioButton.setText("High");
        highRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                highRadioButtonActionPerformed(evt);
            }
        });

        buttonGroup2.add(lowRadioButton);
        lowRadioButton.setText("Low");
        lowRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lowRadioButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(159, 159, 159)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(137, 137, 137)
                                .addComponent(dieImage1)
                                .addGap(50, 50, 50)
                                .addComponent(dieImage2))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(messageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(65, 65, 65)
                                        .addComponent(userBetJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(highRadioButton)
                                    .addComponent(sevenRadioButton)
                                    .addComponent(lowRadioButton))))
                        .addGap(0, 101, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(currentMoneyLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(returnButton)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(dieImage2)
                            .addComponent(dieImage1))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(messageLabel)
                            .addComponent(highRadioButton))
                        .addGap(18, 18, 18)
                        .addComponent(sevenRadioButton))
                    .addComponent(userBetJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(lowRadioButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(returnButton)
                    .addComponent(currentMoneyLabel))
                .addContainerGap(39, Short.MAX_VALUE))
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
    private void highRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_highRadioButtonActionPerformed
        try {
            bet = Integer.parseInt(userBetJTextField.getText());
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Please enter a numeric value.");
        }
        if (bet <= 0) {
            JOptionPane.showMessageDialog(this, "Please place a bet.");
        } else {
            if (bet > MainPanel.getCurrentMoney()) {
                JOptionPane.showMessageDialog(this, "You bet more money than you currently have.");
            } else {
                int sum = die1.roll() + die2.roll();
                messageLabel.setText("You rolled a " + sum);
                dieImage1.setIcon(new javax.swing.ImageIcon(getClass().
                        getResource("/murray_final_project/dice" + die1.getFace() + ".gif")));

                dieImage2.setIcon(new javax.swing.ImageIcon(getClass().
                        getResource("/murray_final_project/dice" + die2.getFace() + ".gif")));
                if (sum > 7) {
                    MainPanel.setCurrentMoney(MainPanel.getCurrentMoney() + bet);
                    messageLabel.setText("The roll was high. You won " + bet);
                    //happy noise
                    if (MainPanel.getCurrentMoney() > MainPanel.getHighScore()) {
                        MainPanel.setHighScore(MainPanel.getCurrentMoney());
                    }
                } else {
                    MainPanel.setCurrentMoney(MainPanel.getCurrentMoney() - bet);
                    messageLabel.setText("You lost " + bet);
                    //sad noise
                    if (MainPanel.getCurrentMoney() <= 0) {
                        MainPanel.getManager().goToPanel(4);
                    }
                }
            }
        }
        updatesCurrentMoneyLabel();
    }//GEN-LAST:event_highRadioButtonActionPerformed


    private void sevenRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sevenRadioButtonActionPerformed
         try {
            bet = Integer.parseInt(userBetJTextField.getText());
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Please enter a numeric value.");
        }
        if (bet <= 0) {
            JOptionPane.showMessageDialog(this, "Please place a bet.");
        } else {
            if (bet > MainPanel.getCurrentMoney()) {
                JOptionPane.showMessageDialog(this, "You bet more money than you currently have.");
            } else {
                int sum = die1.roll() + die2.roll();
                messageLabel.setText("You rolled a " + sum);
                dieImage1.setIcon(new javax.swing.ImageIcon(getClass().
                        getResource("/murray_final_project/dice" + die1.getFace() + ".gif")));

                dieImage2.setIcon(new javax.swing.ImageIcon(getClass().
                        getResource("/murray_final_project/dice" + die2.getFace() + ".gif")));
                if (sum == 7) {
                    MainPanel.setCurrentMoney(MainPanel.getCurrentMoney() + bet * 4);
                    messageLabel.setText("The roll was seven. You won " + bet * 4);
                    //happy noise
                    if (MainPanel.getCurrentMoney() > MainPanel.getHighScore()) {
                        MainPanel.setHighScore(MainPanel.getCurrentMoney());
                    }
                } else {
                    MainPanel.setCurrentMoney(MainPanel.getCurrentMoney() - bet);
                    messageLabel.setText("You lost " + bet);
                    //sad noise
                    if (MainPanel.getCurrentMoney() <= 0) {
                        MainPanel.getManager().goToPanel(4);
                    }
                }
            }
        }
        updatesCurrentMoneyLabel();

    }//GEN-LAST:event_sevenRadioButtonActionPerformed

    private void lowRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lowRadioButtonActionPerformed
         try {
            bet = Integer.parseInt(userBetJTextField.getText());
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Please enter a numeric value.");
        }
        if (bet <= 0) {
            JOptionPane.showMessageDialog(this, "Please place a bet.");
        } else {
            if (bet > MainPanel.getCurrentMoney()) {
                JOptionPane.showMessageDialog(this, "You bet more money than you currently have.");
            } else {
                int sum = die1.roll() + die2.roll();
                messageLabel.setText("You rolled a " + sum);
                dieImage1.setIcon(new javax.swing.ImageIcon(getClass().
                        getResource("/murray_final_project/dice" + die1.getFace() + ".gif")));

                dieImage2.setIcon(new javax.swing.ImageIcon(getClass().
                        getResource("/murray_final_project/dice" + die2.getFace() + ".gif")));
                if (sum < 7) {
                    MainPanel.setCurrentMoney(MainPanel.getCurrentMoney() + bet);
                    messageLabel.setText("The roll was low. You won " + bet);
                    //happy noise
                    if (MainPanel.getCurrentMoney() > MainPanel.getHighScore()) {
                        MainPanel.setHighScore(MainPanel.getCurrentMoney());
                    }
                } else {
                    MainPanel.setCurrentMoney(MainPanel.getCurrentMoney() - bet);
                    messageLabel.setText("You lost " + bet);
                    //sad noise
                    if (MainPanel.getCurrentMoney() <= 0) {
                        MainPanel.getManager().goToPanel(4);
                    }
                }
            }
        }
        updatesCurrentMoneyLabel();

    }//GEN-LAST:event_lowRadioButtonActionPerformed

    private void returnButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnButtonActionPerformed
        MainPanel.getManager().goToPanel(0);
    }//GEN-LAST:event_returnButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JLabel currentMoneyLabel;
    private javax.swing.JLabel dieImage1;
    private javax.swing.JLabel dieImage2;
    private javax.swing.JRadioButton highRadioButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JRadioButton lowRadioButton;
    private javax.swing.JLabel messageLabel;
    private javax.swing.JButton returnButton;
    private javax.swing.JRadioButton sevenRadioButton;
    private javax.swing.JTextField userBetJTextField;
    // End of variables declaration//GEN-END:variables
}
