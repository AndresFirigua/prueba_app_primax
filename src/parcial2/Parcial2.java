package parcial2;

import javax.swing.*;

public class Parcial2 {

    public static Clave password = new Clave();

    public static void main(String[] args) {

        //definición de atributos
        int opc, opc2, deposito = 0, retiro;
        boolean aprobado, salida1 = false, salida2 = false;

        //Mensaje de bienvenida
        JOptionPane.showMessageDialog(null, "Bienvenido al Banco de la Universidad de Cundinamarca");
        //Ingreso de clave
        aprobado = password.aprobar();

        if (aprobado == true) {

            //Introducción de la opción       
            do {
                opc = Integer.parseInt(JOptionPane.showInputDialog("Por favor elija una de las siguientes opciones:\n"
                        + "1. Depositar \n"
                        + "2. Consultar \n"
                        + "3. Retirar \n"
                        + "4. Pagar servicios \n"
                        + "5. Salir"));
                switch (opc) {
                    case 1:
                        System.out.print(subMenus("Depositar"));
                        break;

                    case 2:
                        JOptionPane.showMessageDialog(null, "Usted ha elegido la opción Consultar");
                        password.consultar();
                        break;
                    case 3:
                        System.out.print(subMenus("Retirar"));
                        break;
                    case 4:
                        do {
                            opc2 = Integer.parseInt(JOptionPane.showInputDialog("Usted ha elegido la opción Pagar servicios\n"
                                    + "1. Pagar servicio de luz\n"
                                    + "2. pagar servicio de agua\n"
                                    + "3. Pagar servicio de telefonia\n"
                                    + "4. Volver al manú principal"));
                            switch (opc2) {
                                case 1:
                                    password.pagar("luz");
                                    salida2 = true;
                                    break;
                                case 2:
                                    password.pagar("agua");
                                    salida2 = true;
                                    break;
                                case 3:
                                    password.pagar("telefonia");
                                    salida2 = true;
                                    break;
                                case 4:
                                    salida2 = true;
                                    break;
                                default:
                                    JOptionPane.showMessageDialog(null, "Opción inválida");
                                    salida2 = true;
                            }
                        } while (salida2 == false);
                        break;

                    case 5:
                        JOptionPane.showMessageDialog(null, "Gracias por usar nuestros servicios\n"
                                + "Hasta luego");
                        salida1 = true;
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Opción inválida");
                        break;
                }
            } while (salida1 == false);

        } else {
            JOptionPane.showMessageDialog(null, "El sistema se ha bloqueado\n Demasiados intentos fallidos");
        }

    }

    public static boolean subMenus(String var) {
        int opc2, contenido = 0;
        boolean salida2 = false;
//        Clave oAuxliar = new Clave();
        do {
            opc2 = Integer.parseInt(JOptionPane.showInputDialog("Usted ha elegido la opción " + var + "\n"
                    + "1. " + var + " 50.000\n"
                    + "2. " + var + " 100.000\n"
                    + "3. " + var + " 500.000\n"
                    + "4. " + var + " 1.000.000\n"
                    + "5. " + var + " otro valor\n"
                    + "6. Volver al menú principal"));

            switch (opc2) {
                case 1:
                    contenido = 50000;
                    if ("Depositar".equals(var)) {
                        password.depositar(contenido);
                    } else {
                        password.retirar(contenido);
                    }
                    salida2 = true;
                    break;
                case 2:
                    contenido = 100000;
                    if ("Depositar".equals(var)) {
                        password.depositar(contenido);
                    } else {
                        password.retirar(contenido);
                    }
                    salida2 = true;
                    break;
                case 3:
                    contenido = 500000;
                    if ("Depositar".equals(var)) {
                        password.depositar(contenido);
                    } else {
                        password.retirar(contenido);
                    }
                    salida2 = true;
                    break;
                case 4:
                    contenido = 1000000;
                    if ("Depositar".equals(var)) {
                        password.depositar(contenido);
                    } else {
                        password.retirar(contenido);
                    }
                    salida2 = true;
                    break;
                case 5:
                    if ("Depositar".equals(var)) {
                        password.depositar();
                    } else {
                        password.retirar();
                    }
                    salida2 = true;
                    break;
                case 6:
                    salida2 = true;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción inválida");
            }
        } while (salida2 == false);
        return salida2 = false;
    }
}
