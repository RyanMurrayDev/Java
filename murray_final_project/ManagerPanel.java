
package murray_final_project;

import java.util.ArrayList;
import javax.swing.JPanel;


public class ManagerPanel extends javax.swing.JPanel {

  private static PanelManager manager;

  
    public ManagerPanel() {
        initComponents();
         ArrayList<JPanel> panels = new ArrayList();
        panels.add(new MainPanel());
        panels.add( new HighLowPanel());
        panels.add( new BigSixPanel());
        panels.add( new BeatTheDealerPanel());
        panels.add( new LoserPanel());
        this.setFocusable(true);
        manager = new PanelManager(this, panels);
    }

    /**
     *
     * @return
     */
    public static PanelManager getManager() {
        return manager;
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
