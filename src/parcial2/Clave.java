package parcial2;

import javax.swing.JOptionPane;

public class Clave {

    //Definición de atributos
    private int miClave = 1234, clave, saldo, deposito, retiro, servicio, opc;

    public Clave() {
        miClave = 1234;
        saldo = 100000;
    }

    public Clave(int saldo) {
        this.saldo = saldo;
    }

    public int getClave() {
        return clave;
    }

    public void setClave(int clave) {
        this.clave = clave;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    //Métodos convencionales    
    //Método aprobar:
    public boolean aprobar() {
        boolean aprobado = false;
        int i = 0;
        do {
            this.clave = Integer.parseInt(JOptionPane.showInputDialog("Por favor ingrese su clave de 4 dígitos"));
            if (this.clave == miClave) {
                aprobado = true;
                i = 2;
            }
            i++;
        } while (i < 3);
        return aprobado;
    }

//    // --------------Método depositar --------------------------
    public void depositar(int deposito) {
        this.setSaldo(this.getSaldo() + deposito);
        JOptionPane.showMessageDialog(null, "Su nuevo saldo es de: " + this.getSaldo());
    }

    public void depositar() {//Validación de números negativos
        boolean salir = false, bandera = true;
        int i = 0;
        do {
            bandera = true;
            this.deposito = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor a depositar\n"
                    + "Recuerde que el valor a depositar debe ser multiplo de $10.000"));

            if (deposito < 0) {
                JOptionPane.showMessageDialog(null, "El valor indicado es negativo, \n"
                        + "El valor para retirar debe ser positivo.");
                do {
                    opc = Integer.parseInt(JOptionPane.showInputDialog(null, "Por favor elija una opción: \n"
                            + "1. Cambiar el valor a positivo\n"
                            + "2. Ingrese otro valor"));

                    switch (opc) {
                        case 1:
                            deposito = (deposito * (-1));
                            break;
                        case 2:
                            bandera = false;
                            break;
                        default:
                            JOptionPane.showMessageDialog(null, "Opción incorrecta");
                    }
                } while (opc > 2 || opc < 1);
            }

            if (bandera) {

                if (Math.floorMod(this.deposito, 10000) == 0) {
                    this.setSaldo(this.getSaldo() + this.deposito);
                    salir = true;
                    JOptionPane.showMessageDialog(null, "Su nuevo saldo es: $" + this.getSaldo());
                } else {
                    JOptionPane.showMessageDialog(null, "El valor a depositar debe ser múltiplo de $10.000");
                }
            }
            i++;
        } while (salir == false && i < 2);
    }

    public void consultar() {
        JOptionPane.showMessageDialog(null, "Su saldo es: " + getSaldo());
    }

    public void retirar(int retiro) {
        this.setSaldo(this.getSaldo() - retiro);
        JOptionPane.showMessageDialog(null, "Su nuevo saldo es: $" + getSaldo());
    }

    public void retirar() {
        boolean salir = false, bandera = true;
        int i = 0;
        do {

            bandera = true;

            this.retiro = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor a retirar\n"
                    + "Recuerde que el valor a retirar debe ser multiplo de $10.000"));

            if (retiro < 0) {
                JOptionPane.showMessageDialog(null, "El valor indicado es negativo, \n"
                        + "El valor para retirar debe ser positivo.");
                do {
                    opc = Integer.parseInt(JOptionPane.showInputDialog(null, "Por favor elija una opción: \n"
                            + "1. Cambiar el valor a positivo\n"
                            + "2. Retirar otro valor"));

                    switch (opc) {
                        case 1:
                            retiro = (retiro * (-1));
                            break;
                        case 2:
                            bandera = false;
                            break;
                        default:
                            JOptionPane.showMessageDialog(null, "Opción incorrecta");
                    }
                } while (opc > 2 || opc < 1);
            }
            if (retiro > getSaldo()) {
                JOptionPane.showMessageDialog(null, "Saldo insuficiente para efectuar el retiro. \nSaldo actual: " + this.getSaldo());
            } else {
                if (bandera) {

                    if (Math.floorMod(this.retiro, 10000) == 0) {
                        this.setSaldo(this.getSaldo() - this.retiro);
                        salir = true;
                        JOptionPane.showMessageDialog(null, "Su nuevo saldo es: $" + this.getSaldo());
                    } else {
                        JOptionPane.showMessageDialog(null, "El valor a depositar debe ser múltiplo de $10.000");
                    }

                }
                i++;
            }
        } while (salir == false && i < 2);
    }

// ------INICIO MÉTODO PAGAR --------
    public void pagar(String servicio) {
        short intentos = 0;
        boolean salir = false;
        do {
            this.servicio = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor de su recibo de " + servicio + "\n"
                    + "Recuerde que el valor a pagar debe ser múltiplo de $10.000"));
            if (Math.floorMod(this.servicio, 10000) == 0) {
                this.setSaldo(this.getSaldo() - this.servicio);
                salir = true;
            } else {
                while (intentos < 1) {
                    JOptionPane.showMessageDialog(null, "El valor a pagar debe ser múltiplo de $10.000, intentelo de nuevo");
                    this.servicio = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor de su recibo de " + servicio + "\n"
                            + "Recuerde que el valor a pagar debe ser múltiplo de $10.000"));
                    if (Math.floorMod(this.servicio, 10000) == 0 || Math.floorMod((this.servicio * -1), 10000) == 0) {
                        if (this.servicio < 0) {
                            this.setSaldo(this.getSaldo() - (this.servicio * -1));
                        } else {
                            this.setSaldo(this.getSaldo() - this.servicio);
                        }
                    }
                    intentos++;
                }
                salir = true;
            }
        } while (salir == false && intentos == 1);
        if (intentos == 1) {
            JOptionPane.showMessageDialog(null, "Intentos fallidos, de regreso al menú");
        } else {
            JOptionPane.showMessageDialog(null, "Usted ha pagado el servicio de " + servicio + "\nSu nuevo saldo es: $" + this.getSaldo());
        }
    }
// ------FIN MÉTODO PAGAR --------

}
