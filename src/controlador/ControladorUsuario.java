/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import modelo.Usuario;

/**
 *
 * @author darci
 */
public class ControladorUsuario {
    
    public void controlarAccion(ActionEvent evento, Usuario unUsuario){
        String accion=evento.getActionCommand();
        switch(accion){
            case "Insertar":
                unUsuario.insertar();
            break;
            case "Modificar":
                unUsuario.modificar();
            break;
            case "Eliminar":
                unUsuario.eliminar();
            break;
        }
    }
    
}
