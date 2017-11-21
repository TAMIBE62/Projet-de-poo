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
public class Salary {
    private static String dateEntreeService = new String();
    
    public static void main(String[] args) 
    { 
        Personnel Personne = new Personnel();
        Personne.ajouterEmployé(new Vendeur(   "09A095X", "SAVIMBOK", "KENZO", 25, 1994, 110000));
        Personne.ajouterEmployé(new Representation(   "19A095X", "CIDSON", "RAZ", 54, dateEntreeService, 110000) {

            public double CalculerSalaire() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            
        });

        Personne.ajouterEmployé(new Technicien("14B3450X", "ALEMSON", "GREGOUARDO", 28, dateEntreeService, 110000) {

            @Override
            public double CalculerSalaire() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });

        Personne.ajouterEmploye(new Manutentionnaire(   "06B432", "DARFOUR", "KOLON ", 19, dateEntreeService, 110000) {

            public double CalculerSalaire() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });
        
        Personne.ajouterEmploye(new Manutentionnaire_A_risque(    "16A093X", "ALEXANDRE", "DE GENEVE", 39, dateEntreeService, 110000,25000) {

            public double CalculerSalaire() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public double calculerSalaire() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

        });
 
        Personne.afficherSalaires();
        
        System.out.println("Le salaire moyen dans l'entreprise vaut "+ Personne.salaireMoyen() + " FCFA.");
 
    }    

    private static abstract class Manutentionnaire_A_risque extends Employe {

        public Manutentionnaire_A_risque(String a093X, String alexandre, String de_geneve, int i, String dateEntreeService, int i0, int i1) {
        }
    }

    private static class Technicien extends Vendeur {

        public Technicien(String b3450X, String alemson, String gregouardo, int i, String dateEntreeService, int i0) {
        }
    }
}
