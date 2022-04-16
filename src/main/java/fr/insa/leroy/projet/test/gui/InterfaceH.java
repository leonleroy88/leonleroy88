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
    
    private Button GrosBoutonLeon;
    private Button supprime;
    private Menu aide;
    private Button help;
    
    
    public InterfaceH(){
        this.GrosBoutonLeon = new Button("Léon");
        this.supprime = new Button("Supprimer");
        this.aide = new Menu("Aide");
       
        this.help = new Button("A propos");
        this.help.setOnAction((t) -> {
             Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("A propos");
            alert.setHeaderText("Projet Treillis - Informatique S2");
            alert.setContentText("Projet réalisé par Ana & Allan & Léon ");
            alert.showAndWait();
        });
        
        
        //this.aide.getItems().add(help);
        
        this.setSpacing(10);
        
        this.getChildren().addAll(this.GrosBoutonLeon, this.supprime,this.help);
        
        // coucou les loulous
    }
}
