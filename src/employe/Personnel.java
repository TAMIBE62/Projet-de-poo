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
public class Personnel {
    private Employe[] personnel;

    private int nbreEmploye;
    private final static int NBR_MAX_EMPLOYE = 520;
    
    public Personnel() 
    {
        personnel = new Employe[NBR_MAX_EMPLOYE];
        nbreEmploye = 0;
    }
 
    public void ajouterEmploye(Employe employe) 
    {

        nbreEmploye++;
        if (nbreEmploye <= NBR_MAX_EMPLOYE) 
        {
            personnel[nbreEmploye - 1] = employe;
        } else 
        {

            System.out.println(-1);
        }
    }
 
    public double salaireMoyen() {

        double som = 0.0;
        for (int i = 0; i < nbreEmploye; i++) {

            som += personnel[i].calculerSalaire();
        }

        return som / nbreEmploye;
    }
 
    public void afficherSalaires() 
    {

        for (int i = 0; i < nbreEmploye; i++) 
        {
            System.out.println( personnel[i].getNom() + " gagne "+ personnel[i].calculerSalaire() + " FCFA.");

        }
    }

    void ajouterEmployé(Vendeur vendeur) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
