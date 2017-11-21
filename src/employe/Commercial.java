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
abstract class Commercial extends Employe {
    private double chiffreAffaire=11000;
    public Commercial(String matricule,String nom,String prenom,String dateEntreeService,int age,double chiffreAffaire )
    {
        super(matricule,nom,prenom,age,dateEntreeService);
          this.chiffreAffaire=chiffreAffaire;

    }

    
    public double getchiffreAffaire()
    {
        return chiffreAffaire;
    }

    @Override
    public double calculerSalaire() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
