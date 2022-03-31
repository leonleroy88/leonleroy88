/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.insa.leroy.projet.test.gui;

import javafx.scene.layout.BorderPane;

/**
 *
 * @author Elève
 */
public class MainPanel extends BorderPane {
    
    private InterfaceH outilsTop;
    private InterfaceL outilsLeft;
    //private Dessin dessin;
    
    public MainPanel() {
        this.outilsTop = new InterfaceH();
        this.outilsLeft = new InterfaceL();
       // this.dessin = new Dessin(this);
        
        this.setTop(this.outilsTop);
        this.setLeft(this.outilsLeft);
       // this.setCenter(this.dessin);
    }
    
}
