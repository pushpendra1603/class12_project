/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package project;

import java.awt.Image;
import java.awt.Point;
import java.util.Arrays;
import java.util.Collections;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author L-4 Sys 6
 */
public class card extends javax.swing.JFrame {

    /**
     * Creates new form card
     */
    int t=0;
    
    void diff(String a)
{
    li.setText(a);
}
    
    ImageIcon ibg;
    ImageIcon ic;
    ImageIcon ic1;
    ImageIcon ic2;
    ImageIcon ic3;
    ImageIcon ic4;
    ImageIcon ic5;
    ImageIcon ic6;
    ImageIcon ic7;
    ImageIcon ic8;
    
    Point p[]= new Point[16];
    
    public card() {
        initComponents();
        setExtendedState(this.MAXIMIZED_BOTH);
        
        l.setBounds(0,0,1366,768);
        l1.setBounds(275,25,100,150);
        l2.setBounds(275,200,100,150);
        l3.setBounds(275,375,100,150);
        l4.setBounds(275,550,100,150);
        l5.setBounds(500,25,100,150);
        l6.setBounds(500,200,100,150);
        l7.setBounds(500,375,100,150);
        l8.setBounds(500,550,100,150);
        l9.setBounds(725,25,100,150);
        l10.setBounds(725,200,100,150);
        l11.setBounds(725,375,100,150);
        l12.setBounds(725,550,100,150);
        l13.setBounds(950,25,100,150);
        l14.setBounds(950,200,100,150);
        l15.setBounds(950,375,100,150);
        l16.setBounds(950,550,100,150);
        
    Image bg=new ImageIcon("Images\\cardbg.jpg").getImage();
    Image nbg=bg.getScaledInstance(l.getWidth(), l.getHeight(), Image.SCALE_SMOOTH);
    ibg=new ImageIcon(nbg);
    
    Image c=new ImageIcon("Images\\c.jpg").getImage();
    Image nc=c.getScaledInstance(l1.getWidth(), l1.getHeight(), Image.SCALE_SMOOTH);
    ic=new ImageIcon(nc);
        
    Image c1=new ImageIcon("Images\\c1.jpg").getImage();
    Image nc1=c1.getScaledInstance(l1.getWidth(), l1.getHeight(), Image.SCALE_SMOOTH);
    ic1=new ImageIcon(nc1);
    
    Image c2=new ImageIcon("Images\\c2.jpg").getImage();
    Image nc2=c2.getScaledInstance(l1.getWidth(), l1.getHeight(), Image.SCALE_SMOOTH);
    ic2=new ImageIcon(nc2);
    
    Image c3=new ImageIcon("Images\\c3.jpg").getImage();
    Image nc3=c3.getScaledInstance(l1.getWidth(), l1.getHeight(), Image.SCALE_SMOOTH);
    ic3=new ImageIcon(nc3);
    
    Image c4=new ImageIcon("Images\\c4.jpg").getImage();
    Image nc4=c4.getScaledInstance(l1.getWidth(), l1.getHeight(), Image.SCALE_SMOOTH);
    ic4=new ImageIcon(nc4);
    
    Image c5=new ImageIcon("Images\\c5.jpg").getImage();
    Image nc5=c5.getScaledInstance(l1.getWidth(), l1.getHeight(), Image.SCALE_SMOOTH);
    ic5=new ImageIcon(nc5);
    
    Image c6=new ImageIcon("Images\\c6.jpg").getImage();
    Image nc6=c6.getScaledInstance(l1.getWidth(), l1.getHeight(), Image.SCALE_SMOOTH);
    ic6=new ImageIcon(nc6);
    
    Image c7=new ImageIcon("Images\\c7.jpg").getImage();
    Image nc7=c7.getScaledInstance(l1.getWidth(), l1.getHeight(), Image.SCALE_SMOOTH);
    ic7=new ImageIcon(nc7);
    
    Image c8=new ImageIcon("Images\\c8.jpg").getImage();
    Image nc8=c8.getScaledInstance(l1.getWidth(), l1.getHeight(), Image.SCALE_SMOOTH);
    ic8=new ImageIcon(nc8);
    
        l.setIcon(ibg);
        l1.setIcon(ic);
        l2.setIcon(ic);
        l3.setIcon(ic);
        l4.setIcon(ic);
        l5.setIcon(ic);
        l6.setIcon(ic);
        l7.setIcon(ic);
        l8.setIcon(ic);
        l9.setIcon(ic);
        l10.setIcon(ic);
        l11.setIcon(ic);
        l12.setIcon(ic);
        l13.setIcon(ic);
        l14.setIcon(ic);
        l15.setIcon(ic);
        l16.setIcon(ic);
        
        p[0]=l1.getLocation();
        p[1]=l2.getLocation();
        p[2]=l3.getLocation();
        p[3]=l4.getLocation();
        p[4]=l5.getLocation();
        p[5]=l6.getLocation();
        p[6]=l7.getLocation();
        p[7]=l8.getLocation();
        p[8]=l9.getLocation();
        p[9]=l10.getLocation();
        p[10]=l11.getLocation();
        p[11]=l12.getLocation();
        p[12]=l13.getLocation();
        p[13]=l14.getLocation();
        p[14]=l15.getLocation();
        p[15]=l16.getLocation();
        Collections.shuffle(Arrays.asList(p));
    
}
    
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        l1 = new javax.swing.JLabel();
        l2 = new javax.swing.JLabel();
        l3 = new javax.swing.JLabel();
        l4 = new javax.swing.JLabel();
        l5 = new javax.swing.JLabel();
        l6 = new javax.swing.JLabel();
        l7 = new javax.swing.JLabel();
        l8 = new javax.swing.JLabel();
        l10 = new javax.swing.JLabel();
        l11 = new javax.swing.JLabel();
        l12 = new javax.swing.JLabel();
        l13 = new javax.swing.JLabel();
        l14 = new javax.swing.JLabel();
        l15 = new javax.swing.JLabel();
        l16 = new javax.swing.JLabel();
        l9 = new javax.swing.JLabel();
        l = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        li = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cards");
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                formMouseMoved(evt);
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        l1.setText("A");
        l1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                l1MouseClicked(evt);
            }
        });
        getContentPane().add(l1);
        l1.setBounds(84, 44, 10, 14);

        l2.setText("B");
        l2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                l2MouseClicked(evt);
            }
        });
        getContentPane().add(l2);
        l2.setBounds(201, 44, 10, 14);

        l3.setText("C");
        l3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                l3MouseClicked(evt);
            }
        });
        getContentPane().add(l3);
        l3.setBounds(369, 44, 10, 14);

        l4.setText("D");
        l4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                l4MouseClicked(evt);
            }
        });
        getContentPane().add(l4);
        l4.setBounds(505, 44, 10, 14);

        l5.setText("E");
        l5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                l5MouseClicked(evt);
            }
        });
        getContentPane().add(l5);
        l5.setBounds(84, 102, 10, 14);

        l6.setText("F");
        l6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                l6MouseClicked(evt);
            }
        });
        getContentPane().add(l6);
        l6.setBounds(201, 102, 10, 14);

        l7.setText("G");
        l7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                l7MouseClicked(evt);
            }
        });
        getContentPane().add(l7);
        l7.setBounds(369, 102, 10, 14);

        l8.setText("H");
        l8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                l8MouseClicked(evt);
            }
        });
        getContentPane().add(l8);
        l8.setBounds(505, 102, 10, 14);

        l10.setText("J");
        l10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                l10MouseClicked(evt);
            }
        });
        getContentPane().add(l10);
        l10.setBounds(201, 178, 10, 14);

        l11.setText("K");
        l11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                l11MouseClicked(evt);
            }
        });
        getContentPane().add(l11);
        l11.setBounds(363, 178, 10, 14);

        l12.setText("L");
        l12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                l12MouseClicked(evt);
            }
        });
        getContentPane().add(l12);
        l12.setBounds(499, 178, 10, 14);

        l13.setText("M");
        l13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                l13MouseClicked(evt);
            }
        });
        getContentPane().add(l13);
        l13.setBounds(84, 238, 10, 14);

        l14.setText("N");
        l14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                l14MouseClicked(evt);
            }
        });
        getContentPane().add(l14);
        l14.setBounds(201, 238, 10, 14);

        l15.setText("O");
        l15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                l15MouseClicked(evt);
            }
        });
        getContentPane().add(l15);
        l15.setBounds(363, 238, 10, 14);

        l16.setText("P");
        l16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                l16MouseClicked(evt);
            }
        });
        getContentPane().add(l16);
        l16.setBounds(499, 238, 10, 14);

        l9.setText("Q");
        l9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                l9MouseClicked(evt);
            }
        });
        getContentPane().add(l9);
        l9.setBounds(80, 180, 10, 14);
        getContentPane().add(l);
        l.setBounds(0, 0, 20, 20);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Clicks");
        jPanel1.add(jLabel1);

        li.setForeground(new java.awt.Color(255, 255, 255));
        li.setText("100");
        jPanel1.add(li);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(30, 20, 70, 20);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
