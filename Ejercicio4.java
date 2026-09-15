import java.util.Scanner;

// Clase principal
public class Ejercicio4 {

    // Método para buscar una persona por su nombre
    public static Ejercicio3Persona buscarPersona(Ejercicio3Persona[] personas, String nombreBuscado) {

        for (Ejercicio3Persona persona : personas) {

            // Comparar ignorando mayúsculas y minúsculas
            if (persona.getNombre().equalsIgnoreCase(nombreBuscado)) {
                return persona;
            }
        }

        // Si no se encuentra
        return null;
    }

    public static void mainEje4() {

        Scanner sc = new Scanner(System.in);

        // Crear y llenar el array de Personas
        Ejercicio3Persona[] personas = {
            new Ejercicio3Persona("Carlos", 25),
            new Ejercicio3Persona("Ana", 19),
            new Ejercicio3Persona("Pedro", 32),
            new Ejercicio3Persona("Laura", 22),
            new Ejercicio3Persona("Juan", 28)
        };

        // Pedir el nombre al usuario
        System.out.print("Ingrese el nombre de la persona que desea buscar: ");
        String nombreBuscado = sc.nextLine();

        // Realizar la búsqueda
        Ejercicio3Persona personaEncontrada = buscarPersona(personas, nombreBuscado);

        // Mostrar el resultado
        if (personaEncontrada != null) {
            System.out.println("\nPersona encontrada:");
            System.out.println(personaEncontrada);
        } else {
            System.out.println("\nNo se encontro ninguna persona con ese nombre.");
        }
    }
}