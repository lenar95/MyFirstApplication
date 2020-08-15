package lenarabdrakov.example.myfirstapplication;

import java.io.Serializable;

public class User implements Serializable {
    private String mLogin;
    private String mPassword;

    public User(String mLogin, String mPassword) {
        this.mLogin = mLogin;
        this.mPassword = mPassword;
    }

    public String getLogin() {
        return mLogin;
    }

    public String getPassword() {
        return mPassword;
    }

    public void setLogin(String mLogin) {
        this.mLogin = mLogin;
    }

    public void setPassword(String mPassword) {
        this.mPassword = mPassword;
    }
}
