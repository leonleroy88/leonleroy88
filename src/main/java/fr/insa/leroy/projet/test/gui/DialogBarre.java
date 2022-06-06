/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.insa.leroy.projet.test.gui;

import fr.insa.leroy.projet.test.Barre;
import javafx.scene.control.ButtonBar;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Dialog;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;

/**
 *
 * @author allan
 */
public class DialogBarre extends Dialog<Barre> { // Création de la fenetre, pour demander des attributs sur Barre

    private Barre barre;

    private TextField cout;
    private TextField compression;
    private TextField traction;

    public DialogBarre(MouseEvent t) {

        this.cout = new TextField("0.0");               // Champ de text, ar défaut a 0.0
        this.compression = new TextField("0.0");
        this.traction = new TextField("0.0");

        this.setTitle("Ajouter/Modifier Barre");    // Affiche en haut de la fenetre
        Label Traction = new Label("Traction :");   //
        Label Compression = new Label("Compression :");
        Label Cout = new Label("Cout :");

        GridPane grille = new GridPane();
        grille.add(Traction, 0, 0);
        grille.add(traction, 1, 0);
        grille.add(Compression, 0, 1);
        grille.add(compression, 1, 1);
        grille.add(Cout, 0, 2);
        grille.add(cout, 1, 2);

        ButtonType bOk2 = new ButtonType("Ok", ButtonBar.ButtonData.OK_DONE);       // bouton OK
        ButtonType bAnnuler = new ButtonType("Annuler", ButtonBar.ButtonData.CANCEL_CLOSE); // bouton cancel
        this.getDialogPane().setContent(grille);
        this.getDialogPane().getButtonTypes().add(bOk2);
        this.getDialogPane().getButtonTypes().add(bAnnuler);

    }
}