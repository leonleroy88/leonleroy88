/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.insa.leroy.projet.test.gui;

import javafx.scene.layout.Pane;

/**
 * sert a rien pour le moment 
 *
 * @author Elève
 */
public class Dessin extends Pane{
    private MainPanel main;
    
    public Dessin(MainPanel main) {
        super();
        this.main = main;
        this.redrawAll();
    }
    
    public  void redrawAll() {
       // this.getChildren().add();
    }
    
}
    

