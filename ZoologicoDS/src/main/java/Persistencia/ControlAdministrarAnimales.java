/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persistencia;


import java.util.ArrayList;
import java.util.List;
import objetosNegocio.Animal;
import objetosNegocio.Habitat;

/**
 *
 * @author Equipo 3
 */
public class ControlAdministrarAnimales {
    private List<Animal> animales;
    
    public ControlAdministrarAnimales() {
        this.animales = new ArrayList<>();
        // Inicialización con algunos datos de ejemplo
        this.animales.add(new Animal("Luna", "Hembra", 2));
        this.animales.add(new Animal("Pedro", "Macho", 1));
    }
    
    protected List<Animal> consultarAnimales() {
        // Lógica para consultar y devolver todos los animales
        return this.animales;
    }
     public void agregar(Animal animal){
        this.animales.add(animal);
    }
}
