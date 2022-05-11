/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.insa.leroy.projet.test;

/**
 *
 * @author Elève
 */
public class Vecteur2D {
    private double vx;
    private double vy;

    /**
     * @return the vx
     */
    public double getVx() {
        return vx;
    }

    /**
     * @param vx the vx to set
     */
    public void setVx(double vx) {
        this.vx = vx;
    }

    /**
     * @return the vy
     */
    public double getVy() {
        return vy;
    }

    /**
     * @param vy the vy to set
     */
    public void setVy(double vy) {   // les asséseurs 
        this.vy = vy;
    }
    
     public Vecteur2D (double vx, double vy){
      this.vx = vx;
      this.vy = vy;
    }
 
     
    
     void setvx(){
     System.out.println("Entrer la composante x");
     this.vx=Lire.d();
     }
     void setvy(){
     System.out.println("Entrer la composante y");
     this.vy=Lire.d();
    
     }
    @Override
    public String toString() {
    return ("Vecteur ( vx = " + this.vx + ", vy = " + this.vy + " )");
    }
     }
     


    



