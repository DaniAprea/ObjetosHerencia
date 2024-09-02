public class Persona {

    //Atributos (estado/características de un objeto)
    private String nombre;
    private String apellido;
    private int edad;

    //Constructor

    public Persona(String nombre, String apellido, int edad){
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    //Métodos (Comportamiento de un objeto)

    public String darNombreCompleto(){
        return getApellido() + ", " + getNombre();
    }

    public String enviarSaludo(String saludado){
        return "Hola, ¿Cómo estás " + saludado + "?";
    }


    //Getter y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    

    
}

