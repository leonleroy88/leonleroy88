/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.insa.leroy.projet.test.gui;

import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;

/**
 *
 * @author Elève
 */
public class InterfaceL extends VBox {

    private Button noeud;
    private Button bBarre;
    private ChoiceBox menuderoule;
    private Text texte;
    private Stage stage;
    private Button commencer;

    public InterfaceL() {

        this.noeud = new Button("Noeud");
        this.noeud.setOnAction((t) -> {
            System.out.println("Noeud");
        });

        this.bBarre = new Button("Barre");
        this.bBarre.setOnAction((t) -> {
            System.out.println("Barre");
            //window.setCenter(this.);

        });
        this.texte = new Text("Ana & Allan & Léon");
        texte.setFont(Font.font("ARIAL", FontWeight.THIN, 12));
        texte.setTextAlignment(TextAlignment.CENTER);

        this.commencer = new Button("Commencer");
        this.commencer.setOnAction((t) -> {

        });
        FxUtils.setSimpleBorder(this, Color.BLUEVIOLET, 1);
        this.getChildren().addAll(this.noeud, this.bBarre, this.commencer);

    }

}
