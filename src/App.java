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

        User sorana = new Admin("Cimpan", "Sorana", "sorana.cimpan@gmail.com", "professeur");
        User woofy = new BDE("BDE", "WoofyAnnecy", "bde.annecy@gmail.com");

        service.addObserver(axelle); 
        service.addObserver(bob); 
        service.addObserver(emma);
        service.addObserver(sorana);
        service.addObserver(woofy);

        List<User> users = new ArrayList<>();
        users.add(daniel);
        users.add(bob);
        users.add(axelle);
        users.add(emma);
        users.add(sorana);
        users.add(woofy);

        Post p1 = new InformationPost("Gala Polytech", "Grand retour du Gala de Polytehc !");
        Post p2 = new PretLivre("Voyage au centre de la terre", "Livre en très bon état! Je veux le récupérer après !", "photo", "Neuf", "Voyage au centre de la Terre", "Jules Verne");
        Post p3 = new ServiceCours("Cours de mathématiques", "Elève en 4ème année de cycle ingénieur propose des cours de math", "2024/12/20", "87 Avenue de Genève, Annecy", 1, "Mathématiques");
        
        List <Post> wl=new ArrayList<>();
        wl.add(p2);
        alice.setWishlist(wl);

        List <Post> posts = new ArrayList<>();
        posts.add(p1);
        posts.add(p2);
        posts.add(p3);

        List<Message>messages=new ArrayList<>();
        messages.add(new Message("bonjour"));  
        messages.add(new Message("test1"));
        messages.add(new Message("test2"));  
        alice.setMessagesRecus(messages);
        creerApp(users, posts, service);
    }

    
    public static void creerApp(List<User> users, List <Post> posts, NotificationService notif) {
        System.out.println("Bienvenue dans PolyApp");
        Scanner scanner = new Scanner(System.in);

        User utilisateur_connecte=choixUtilisateur(users, scanner);

        Messagerie mess = new Messagerie(utilisateur_connecte, users);
        Profil profil = new Profil(utilisateur_connecte);
        Wishlist wl = new Wishlist(utilisateur_connecte);
        Feed fe = new Feed(utilisateur_connecte, posts, notif);

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
            } else if (input.equalsIgnoreCase("W")) {
                wl.wishlistApp();
            } else if (input.equalsIgnoreCase("R")) {
                break; // Retourne au menu principal
            } else {
                System.out.println("Entrez une lettre valable.");
            }
        }
    }

    public static User choixUtilisateur(List<User> users, Scanner scanner){
        // choix de l'utilisateur
        System.out.println("Liste des utilisateurs disponibles :");
        for(User user : users){
            System.out.println(" - "+user.getPrenom());
        }

        System.out.println("Connectez vous à votre profil en entrant votre prenom");
        String prenom=scanner.nextLine();

        // verification de l'utilisateur
        User utilisateur_connecte=null;
        for(User user : users){
            if(user.getPrenom().equals(prenom)){
                utilisateur_connecte=user;
                break;
            }
        }

        if (utilisateur_connecte == null) {
            System.out.println("Utilisateur non trouvé");
            return choixUtilisateur(users, scanner);
        }
        else {
            System.out.println("Connecté sur le compte de: " + utilisateur_connecte.getPrenom());
            return utilisateur_connecte;
        }
    }

}