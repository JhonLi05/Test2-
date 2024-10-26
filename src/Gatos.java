public class Gatos {
    public int edad;
    public String nombre;

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {return edad;}
    public String getNombre() {return nombre;}

    public Gatos(int edad,String nombre) {
        this.edad = edad;
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Gato {" +
                "edad=" + getEdad() +
                ", nombre='" + getNombre() + '\'' +
                '}';
    }
}
