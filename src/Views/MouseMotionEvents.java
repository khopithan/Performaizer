/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

/**
 *
 * @author khopi
 */
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.JPanel;

class MouseMotionEvents extends JPanel implements MouseListener,
    MouseMotionListener {
  

  public MouseMotionEvents() {
    addMouseListener(this);
    addMouseMotionListener(this);
  }

  public void mouseClicked(MouseEvent me) {
  }

  public void mouseEntered(MouseEvent me) {
  }

  public void mouseExited(MouseEvent me) {
  }

  public void mousePressed(MouseEvent me) {
  }

  public void mouseReleased(MouseEvent me) {
  }

  public void mouseDragged(MouseEvent me) {
  }

  public void mouseMoved(MouseEvent me) {
      MainClass m = new MainClass();
      m.mClose(); 
  }
}
