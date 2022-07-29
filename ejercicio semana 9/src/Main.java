public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        System.out.println("ESTE ES EL CLIENTE");
       cliente.edad = 22;
       System.out.println("Su edad: "+cliente.edad);
       cliente.nombre = "Hector";
        System.out.println("Nombre: "+cliente.nombre);
       cliente.telefono = 1234;
        System.out.println("Numero de telefono: "+cliente.telefono);
       cliente.credito = 99999;
        System.out.println("Credito disponible "+cliente.credito);
    System.out.println("-------------------------");
        System.out.println("ESTE ES EL TRABAJADOR");
        Trabajador trabajador = new Trabajador();
        trabajador.edad = 22;
        System.out.println("Su edad es: "+trabajador.edad);
        trabajador.nombre = "Antonio";
        System.out.println("Su nombre es: "+trabajador.nombre);
        trabajador.telefono = 4321;
        System.out.println("El numero de telefono es: "+trabajador.telefono);
        trabajador.salario = 9837;
        System.out.println("El trabajador gana "+ "$" + trabajador.salario + " dolares");
    }
}

class Persona{
    int edad;
    String nombre;
    int telefono;



}

class Cliente extends Persona{
    int credito;
}

class Trabajador extends Persona{
    int salario;
}
