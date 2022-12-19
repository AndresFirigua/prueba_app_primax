
package parcial2;

import javax.swing.JOptionPane;

public class Deposito {
    //Atributos:
    int deposito, opc;
    Clave oClave = new Clave();
//    Clave oClaveSecond = new Clave(oClave.getSaldo());

    // --------------Método depositar --------------------------
//    public void depositar(int deposito) {
//        Clave cambioSaldo = new Clave(oClave.getSaldo() + deposito);
//        JOptionPane.showMessageDialog(null, "Su nuevo saldo es de: " + cambioSaldo.getSaldo());
//    }
//    
//    public void depositar() {//Validación de números negativos
//        boolean salir = false, bandera = true;
//        int i = 0;
//        do {
//            bandera = true;
//            deposito = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor a depositar\n"
//                    + "Recuerde que el valor a depositar debe ser multiplo de $10.000"));
//
//            if (deposito < 0) {
//                JOptionPane.showMessageDialog(null, "El valor indicado es negativo, \n"
//                        + "El valor para retirar debe ser positivo.");
//                do {
//                    opc = Integer.parseInt(JOptionPane.showInputDialog(null, "Por favor elija una opción: \n"
//                            + "1. Cambiar el valor a positivo\n"
//                            + "2. Ingrese otro valor"));
//
//                    switch (opc) {
//                        case 1:
//                            deposito = (deposito * (-1));
//                            break;
//                        case 2:
//                            bandera = false;
//                            break;
//                        default:
//                            JOptionPane.showMessageDialog(null, "Opción incorrecta");
//                    }
//                } while (opc > 2 || opc < 1);
//            }
//
//            if (bandera) {
//
//                if (Math.floorMod(this.deposito, 10000) == 0) {
//                    Clave cambioSaldo = new Clave(oClave.getSaldo() + deposito);
//                    salir = true;
//                    JOptionPane.showMessageDialog(null, "Su nuevo saldo es: $" + cambioSaldo.getSaldo());
//                } else {
//                    JOptionPane.showMessageDialog(null, "El valor a depositar debe ser múltiplo de $10.000");
//                }
//            }
//            i++;
//        } while (salir == false && i < 2);
//    }
//    
//    
}


//do{
//                    opc2=Integer.parseInt(JOptionPane.showInputDialog("Usted ha elegido la opción Depositar\n"
//                            + "1. Depositar 50.000\n"
//                            + "2. Depositar 100.000\n"
//                            + "3. Depositar 500.000\n"
//                            + "4. Depositar 1.000.000\n"
//                            + "5. Depositar otro valor\n"
//                            + "6. Volver al menú principal"));
//                    
//                        switch (opc2) {
//                        case 1:
//                            deposito=50000;
//                            oDeposito.depositar(deposito);
//                            salida2=true;
//                            break;
//                        case 2:
//                            deposito=100000;
//                            oDeposito.depositar(deposito);
//                            salida2=true;
//                            break;
//                        case 3:
//                            deposito=500000;
//                            oDeposito.depositar(deposito);
//                            salida2=true;
//                            break;
//                        case 4:
//                            deposito=1000000;
//                            oDeposito.depositar(deposito);
//                            salida2=true;
//                            break;
//                        case 5:
//                            oDeposito.depositar();
//                            salida2=true;
//                            break;
//                        case 6:
//                            salida2=true;
//                            break;
//                        default:
//                            JOptionPane.showMessageDialog(null, "Opción inválida");
//                    }
//                    }while(salida2==false);
//                    salida2=false;

//do{
//                        opc2=Integer.parseInt(JOptionPane.showInputDialog("usted ha elegido la opción Retirar\n"
//                                + "1. Retirar 50.000\n"
//                                + "2. Retirar 100.000\n"
//                                + "3. Retirar 500.000\n"
//                                + "4. retirar 1.000.000\n"
//                                + "5. Retirar otro valor\n"
//                                + "6. Volver al menú principal"));
//                        switch (opc2) {
//                            case 1:
//                                retiro=50000;                                
//                                password.retirar(retiro);
//                                salida2=true;
//                                break;
//                            case 2:
//                                retiro=100000;                                
//                                password.retirar(retiro);
//                                salida2=true;
//                                break;
//                            case 3:
//                                retiro=500000;                                
//                                password.retirar(retiro);
//                                salida2=true;
//                                break;
//                            case 4:
//                                retiro=1000000;                                
//                                password.retirar(retiro);
//                                salida2=true;
//                                break;
//                            case 5:
//                                password.retirar();
//                                salida2=true;
//                                break;
//                            default:
//                                JOptionPane.showMessageDialog(null, "Opción inválida");
//                                salida2=true;
//                        }
//                    }while(salida2==false);
//                    salida2=false;