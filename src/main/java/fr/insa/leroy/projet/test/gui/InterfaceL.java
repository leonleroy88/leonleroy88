/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.insa.leroy.projet.test.gui;


import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
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

    private RadioButton noeudsimple;
    private RadioButton bBarre;
    private ChoiceBox menuderoule;
    private Text texte;
    private Text Tas;
    private Stage stage;
    private RadioButton noeudDou;

 public InterfaceL() {
     
        this.texte = new Text("Les Noeuds :");
        texte.setFont(Font.font("ARIAL", FontWeight.THIN, 12));
        texte.setTextAlignment(TextAlignment.CENTER);
        this.getChildren().add(this.texte);

        this.noeudsimple = new RadioButton("Noeud Simple");
        this.noeudsimple.setOnAction((t) -> {
            System.out.println("Noeud Simple");
        });
        
        this.noeudDou = new RadioButton("Noeud Double");
        
        this.Tas = new Text("Barre :");
        Tas.setFont(Font.font("ARIAL", FontWeight.THIN, 12));
        Tas.setTextAlignment(TextAlignment.CENTER);
        //this.getChildren().add(this.Tas);

        this.bBarre = new RadioButton("Barre");
        this.bBarre.setOnAction((t) -> {
            System.out.println("Barre");
        });
        ToggleGroup gBoutons = new ToggleGroup();
        this.noeudsimple.setToggleGroup(gBoutons);
        this.noeudDou.setToggleGroup(gBoutons);
        this.bBarre.setToggleGroup(gBoutons);
        this.noeudsimple.setSelected(true);
        
       
        FxUtils.setSimpleBorder(this, Color.BLUEVIOLET, 1);
        this.setSpacing(10);
       this.getChildren().addAll(this.noeudsimple,this.noeudDou,this.Tas, this.bBarre);

    }

}