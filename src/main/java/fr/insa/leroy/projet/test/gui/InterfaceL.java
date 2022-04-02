/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.insa.leroy.projet.test.gui;

import javafx.scene.control.ChoiceBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleButton;
import javafx.scene.layout.VBox;

/**
 *
 * @author Elève
 */
public class InterfaceL extends VBox {
    
  private ToggleButton bNouveau;
  private ToggleButton blike;
  private ChoiceBox menuderoule;  
    
    public InterfaceL()
            {
    this.bNouveau = new ToggleButton("Noeud");  
    this.blike = new ToggleButton("Barre");
    this.setSpacing(10);
    
    this.getChildren().addAll(this.bNouveau, this.blike);
}
}