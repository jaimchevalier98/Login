/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.login;

import java.io.Serializable;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.inject.Named;

@Named
@ViewScoped
public class pantillaController implements Serializable {
    
    public  String verificaSession()
    {
        //try{
            FacesContext context = FacesContext.getCurrentInstance();
            String usu = (String) context.getExternalContext().getSessionMap().get("usuario_lo");
            if (usu.equals(""))
            {
                return "/index";
            }
            else
              return "/Layout/ViewUsuario/usuarios";  
        //}
        //catch(Exception e){
          //  return "/Layout/ViewUsuario/usuarios";
        //}
    }
}
