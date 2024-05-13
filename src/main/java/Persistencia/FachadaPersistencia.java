/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persistencia;

import dto.ClimaDTO;
import java.util.List;

/**
 *
 * @author Gabriel
 */
public class FachadaPersistencia {

    private ContinenteDAO continente;
    private ClimaDAO clima;
    private VegetacionDAO vegetacion;
    private HabitatDAO habitat;
    private ZonaDAO zona;
    private HabitatOcupaDAO habitatO;

    public FachadaPersistencia() {
        continente = new ContinenteDAO();
        vegetacion = new VegetacionDAO();
        clima = new ClimaDAO();
        habitat = new HabitatDAO();
        zona = new ZonaDAO();
        habitatO = new HabitatOcupaDAO();

    }

}
