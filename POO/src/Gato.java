public class Gato extends Animal {
    

    public Gato (String nombre, int edad){
        //con la palabra SUPER estamos asignando al información heredada
        super(nombre, edad);
       
    }

    @Override
    public String hacerSonido(){
        return "Miau";
    }

    
}
