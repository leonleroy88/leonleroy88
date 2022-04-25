/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.insa.leroy.projet.test.gui;

import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.HBox;

/**
 *
 * @author Elève
 */
public class InterfaceH extends HBox {
    
    private Menu fichier;
    private Button supprime;
    private Menu aide;
    private Button help;
    private MenuItem sauvegarder, ouvrir, nouveau;
    
    
    public InterfaceH(){
        this.fichier = new Menu("Fichier");
        this.sauvegarder = new MenuItem("Enregistrer");
        this.ouvrir = new MenuItem("Ouvrir");
        this.nouveau = new MenuItem("Nouveau");
       // this.getChildren().add(this.fichier);
        
        
        fichier.getItems().add(sauvegarder);
        fichier.getItems().add(ouvrir);
        fichier.getItems().add(nouveau);
        
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
       
        
        this.setSpacing(15);
        
        this.getChildren().addAll(this.supprime,this.help);
        
        // coucou les loulous
    }
}
