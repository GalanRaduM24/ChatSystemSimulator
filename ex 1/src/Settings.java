public class Settings {
    private User user;

    private boolean notifications;

    public Settings(User user) {
        this.user = user;
        this.notifications = false;
    }

    public void viewMonProfile(){
        System.out.println("View profile of:" + user.username);
        user.getUsername();
        user.getStatus();
        user.getPassword();
    }

    public boolean setNotifications(){
        this.notifications = true;
        System.out.println("Notification has been set to true");
        return notifications;
    }

    public void help(){
        System.out.println("Displaying help for " + user.username);
    }

    public void changePassword(String password){
        System.out.println("Changing password from:" + user.getPassword() + "to :" + password);
        user.setPassword(password);
    }

    public void changeNumber(String telephone){
        System.out.println("Changing password from:" + user.telephone + "to :" + telephone);
        user.setTelephone(telephone);
    }

    public void updateStatus(Status status){
        System.out.println("Updating status for " + user.username + " to " + status);
        user.setStatus(status);
    }

}
