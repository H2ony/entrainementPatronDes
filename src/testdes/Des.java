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
public class Des {
    private int numero;
    private int value;

    public int getNumero() {
        return numero;
    }

    public int getValue() {
        return value;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Des(int numero, int value) {
        this.numero = numero;
        this.value = value;
    }
    
    public void roll(){
        Random rand = new Random();
        this.value = rand.nextInt(6 - 1 + 1) + 1;
        
    }
    
}
