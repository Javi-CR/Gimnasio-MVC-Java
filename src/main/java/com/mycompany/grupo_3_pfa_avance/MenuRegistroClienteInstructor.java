/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.grupo_3_pfa_avance;

import javax.swing.JOptionPane;

/**
 *
 * @author diego
 */
public class MenuRegistroClienteInstructor {
    Cliente cli = new Cliente("", "", "", "", 0, 0, "", "");
    public void Menu(){
     int opcion = 0;

        //...............
        while (opcion != 3) {
            opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "Menú Inicial:\n"
                    + "1 - Registrar cliente\n"
                    + "2 - Registrar Instructor\n"
                    + "3 - Salir\n"
                    + "Digite una opción para continuar: "
            ));
            switch (opcion) {
                case 1:
                    System.out.println("Registro de Clientes");
                    cli.Registrar();
            
                    break;
                case 2:
                    System.out.println("Registro instructor");
                    break;
                case 3:
                    System.out.println("Saliendo del registro");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opción Invalida...");
                    break;
            }
        }
    }
}
