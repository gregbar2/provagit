
import java.awt.event.ActionEvent;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class RubricaController {

    private Rubrica r;

    private FileManager file;

    private RubricaView view;

    ObservableList<Contatto> contatti;
    
    public void initialize(URL url, ResourceBundle rb) {
        contatti= FXCollections.observableArrayList(r.getContatti());
    }
    
    public void creaContatto(ActionEvent event) {
       
    }

    public void modificaContatto(ActionEvent event) {
    }

    public void eliminaContatto(ActionEvent event) {
    }

    public Contatto cercaContatto(ActionEvent event) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    

    public void salvaRubrica(ActionEvent event) {
    }

    public void caricaRubrica(ActionEvent event) {
    }
}
