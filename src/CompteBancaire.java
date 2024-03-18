public class CompteBancaire {
    double numeroCompte, solde;
    double interet;

    CompteBancaire(){
        this.interet = 0.05;
    }

    CompteBancaire(double numeroCompte, double solde, double interet){
        this.numeroCompte = numeroCompte;
        this.solde = solde;
        this.interet = interet;
    }
    public void changerTauxInteret(int nb){
        this.interet=nb;
    }

    public void ajouterInteret(){
        this.solde = this.solde+this.solde*this.interet;
    }

    public void afficherSolde(){
        System.out.println("Solde actuel: "+this.solde);
    }
}
