package com.example.media_proyect.models;

public class Login {
    private String email;
    private String cotrasenia;
    private String membresia;

    public Login(String email, String cotrasenia, String membresia) {
        this.email = email;
        this.cotrasenia = cotrasenia;
        this.membresia = membresia;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCotrasenia() {
        return cotrasenia;
    }

    public void setCotrasenia(String cotrasenia) {
        this.cotrasenia = cotrasenia;
    }

    public String getMembresia() {
        return membresia;
    }

    public void setMembresia(String membresia) {
        this.membresia = membresia;
    }
}
