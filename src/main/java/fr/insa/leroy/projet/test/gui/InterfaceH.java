/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.insa.leroy.projet.test.gui;

import javafx.scene.control.Button;
import javafx.scene.layout.HBox;

/**
 *
 * @author Elève
 */
public class InterfaceH extends HBox {
    
    private Button GrosBoutonLeon;
    private Button supprime;
    private Button aide;
    
    
    public InterfaceH(){
        this.GrosBoutonLeon = new Button("Léon");
        this.supprime = new Button("Supprimer");
        this.aide = new Button("Aide");
        
        
        
        this.setSpacing(10);
        
        
        
        
        
        this.getChildren().addAll(this.GrosBoutonLeon, this.supprime,this.aide);
        // coucou les loulous
    }
}
