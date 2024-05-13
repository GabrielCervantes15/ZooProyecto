/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persistencia;

import com.mongodb.MongoException;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import static com.mongodb.client.model.Filters.eq;
import dto.HabitatOcupadaDTO;
import java.util.ArrayList;
import java.util.List;
import org.bson.types.ObjectId;

/**
 *
 * @author diego
 */
public class HabitatOcupaDAO<T> extends DAOBase<HabitatOcupadaDTO> {

    private MongoDatabase conexion;

    public void recuperarContinente() {
        conexion = Conexion.getInstance();
    }

    @Override
    public boolean guardar(HabitatOcupadaDTO entidad) {
        MongoCollection<HabitatOcupadaDTO> coleccionP = obtenerColeccion();
        try {
            coleccionP.insertOne(entidad);
            return true; // El guardado fue exitoso
        } catch (MongoException e) {
            return false; // Error al guardar la entidad
        }
    }
    public boolean guardarMuchos(List<HabitatOcupadaDTO> entidad) {
        MongoCollection<HabitatOcupadaDTO> coleccionP = obtenerColeccion();
        try {
            coleccionP.insertMany(entidad);
            return true; // El guardado fue exitoso
        } catch (MongoException e) {
            return false; // Error al guardar la entidad
        }
    }

    @Override
    public HabitatOcupadaDTO buscarPorID(ObjectId id) {
        HabitatOcupadaDTO guias = obtenerColeccion().find(eq("_id", id)).first();
        return guias;
    }

    @Override
    public List<HabitatOcupadaDTO> buscarTodos() {
        List<HabitatOcupadaDTO> guias = new ArrayList<>();
        guias = obtenerColeccion().find().into(new ArrayList<>());
        return guias;
    }

    @Override
    public MongoCollection<HabitatOcupadaDTO> obtenerColeccion() {
        MongoDatabase db = Conexion.getInstance();
        MongoCollection<HabitatOcupadaDTO> coleccion = db.getCollection("HabitatOcupada", HabitatOcupadaDTO.class);
        return coleccion;
    }
}
