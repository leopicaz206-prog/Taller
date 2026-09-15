import java.util.Arrays;
import java.util.Comparator;

public class Ejercicio3 {
    public static void mainEje3() {
        // Crear y llenar el array de Personas
        Ejercicio3Persona[] personas = {
            new Ejercicio3Persona("Carlos", 25),
            new Ejercicio3Persona("Ana", 19),
            new Ejercicio3Persona("Pedro", 32),
            new Ejercicio3Persona("Laura", 22),
            new Ejercicio3Persona("Juan", 28)
        };

        // Mostrar las personas antes de ordenar
        System.out.println("Personas antes de ordenar:");

        for (Ejercicio3Persona persona : personas) {
            System.out.println(persona);
        }

        // Ordenar por edad de forma ascendente
        Arrays.sort(personas, new Comparator<Ejercicio3Persona>() {
            @Override
            public int compare(Ejercicio3Persona p1, Ejercicio3Persona p2) {
                return Integer.compare(p1.getEdad(), p2.getEdad());
            }
        });

        // Mostrar las personas después de ordenar
        System.out.println("\nPersonas ordenadas por edad:");

        for (Ejercicio3Persona persona : personas) {
            System.out.println(persona);
        }
    }
}