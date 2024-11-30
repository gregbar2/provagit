
import java.util.ArrayList;
import java.util.List;

public class Rubrica implements  Contattabile {

    private List<Contatto> contatti;

    public void creaRubrica() {
        contatti = new ArrayList<>();
    }

    @Override
    public void creaContatto(Contatto c) {
        contatti.add(c);
    }

    @Override
    public void modificaContatto(Contatto c) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void eliminaContatto(Contatto c) {
        contatti.remove(c);
    }

    public List<Contatto> getContatti() {
        return contatti;
    }

    @Override
    public Contatto cercaContatto(Contatto c) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

  

  
}
