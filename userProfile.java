/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TechQuizApp.pojo;

/**
 *
 * @author DELL
 */
public class userProfile {
    private static String username;
    private static String usertype;

    public static String getUsername() {
        return username;
    }

    public static void setUsername(String username) {
        userProfile.username = username;
    }

    public static String getUsertype() {
        return usertype;
    }

    public static void setUsertype(String usertype) {
        userProfile.usertype = usertype;
    }
    
    
}
