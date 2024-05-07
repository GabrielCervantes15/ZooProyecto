package administrarAnimalesSubsistema;

import java.util.List;
import objetosNegocio.Queja;

/**
 *
 * @author Fernando
 */
public class FachadaAdministrarQueja {

    public class FachadaAdministrarQuejas {

        private ControlAdministrarQuejas controlQuejaes;

        public FachadaAdministrarQuejas() {
            this.controlQuejaes = new ControlAdministrarQuejas();
        }

        public List<Queja> consultarTodosLosQuejaes() {
            return controlQuejaes.consultarQuejas();
        }

        public void Agregar(Queja Queja) {
            this.controlQuejaes.agregar(Queja);
        }
    }
}
