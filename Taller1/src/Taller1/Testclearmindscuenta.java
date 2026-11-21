package Taller1;

public class Testclearmindscuenta {

    public static void main(String[] args) {


        clearmindscuenta cuenta1 = new clearmindscuenta("03476");
        cuenta1.setSaldo(675);

        clearmindscuenta cuenta2 = new clearmindscuenta("03476", "C", 98);

        clearmindscuenta cuenta3 = new clearmindscuenta("03476");
        cuenta3.setTipo("C");
        System.out.println("-------- Valores Iniciales ---------");

        cuenta1.imprimir();
        cuenta2.imprimir();
        cuenta3.imprimir();
        System.out.println("-------- Valores Modificados ---------");

        cuenta1.setSaldo(850);
        cuenta1.setTipo("C");

        cuenta2.setSaldo(250);
        cuenta2.setTipo("A");

        cuenta3.setSaldo(500);
        cuenta3.setTipo("C");

        cuenta1.imprimir();
        cuenta2.imprimir();
        cuenta3.imprimir();

        System.out.println("-------- Cuentas Adicionales ---------");

        clearmindscuenta cuenta4 = new clearmindscuenta("04567");
        cuenta4.setSaldo(1200);
        clearmindscuenta cuenta5 = new clearmindscuenta("07890", "B", 350);
        clearmindscuenta cuenta6 = new clearmindscuenta("09876", "A", 2000);

        cuenta4.imprimir();
        cuenta5.imprimir();
        cuenta6.imprimir();

        System.out.println("-------- Impresión Personalizada ---------");
        cuenta1.imprimirConMiEstilo();
        cuenta5.imprimirConMiEstilo();    }
}
