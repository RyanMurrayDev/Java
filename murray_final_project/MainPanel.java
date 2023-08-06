
package murray_final_project;

import java.awt.GridLayout;
import java.util.ArrayList;
import javax.swing.JPanel;


public class MainPanel extends javax.swing.JPanel {

  private static PanelManager manager;
  private static int currentMoney;
  private static int highScore;
  private ArrayList<JPanel> panels;

  
    public MainPanel() {
        initComponents();
        setLayout(new GridLayout(0,1,0,0));
         panels = new ArrayList();
         panels.add(new ControlPanel());
         manager = new PanelManager(this, panels);
        panels.add( new HighLowPanel());
        panels.add( new BigSixPanel());
        panels.add( new BeatTheDealerPanel());
        panels.add( new LoserPanel());
       
    }

    public ArrayList<JPanel> getPanels() {
        return panels;
    }

    /**
     *
     * @return
     */
    public static PanelManager getManager() {
        return manager;
    }

    public static int getCurrentMoney() {
        return currentMoney;
    }

    public static void setCurrentMoney(int currentMoney) {
        MainPanel.currentMoney = currentMoney;
    }

    public static int getHighScore() {
        return highScore;
    }

    public static void setHighScore(int highScore) {
        MainPanel.highScore = highScore;
    }

  
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
