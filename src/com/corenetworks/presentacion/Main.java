package com.corenetworks.presentacion;

import com.corenetworks.presistencia.Conexcion;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        Conexcion c1 = new Conexcion();

        try {
            c1.abrirConexcion();
        } catch (ClassNotFoundException e) {
            System.out.println(e.toString());
        } catch (SQLException e) {
            System.out.println(e.toString());
        }

    }
}