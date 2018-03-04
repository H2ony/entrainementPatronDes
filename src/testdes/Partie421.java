/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testdes;

import java.util.ArrayList;
import java.util.Observable;

/**
 *
 * @author Anthony
 */
public class Partie421 extends Observable implements Jeu{
    
    private ArrayList<Des> lesDes;
    private int somme;
    
    public Partie421(){
        
        super();
        
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
        
        setChanged();
        notifyObservers(this.statutPartie());
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
    public String getInfosPlus(){
        return this.getClass()+", Score : "+this.somme+" "+this.lesDes.get(0).getValue();
    }
}
