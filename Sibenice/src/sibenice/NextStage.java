/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sibenice;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class NextStage {
     private int stage = 1;
     private JLabel imageLabel;
    
    public void setNextStage() {
        stage++;
        
        if(stage == 6){
            // konec hry
        }
        if (stage <= 6){
            imageLabel.setIcon(new ImageIcon("sibeniceObrazek"+stage+".png"));
        }
    }
}
