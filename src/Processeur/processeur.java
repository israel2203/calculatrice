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
    private double resultat;
    
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
       screen.getPoint().addActionListener(this);
       screen.getDelete().addActionListener(this);
       screen.getNegative_sign().addActionListener(this);
       screen.getPercentage().addActionListener(this);
       screen.getSquare_root().addActionListener(this);
        
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
              
        } if(e.getSource()== screen.getPoint()){
            if(operateur==0){
                valeur1=valeur1+".";
                screen.getScreen().setText(valeur1);
            }
            else{
                valeur2=valeur2+".";
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
            double v1,v2;
            v1=Double.parseDouble(valeur1);
            v2=Double.parseDouble(valeur2);
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
             int integerpart=(int)resultat;
             double netresult= integerpart-resultat;
            if(netresult==0.0){
            screen.getScreen().setText(" "+integerpart);
        }else{
            screen.getScreen().setText(" "+resultat);
            }
            valeur1="";
            valeur2="";
            operateur=0;
            
        }
//      Making the calculation
//     Special Buttons
     if(e.getSource()==screen.getSquare_root()){
          double v1=Double.parseDouble(valeur1);
          double result=Math.sqrt(v1);
             valeur1=" "+result;
            int integerpart=(int)result;
             double netresult= integerpart-result;
            if(netresult==0.0){
            screen.getScreen().setText(" "+integerpart);
        }else{
            screen.getScreen().setText(" "+result);
            }
           if(operateur!=0){
               double v2=Double.parseDouble(valeur2);
               result=Math.sqrt(v2);
               valeur2=" "+result;
               integerpart=(int)result;
             netresult= integerpart-result;
            if(netresult==0.0){
            screen.getScreen().setText(" "+integerpart);
           }
           }
           }
//     Special buttons
//    Cancelling the operation
      if(e.getSource()==screen.getAnnuler()){ 
          valeur1="";
          valeur2="";
          operateur=0;
         screen.getScreen().setText("");
         
       }
//    Cancelling the operation

    }
}
