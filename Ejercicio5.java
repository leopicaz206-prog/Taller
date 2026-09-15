// Clase principal
public class Ejercicio5 {

    // 1. Método para calcular el promedio de los enteros
    public static double calcularPromedio(int[] numeros) {

        int suma = 0;

        for (int numero : numeros) {
            suma += numero;
        }

        return (double) suma / numeros.length;
    }

    // 2. Método para concatenar los nombres de los cursos
    public static String concatenarCursos(String[] cursos) {

        StringBuilder resultado = new StringBuilder();

        for (String curso : cursos) {
            resultado.append(curso).append(" ");
        }

        return resultado.toString().trim();
    }

    // 3. Método para encontrar el estudiante con mayor calificación
    public static Ejercicio5Estudiante estudianteMayorCalificacion(
            Ejercicio5Estudiante[] estudiantes) {

        Ejercicio5Estudiante mejorEstudiante = estudiantes[0];

        for (int i = 1; i < estudiantes.length; i++) {

            if (estudiantes[i].getCalificacion()
                    > mejorEstudiante.getCalificacion()) {

                mejorEstudiante = estudiantes[i];
            }
        }

        return mejorEstudiante;
    }

    public static void mainEje5() {

        // Array de enteros: calificaciones o puntajes
        int[] puntajes = {80, 90, 75, 95, 85};

        // Array de Strings: nombres de cursos
        String[] cursos = {
            "Poo",
            "Base de Datos",
            "Matematicas",
            "Ingles"
        };

        // Array de objetos Estudiante
        Ejercicio5Estudiante[] estudiantes = {
            new Ejercicio5Estudiante("Carlos", 20, 8.5),
            new Ejercicio5Estudiante("Ana", 19, 9.2),
            new Ejercicio5Estudiante("Pedro", 22, 7.8),
            new Ejercicio5Estudiante("Laura", 21, 9.7),
            new Ejercicio5Estudiante("Juan", 20, 8.9)
        };

        // Operación 1: calcular promedio
        double promedio = calcularPromedio(puntajes);

        // Operación 2: concatenar cursos
        String cursosConcatenados = concatenarCursos(cursos);

        // Operación 3: encontrar estudiante con mayor calificación
        Ejercicio5Estudiante mejorEstudiante =
                estudianteMayorCalificacion(estudiantes);

        // Mostrar resultados
        System.out.println("===== RESULTADOS =====");

        System.out.println("\n1. Promedio de los puntajes:");
        System.out.println(promedio);

        System.out.println("\n2. Cursos concatenados:");
        System.out.println(cursosConcatenados);

        System.out.println("\n3. Estudiante con mayor calificacion:");
        System.out.println(mejorEstudiante);
    }
}