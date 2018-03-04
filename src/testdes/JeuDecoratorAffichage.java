/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testdes;

/**
 *
 * @author Anthony
 */
public class JeuDecoratorAffichage extends JeuDecorator {
    
    
    public JeuDecoratorAffichage(Player p) {
        player = p;
    }

    @Override
    public String getInfosPlus() {
       return player.getInfosPlus() + player.getAge();
    }

    public JeuDecoratorAffichage() {
    }
    
}
