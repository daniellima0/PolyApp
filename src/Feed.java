import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Feed {
    private User utilisateur;
    private Scanner scanner = new Scanner(System.in);

    public Feed(User u){
        this.utilisateur=u;
    }

    public void feedApp(){
        System.out.println("Vous vous trouvez dans le feed");
        System.out.println("Pour creer un post, tapez P");

        String input=scanner.nextLine();
        
        if (input.equals("P")){ 
            this.creerPost(scanner, utilisateur);
        }
    }

    public void creerPost(Scanner scanner, User utilisateur){
        System.out.println("Création d'un post");
        // choix des types de post en fonction du type de user :

        // si on a un Etudiant
        if (utilisateur.getType().equals("Etudiant")){
            System.out.println("En tant qu'étudiant, vous pouvez créer un post pour proposer un service ou pour prêter du matériel.");
            System.out.println("Tapez S pour proposer un service");
            System.out.println("Tapez M pour prêter du matériel");
            String choix_post=scanner.nextLine();
            if (choix_post.equals("S")) {
                this.creerService(scanner, utilisateur);
            }

            if (choix_post.equals("M")){
                this.creerPretMateriel(scanner, utilisateur);
            }

            else{
                System.out.println("Vous n'avez pas choisi un type de post");
            }
        }

        // si on a un délégué 
        if (utilisateur.getType().equals("Delegue")){
            System.out.println("En tant qu'étudiant, vous pouvez créer un post pour proposer un service ou pour prêter du matériel.");
            System.out.println("En tant que délégué, vous pouver créer un post d'information");
            System.out.println("Tapez S pour proposer un service");
            System.out.println("Tapez M pour prêter du matériel");
            System.out.println("Tapez I pour créer une information");

            String choix_post=scanner.nextLine();
            if (choix_post.equals("S")) {
                this.creerService(scanner, utilisateur);
            }

            if (choix_post.equals("M")){
                this.creerPretMateriel(scanner, utilisateur);
            }

            if (choix_post.equals("I")){
                this.creerInformation(scanner, utilisateur);
            }

            else{
                System.out.println("Vous n'avez pas choisi un type de post");
            }
        }

        // si on a le BDE
        if (utilisateur.getType().equals("BDE")){
            System.out.println("En tant que BDE, vous pouvez créer un évènement ou une information.");
            System.out.println("Tapez I pour créer une information");
            System.out.println("Tapez E pour créer un évènement");

            String choix_post=scanner.nextLine();

            if (choix_post.equals("I")){
                this.creerInformation(scanner, utilisateur);
            }
            if (choix_post.equals("E")){
                this.creerEvenement(scanner, utilisateur);
            }

            else{
                System.out.println("Vous n'avez pas choisi un type de post");
            }

        }

        // si on a l'Admin
        if (utilisateur.getType().equals("Admin")){
            System.out.println("En tant qu'admin, vous pouvez créer un post d'information.");
            System.out.println("Tapez I pour créer une information");

            String choix_post=scanner.nextLine();
            if (choix_post.equals("I")){
                this.creerInformation(scanner, utilisateur);
            }
            else{
                System.out.println("Vous n'avez pas choisi un type de post");
            }
        }

    }

    public void creerService(Scanner scanner, User utilisateur){
        System.out.println("Création d'un post pour un service");
        System.out.println("Vous avez la possibilité de proposer un Covoiturage ou un Cours");
        System.out.println("Tapez C pour proposer un Cours");
        System.out.println("Tapez V pour proposer un Covoiturage");

        String choix_service=scanner.nextLine();
        if (choix_service.equals("C")){
            System.out.println("Vous avez choisi de proposer un cours");
            String[] infosGenerales=this.choixInformationsGenerales(scanner, utilisateur);
            String titre=infosGenerales[0];
            String description=infosGenerales[1];
            String [] infosService=this.choixInformationsService(scanner, utilisateur);
            String date=infosService[0];
            String adresse=infosService[1];
            int nbPersonnes=Integer.parseInt(infosService[2]);

            System.out.println("Informations précises pour le cours");
            System.out.println("Dans quelle matière voulez-vous donner un cours ?");
            String matiere=scanner.nextLine();

            // creation du post
            ServiceCours post_cours=new ServiceCours(titre, description, date, adresse, nbPersonnes, matiere);
            System.out.println("Le post a été créé");
        }

        if (choix_service.equals("V")){
            System.out.println("Vous avez choisi de proposer un covoiturage");
            String[] infosGenerales=this.choixInformationsGenerales(scanner, utilisateur);
            String titre=infosGenerales[0];
            String description=infosGenerales[1];
            String [] infosService=this.choixInformationsService(scanner, utilisateur);
            String date=infosService[0];
            String adresse=infosService[1];
            int nbPersonnes=Integer.parseInt(infosService[2]);

            System.out.println("Informations précises pour le covoiturage");
            System.out.println("Quelle est l'adresse d'arrivée ?");
            String adresseArrivee=scanner.nextLine();
            System.out.println("Quelle est l'heure de départ ?");
            String heureDepart=scanner.nextLine();

            // creation du post
            ServiceCovoiturage post_covoiturage=new ServiceCovoiturage(titre, description, date, adresse, nbPersonnes, adresseArrivee,heureDepart);
        }


    }

    public void creerPretMateriel(Scanner scanner, User utilisateur){
        System.out.println("Création d'un post pour prêter du matériel");
        // choix du type de post
        System.out.println("Vous avez la possibilité de proposer des Vêtements, du matériel de sort, un logement, un livre ou autre");
        System.out.println("Tapez V pour proposer un vêtement");
        System.out.println("Tapez S pour proposer un matériel de sport");
        System.out.println("Tapez M pour proposer un logement");
        System.out.println("Tapez L pour proposer un livre");
        System.out.println("Tapez A pour proposer autre");

        String choix_materiel=scanner.nextLine();

        if (choix_materiel.equals("V")){
            System.out.println("Vous avez choisi de proposer un vêtement");
            String[] infosGenerales=this.choixInformationsGenerales(scanner, utilisateur);
            String titre=infosGenerales[0];
            String description=infosGenerales[1];
            String [] infosPretMateriel=this.choixInformationsPretMateriel(scanner, utilisateur);
            String nomPhoto=infosPretMateriel[0];
            String etatInitial=infosPretMateriel[1];

            System.out.println("Informations précises pour les vêtements");
            System.out.println("Quelles est la taille du vêtement ?");
            String taille=scanner.nextLine();

            // creation du post
            PretVetement pret_vetement=new PretVetement(titre, description, nomPhoto, etatInitial, taille);
            
        }

        if (choix_materiel.equals("S")){
            System.out.println("Vous avez choisi de proposer un matériel de sport");
            String[] infosGenerales=this.choixInformationsGenerales(scanner, utilisateur);
            String titre=infosGenerales[0];
            String description=infosGenerales[1];
            String [] infosPretMateriel=this.choixInformationsPretMateriel(scanner, utilisateur);
            String nomPhoto=infosPretMateriel[0];
            String etatInitial=infosPretMateriel[1];

            System.out.println("Informations précises pour le matériel de sport");
            System.out.println("Quelle est la taille du matériel ?");
            String taille=scanner.nextLine();
            System.out.println("Pour quel sport est-ce destiné ?");
            String sport=scanner.nextLine();

            // creation du post
            PretMaterielSport materiel_sport=new PretMaterielSport(titre, description, nomPhoto, etatInitial, taille, sport);
        
        }

        if (choix_materiel.equals("M")){
            System.out.println("Vous avez choisi de proposer un logement");
            String[] infosGenerales=this.choixInformationsGenerales(scanner, utilisateur);
            String titre=infosGenerales[0];
            String description=infosGenerales[1];
            String [] infosPretMateriel=this.choixInformationsPretMateriel(scanner, utilisateur);
            String nomPhoto=infosPretMateriel[0];
            String etatInitial=infosPretMateriel[1];

            System.out.println("Informations précises pour le logement");
            System.out.println("Quelle est l'adresse du logement ?");
            String adresse=scanner.nextLine();
            System.out.println("Pour quelle durée est-il disponible ?");
            String duree=scanner.nextLine();

            // creation du post
            PretLogement logement=new PretLogement(titre, description, nomPhoto, etatInitial, adresse, duree);
        }

        if (choix_materiel.equals("L")){
            System.out.println("Vous avez choisi de proposer un livre");
            String[] infosGenerales=this.choixInformationsGenerales(scanner, utilisateur);
            String titre=infosGenerales[0];
            String description=infosGenerales[1];
            String [] infosPretMateriel=this.choixInformationsPretMateriel(scanner, utilisateur);
            String nomPhoto=infosPretMateriel[0];
            String etatInitial=infosPretMateriel[1];

            System.out.println("Informations précises pour le livre");
            System.out.println("Quel est le titre du livre ?");
            String titreLivre=scanner.nextLine();
            System.out.println("Quel est l'auteur du livre ?");
            String auteur=scanner.nextLine();

            // creation du post
            PretLivre livre=new PretLivre(titre, description, nomPhoto, etatInitial, titre, auteur);
        }

        if (choix_materiel.equals("A")){
            System.out.println("Vous avez choisi de proposer autre chose");
            String[] infosGenerales=this.choixInformationsGenerales(scanner, utilisateur);
            String titre=infosGenerales[0];
            String description=infosGenerales[1];
            String [] infosPretMateriel=this.choixInformationsPretMateriel(scanner, utilisateur);
            String nomPhoto=infosPretMateriel[0];
            String etatInitial=infosPretMateriel[1];

            // creation du post
            PretAutre autre=new PretAutre(titre, description, nomPhoto, etatInitial);
        }

    }

    public void creerInformation(Scanner scanner, User utiliateur){
        System.out.println("Création d'un post d'information");
        String[] infosGenerales = this.choixInformationsGenerales(scanner, utilisateur);
        String titre=infosGenerales[0];
        String description=infosGenerales[1];

        // creation du post
        InformationPost info=new InformationPost(titre, description);
    }

    public void creerEvenement(Scanner scanner, User utilisateur){
        System.out.println("Création d'un post évènement");
        String[] infosGenerales = this.choixInformationsGenerales(scanner, utilisateur);
        String titre=infosGenerales[0];
        String description=infosGenerales[1];
        System.out.println("Quelle est la date de l'évènement ?");
        String date=scanner.nextLine();
        System.out.println("Quelle est l'adresse de l'évènement ?");
        String adresse=scanner.nextLine();
        System.out.println("Combien de personne peut accueillir l'évènement ?");
        int nombre=Integer.parseInt(scanner.nextLine());

        // création du post
        EvenementPost evenement=new EvenementPost(titre, description, date, adresse, nombre);

    }


    public String[] choixInformationsGenerales(Scanner scanner, User utilisateur){
        System.out.println("Informations générales :");
        System.out.println("Quel est le titre de votre post ?");
        String titre=scanner.nextLine();
        System.out.println("Quel est la description de votre post ?");
        String description=scanner.nextLine();

        return new String[]{titre, description};
    }

    public String[] choixInformationsService(Scanner scanner, User utilisateur){
        System.out.println("Informations sur le service :");
        System.out.println("A quelle date aura lieu ce service ?");
        String date=scanner.nextLine();
        System.out.println("A quelle adresse aura lieu ce service ?");
        String adresse=scanner.nextLine();
        System.out.println("Combien de personne peut accueillir ce service ?");
        String nombre=scanner.nextLine();

        return new String[]{date, adresse, nombre};

    }

    public String[] choixInformationsPretMateriel(Scanner scanner, User utilisateur){
        System.out.println("Informations sur le prêt de materiel :");
        System.out.println("Quelle est le nom de la photo que vous voulez rajouter ?");
        String nomPhoto=scanner.nextLine();
        System.out.println("Quel est l'état initial du matériel ?");
        String etatInitial=scanner.nextLine();

        return new String[]{nomPhoto, etatInitial};
    }



}

