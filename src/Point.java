public class Point
{
    // Liste des attributs
    double x;
    double y;
    // Ecrire le constructeur par défaut

    Point(){
    }

    Point(double x,double y){
        this.x = x;
        this.y = y;

    }
    
    public static double distanceStat(Point p1, Point p2) {
        double dx = p1.x - p2.x;
        double dy = p1.y - p2.y;
        return Math.sqrt(dx * dx + dy * dy);
    }
    public double distance(Point P2) {
        double dx = this.x - P2.x;
        double dy = this.y - P2.y;
        return Math.sqrt(dx * dx + dy * dy);
    }

    void afficher() {
        System.out.println( "Point(" + this.x + ", " + this.y + ")");
    }

}