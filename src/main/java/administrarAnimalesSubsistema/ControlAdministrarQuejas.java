package administrarAnimalesSubsistema;

import java.util.ArrayList;
import java.util.List;
import objetosNegocio.Queja;

/**
 *
 * @author Fernando
 */
public class ControlAdministrarQuejas {
    private List<Queja> Quejas;
    
    public ControlAdministrarQuejas() {
        this.Quejas = new ArrayList<>();
        // Inicialización con algunos datos de ejemplo
        this.Quejas.add(new Queja("Bosque", "29/04/2024 08-10", "Juan Carlos Bodoque", "irmaluz@gmail.com", "Irma Luz", "4668445212584", "Los topos mordieron a un niño"));
        this.Quejas.add(new Queja("Selva", "30/04/2024 10-12", "Saul Guzman", "gustavo.fring@hotmail.com", "Irma Luz", "64545215445", "Los monos lanzaron piedras azules a los visitantes"));
        
    }
    
    protected List<Queja> consultarQuejas() {
        // Lógica para consultar y devolver todos los Quejas
        return this.Quejas;
    }
     public void agregar(Queja queja){
        this.Quejas.add(queja);
    }
}
