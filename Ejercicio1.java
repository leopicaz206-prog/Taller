import java.util.Scanner;

public class Ejercicio1 {
    public void mainEje1(){
        Scanner sc = new Scanner(System.in);
        
        int[] numeros = {10, 5, 8, 5, 3, 5, 7, 8, 5, 2};
        
        System.out.print("Ingrese el numero que desea buscar: "); 
        int buscado = sc.nextInt();
       
        int contador = 0;
        
        for (int i = 0; i < numeros.length; i++) { 
            if (numeros[i] == buscado) { 
                System.out.println("El numero " + buscado + " se encuentra en la posicion " + i); 
                contador++;
            }  
        } 
        System.out.println("\nTotal de ocurrencias: " + contador);
        
        if (contador == 0) { 
        System.out.println("El numero no se encuentra en el array."); 
        }
    }
}
