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
    private String valeur1="";
    private String valeur2="";
    private Character operateur=0;
    private int resultat;
    
    public processeur(Fenetre screen){
        this.screen = screen;
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
//       screen.getPoint().addActionListener(this);
       screen.getPlus().addActionListener(this);
       screen.getMinus().addActionListener(this);
       screen.getMultiplication().addActionListener(this);
       screen.getDivision().addActionListener(this);
       screen.getEgale().addActionListener(this);
       screen.getAnnuler().addActionListener(this);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
//   Getting the input number
        if(e.getSource()== screen.getOne()){
            if(operateur==0){
                valeur1=valeur1+"1";
             screen.getScreen().setText(valeur1);
            }
            else{
                valeur2=valeur2+"1";
                screen.getScreen().setText(valeur2);
            }
            
        }
         if(e.getSource()== screen.getTwo()){
            if(operateur==0){
                valeur1=valeur1+"2";
                screen.getScreen().setText(valeur1);
            }
            else{
                valeur2=valeur2+"2";
                screen.getScreen().setText(valeur2);
            }
            
        }
          if(e.getSource()== screen.getThree()){
            if(operateur==0){
                valeur1=valeur1+"3";
                screen.getScreen().setText(valeur1);
            }
            else{
                valeur2=valeur2+"3";
                screen.getScreen().setText(valeur2);
            }
            
        } if(e.getSource()== screen.getFour()){
            if(operateur==0){
                valeur1=valeur1+"4";
                screen.getScreen().setText(valeur1);
            }
            else{
                valeur2=valeur2+"4";
                screen.getScreen().setText(valeur2);
            }
            
        } if(e.getSource()== screen.getFive()){
            if(operateur==0){
                valeur1=valeur1+"5";
                screen.getScreen().setText(valeur1);
            }
            else{
                valeur2=valeur2+"5";
                screen.getScreen().setText(valeur2);
            }
            
        } if(e.getSource()== screen.getSix()){
            if(operateur==0){
                valeur1=valeur1+"6";
                screen.getScreen().setText(valeur1);
            }
            else{
                valeur2=valeur2+"6";
                screen.getScreen().setText(valeur2);
            }
            
        } if(e.getSource()== screen.getSeven()){
            if(operateur==0){
                valeur1=valeur1+"7";
                screen.getScreen().setText(valeur1);
            }
            else{
                valeur2=valeur2+"7";
                screen.getScreen().setText(valeur2);
            }
            
        } if(e.getSource()== screen.getEight()){
            if(operateur==0){
                valeur1=valeur1+"8";
                screen.getScreen().setText(valeur1);
            }
            else{
                valeur2=valeur2+"8";
                screen.getScreen().setText(valeur2);
            }
            
        } if(e.getSource()== screen.getNine()){
            if(operateur==0){
                valeur1=valeur1+"9";
                screen.getScreen().setText(valeur1);
            }
            else{
                valeur2=valeur2+"9";
                screen.getScreen().setText(valeur2);
            }
            
        } if(e.getSource()== screen.getZero()){
            if(operateur==0){
                valeur1=valeur1+"0";
                screen.getScreen().setText(valeur1);
            }
            else{
                valeur2=valeur2+"0";
                screen.getScreen().setText(valeur2);
            }
            
        }
//      Getting the input number

//      Getting the entered operator
        if(e.getSource()== screen.getPlus()){
            operateur=43;
            
        }
         if(e.getSource()== screen.getMinus()){
            operateur=45;
            
        }
          if(e.getSource()== screen.getMultiplication()){
            operateur=42;
            
        }
           if(e.getSource()== screen.getDivision()){
            operateur=47;
            
        }
//      Getting the entered operator

//      Making the calculation
        if(e.getSource()== screen.getEgale()){  
            int v1,v2;
            v1=Integer.parseInt(valeur1);
            v2=Integer.parseInt(valeur2);
            switch(operateur){
                case 43:
                         resultat=v1+v2;
                         break;
                case 45:
                         resultat=v1-v2;
                         break;
                case 42:
                         resultat=v1*v2;
                         break;
                case 47:
                         resultat=v1/v2;
                         break;
                 
            }
            screen.getScreen().setText(" "+resultat);
        }
//      Making the calculation
    
       if(e.getSource()==screen.getAnnuler()){ 
          valeur1="";
          valeur2="";
         screen.getScreen().setText("");
         
       }
    }
}
