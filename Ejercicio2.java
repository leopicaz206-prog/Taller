public class Ejercicio2 {
    // Método para concatenar todas las cadenas
    public static String concatenar(String[] cadenas) {
        StringBuilder resultado = new StringBuilder();

        for (String cadena : cadenas) {
            resultado.append(cadena).append(" ");
        }

        return resultado.toString().trim();
    }

    // Método para encontrar la cadena más larga
    public static String cadenaMasLarga(String[] cadenas) {
        String masLarga = cadenas[0];

        for (int i = 1; i < cadenas.length; i++) {
            if (cadenas[i].length() > masLarga.length()) {
                masLarga = cadenas[i];
            }
        }

        return masLarga;
    }

    // Método para encontrar la cadena que aparece primero alfabéticamente
    public static String primeraAlfabeticamente(String[] cadenas) {
        String primera = cadenas[0];

        for (int i = 1; i < cadenas.length; i++) {
            if (cadenas[i].compareTo(primera) < 0) {
                primera = cadenas[i];
            }
        }

        return primera;
    }

    public void mainEje2() {

        // Inicializar el array de Strings
        String[] cadenas = {
            "Manzana",
            "Computadora",
            "Casa",
            "Programacion",
            "Sol"
        };

        // Mostrar el array
        System.out.println("Cadenas del array:");

        for (String cadena : cadenas) {
            System.out.println("- " + cadena);
        }

        // Realizar las operaciones
        String concatenadas = concatenar(cadenas);
        String masLarga = cadenaMasLarga(cadenas);
        String primera = primeraAlfabeticamente(cadenas);

        // Mostrar los resultados
        System.out.println("\nResultados:");

        System.out.println("1. Cadenas concatenadas:");
        System.out.println(concatenadas);

        System.out.println("\n2. Cadena mas larga:");
        System.out.println(masLarga);

        System.out.println("\n3. Primera cadena en orden alfabetico:");
        System.out.println(primera);
    }
}