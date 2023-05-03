package com.hedima.presentacion;

import com.hedima.persistencia.Conexion;

import java.sql.SQLException;

public class ProbarConexion {

    public static void main(String[] args) {
        Conexion c1 = new Conexion();
        try {
            c1.abrirConexion();
        } catch (ClassNotFoundException e) {
            System.out.println(e.toString());
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
    }
}
