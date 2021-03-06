/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.insa.leroy.projet.test.gui;

import fr.insa.leroy.projet.test.Barre;
import fr.insa.leroy.projet.test.Noeud;
import fr.insa.leroy.projet.test.NoeudAppui;
import fr.insa.leroy.projet.test.NoeudSimple;
import java.util.Optional;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;

/**
 *
 * @author Elève
 */
public class Controleur {
    private MainPanel main;
    private Noeud noeudSelect;
    public enum Etat { SELECT, NOEUD, BARRE1, BARRE2, NOEUDDOUBLE }
    
    private Etat etat;
    
    public Controleur(MainPanel main) {
        this.main = main;
        this.etat = Etat.SELECT;
    }
    
    public void clicDansDessin(MouseEvent t) {
        Noeud n;
        switch (this.etat) {
            case NOEUD:
              //n = new NoeudSimple.(t.getX(), t.getY());
                n = this.main.getModel().noeudPlusProche(t.getX(), t.getY(), 5);
                boolean creerNoeud = n==null;
                NoeudDialog dialog = new NoeudDialog(n, t);
                Optional<Noeud> p = dialog.showAndWait();
                if (p.isPresent()){
                    if (creerNoeud) {
                        n = p.get();
                        this.main.getModel().ajouteNoeud(n);
                    } else {
                        n.setPx(p.get().getPx());
                        n.setPy(p.get().getPy());
                        n.setForce(p.get().getForce());
                    }
                    //this.ChangerEtat(Etat.SELECT);
                }
                break;
            case NOEUDDOUBLE:
                n = this.main.getModel().noeudPlusProche(t.getX(), t.getY(), 5);
                boolean creerNoeud1 = n==null;
                NoeudDialog dialoge = new NoeudDialog(n, t);
                Optional<Noeud> p2 = dialoge.showAndWait();
                if (p2.isPresent()){
                    if (creerNoeud1) {
                        n = p2.get();
                        this.main.getModel().ajouteNoeud(n);
                    } else {
                        n.setPx(p2.get().getPx());
                        n.setPy(p2.get().getPy());
                        n.setForce(p2.get().getForce());
                    }
                    //this.ChangerEtat(Etat.SELECT);
                }
            case SELECT:
                n = this.main.getModel().noeudPlusProche(t.getX(), t.getY(), 5);
                if (n != null){
                    if (noeudSelect != null)
                     noeudSelect.setColor(Color.RED);
                     noeudSelect = n;
                     noeudSelect.setColor(Color.RED);
                } else {
                    if (noeudSelect != null){
                        noeudSelect.setColor(Color.RED);
                        noeudSelect = null;
                    }
                }
                break;
            case BARRE1:
                n = this.main.getModel().noeudPlusProche(t.getX(), t.getY(), 5);
                if (n != null){
                    if (noeudSelect != null)
                        noeudSelect.setColor(Color.RED);
                        System.out.println("Test barre"); 
                    noeudSelect = n;
                        noeudSelect.setColor(Color.RED);
                    this.ChangerEtat(Etat.BARRE2);
                }
                break;
            case BARRE2:
                n = this.main.getModel().noeudPlusProche(t.getX(), t.getY(), 5);
                if (n != null){
                    this.main.getModel().ajouteBarre(new Barre(this.noeudSelect, n));
                    this.noeudSelect.setColor(Color.BLUE);
                    this.noeudSelect = null;
                     DialogBarre dialog3 = new DialogBarre(t);
                     Optional<Barre> p1 = dialog3.showAndWait();
                    this.ChangerEtat(Etat.SELECT);
                }
                break;
            default:
                throw new AssertionError();
        }
    }
    
    public void ChangerEtat(Etat nouvelEtat){
        switch (nouvelEtat) {
            case SELECT:
                this.etat = nouvelEtat;
                this.main.getoutilsLeft().getNoeudDou();
                break;
            case NOEUD:
                this.etat = nouvelEtat;
                this.main.getoutilsLeft().getNoeudsimple();//setSelected(true)
                break;
            case NOEUDDOUBLE:
                this.etat = nouvelEtat;
                this.main.getoutilsLeft().getNoeudADouble();
                break;
            case BARRE1:
                this.etat = nouvelEtat;
                break;
            case BARRE2:
                this.etat = nouvelEtat;
                break;
            default:
                throw new AssertionError();
        }
        this.main.redrawAll();
    }
}

