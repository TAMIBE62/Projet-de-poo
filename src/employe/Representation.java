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
public class Representation extends Employe {
    private static final double pourcentage = 0.2;
   private static final double bonus = 200.0;

    public Representation(String matricule, String nom, String prenom, int age,String dateEntreeService , double chiffreAffaire) {
        super(matricule, nom, prenom, age,dateEntreeService );
    }

    @Override
    public double calculerSalaire() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
