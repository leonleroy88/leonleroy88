/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.insa.leroy.projet.test.gui;

import fr.insa.leroy.projet.test.Treillis;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

/**
 *
 * @author Elève
 */
public class InterfaceH extends HBox {

    private Stage stage;
    private MenuBar bar;
    private Menu fichier;
    private Button supprime;
    private Menu aide;
    private Button help;
    private MenuItem sauvegarder, ouvrir, nouveau, enregistrer;
    private File fichierCourant;
    private Treillis treillis;
    private MainPanel vue;
    private BoutonIcone leon;

    public InterfaceH() {
        this.fichier = new Menu("Fichier");
        this.enregistrer = new MenuItem("Enregistrer");
        this.enregistrer.setOnAction((t) -> {
            if (this.fichierCourant != null) {
                save(this.fichierCourant);
            } else {
                saveAs();
            }
        });
        this.sauvegarder = new MenuItem("Enregistrer sous");
        this.sauvegarder.setOnAction((t) -> {
            saveAs();
        });
        this.ouvrir = new MenuItem("Ouvrir");
        this.nouveau = new MenuItem("Nouveau");

        fichier.getItems().add(ouvrir);
        fichier.getItems().add(enregistrer);
        fichier.getItems().add(sauvegarder);
        fichier.getItems().add(nouveau);
        this.bar = new MenuBar(this.fichier);

        this.getChildren().add(bar);

        this.supprime = new Button("Supprimer");

        this.fichier.setOnAction((t) -> {

        });

        this.help = new Button("A propos");
        this.help.setOnAction((t) -> {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("A propos");
            alert.setHeaderText("Projet Treillis - Informatique S2");
            alert.setContentText("Projet réalisé par Allan & Léon ");
            alert.showAndWait();
        });

        this.setSpacing(15);
        FxUtils.setSimpleBorder(this, Color.BLUEVIOLET, 1);
        //this.bTranslateDroite = new BoutonIcone("icones/droite.png",32,32);
        this.leon = new BoutonIcone("icones/okkk.PNG",32,32);
        this.leon.setOnAction((t) -> {
            System.out.println("ICONES");
        });
        
        this.getChildren().addAll(this.supprime, this.help,this.leon);

        // coucou les loulous
    }

    public void saveAs() {
        FileChooser chooser = new FileChooser();
        File f = chooser.showSaveDialog(this.stage);
        if (f != null) {
            save(f);
        }
    }

    private void save(File f) {
        try (BufferedWriter bout = new BufferedWriter(new FileWriter(f))) {
            treillis.save(bout);
            this.fichierCourant = f;
        } catch (IOException ex) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Erreur");
            alert.setHeaderText("Problème durant la sauvegarde");
            alert.setContentText(ex.getLocalizedMessage());
            alert.showAndWait();
        }
    }
    
    
}