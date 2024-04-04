package com.education.models;

// import com.education.models.IUpdatableProfile;
// import com.education.models.IViewableProfile;


public class User implements IUpdatableProfile,IViewableProfile{
    private String username;
    private String password;
    private Profile profile;

    public User(String username,String password){
        this.username=username;
        this.password=password;
    }

    public String getUsername(){
        return username;
    }
    public void setUsername(String username){
        this.username=username;
    }
    public String getPassword(){
        return password;
    }
    public void setPassword(String password){
        this.password=password;
    }

    public Profile getProfile() {
        return profile;
    }

    public void setProfile(Profile profile) {
        this.profile = profile;
    }

    public boolean login(String username,String password){
        //still write logic to check login 
        return true;
    }
    public void logout(String username,String password){
        //login  to logout 
    }
    @Override
    public void updateProfile(){
        //write code still

    }
    public String viewProfile(){
        return null;
    }
}
