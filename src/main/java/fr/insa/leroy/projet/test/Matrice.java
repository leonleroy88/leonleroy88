
import fr.insa.leroy.projet.test.Lire;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/*package fr.insa.beuvron.cours.m2.pasapasm2.dessin;

import fr.insa.leroy.projet.test.Lire;

/**
 *
 * @author Elève
 */

public class Matrice {
    
    //Attributs
    int  i, j, nblin, nbcol;
    double[][] coefs;
    
    //Constructeur
    Matrice (int nl, int nc)
    {
        this.nblin = nl;
        this.nbcol = nc;
        this.coefs = new double[nl][nc];
    
        for (i=0;i<nl;i++){
            for (j=0;j<nc;j++){
                coefs[i][j] = 0;
            }
        }
    }
     public static void main (String[] args){
        Matrice m;
        int  i, j;
        int nl;
        int nc ;
        
        System.out.println("Saisir les coeffs BG");
        nl = Lire.i();
        nc = Lire.i();
                m = new Matrice (nl, nc);
        
        for (i=0;i<nl;i++){
            for (j=0;j<nc;j++){
                System.out.print(m.coefs[i][j]+ " ");
            }
        System.out.println();
        }
    }
}

