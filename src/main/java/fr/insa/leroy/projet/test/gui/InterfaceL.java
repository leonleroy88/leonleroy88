/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.insa.leroy.projet.test.gui;

import fr.insa.leroy.projet.test.Noeud;
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

    private BoutonIcone noeudsimple;
    private BoutonIcone noeudADouble;
    private RadioButton bBarre;
    private ChoiceBox menuderoule;
    private Text texte;
    private Text Tas;
    private Stage stage;
    private BoutonIcone noeudDou;
    private Controleur controle;
    private Noeud noeudPrecedent;
    private MainPanel main;

    public InterfaceL(MainPanel panel) {
        this.main = panel;
        this.noeudPrecedent = null;
        this.texte = new Text("Les Noeuds :");
        texte.setFont(Font.font("ARIAL", FontWeight.THIN, 12));
        texte.setTextAlignment(TextAlignment.CENTER);
        this.getChildren().add(this.texte);

        this.noeudsimple = new BoutonIcone("icones/NoeudS.PNG", 32, 32);
        this.noeudsimple.setOnAction((t) -> {
            System.out.println("Noeud Simple");
            this.main.getControleur().ChangerEtat(Controleur.Etat.NOEUD);

        });
        this.getChildren().add(this.noeudsimple);

        this.noeudDou = new BoutonIcone("icones/Noeud Simple.PNG", 32, 32);
        this.noeudDou.setOnAction((t) -> {
        });
        this.getChildren().add(this.noeudDou);

        this.noeudADouble = new BoutonIcone("icones/NoeudDouble.PNG", 32, 32);
        this.getChildren().add(this.noeudADouble);

        this.Tas = new Text("Barre :");
        Tas.setFont(Font.font("ARIAL", FontWeight.THIN, 12));
        Tas.setTextAlignment(TextAlignment.CENTER);

        this.bBarre = new RadioButton("Barre");
        this.bBarre.setOnAction((t) -> {
            System.out.println("Barre");
            this.main.getControleur().ChangerEtat(Controleur.Etat.BARRE1);

        });
        //ToggleGroup gBoutons = new ToggleGroup();
        //this.noeudsimple.setToggleGroup(gBoutons);
        //this.noeudDou.setToggleGroup(gBoutons);
        // this.bBarre.setToggleGroup(gBoutons);
        //  this.bBarre.setSelected(true);

        FxUtils.setSimpleBorder(this, Color.BLUEVIOLET, 1);
        this.setSpacing(10);
        this.getChildren().addAll(this.Tas, this.bBarre);

    }

    /**
     * @return the noeudsimple
     */
    public BoutonIcone getNoeudsimple() {
        return noeudsimple;
    }

    /**
     * @param noeudsimple the noeudsimple to set
     */
    public void setNoeudsimple(BoutonIcone noeudsimple) {
        this.noeudsimple = noeudsimple;
    }

    /**
     * @return the bBarre
     */
    public RadioButton getbBarre() {
        return bBarre;
    }

    /**
     * @return the menuderoule
     */
    public ChoiceBox getMenuderoule() {
        return menuderoule;
    }

    /**
     * @return the noeudDou
     */
    public BoutonIcone getNoeudDou() {
        return noeudDou;
    }

    /**
     * @return the noeudPrecedent
     */
    public Noeud getNoeudPrecedent() {
        return noeudPrecedent;
    }

}
