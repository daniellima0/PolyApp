import java.util.Scanner;

public class App implements NotificationListener {
    public static void main(String[] args) throws Exception {
        // Create a UserFactory instance
        User user = new User();

        System.err.println(" ");

        // Create a Student profile
        User student = user.creerProfil("STUDENT", "Daniel", "Lima", "daniellima@gmail.com", "Promo2024", 2,
                true, null);
        System.out.println(student.getInfoProfil());

        // Create a BDE profile
        User bde = user.creerProfil("BDE", "Henrique", "Barretto", "henrique@gmail.com", null, 0, false, null);
        System.out.println(bde.getInfoProfil());

        // Create an Admin profile
        User admin = user.creerProfil("ADMIN", "Francielle", "Cardoso", "francielle@gmail.com", null, 0, false,
                "IT Manager");
        System.out.println(admin.getInfoProfil());

        // Create a Post and associate it with a user
        Post post = new Post("Welcome to our platform!");
        user.creerPost(post);

        // Delete a profile
        user.supprimerProfil(student);
    }

    @Override
    public void receiveNotif(NotificationEvent event) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'receiveNotif'");
    }
}