l1.setLocation(p[0]);
l2.setLocation(p[1]);
l3.setLocation(p[2]);
l4.setLocation(p[3]);
l5.setLocation(p[4]);
l6.setLocation(p[5]);
l7.setLocation(p[6]);
l8.setLocation(p[7]);
l9.setLocation(p[8]);
l10.setLocation(p[9]);
l11.setLocation(p[10]);
l12.setLocation(p[11]);
l13.setLocation(p[12]);
l14.setLocation(p[13]);
l15.setLocation(p[14]);
l16.setLocation(p[15]);
    }//GEN-LAST:event_formWindowOpened

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked

    }//GEN-LAST:event_formMouseClicked

    private void l1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l1MouseClicked
l1.setIcon(ic1);
t=Integer.parseInt(li.getText())-1;
li.setText(""+t);

if(l2.getIcon().equals(ic1))
{
    l1.setIcon(ic);
    l2.setIcon(ic);
    l1.setVisible(false);
    l2.setVisible(false);
}
    }//GEN-LAST:event_l1MouseClicked

    private void l2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l2MouseClicked
l2.setIcon(ic1);
t=Integer.parseInt(li.getText())-1;
li.setText(""+t);

if(l1.getIcon().equals(ic1))
{
    l1.setIcon(ic);
    l2.setIcon(ic);
    l1.setVisible(false);
    l2.setVisible(false);
}
    }//GEN-LAST:event_l2MouseClicked

    private void l3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l3MouseClicked
