
package Animal;

public class Cachorro implements Animal{

    @Override
    public void emitirSom() {
        System.out.println("Rosnar");
    }

    @Override
    public void comer() {
        System.out.println("Carne");
    }
    
}
