
package Animal;

public class Gato implements Animal{

    @Override
    public void emitirSom() {
        System.out.println("Ronronando");
    }

    @Override
    public void comer() {
        System.out.println("Carne");
    }
    
}
