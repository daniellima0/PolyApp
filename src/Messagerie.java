import java.util.List;
import java.util.Scanner;

public class Messagerie {
    User envoyeur;
    List<User> users;
    Scanner scan = new Scanner(System.in);


    public Messagerie (User envoyeur, List<User> u){
        this.envoyeur=envoyeur;
        this.users=u;
    }

    public void messagerieApp(){
        //Affichage de la messagerie
        System.out.println("Vous êtes dans la messagerie");
        System.out.println("Pour accéder aux messages recus, tapez R");
        System.out.println("Pour envoyer un message, tapez E");

        String input = scan.nextLine();
        
        if (input.equals("R")){ 
            System.out.println("Liste des messages");
            listeMessages();
        }else if (input.equals("E")){
            envoyerMessageApp();
        }
           
    }

    public void listeMessages (){
        List<Message> messages=this.envoyeur.getMessagesRecus();

        for (Message mess : messages){
            System.out.println(mess.toString());
        }
    }

    public void envoyerMessageApp(){
         //On part du principe qu'il n'y a pas de doublons de noms 

         System.out.println("Veuillez entrer prénom du destinataire : ");
         String destinataire=scan.nextLine();

         User dest=null;

         for (User u : users) {
             if (u.getPrenom().equals(destinataire)){
                 dest=u;
             }
         }

         if (dest==null){
             System.out.println("Entrez un nom valide");
             envoyerMessageApp();
         }else {
            
            System.out.println("Veuillez entrer le message à envoyé : ");
            String message=scan.nextLine();

            Message mess = new Message (message);
            this.envoyeur.envoyerMessage(dest, mess);
         }

     }

}
