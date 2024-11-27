public class App implements NotificationListener {
    public static void main(String[] args) throws Exception {
    
        User user = new Student("Daniel", "Lima", "daniel@gmail.com", "M1", 2021, true);
        user.getInfoProfil();
    }

    @Override
    public void receiveNotif(NotificationEvent event) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}