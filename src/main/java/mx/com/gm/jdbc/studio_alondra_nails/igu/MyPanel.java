package mx.com.gm.jdbc.studio_alondra_nails.igu;

import java.awt.*;
import javax.swing.JPanel;

public class MyPanel extends JPanel{
    
    
    @Override
    public void paint(Graphics g){
        super.paint(g);
        g.setColor(Color.LIGHT_GRAY);
        int x = 30;
        for (int i = 0; i < 19; i++) {
           g.drawLine(0, (x*i)+15, 200, (x*i)+15);
        }
    
        
    }
    
}
