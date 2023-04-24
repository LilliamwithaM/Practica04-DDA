/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.uv.programa04;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author LilyE
 */
public class ConexionDB {
    private Connection con = null;
    private static ConexionDB cx = null;
    public static  ConexionDB getInstance(){
        if (cx == null)
            cx = new ConexionDB();
            return cx;
    }
    private ConexionDB(){
        try {
        String url = "jdbc:postgresql://localhost:7000/ejemplo";
        String pwd = "1234";
        String user = "postgres";
        con = DriverManager.getConnection(url,user,pwd);
        Logger.getLogger(Programa04.class.getName()).log(Level.INFO, "Se conecto");
        } catch (SQLException ex){
            Logger.getLogger(Programa04.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
        public boolean execute(String sql){
            return true;
        }
        
        public boolean execute(TransaccionDB tdb){
            return tdb.execute(con);
        }
        
        
}