l3.setIcon(ic2);
t=Integer.parseInt(li.getText())-1;
li.setText(""+t);

if(l4.getIcon().equals(ic2))
{
    l3.setIcon(ic);
    l4.setIcon(ic);
    l3.setVisible(false);
    l4.setVisible(false);
}
    }//GEN-LAST:event_l3MouseClicked

    private void l4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l4MouseClicked
l4.setIcon(ic2);
t=Integer.parseInt(li.getText())-1;
li.setText(""+t);

if(l3.getIcon().equals(ic2))
{
    l3.setIcon(ic);
    l4.setIcon(ic);
    l3.setVisible(false);
    l4.setVisible(false);
}
    }//GEN-LAST:event_l4MouseClicked

    private void l5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l5MouseClicked
l5.setIcon(ic3);
t=Integer.parseInt(li.getText())-1;
li.setText(""+t);

if(l6.getIcon().equals(ic3))
{
    l5.setIcon(ic);
    l6.setIcon(ic);
    l5.setVisible(false);
    l6.setVisible(false);
}
    }//GEN-LAST:event_l5MouseClicked

    private void l6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l6MouseClicked
l6.setIcon(ic3);
t=Integer.parseInt(li.getText())-1;
li.setText(""+t);

if(l5.getIcon().equals(ic3))
{
    l5.setIcon(ic);
    l6.setIcon(ic);
    l5.setVisible(false);
    l6.setVisible(false);
}
    }//GEN-LAST:event_l6MouseClicked

    private void l7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l7MouseClicked
l7.setIcon(ic4);
t=Integer.parseInt(li.getText())-1;
li.setText(""+t);

if(l8.getIcon().equals(ic4))
{
    l7.setIcon(ic);
    l8.setIcon(ic);
    l7.setVisible(false);
    l8.setVisible(false);
}
    }//GEN-LAST:event_l7MouseClicked

    private void l8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l8MouseClicked
