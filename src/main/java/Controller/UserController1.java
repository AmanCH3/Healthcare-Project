package Controller;


import DAO.UserDao;
import Model.User;
import View.UserProfilePanel;

public class UserController1 {
    private UserDao userDao;
    private UserProfilePanel userProfilePanel;

    public UserController1(UserDao userDao, UserProfilePanel userProfilePanel) {
        this.userDao = userDao;
        this.userProfilePanel = userProfilePanel;
    }

    public void displayUserInfo(String userEmail) {
        User user = userDao.getUserByEmail(userEmail);
        userProfilePanel.setUserProfile(user);
    }
    public boolean updateUserPassword(String userEmail, String newPassword) {
        return userDao.updateUserPassword(userEmail, newPassword);
    }
    public boolean deleteUser(String userEmail) {
        return userDao.deleteAccount(userEmail);
    }
}
