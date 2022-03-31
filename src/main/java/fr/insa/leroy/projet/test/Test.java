/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.insa.leroy.projet.test;

/**
 *
 * @author Elève
 */
public class Test {
    public static void main(String [] args){
    double PX = 0 ,PY = 0;    
    Vecteur2D v1;
    Noeud n1;
    Vecteur2D fce = new Vecteur2D(0,0);
    n1 = Noeud.entreeNoeud(PX, PY, fce);
    System.out.println(n1.toString());
   
    // v1 = new Vecteur2D(0,0);
     //v1.setvx();
    // v1.setvy();   
     
     //System.out.println(v1.toString());
}
}
