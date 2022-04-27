/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.insa.leroy.projet.test.gui;

import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;

/**
 *
 * @author Elève
 */
public class Controleur {
    private MainPanel vue;
    
    private int etat;

public Controleur(MainPanel vue) {
    this.vue = vue;

}

public void changetat(int nouvelEtat){
    if (nouvelEtat == 30){
        
    }
    
}

    void clikdanslazone(MouseEvent t) {
        double px = t.getX();
        double py = t.getY();
        Color col = Color.BLUE;
        
        
    }
        


}