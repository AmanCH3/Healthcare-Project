package Model;

public class UserData {
    private static String userEmail;

    public static String getUserEmail() {
        return userEmail;
    }

    public static void setUserEmail(String userEmail) {
        UserData.userEmail = userEmail;
    }
    
}

