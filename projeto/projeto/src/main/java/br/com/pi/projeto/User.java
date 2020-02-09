package br.com.pi.projeto;

public class User {
    protected String user = "usuarioteste";
    protected String password = "1234";

    public User(String user, String password) {
        this.user = user;
        this.password = password;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Boolean authenticate(String user, String password){
        if (this.user == user && this.password == password){
            return true;
        } else{
            return false;
        }
    }
}
