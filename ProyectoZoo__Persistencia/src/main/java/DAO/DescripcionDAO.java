/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;


import Dominio.Descripcion;
import com.mongodb.MongoException;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import static com.mongodb.client.model.Filters.eq;
import java.util.ArrayList;
import java.util.List;
import javax.swing.text.Document;
import org.bson.types.ObjectId;

/**
 *
 * @author Gabriel
 */
public class DescripcionDAO<T> extends DAOBase<Descripcion>  {
     private MongoDatabase conexionExterna;
      

    public void recuperaDescripcion(){
        conexionExterna = ConexionExterna.getInstance();
    }
   
       public Descripcion buscarPorNombre(String nombre) {
        Descripcion es = obtenerColeccion().find(eq("nombreespecie", nombre)).first();
           System.out.println(es);
        return es;
    }
    
    @Override
    public boolean guardar(Descripcion entidad) {
        MongoCollection<Descripcion> coleccionP = obtenerColeccion();
        try {
            
            coleccionP.insertOne(entidad);
            return true; // El guardado fue exitoso
        } catch (MongoException e) {
            return false; // Error al guardar la entidad
        }
    }
    public boolean guardarMuchos(List<Descripcion> entidad) {
        MongoCollection<Descripcion> coleccionP = obtenerColeccion();
        try {
            coleccionP.insertMany(entidad);
            return true; // El guardado fue exitoso
        } catch (MongoException e) {
            return false; // Error al guardar la entidad
        }
    }
    @Override
    public Descripcion buscarPorID(ObjectId id) {
        Descripcion cuidador = obtenerColeccion().find(eq("_id", id)).first();
        return cuidador;
    }

    @Override
    public List<Descripcion> buscarTodos() {
        List<Descripcion> cuidador = new ArrayList<>();
        cuidador = obtenerColeccion().find().into(new ArrayList<>());
        return cuidador;
    }

    @Override
    public MongoCollection<Descripcion> obtenerColeccion() {
        MongoDatabase db = ConexionExterna.getInstance();
        MongoCollection<Descripcion> colleccionCuidador = db.getCollection("Descripcion", Descripcion.class);
        return colleccionCuidador;
    }

}
