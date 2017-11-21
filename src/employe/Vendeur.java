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
public class Vendeur extends Commercial {
    
     private final static double TAUX_VENDEUR = 0.2;
    private final static int PRIME_VENDEUR = 100;

    public Vendeur(String matricule,String nom,String prenom,int age,String dateEntreeService,double chiffreAffaire )
    {
        super(matricule,nom,prenom,dateEntreeService,age,chiffreAffaire);
    }
  
    
    public double calculerSalaire() 
    {
        return (TAUX_VENDEUR * getchiffreAff()) + PRIME_VENDEUR;
    }
 
    public String getDesignation()
        {
            return "Le vendeur ";
        }

    public double CalculerSalaire() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

       

    private double getchiffreAff()
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
         
}
