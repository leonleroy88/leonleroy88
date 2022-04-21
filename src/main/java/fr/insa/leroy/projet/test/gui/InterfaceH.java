/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.insa.leroy.projet.test.gui;

import static java.awt.SystemColor.window;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Menu;
import javafx.scene.layout.HBox;

/**
 *
 * @author Elève
 */
public class InterfaceH extends HBox {
    
    private Button fichier;
    private Button supprime;
    private Menu aide;
    private Button help;
    
    
    public InterfaceH(){
        this.fichier = new Button("Fichier");
        this.supprime = new Button("Supprimer");
        
        this.fichier.setOnAction((t) -> {
         //stage.setTitle("Création graphique du treillis");
         //window.setCenter(this.aide);
        });
       
        this.help = new Button("A propos");
        this.help.setOnAction((t) -> {
             Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("A propos");
            alert.setHeaderText("Projet Treillis - Informatique S2");
            alert.setContentText("Projet réalisé par Ana & Allan & Léon ");
            alert.showAndWait();
        });
        ChoiceBox<String> cbxLang = new ChoiceBox<String>();
        cbxLang.getItems().addAll("Deutsch", "English", "Français", "VIVALESPAGNA");
        cbxLang.getSelectionModel().select(3); 
        this.getChildren().add(cbxLang);
        
        //this.aide.getItems().add(help);
        
        this.setSpacing(5);
        
        this.getChildren().addAll(this.fichier, this.supprime,this.help);
        
        // coucou les loulous
    }
}
