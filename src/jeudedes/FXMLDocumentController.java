/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jeudedes;

import java.net.URL;
import java.util.Observable;
import java.util.Observer;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import testdes.AdultePlayer;
import testdes.EnfantPlayer;
import testdes.Jeu;
import testdes.JeuDecorator;
import testdes.JeuDecoratorAffichage;
import testdes.JeuDecoratorDebug;
import testdes.Partie10Lance;
import testdes.Partie421;
import testdes.Player;

/**
 *
 * @author Anthony
 */
public class FXMLDocumentController implements Initializable, Observer{
    
    @FXML
    private Label label;
    Jeu j1;
    //Jeu j2;
    
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        j1.jouer();
        //j2.jouer();
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
      
        j1 = new Partie421();
        //j2 = new Partie10Lance();
        
        ((Partie421)j1).addObserver(this);
       // ((Partie10Lance)j2).addObserver(this);
        
        //j1
       
    }    

    @Override
    public void update(Observable o, Object o1) {
        Player p1 = new AdultePlayer();
        Player p2 = new EnfantPlayer();
        p1 = new JeuDecoratorDebug(p1);
        p2 = new JeuDecoratorAffichage(p2);
        System.out.println(p1.getInfosPlus());
        System.out.println(p2.getInfosPlus());
        this.label.setText(String.valueOf(((Jeu)o).statutPartie()));
    }
    
}
