import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
<<<<<<< HEAD
        // Create a UserFactory instance
        UserFactory userFactory = new UserFactory();

        System.err.println(" ");

        // Create a Student profile
        User student = userFactory.creerProfil("STUDENT", "Daniel", "Lima", "daniellima@gmail.com", "Promo2024", 2,
                true, null);
        System.out.println(student.getInfoProfil());

        // Create a BDE profile
        User bde = userFactory.creerProfil("BDE", "Henrique", "Barretto", "henrique@gmail.com", null, 0, false, null);
        System.out.println(bde.getInfoProfil());

        // Create an Admin profile
        User admin = userFactory.creerProfil("ADMIN", "Francielle", "Cardoso", "francielle@gmail.com", null, 0, false,
                "IT Manager");
        System.out.println(admin.getInfoProfil());

        // Create a Post and associate it with a user
        Post post = new Post("Welcome to our platform!");
        userFactory.creerPost(post);

        // Delete a profile
        userFactory.supprimerProfil(student);
=======
        App app = new App();
        app.creerApp();
    }

    public void creerApp(){
        Scanner scanner = new Scanner(System.in);
        Messagerie mess = new Messagerie();
        Profil profil = new Profil();
        Wishlist wl = new Wishlist();
        Feed fe = new Feed();

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

    public void afficherMenu(Scanner scanner, Messagerie mess, Profil profil, Wishlist wl, Feed fe) {
        while (true) {
            System.out.println("Nous sommes dans le menu : ");
            System.out.println("- pour accéder aux informations du profil, tapez P");
            System.out.println("- pour accéder à la messagerie, tapez M");
            System.out.println("- pour accéder au feed, tapez F");
            System.out.println("- pour accéder à la wishlist, tapez W");
            System.out.println("- pour retourner au menu principal, tapez R");

            String input = scanner.nextLine();

            //equalsIgnoreCase permet de prendre en compte les majuscule et minuscule
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
>>>>>>> main
    }
}