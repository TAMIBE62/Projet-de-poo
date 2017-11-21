/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employe;

/**
 *
 * @author compaq
 */
public abstract class Employe {

    
    private String matricule;
   public String nom;
    public String prenom;
    private int age;
    private String dateEntreeService ;
 
    public Employe(String matricule, String nom, String prenom, int age, String dateEntreeService) 
    {

        this.matricule = matricule;
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        this.dateEntreeService = dateEntreeService;

    }
    public abstract double calculerSalaire();
  
    public String getNom() 
    {
        return ( "l'employe "+ nom + " " + prenom);
    }
    
}       
