import javax.swing.*;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Création des clients
        // Création des clients
        Client[] clients = new Client[3];
        for (int i = 0; i < 3; i++) {
            System.out.println("Entrez les informations pour le client " + (i + 1) + ":");
            System.out.print("ID: ");
            int ID = scanner.nextInt();
            scanner.nextLine(); // Pour consommer la nouvelle ligne restante après nextInt()
            System.out.print("Nom: ");
            String nom = scanner.nextLine();
            System.out.print("Prénom: ");
            String prenom = scanner.nextLine();
            // Création d'un compte bancaire avec un solde initial de 0 pour chaque client
            CompteBancaire compte = new CompteBancaire();
            clients[i] = new Client(ID, nom, prenom, compte);
        }

        Client deuxiemeClient = clients[1];
        System.out.println("\nDépôt de 5000 euros pour le deuxième client...");
        deuxiemeClient.depot(5000);
        deuxiemeClient.compte.changerTauxInteret(0.1); // Changement du taux d'intérêt à 0.1
        System.out.println("Solde actuel du compte du deuxième client après dépôt: ");
        deuxiemeClient.compte.afficherSolde();

        System.out.println("\nInformations du deuxième client:");
        System.out.println("ID: " + deuxiemeClient.ID);
        System.out.println("Nom: " + deuxiemeClient.nom);
        System.out.println("Prénom: " + deuxiemeClient.prenom);
        System.out.println("Solde du compte: " + deuxiemeClient.compte.solde);

        System.out.println("\nSolde disponible sur chacun des comptes:");
        for (Client client : clients) {
            System.out.println("Solde du compte du client " + client.ID + ": " + client.compte.solde);
        }

    }
}
