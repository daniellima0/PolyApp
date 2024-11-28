public class NotificationEvent {
    public static final String MESSAGE_RECEIVED = "MESSAGE";
    public static final String NEW_POST = "POST";

    private String message;
    private String type;
    private Post post;

    public NotificationEvent(String message, String type) { 
        this(message, type, null); 
    } 
    
    public NotificationEvent(String message, String type, Post post) { 
        this.message = message; 
        this.type = type; 
        this.post = post;
    }

    public String getMessage() {
        return this.message;
    }

    public String getType() {
        return type;
    }

    public Post getPost(){
        return this.post;
    }

   public void action(){
        if (this.type.equals("MESSAGE")){
            getMessage();
        }else if(this.type.equals("POST")){
            System.out.println("Un nouveau post est disponible");
        }

   }
}
