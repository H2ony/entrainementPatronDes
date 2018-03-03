/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testdes;

import java.util.ArrayList;

/**
 *
 * @author Anthony
 */
public class Partie421 implements Jeu{
    
    private ArrayList<Des> lesDes;
    private int somme;
    
    public Partie421(){
        this.somme = 0;
        this.lesDes = new ArrayList<Des>();
        
        for (int i = 0; i < 3; i++) {
            Des DesTemp = new Des(i,i);
            
            this.lesDes.add(DesTemp);
        }
    }
    
    @Override
    public void jouer() {
        this.somme = 0;
        
        for(Des d : this.lesDes){
            d.roll();
            
            this.somme +=d.getValue();
        }
    }

    @Override
    public boolean statutPartie() {
       if(this.somme == 7 ){
           return true;
       }
       else{
           return false;
       }
    }
    
    public String toString(){
        return "Score : "+this.somme;
    }
    
}
