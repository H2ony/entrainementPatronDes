/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testdes;

import java.util.Observable;
import jeudedes.FXMLDocumentController;

/**
 *
 * @author Anthony
 */
public abstract class JeuDecorator extends Player{
    protected Player player;
    public abstract String getInfosPlus();
}