l8.setIcon(ic4);
t=Integer.parseInt(li.getText())-1;
li.setText(""+t);

if(l7.getIcon().equals(ic4))
{
    l7.setIcon(ic);
    l8.setIcon(ic);
    l7.setVisible(false);
    l8.setVisible(false);
}
    }//GEN-LAST:event_l8MouseClicked

    private void l9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l9MouseClicked
l9.setIcon(ic5);
t=Integer.parseInt(li.getText())-1;
li.setText(""+t);

if(l10.getIcon().equals(ic5))
{
    l9.setIcon(ic);
    l10.setIcon(ic);
    l9.setVisible(false);
    l10.setVisible(false);
}
    }//GEN-LAST:event_l9MouseClicked

    private void l10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l10MouseClicked
l10.setIcon(ic5);
t=Integer.parseInt(li.getText())-1;
li.setText(""+t);

if(l9.getIcon().equals(ic5))
{
    l9.setIcon(ic);
    l10.setIcon(ic);
    l9.setVisible(false);
    l10.setVisible(false);
}
    }//GEN-LAST:event_l10MouseClicked

    private void l11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l11MouseClicked
l11.setIcon(ic6);
t=Integer.parseInt(li.getText())-1;
li.setText(""+t);

if(l12.getIcon().equals(ic6))
{
    l11.setIcon(ic);
    l12.setIcon(ic);
    l11.setVisible(false);
    l12.setVisible(false);
}
    }//GEN-LAST:event_l11MouseClicked

    private void l12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l12MouseClicked
l12.setIcon(ic6);
t=Integer.parseInt(li.getText())-1;
li.setText(""+t);

if(l11.getIcon().equals(ic6))
{
    l11.setIcon(ic);
    l12.setIcon(ic);
    l11.setVisible(false);
    l12.setVisible(false);
}
    }//GEN-LAST:event_l12MouseClicked

    private void l13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l13MouseClicked
l13.setIcon(ic7);
t=Integer.parseInt(li.getText())-1;
li.setText(""+t);

if(l14.getIcon().equals(ic7))
{
    l13.setIcon(ic);
    l14.setIcon(ic);
    l13.setVisible(false);
    l14.setVisible(false);
}
    }//GEN-LAST:event_l13MouseClicked

    private void l14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l14MouseClicked
l14.setIcon(ic7);
t=Integer.parseInt(li.getText())-1;
li.setText(""+t);

if(l13.getIcon().equals(ic7))
{
    l13.setIcon(ic);
    l14.setIcon(ic);
    l13.setVisible(false);
    l14.setVisible(false);
}
    }//GEN-LAST:event_l14MouseClicked

    private void l15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l15MouseClicked
l15.setIcon(ic8);
t=Integer.parseInt(li.getText())-1;
li.setText(""+t);

if(l16.getIcon().equals(ic8))
{
    l15.setIcon(ic);
    l16.setIcon(ic);
    l15.setVisible(false);
    l16.setVisible(false);
}
    }//GEN-LAST:event_l15MouseClicked

    private void l16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l16MouseClicked
l16.setIcon(ic8);
t=Integer.parseInt(li.getText())-1;
li.setText(""+t);

if(l15.getIcon().equals(ic8))
{
    l15.setIcon(ic);
    l16.setIcon(ic);
    l15.setVisible(false);
    l16.setVisible(false);
}
    }//GEN-LAST:event_l16MouseClicked

    private void formMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseMoved
