public class Client {
    int ID;
    String nom;
    String prenom;
    CompteBancaire compte;
    public Client(int ID, String nom, String prenom, CompteBancaire compte) {
        this.ID = ID;
        this.nom = nom;
        this.prenom = prenom;
        this.compte = compte;
    }

    public Client(int ID, String nom, String prenom) {
        this.ID = ID;
        this.nom = nom;
        this.prenom = prenom;
    }

    public void depot(double montant) {
        compte.solde += montant;
        System.out.println("Dépôt de " + montant + " effectué. Nouveau solde: " + compte.solde);
    }
    public void retirer(double montant) {
        if (montant <= compte.solde) {
            compte.solde -= montant;
            System.out.println("Retrait de " + montant + " effectué. Nouveau solde: " + compte.solde);
        } else {
            System.out.println("Solde insuffisant pour effectuer le retrait.");
        }
    }
}
