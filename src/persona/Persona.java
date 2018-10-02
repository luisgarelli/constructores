package persona;
public class Persona {
 //Atributos
    String nombre;
 int edad;
 //metodos
 public Persona (String nombre , int edad){
 
 this.nombre = "jorge";
 this.edad= 25;
 }
 public void mostrarDatos(){
     System.out.println("El nombre de la persona es: "+nombre);
     System.out.println("La edad de la persona es :"+edad);
 
 }
    public static void main(String[] args) {
    Persona p1 = new Persona("Jorge" , 25);
    
    p1.mostrarDatos();
    }
}
