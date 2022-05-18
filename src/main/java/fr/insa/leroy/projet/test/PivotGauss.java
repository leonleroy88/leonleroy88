package fr.insa.leroy.projet.test;


public class PivotGauss {
    
  static void affichageVecteur(double [] t) { /*on crée une fonction pour afficher les vecteurs avec 1 à 3 chiffres près */
    for ( int i = 0 ; i < t.length ; i++ ) {
      System.out.printf("%3.1f\n",t[i]); }
  }
  
  static void affichageMatrice(double [][] t) { /*pareil que au dessus mais pour la matrice*/
      for (double[] t1 : t) {
          for (int j = 0; j < t1.length; j++) {
              System.out.printf("%3.1f", t1[j]);
          }
      }
  }
  

  static double [] produit(double [][] m,double [] v) { /* on crée la méthode qui va permettre de faire le produit des matrices*/
    int n = v.length;
    double [] w = new double[n];
    for ( int i = 0 ; i < n ; i++ ) {
      w[i] = 0.0;
      for ( int j = 0 ; j < n ; j++ ) {
        w[i] = w[i] + m[i][j]*v[j]; } }
    return w;
  }
  


  static double [] cloneV(double [] t) { /* on crée de quoi pouvoir cloner les matrices et les vecteurs*/
    int n = t.length;
    double [] nt = new double[n];
    for ( int i = 0 ; i < n ; i++ ) {
      nt[i] = t[i]; }
    return nt;
  }


  static double [][] cloneM(double [][] t) { 
    int n = t.length;
    int m = t[0].length;
    double [][] nt = new double[n][m];
    for ( int i = 0 ; i < n ; i++ ) {
      for ( int j = 0 ; j < m ; j++ ) {
        nt[i][j] = t[i][j]; } }
    return nt;
  }



  static void permutation(int l,double [][] a,double [] b) { /*Cette classe permet d'effecuter les permutations nécessaires à la méthode du pivot de Gauss*/
    int n = b.length;
    double aux;
    int ll = l;
    while ( a[ll][l] == 0.0 ) {
      ll++; }
    for ( int i = l ; i < n ; i++ ) {
      aux = a[l][i];
      a[l][i] = a[ll][i];
      a[ll][i] = aux; }
    aux = b[l];
    b[l] = b[ll];
    b[ll] = aux;
  }


  static void transformation(double [][] a,double [] b) { /*Transforme la matrice en matrice diagonale pour effectuer la résolution*/
    int n = b.length;
    for ( int i = 1 ; i < n ; i++ ) {
      if ( a[i-1][i-1] == 0.0 )
        permutation(i-1,a,b);
      for ( int j = i ; j < n ; j++ ) {
        double facteur = a[j][i-1]/a[i-1][i-1];
        for ( int k = i-1 ; k < n ; k++ ) {
          a[j][k] = a[j][k] - a[i-1][k]*facteur; }
        b[j] = b[j] - b[i-1]*facteur;  } }
  }


  
  static double [] extraction(double [][] a,double [] b) { 
    int n = b.length;
    double [] v = new double[n];
    v[n-1] = b[n-1]/a[n-1][n-1];
    for ( int i = n-2 ; i >= 0 ; i-- ) {
      v[i] = b[i];
      for ( int j = n-1 ; j > i ; j-- ) {
        v[i] = v[i] - v[j]*a[i][j]; }
      v[i] = v[i]/a[i][i]; }
    return v;
  }



  static double [] resolution(double [][] a, /*Résoud le système d'équations */
                              double [] b) {
    transformation(a,b);
    return extraction(a,b);
  }
  


  static double [] resolutionGauss(double [][] a, double [] b) { /*clone la matrice a et le vecteur b afin qu'ont puisse les afficher*/
    return resolution(cloneM(a),cloneV(b));
  }


  public static double[]inverse(double[][] a,double[] b) {
    double [] v; /*vecteur solution*/
    System.out.println("Matrice A:");/*affiche la matrice, le vecteur inconnu et le vecteur solution*/
    affichageMatrice(a);
    System.out.println("Vecteur B:");
    affichageVecteur(b);
    v = resolutionGauss(a,b);
    System.out.println("Vecteur V solution ");
    affichageVecteur(v);
    return v;
    }
}
