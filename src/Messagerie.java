import java.util.Scanner;

public class Messagerie {
   
    public void messagerieApp(){
        //Affichage de la messagerie
        Scanner scan = new Scanner(System.in);

        System.out.println("Vous êtes dans la messagerie");
        System.out.println("Pour accéder aux messages recus, tapez R");
        System.out.println("Pour envoyer un message, tapez E");

        String input = scan.nextLine();
        
        if (input.equals("R")){ 
             //A METTRE A JOUR
            System.out.println("Liste des messages");
        }else if (input.equals("E")){
            //A METTRE A JOUR

            //On part du principe qu'il n'y a pas de doublons de noms 
            System.out.println("Veuillez entrer le nom du destinataire : ");
            String nom=scan.nextLine();

            System.out.println("Veuillez entrer le prénom du destinataire : ");
            String prenom=scan.nextLine();

            System.out.println("Veuillez entrer le message à envoyé : ");
            String message=scan.nextLine();
        }

    }
}
