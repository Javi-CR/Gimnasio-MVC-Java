/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.grupo_3_pfa_avance;

import javax.swing.JOptionPane;

/**
 *
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
                    System.out.println("-------");
                    break;
                case 2:
                    System.out.println("-------");
                    break;
                case 3:
                    System.out.println("-------");
                    break;
                case 4:
                    System.out.println("-------");
                    break;
                default:
                    System.out.println("Opción Invalida...");
                    break;
            }
        }
    }
}
