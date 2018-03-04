/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testdes;

import jeudedes.FXMLDocumentController;

/**
 *
 * @author Anthony
 */
public class FactoryJeu  {

    public FactoryJeu() {
    }
    
    public Jeu getPartie(String s, FXMLDocumentController c){
        Jeu retour = null;
        
        switch(s)
        {
            case "421":
                retour= new Partie421();
                ((Partie421)retour).addObserver(c);
                
                break;
                
            case "lance10":
                retour= new Partie10Lance(); 
                ((Partie10Lance)retour).addObserver(c);
                break;
                
            default:
                retour = null;
        }
        
        
        
        return retour;
  
    }

}
