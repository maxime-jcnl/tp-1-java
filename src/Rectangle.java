public class Rectangle {

    // Déclarer les attributs
    Point p1,p2,p3,p4;

         // Constructeur à 4 paramètres initialisant les différents attributs
    public Rectangle(Point p1, Point p2, Point p3, Point p4){
        this.p1=p1;
        this.p2 = p2;
        this.p3 = p3;
        this.p4= p4;
    }

    private double distance(Point a, Point b) {
        return Math.sqrt(Math.pow(b.x - a.x, 2) + Math.pow(b.y - a.y, 2));
    }
    public double calculerPerimetre() {
        double longueur = distance(p1, p2);
        double largeur = distance(p2, p3);
        return 2 * (longueur + largeur);
    }
    public double calculerSurface() {
        double longueur = distance(p1, p2);
        double largeur = distance(p2, p3);
        return longueur * largeur;
    }
}