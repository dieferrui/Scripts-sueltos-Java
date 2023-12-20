public class TrabajadorYProyecto {

    public static void main(String[] args) {


    }

    static class Trabajador {

        String nombre;
        int edad;
        int sueldo;
        Proyecto proyecto;

        public Trabajador(String nombre, int edad, int sueldo, Proyecto proyecto) {
            this.nombre = nombre;
            this.edad = edad;
            this.sueldo = sueldo;
            this.proyecto = proyecto;
        }
    }

    static class Proyecto {

        String nombre;
        String descripcion;

        public Proyecto(String nombre, String descripcion) {

            this.nombre = nombre;
            this.descripcion = descripcion;
        }
    }
}