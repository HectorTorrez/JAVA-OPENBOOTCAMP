public class Main {
    public static void main(String[] args) {
        Persona persona = new Persona();


        persona.setEdad(22);
        persona.setNombre("Hector");
        persona.setTelefono(1234);
        System.out.println(persona.getEdad());
        System.out.println(persona.getNombre());
        System.out.println(persona.getTelefono());
    }



}
class Persona{
    private int edad;
    private String nombre;
    private int telefono;

    public int setEdad(int edad){
        return this.edad = edad;
    }
    public int getEdad(){
        return this.edad;
    }
    public String setNombre(String nombre){
        return this.nombre = nombre;
    }
    public String getNombre(){
        return this.nombre;
    }

    public int setTelefono(int telefono ){
        return this.telefono = telefono;
    }
    public int getTelefono(){
        return this.telefono;
    }
}