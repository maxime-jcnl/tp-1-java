public class Vehicule {
    String marque;
    int vitesse_max, vitesse_cour, PUISSANCE_FISC;
    static int Nombre = 0; // Attribut de classe Nombre

    Vehicule(){
        Nombre++; // Incrémentation lors de la création d'un nouvel objet Vehicule
    }
    Vehicule(String marque, int vitesse_max, int vitesse_cour, int PUISSANCE_FISC){
        this.marque = marque;
        this.vitesse_max= vitesse_max;
        this.vitesse_cour = vitesse_cour;
        this.PUISSANCE_FISC = PUISSANCE_FISC;
        Nombre++; // Incrémentation lors de la création d'un nouvel objet Vehicule
    }
    public void demarrer() {
        Nombre++;// Décrémentation lors de la suppression d'un objet Vehicule
    }
    public void eteindre() {
        Nombre--;
    }

    public void afficher(){
        System.out.println("Marque: "+this.marque+"\n");
        System.out.println("Puissance Fiscale: "+this.PUISSANCE_FISC+"\n");
        System.out.println("Vitesse Maximale: "+this.vitesse_max+"\n");
        System.out.println("Vitesse Courante: "+this.vitesse_cour+"\n");



    }
}
