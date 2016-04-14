package com.login;


public class UsuaModel {
    String us_usuario, us_nombre, us_correo_electronico, us_perfil;

    UsuaModel(String string, String string0, String string1, String string2) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getUs_usuario() {
        return us_usuario;
    }

    public void setUs_usuario(String us_usuario) {
        this.us_usuario = us_usuario;
    }

    public String getUs_nombre() {
        return us_nombre;
    }

    public void setUs_nombre(String us_nombre) {
        this.us_nombre = us_nombre;
    }

    public String getUs_correo_electronico() {
        return us_correo_electronico;
    }

    public void setUs_correo_electronico(String us_correo_electronico) {
        this.us_correo_electronico = us_correo_electronico;
    }

    public String getUs_perfil() {
        return us_perfil;
    }

    public void setUs_perfil(String us_perfil) {
        this.us_perfil = us_perfil;
    }
    
    public void UsuaModel( String us_usuario, String us_nombre, String us_correo_electronico, String us_perfil)
    {
       this.us_usuario = us_usuario; 
       this.us_nombre = us_nombre; 
       this.us_correo_electronico = us_correo_electronico; 
       this.us_perfil = us_perfil; 
    }
}
