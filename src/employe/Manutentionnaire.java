/*
 * To change this license header, choose License Headers in Project
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employe;

/**
 *
 * @author compaq
 */
public class Manutentionnaire extends Employe {
   //CONSTANTES
    private final static double MULT = 5.0;
    private int nbrUnite;
        
     public Manutentionnaire(String matricule, String nom, String prenom, int age, String dateEntreeService, int tempsPasse) 
    {
        super(matricule, nom, prenom, age, dateEntreeService);
        this.nbrUnite=nbrUnite; 
    }
 @Override
    public double calculerSalaire() 
    {
        double nbrP = 0;
        return MULT*nbrP;
    }
 
    @Override
    public String getNom()
    {
            return ("Le Manutentionnaire "+nom+ "" +prenom );

        }
  
    
 
}

