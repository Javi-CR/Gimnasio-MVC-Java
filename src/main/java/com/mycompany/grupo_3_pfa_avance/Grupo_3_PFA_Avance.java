/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.grupo_3_pfa_avance;

import javax.swing.JOptionPane;

/**
 * ARON 222222
 * @author javie
 */
public class Grupo_3_PFA_Avance {

    public static void main(String[] args) {
        //...............
        int opcion = 0;
        //...............
        while(opcion != 7) {
            opcion = Integer.parseInt(JOptionPane.showInputDialog(null, 
                                        "Menú Inicial:\n"
                                        + "1 - Registrarse\n"
                                        + "2 - Iniciar Seccion\n"
                                        + "3 - Horarios\n"
                                        + "4 - Salir\n"
                                        + "Digite una opción para continuar: "
            ));
            switch(opcion) {
                case 1:
                    System.out.println("Modulo de registro");
                    Usuarios users = new Usuarios("sfdwefef","aaaa","dddd","ffff","fff","fff",457525,45345);
                    users.Registrado();
                    break;
                case 2:
                    System.out.println("-------");
                    break;
                case 3:
                    System.out.println("-------");
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opción Invalida...");
                    break;
            }
        }
    }
}
