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
public class TestDes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Jeu j1;
        Jeu j2;
        j1 = new Partie421();
        j2 = new Partie10Lance();
        
        
        j1.jouer();
        j2.jouer();
        
        
        
        System.out.println("J1 : "+ j1.statutPartie()+" "+j1.toString()+" ,  j2 : "+j2.statutPartie()+ "  "+j2.toString());
        
        
    }
    
}
