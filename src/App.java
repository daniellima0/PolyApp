import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        NotificationService service = new NotificationService();
    
        User daniel = new Student("Lima", "Daniel", "daniel@gmail.com", "M1", 2021, true);
        //daniel.getInfoProfil();

        User alice = new Student("Wonderland", "Alice", "alice@gmail.com", "M2", 2024, false); 
        User bob = new Student("LeBricoleur", "Alice", "bob@gmail.com", "L2", 2024, false); 
        User axelle = new Student("Roy","Axelle",  "axroy@gmail.com", "M1", 2021, false);
        User emma = new Student("RR","Emma",  "emrr@gmail.com", "M1", 2021, false);

        service.addObserver(axelle); 
        service.addObserver(bob); 
        service.addObserver(emma);

        List<User> users = new ArrayList<>();
        users.add(daniel);
        users.add(bob);
        users.add(axelle);
        users.add(emma);

        Post p1 = new InformationPost("Gala Polytech", "Grand retour du Gala de Polytehc !" , false);
        
        List<Message>messages=new ArrayList<>();
        messages.add(new Message("bonjour"));  
        messages.add(new Message("test1"));
        messages.add(new Message("test2"));  
        alice.setMessagesRecus(messages);
        creerApp(alice, users);
    }

    
    public static void creerApp(User u, List<User> users) {
        Scanner scanner = new Scanner(System.in);
        Messagerie mess = new Messagerie(u, users);
        Profil profil = new Profil(u);
        Wishlist wl = new Wishlist(u);
        Feed fe = new Feed(u);

        System.out.println("Bienvenue dans PolyApp");

        while (true) {
            System.out.println("Pour accéder au menu, tapez M (ou tapez Q pour quitter)");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("M")) {
                afficherMenu(scanner, mess, profil, wl, fe);
            } else if (input.equalsIgnoreCase("Q")) {
                System.out.println("Au revoir !");
                break; // Quitte la boucle et termine le programme
            } else {
                System.out.println("Entrée invalide, veuillez réessayer.");
            }
        }
    }

    public static void afficherMenu(Scanner scanner, Messagerie mess, Profil profil, Wishlist wl, Feed fe) {
        while (true) {
            System.out.println("Nous sommes dans le menu : ");
            System.out.println("- pour accéder aux informations du profil, tapez P");
            System.out.println("- pour accéder à la messagerie, tapez M");
            System.out.println("- pour accéder au feed, tapez F");
            System.out.println("- pour accéder à la wishlist, tapez W");
            System.out.println("- pour retourner au menu principal, tapez R");

            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("P")) {
                profil.profilApp();
            } else if (input.equalsIgnoreCase("M")) {
                mess.messagerieApp();
            } else if (input.equalsIgnoreCase("F")) {
                fe.feedApp();
                fe.addPost("Un nouveau post génial !");
            } else if (input.equalsIgnoreCase("W")) {
                wl.wishlistApp();
            } else if (input.equalsIgnoreCase("R")) {
                break; // Retourne au menu principal
            } else {
                System.out.println("Entrez une lettre valable.");
            }
        }
    }



}