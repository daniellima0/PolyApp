public class UserFactory {
    public UserFactory() {
    }

    // Factory Method to create user profiles
    public User creerProfil(String userType, String nom, String prenom, String mail, String promo, int annee, boolean delegue, String metier) {
        if (userType == null) {
            return null;
        }

        switch (userType.toUpperCase()) {
            case "STUDENT":
                return new Student(nom, prenom, mail, promo, annee, delegue);
            case "BDE":
                return new BDE(nom, prenom, mail);
            case "ADMIN":
                return new Admin(nom, prenom, mail, metier);
            default:
                return null;
        }
    }

    // Method to delete a user profile
    public void supprimerProfil(User user) {
        // Implement the logic to delete the user profile
        System.out.println("Profile deleted: " + user.getInfoProfil());
    }

    // Method to cancel profile creation (placeholder)
    public void annulerCreation() {
        System.out.println("Profile creation canceled.");
    }

    // Method to create a post (assuming Post is a predefined class)
    public void creerPost(Post post) {
        System.out.println("Post created: " + post.getContent());
    }
}
