public class Feed {
    private User u;

    public Feed(User u){
        this.u=u;
    }

    public void feedApp(){
        //A METTRE A JOUR
        System.out.println("Vous vous trouvez dans le feed");

    }

    public void addPost(String post) {
        //A METTRE A JOUR

        // Logique pour ajouter un post dans le feed
        System.out.println("Nouveau post ajouté : " + post);
        //this.u.update(new NotificationEvent("Nouveau post", NotificationEvent.NEW_POST, new PostFactory()) ;
    }
}

