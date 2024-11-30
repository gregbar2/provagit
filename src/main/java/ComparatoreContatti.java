
import java.util.Comparator;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author grego
 */
public class ComparatoreContatti implements Comparator<Contatto>{

    @Override
    public int compare(Contatto o1, Contatto o2) {
        if(o1.getCognome().equals(o2.getCognome()))
            return o1.getNome().compareTo(o2.getNome());
        
        return o1.getCognome().compareTo(o2.getCognome());
    }
    
}
