package Controller;

import Model.Block;
import View.SystemDisplay;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

/**
 * Sectioned off part of SystemBuilder.java when switching to MVC model
 *
 * @author Anthony Tran
 * @since 2017-09-16
 */
public class MouseTracker {

    public void mouseTracker(JLayeredPane panel) {
        panel.addMouseMotionListener(new MouseMotionAdapter() {
            Block draggedComponent = new Block();
            @Override
            public void mouseDragged(MouseEvent e) {
                String mouseIsOn = e.getComponent().getComponentAt(e.getPoint()).getClass().getSimpleName();
                if (mouseIsOn.equals("JLabel")) {
                    //make new block of same component
                    //We'll call it draggedComponent for now
                    //just make sure it has the same properties as the selected component

                    SystemDisplay.addToProgramWindow(draggedComponent, 1, 0);
                }
                draggedComponent.setLocation(e.getX() - 8, e.getY() - 8);
            }
        });
    }

    public void mouseTracker(Block block) {
        block.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                SystemDisplay.turnOnInputWindow(block);
            }
        });
    }

}
