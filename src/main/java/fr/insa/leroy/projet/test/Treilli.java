/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.insa.leroy.projet.test;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Elève
 */
public class Treilli {
    
    private List<Noeud> noeuds;
    private List<Barre> barres;
    
    public Treilli() {
        this.noeuds = new ArrayList<Noeud>();
        this.barres = new ArrayList<>();
    }
    
    public void ajouteNoeud(Noeud n) {
        this.getNoeuds().add(n);
    }
    
    public static Treilli treilliTest(){
        Treilli res;
        res = new Treilli();
        NoeudAppuiDouble n1 = new NoeudAppuiDouble(0, 200, new Vecteur2D(0, 0));
        NoeudSimple n2 = new NoeudSimple(2, 100, 100, new Vecteur2D(0, -1000));
        NoeudAppuiSimple n3 = new NoeudAppuiSimple(0, 0, new Vecteur2D(0, 0));
        res.ajouteNoeud(n1);
        res.ajouteNoeud(n2);
        res.ajouteNoeud(n3);
        return res;
    }

    /**
     * @return the noeuds
     */
    public List<Noeud> getNoeuds() {
        return noeuds;
    }

    /**
     * @return the barres
     */
    public List<Barre> getBarres() {
        return barres;
    }
    
}
