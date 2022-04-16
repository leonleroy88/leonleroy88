/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.insa.leroy.projet.test.gui;

import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;

/**
 *
 * @author Elève
 */
public class InterfaceL extends VBox {
    
  private Button bNouveau;
  private Button bBarre;
  private ChoiceBox menuderoule;  
  private Text texte;
    
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
        this.texte = new Text("Ana & Allan & Léon");
        texte.setFont(Font.font("ARIAL", FontWeight.THIN, 12));
        texte.setTextAlignment(TextAlignment.CENTER);
   
    
   // this.setSpacing(10);
    
    this.getChildren().addAll(this.bNouveau, this.bBarre,this.texte);
}
}