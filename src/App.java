public class App {
    public static void main(String[] args) throws Exception {
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
    }
}