public class Date {
    int jour, mois, annee;

    public Date(int jour, int mois, int annee){
        this.jour = jour;
        this.mois = mois;
        this.annee = annee;
    }

    String afficher(){
        return this.jour+"/"+this.mois+"/"+this.annee;
    }
    public static int compareDatesStat(Date d1, Date d2) {
        if (d1.annee > d2.annee) {
            return 1;
        } else if (d1.annee < d2.annee) {
            return -1;
        } else {
            if (d1.mois > d2.mois) {
                return 1;
            } else if (d1.mois < d2.mois) {
                return -1;
            } else {
                if (d1.jour > d2.jour) {
                    return 1;
                } else if (d1.jour < d2.jour) {
                    return -1;
                } else {
                    return 0; // Les dates sont égales
                }
            }
        }
    }
}
