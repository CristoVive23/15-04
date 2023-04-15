
package Animal;

public class Galo implements Animal{

    @Override
    public void emitirSom() {
        System.out.println("Cacareja");
    }

    @Override
    public void comer() {
        System.out.println("Milho (T)");
    }
    
}
