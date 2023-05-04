package com.hedima.presentacion;

import com.hedima.persistencia.AccesoProductos;
import com.hedima.persistencia.Conexion;

import java.sql.SQLException;

public class ProbarConexion {

    public static void main(String[] args) {
        AccesoProductos ap = new AccesoProductos();
        try {
//            System.out.println(ap.mostrarUno(2));
            System.out.println(ap.mostrarTodos());
        } catch (ClassNotFoundException e) {
            System.out.println(e.toString());
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
    }
}
