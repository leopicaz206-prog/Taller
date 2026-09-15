public class Ejercicio3Persona {

    // Atributos
    private String nombre;
    private int edad;

    // Constructor
    public Ejercicio3Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Getter del nombre
    public String getNombre() {
        return nombre;
    }

    // Getter de la edad
    public int getEdad() {
        return edad;
    }

    // Método toString para mostrar los datos
    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Edad: " + edad;
    }
}