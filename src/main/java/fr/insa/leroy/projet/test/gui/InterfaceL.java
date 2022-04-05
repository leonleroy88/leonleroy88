/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.insa.leroy.projet.test.gui;

import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.layout.VBox;

/**
 *
 * @author Elève
 */
public class InterfaceL extends VBox {
    
  private Button bNouveau;
  private Button bBarre;
  private ChoiceBox menuderoule;  
    
    public InterfaceL()
            {
    this.bNouveau = new Button("Noeud"); 
    this.bNouveau.setOnAction((t) -> {
        System.out.println("Bouton Noeud");
    });
    
    this.bBarre = new Button("Barre");
    this.bBarre.setOnAction((t) -> {
       System.out.println("Barre");
        
    });
   
    
   // this.setSpacing(10);
    
    this.getChildren().addAll(this.bNouveau, this.bBarre);
}
}