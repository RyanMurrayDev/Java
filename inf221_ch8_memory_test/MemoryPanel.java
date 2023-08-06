package inf221_ch8_memory_test;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.Icon;
import javax.swing.JOptionPane;
import javax.swing.Timer;

public class MemoryPanel extends javax.swing.JPanel
{

    private Memory memory;
    private CardLabel firstLabel, secondLabel;
    private Icon blankCard = new javax.swing.ImageIcon(getClass().getResource("/inf221_ch8_memory_test/images/52.png"));
    private Timer matchTimer;
    private Timer nonMatchTimer;

    public MemoryPanel()
    {
        initComponents();
        this.setFocusable(true);
        matchTimer = new Timer(50, new MatchActionListener());
        nonMatchTimer = new Timer(2000, new NonMatchActionListener());
        firstLabel = null;
        secondLabel = null;
        setLayout(new GridLayout(4, 13, 3, 3));
        memory = new Memory();
        for (int row = 0; row < 4; row++)
        {
            for (int col = 0; col < 13; col++)
            {

                CardLabel c = new CardLabel(row, col, blankCard);
                MyMouseListener mml = new MyMouseListener();
                c.addMouseListener(mml);
                this.add(c);
            }
        }
    }

    public void reset()
    {
       
        firstLabel = null;
        secondLabel = null;
        this.removeAll();
        memory = new Memory();
        for (int row = 0; row < 4; row++)
        {
            for (int col = 0; col < 13; col++)
            {

                CardLabel c = new CardLabel(row, col, blankCard);
                MyMouseListener mml = new MyMouseListener();
                c.addMouseListener(mml);
                this.add(c);
            }
        }
        revalidate();
        repaint();
    }

    private class MyMouseListener implements MouseListener
    {

        @Override
        public void mouseClicked(MouseEvent me)
        {
            if (matchTimer.isRunning() || nonMatchTimer.isRunning())
            {
                return;
            }
            CardLabel label = (CardLabel) me.getSource();
            int row = label.getRow();
            int col = label.getCol();
            boolean success = memory.pickCard(row, col);
            if (success)
            {
                if (firstLabel == null)
                {
                    firstLabel = label;
                }
                else if (secondLabel == null)
                {
                    secondLabel = label;
                }
                Card card = memory.get(row, col);
                Icon icon = new javax.swing.ImageIcon(getClass().getResource("/inf221_ch8_memory_test/images/" + card.getCardNumber() + ".png"));
                label.setIcon(icon);
                boolean match;
                if (memory.getSecond() != null)
                {

                    match = memory.isMatch();
                    if (!match)
                    {
                        nonMatchTimer.start();
                    }
                    else
                    {
                        matchTimer.start();
                    }
                }
            }
        }

        @Override
        public void mousePressed(MouseEvent me)
        {
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void mouseReleased(MouseEvent me)
        {
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void mouseEntered(MouseEvent me)
        {
            // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void mouseExited(MouseEvent me)
        {
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }

    private class MatchActionListener implements ActionListener
    {

        @Override
        public void actionPerformed(ActionEvent ae)
        {
            firstLabel.setVisible(false);
            secondLabel.setVisible(false);
            firstLabel = null;
            secondLabel = null;
            System.out.println(firstLabel + ", " + secondLabel);
            matchTimer.stop();
            if (memory.isGameOver())
            {
                int result = JOptionPane.showConfirmDialog(MemoryPanel.this, "Game over man. Do you want to play again?");
                if (result == 0)
                {
                    reset();
                }
            }
        }
    }

    private class NonMatchActionListener implements ActionListener
    {

        @Override
        public void actionPerformed(ActionEvent ae)
        {
            firstLabel.setIcon(blankCard);
            secondLabel.setIcon(blankCard);
            firstLabel = null;
            secondLabel = null;
            nonMatchTimer.stop();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

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
