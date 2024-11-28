import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        NotificationService service = new NotificationService();
    
        User user = new Student("Daniel", "Lima", "daniel@gmail.com", "M1", 2021, true);
        user.getInfoProfil();

        User alice = new Student("Wonderland", "Alice", "alice@gmail.com", "M2", 2024, false); 
        User bob = new Student("LeBricoleur", "Alice", "bob@gmail.com", "L2", 2024, false); 
        service.addObserver(alice); 
        service.addObserver(bob); 
        //service.createMessageNotification("Vous avez un nouveau message"); => faire en sorte que bob envoit un message ) Alice

        /*PostFactory post1 = new ServiceCours("Cours de Mathématiques", "Cours de mathématiques pour un élèves de primaire", false, service.getObserver(), new java.sql.Date(2024/12/20), ); 
        service.createPostNotification("Un nouveau post est disponible", post1);
        PostFactory post2 = new Post(2, "Guide de survie en forêt"); 
        service.createPostNotification("Un nouveau post est disponible", post2);
        A revoir pour tester 
        */ 

        creerApp();
    }

    
    public static void creerApp() {
        User alice = new Student("Wonderland", "Alice", "alice@gmail.com", "M2", 2024, false); 

        Scanner scanner = new Scanner(System.in);
        Messagerie mess = new Messagerie();
        Profil profil = new Profil();
        Wishlist wl = new Wishlist();
        Feed fe = new Feed(alice);

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