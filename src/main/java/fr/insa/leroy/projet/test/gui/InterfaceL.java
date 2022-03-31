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
  private RadioButton blike;
  private ChoiceBox menuderoule;  
    
    public InterfaceL()
            {
    this.bNouveau = new ToggleButton("Allan");  
    this.blike = new RadioButton("Ana");
    //ChoiceBox<String> menuderoule = new ChoiceBox<>();
    //this.menuderoule.getItems().addAll("Noeud","Ana","Léon");
    
    this.getChildren().addAll(this.bNouveau, this.blike);
}
}