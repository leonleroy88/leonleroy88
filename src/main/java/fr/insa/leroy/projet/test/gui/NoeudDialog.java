/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.insa.leroy.projet.test.gui;

import fr.insa.leroy.projet.test.Noeud;
import fr.insa.leroy.projet.test.NoeudSimple;
import fr.insa.leroy.projet.test.Vecteur2D;
import javafx.scene.control.ButtonBar.ButtonData;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Dialog;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;

/**
 *
 * @author Elève
 */
public class NoeudDialog extends Dialog<Noeud> {
    private Noeud noeud;
    
    private TextField tfPx;
    private TextField tfPy;
    private TextField tfFPx;
    private TextField tfFPy;
    
    public NoeudDialog(Noeud noeud, MouseEvent t){
        if (noeud != null) {
            this.tfPx = new TextField(Double.toString(noeud.getPx()));
            this.tfPy = new TextField(Double.toString(noeud.getPy()));
            this.tfFPx = new TextField(Double.toString(noeud.getForce().getVx()));
            this.tfFPy = new TextField(Double.toString(noeud.getForce().getVy()));
        } else {
            this.tfPx = new TextField(Double.toString(t.getX()));
            this.tfPy = new TextField(Double.toString(t.getY()));
            this.tfFPx = new TextField("0.0");
            this.tfFPy = new TextField("0.0");
        }
        this.noeud = noeud;
        this.setTitle("Ajouter/Modifier Noeud");
        Label lPx = new Label("Position X:");
        Label lPy = new Label("Position Y:");
        Label lFPx = new Label("Composante X de la force:");
        Label lFPy = new Label("Composante Y de la force:");
        
        GridPane grid = new GridPane();
        grid.add(lPx, 0, 0);
        grid.add(tfPx, 1, 0);
        grid.add(lPy, 0, 1);
        grid.add(tfPy, 1, 1);
        grid.add(lFPx, 0, 2);
        grid.add(tfFPx, 1, 2);
        grid.add(lFPy, 0, 3);
        grid.add(tfFPy, 1, 3);
        
        ButtonType bOk = new ButtonType("Ok", ButtonData.OK_DONE);
        ButtonType bAnnuler = new ButtonType("Annuler", ButtonData.CANCEL_CLOSE);
        this.getDialogPane().setContent(grid);
        this.getDialogPane().getButtonTypes().add(bOk);
        this.getDialogPane().getButtonTypes().add(bAnnuler);
        
        this.setResultConverter((p) -> {
            if (p == bOk) {
                double px, py, vx, vy;
                try {
                    px = Double.parseDouble(this.tfPx.getText());
                    py = Double.parseDouble(this.tfPy.getText());
                    vx = Double.parseDouble(this.tfFPx.getText());
                    vy = Double.parseDouble(this.tfFPy.getText());
                } catch (NumberFormatException e){
                    return null;
                }
                return new NoeudSimple(0, px, py, new Vecteur2D(vx,vy));
            } else {
                return null;
            }
        });
    }
}
    

