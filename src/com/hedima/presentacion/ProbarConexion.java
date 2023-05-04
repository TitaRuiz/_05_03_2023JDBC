package com.hedima.presentacion;

import com.hedima.modelo.Producto;
import com.hedima.persistencia.AccesoProductos;
import com.hedima.persistencia.Conexion;

import java.sql.SQLException;

public class ProbarConexion {

    public static void main(String[] args) {
        AccesoProductos ap = new AccesoProductos();
        Producto p = new Producto(79,"Prueba desde java",20,0);
        try {
//            System.out.println(ap.mostrarUno(2));
//            System.out.println(ap.mostrarTodos());
//            System.out.println("Se pudo dar de alta el producto ?" + ap.insertarProducto(p));
//            System.out.println("Se pudo modificar el producto ?" + ap.modificarProducto(p));
            System.out.println("Se pudo eliminar el producto ?" + ap.eliminarProducto(79));
        } catch (ClassNotFoundException e) {
            System.out.println(e.toString());
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
    }
}
