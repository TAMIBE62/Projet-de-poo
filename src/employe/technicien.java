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
public class technicien extends Employe {
   //CONSTANTES
    private final static double MULT = 5.0;
    private int nbrUniteP;

   
//SON CONSTRUCTEUR 
    public technicien(String matricule, String nom, String prenom, int age, String dateEntreeService, int nbrUniteFabrique) 
    {
        super(matricule, nom, prenom, age, dateEntreeService);
        this.nbrUniteP = nbrUniteP;
    }
 
    
    public double calculerSalaire() 
    {
        return MULT * nbrUniteP;
    }
 
    
    public String getNom()
        {
            return ("Le technicien "+nom+ "" +prenom);
        } 
}
