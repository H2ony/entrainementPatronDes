/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testdes;

import java.util.Random;

/**
 *
 * @author Anthony
 */
public class EnfantPlayer extends Player {

    public EnfantPlayer() {
        super();
        Random rand = new Random();
        this.age=rand.nextInt(100 - 1 + 1) + 1;
    }
        
       public String getInfosPlus(){
        return "Je suis un enfant";
    }
}
