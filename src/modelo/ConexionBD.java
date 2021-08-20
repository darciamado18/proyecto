/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author darci
 */
public class ConexionBD {
    public static Connection conexion; 
    public Statement sentencia;
    public ResultSet resultado;
    
    public void ConexionBD() {
        try {
            String driverBD  = "com.mysql.jdbc.Driver";
            Class.forName(driverBD);
            String urlBD     = "jdbc:mysql://localhost:3306/sistemaalmacen";
            String usuarioBD = "root";
            String claveBD   = "";
           
            conexion = DriverManager.getConnection(urlBD, usuarioBD, claveBD);
            sentencia = conexion.createStatement();
        } catch (ClassNotFoundException | SQLException ex) {
            System.err.println("No encuentro el driver"+ex.getMessage());
//        } catch (SQLException ex){
//            System.err.println("Error al conectarme:"+ex.getMessage());
        }
    }
    
    public void desconectarBD(){
        try {
            if(conexion != null){
                if(sentencia != null){
                   sentencia.close();
                }
                conexion.close();
            }
        } catch (SQLException ex) {
            System.err.println("Error al desconectarme:"+ex.getMessage());
            System.exit(1);
        }
        
    }
//    public static ConexionBD getInstance() {
//        return ConexionBDHolder.INSTANCE;
//    }
//    private static class ConexionBDHolder {
//
//        private static final ConexionBD INSTANCE = new ConexionBD();
//    }
}
