package murray_final_project;


import java.awt.GridLayout;
import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


public class ControlPanel extends javax.swing.JPanel implements CurrentMoneyInterface {

   private static JLabel highScoreJLabel;
    
    
    public ControlPanel() {
        initComponents();
        if(MainPanel.getCurrentMoney()==0)
        {
            MainPanel.setCurrentMoney(100);
        }
        else{
        currentMoneyJLabel.setText("Current Money: " + MainPanel.getCurrentMoney());
        revalidate();
        repaint();
        }
    }

    public JLabel getCurrentMoneyJLabel() {
        return currentMoneyJLabel;
    }

    public static JLabel getHighScoreJLabel() {
        return highScoreJLabel;
    }
    
    public void setHighScoreJLabel(JLabel highScoreJLabel) {
        this.highScoreJLabel = highScoreJLabel;
    }
    

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


     
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        playHighLowButton = new javax.swing.JButton();
        highLowDiirectionsButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        resetButton = new javax.swing.JButton();
        currentMoneyJLabel = new javax.swing.JLabel();
        playBeatTheDealerButton = new javax.swing.JButton();
        playBigSixButton = new javax.swing.JButton();
        beatTheDealerDirectionsButton = new javax.swing.JButton();
        bigSixDirectionsButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(51, 255, 51));

        playHighLowButton.setText("Play High Low");
        playHighLowButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playHighLowButtonActionPerformed(evt);
            }
        });

        highLowDiirectionsButton.setText("Directions");
        highLowDiirectionsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                highLowDiirectionsButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Welcome to Ryan's Casino");

        resetButton.setText("Reset Game");
        resetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetButtonActionPerformed(evt);
            }
        });

        playBeatTheDealerButton.setText("Play Beat the Dealer");
        playBeatTheDealerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playBeatTheDealerButtonActionPerformed(evt);
            }
        });

        playBigSixButton.setText("Play Big Six");
        playBigSixButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playBigSixButtonActionPerformed(evt);
            }
        });

        beatTheDealerDirectionsButton.setText("Directions");
        beatTheDealerDirectionsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                beatTheDealerDirectionsButtonActionPerformed(evt);
            }
        });

        bigSixDirectionsButton.setText("Directions");
        bigSixDirectionsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bigSixDirectionsButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(80, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(playHighLowButton, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(playBigSixButton, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                                .addComponent(playBeatTheDealerButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(beatTheDealerDirectionsButton)
                                    .addComponent(bigSixDirectionsButton)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(highLowDiirectionsButton)))
                        .addGap(84, 84, 84))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(114, 114, 114))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(resetButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(currentMoneyJLabel)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(playHighLowButton)
                    .addComponent(highLowDiirectionsButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(playBeatTheDealerButton)
                    .addComponent(beatTheDealerDirectionsButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(playBigSixButton)
                    .addComponent(bigSixDirectionsButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                .addComponent(currentMoneyJLabel)
                .addGap(18, 18, 18)
                .addComponent(resetButton)
                .addGap(29, 29, 29))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void highLowDiirectionsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_highLowDiirectionsButtonActionPerformed
     JOptionPane.showMessageDialog(this, "The user will place a bet then click high, low or 7."
             + " On the click, two dice will be rolled. If the dice add up to 8-12, the roll is "
             + "considered high.\n If the dice add up to 2-6 the roll is considered low."
             + "High and low pay 2:1 and seven pays 4:1 ");
    }//GEN-LAST:event_highLowDiirectionsButtonActionPerformed

    private void playHighLowButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playHighLowButtonActionPerformed
        updatesCurrentMoneyLabel();
        MainPanel.getManager().goToPanel(1);
    }//GEN-LAST:event_playHighLowButtonActionPerformed

    private void resetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetButtonActionPerformed
        MainPanel.setCurrentMoney(100);
        updatesCurrentMoneyLabel();
    }//GEN-LAST:event_resetButtonActionPerformed

    private void playBeatTheDealerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playBeatTheDealerButtonActionPerformed
        updatesCurrentMoneyLabel();
        MainPanel.getManager().goToPanel(3);
    }//GEN-LAST:event_playBeatTheDealerButtonActionPerformed

    private void playBigSixButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playBigSixButtonActionPerformed
        updatesCurrentMoneyLabel();
        MainPanel.getManager().goToPanel(2);
    }//GEN-LAST:event_playBigSixButtonActionPerformed

    private void beatTheDealerDirectionsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_beatTheDealerDirectionsButtonActionPerformed
        JOptionPane.showMessageDialog(this, "The user will place a bet. Once placed, the dealer will roll two dice."
                + "Then the user will roll to dice.\n If the users roll is higher then the dealers roll,"
                + "the user wins. If the dealers roll is higher or the same, the user loses. "
                + "Pays 2:1");
    }//GEN-LAST:event_beatTheDealerDirectionsButtonActionPerformed

    private void bigSixDirectionsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bigSixDirectionsButtonActionPerformed
        JOptionPane.showMessageDialog(this, "The user will place a bet on a number 1-6. Three dice will be "
                + "rolled and the users bet will be matched \nfor however many times that number occurs."
                + "For example, if the user places $10 on 6 and the three dice roll 6,6,6 \n the user"
                + "will win $30.\n The users first non zero bet is the only bet that will be counted");
    }//GEN-LAST:event_bigSixDirectionsButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton beatTheDealerDirectionsButton;
    private javax.swing.JButton bigSixDirectionsButton;
    private javax.swing.JLabel currentMoneyJLabel;
    private javax.swing.JButton highLowDiirectionsButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton playBeatTheDealerButton;
    private javax.swing.JButton playBigSixButton;
    private javax.swing.JButton playHighLowButton;
    private javax.swing.JButton resetButton;
    // End of variables declaration//GEN-END:variables
}