if(((l1.getIcon()!=ic || l2.getIcon()!=ic) && (l3.getIcon()!=ic || l4.getIcon()!=ic || l5.getIcon()!=ic || 
        l6.getIcon()!=ic || l7.getIcon()!=ic || l8.getIcon()!=ic || l9.getIcon()!=ic || l10.getIcon()!=ic ||
        l11.getIcon()!=ic || l12.getIcon()!=ic || l13.getIcon()!=ic || l14.getIcon()!=ic || l15.getIcon()!=ic || 
        l16.getIcon()!=ic)) || 
        ((l3.getIcon()!=ic || l4.getIcon()!=ic) && (l5.getIcon()!=ic || l6.getIcon()!=ic || l7.getIcon()!=ic || 
        l8.getIcon()!=ic || l9.getIcon()!=ic || l10.getIcon()!=ic || l11.getIcon()!=ic || l12.getIcon()!=ic || 
        l13.getIcon()!=ic || l14.getIcon()!=ic || l15.getIcon()!=ic || l16.getIcon()!=ic)) ||
        ((l5.getIcon()!=ic || l6.getIcon()!=ic) && (l7.getIcon()!=ic || l8.getIcon()!=ic || l9.getIcon()!=ic || 
        l10.getIcon()!=ic || l11.getIcon()!=ic || l12.getIcon()!=ic || l13.getIcon()!=ic || l14.getIcon()!=ic || 
        l15.getIcon()!=ic || l16.getIcon()!=ic)) ||
        ((l7.getIcon()!=ic || l8.getIcon()!=ic) && (l9.getIcon()!=ic || l10.getIcon()!=ic || l11.getIcon()!=ic || 
        l12.getIcon()!=ic || l13.getIcon()!=ic || l14.getIcon()!=ic || l15.getIcon()!=ic || l16.getIcon()!=ic)) ||
        ((l9.getIcon()!=ic || l10.getIcon()!=ic) && (l11.getIcon()!=ic || l12.getIcon()!=ic || l13.getIcon()!=ic || 
        l14.getIcon()!=ic || l15.getIcon()!=ic || l16.getIcon()!=ic)) ||
        ((l11.getIcon()!=ic || l12.getIcon()!=ic) && (l13.getIcon()!=ic || l14.getIcon()!=ic || l15.getIcon()!=ic || 
        l16.getIcon()!=ic)) ||
        ((l13.getIcon()!=ic || l14.getIcon()!=ic) && (l15.getIcon()!=ic || l16.getIcon()!=ic)))
{
    l1.setIcon(ic);
    l2.setIcon(ic);
    l3.setIcon(ic);
    l4.setIcon(ic);
    l5.setIcon(ic);
    l6.setIcon(ic);
    l7.setIcon(ic);
    l8.setIcon(ic);
    l9.setIcon(ic);
    l10.setIcon(ic);
    l11.setIcon(ic);
    l12.setIcon(ic);
    l13.setIcon(ic);
    l14.setIcon(ic);
    l15.setIcon(ic);
    l16.setIcon(ic);
}
else if(Integer.parseInt(li.getText())<=0)
{
    JOptionPane.showMessageDialog(null, "LOSERRRRRRRRRR");
    {
    this.dispose();
    new gamemenu().setVisible(true);
    }
}
else if((l1.isVisible() || l2.isVisible() || l3.isVisible() || l4.isVisible() || l5.isVisible() || 
        l6.isVisible() || l7.isVisible() || l8.isVisible() || l9.isVisible() || l10.isVisible() || 
        l11.isVisible() || l12.isVisible() || l13.isVisible() || l14.isVisible() || l15.isVisible() || 
        l16.isVisible())==false)
{
    JOptionPane.showMessageDialog(null, "WINNERRRRRRRRR");
    {
    this.dispose();
    new gamemenu().setVisible(true);
    }
}
    }//GEN-LAST:event_formMouseMoved

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowClosed

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
            java.util.logging.Logger.getLogger(card.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(card.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(card.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(card.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new card().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel l;
    private javax.swing.JLabel l1;
    private javax.swing.JLabel l10;
    private javax.swing.JLabel l11;
    private javax.swing.JLabel l12;
    private javax.swing.JLabel l13;
    private javax.swing.JLabel l14;
    private javax.swing.JLabel l15;
    private javax.swing.JLabel l16;
    private javax.swing.JLabel l2;
    private javax.swing.JLabel l3;
    private javax.swing.JLabel l4;
    private javax.swing.JLabel l5;
    private javax.swing.JLabel l6;
    private javax.swing.JLabel l7;
    private javax.swing.JLabel l8;
    private javax.swing.JLabel l9;
    private javax.swing.JLabel li;
    // End of variables declaration//GEN-END:variables
}
