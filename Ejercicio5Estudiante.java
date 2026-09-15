public class Ejercicio5Estudiante {

    // Atributos
    private String nombre;
    private int edad;
    private double calificacion;

    // Constructor
    public Ejercicio5Estudiante(String nombre, int edad, double calificacion) {
        this.nombre = nombre;
        this.edad = edad;
        this.calificacion = calificacion;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public double getCalificacion() {
        return calificacion;
    }

    // Método toString
    @Override
    public String toString() {
        return "Nombre: " + nombre +
               ", Edad: " + edad +
               ", Calificacion: " + calificacion;
    }
}