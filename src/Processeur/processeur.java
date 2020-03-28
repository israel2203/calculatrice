/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Processeur;

import Interface.Fenetre;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author israel
 */
public class processeur implements ActionListener {
    
    private Fenetre screen;
    
    public processeur(){
      Fenetre screen= new Fenetre();
       this.screen.setVisible(true);
       screen.getOne().addActionListener(this);
       screen.getTwo().addActionListener(this);
       screen.getThree().addActionListener(this);
       screen.getFour().addActionListener(this);
       screen.getFive().addActionListener(this);
       screen.getSix().addActionListener(this);
       screen.getSeven().addActionListener(this);    
       screen.getEight().addActionListener(this);
       screen.getNine().addActionListener(this);
       screen.getZero().addActionListener(this);
       screen.getPoint().addActionListener(this);
       screen.getPlus().addActionListener(this);
       screen.getMinus().addActionListener(this);
       screen.getMultiplication().addActionListener(this);
       screen.getDivision().addActionListener(this);
       screen.getEqual().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()== screen.getOne()){
            
        }
    }
    
  
    
   
    
    
     

    
}
