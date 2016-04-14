package com.login;

import com.conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

@ManagedBean
@RequestScoped
public class mbLogin {
    String usuario, contraseña;
    Conexion conexion;
    private ArrayList<UsuaModel> lista;
    UsuaModel usu;
    public mbLogin() {
        conexion = new Conexion();
    }
   public String iniciarSession()
   {
       lista = new ArrayList();
       UsuaModel usuario_login = null;
       try{
           if (usuario.equals("") || contraseña.equals(""))
           {
               FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR,"Error","Error todos los campos deben ser completados"));
               return "/index"; 
           }
           else
           {
               
               String consulta = "SELECT us_usuario, us_nombre, us_correo_electronico, us_perfil \n" +
                                 "FROM BV_USUARIOS where us_usuario = 'jchevalier' and us_activo = 1";
               Connection accesoDB = conexion.getConexion();
                try {

                    //PreparedStatement ps = accesoDB.prepareStatement(consulta);
                    //ResultSet rs = ps.executeQuery();
                    /*while (rs.next()){
                        usu = new UsuaModel(rs.getString("us_usuario"), rs.getString("us_nombre"),
                                            rs.getString("us_correo_electronico"),rs.getString("us_perfil"));
                        
                        lista.add(usu);
                    }*/
                    if (lista.isEmpty())
                    {
                        //usuario_login = lista.get(0);
                        FacesContext.getCurrentInstance().getExternalContext().getSessionMap().put("usuario_lo", usuario);
                    }
                } catch (Exception e) {
                }
           }
       }catch(Exception e){
           throw e;
       }
   }
    //Metodos Get y Set
    public String getUsuario() {
        return usuario;
    }
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    public String getContraseña() {
        return contraseña;
    }
    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
}
