//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Point P0, P1;
        P0 = new Point();
        P0.x=3.1;
        P0.y=5.3;
        P1 = new Point(1.2,2.3);
        P1.afficher();
        System.out.println(Point.distanceStat(P0,P1));
        System.out.println(P0.distance(P1));
        // Exercice 2
        Date newDate = new Date(3,5,8);
        Date newDate2 = new Date(3,5,7);

        System.out.println(newDate.afficher());
        System.out.println(Date.compareDatesStat(newDate,newDate2));
    }
}