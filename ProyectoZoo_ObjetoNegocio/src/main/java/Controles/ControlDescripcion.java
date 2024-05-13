/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controles;
import Datos.FabricaDatos;
import Datos.IDatos;
import Dominio.Descripcion;

/**
 *
 * @author Gabriel
 */
public class ControlDescripcion {
       private IDatos datos;

              public Descripcion verificaDescripcion(String nombre){
        datos=FabricaDatos.dameInstancia();
        Descripcion e =datos.verificarDescripcion(nombre);
        return e;
    }
}
