package com.corenetworks.presistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexcion {
    public Conexcion() {
    }

    //--atributos
        protected Connection miConexcion;

        //--Metodos
    public void abrirConexcion() throws ClassNotFoundException, SQLException {
         Class.forName("org.postgresql.Driver");
        miConexcion = DriverManager.getConnection(
                "jdbc:postgresql://127.0.0.1:5432/northwind2",
                "postgres", "Yolany1981");
        System.out.println("exito al abrir la conexcion");

    }


}
