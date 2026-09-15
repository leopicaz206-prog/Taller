import java.util.Scanner; 

public class TallerEstructuraDeDatos { 
    public static void main(String[] args) { 
        Scanner entrada = new Scanner(System.in);
        
        Ejercicio1 Ej1 = new Ejercicio1(); 
        Ejercicio2 Ej2 = new Ejercicio2(); 
        Ejercicio3 Ej3 = new Ejercicio3(); 
        Ejercicio4 Ej4 = new Ejercicio4(); 
        Ejercicio5 Ej5 = new Ejercicio5(); 
        
        int opcion;
        do {
            System.out.println("\n===== TALLER ESTRUCTURA DE DATOS ====="); 
            System.out.println("1. Ejercicio 1 - Array de enteros");
            System.out.println("2. Ejercicio 2 - Array de Strings");
            System.out.println("3. Ejercicio 3 - Ordenamiento de Personas");
            System.out.println("4. Ejercicio 4 - Busqueda de Personas");
            System.out.println("5. Ejercicio 5 - Arrays Mixtos");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opcion: ");
            opcion = entrada.nextInt();
            switch (opcion) {
                case 1: 
                    System.out.println("\n--- EJERCICIO 1 ---");
                    Ej1.mainEje1();
                break;
                case 2: 
                    System.out.println("\n--- EJERCICIO 2 ---");
                    Ej2.mainEje2();
                break; 
                case 3: 
                    System.out.println("\n--- EJERCICIO 3 ---");
                    Ej3.mainEje3();
                break;
                case 4:
                    System.out.println("\n--- EJERCICIO 4 ---");
                    Ej4.mainEje4();
                    break;
                case 5: 
                    System.out.println("\n--- EJERCICIO 5 ---");
                    Ej5.mainEje5();
                    break; 
                case 0: 
                    System.out.println("\nSaliendo del programa...");
                    break; 
                default: 
                    System.out.println("\nOpción no valida. Intente nuevamente.");
            } 
        } while (opcion != 0); entrada.close();
    } 
}