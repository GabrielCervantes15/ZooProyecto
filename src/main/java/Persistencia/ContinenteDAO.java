package Persistencia;

import com.mongodb.MongoException;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import static com.mongodb.client.model.Filters.eq;
import dto.ContinenteDTO;
import java.util.ArrayList;
import java.util.List;
import org.bson.types.ObjectId;

public class ContinenteDAO<T> extends DAOBase<ContinenteDTO> {

    private MongoDatabase conexion;

    public void recuperarContinente() {
        conexion = Conexion.getInstance();
    }

    @Override
    public boolean guardar(ContinenteDTO entidad) {
        MongoCollection<ContinenteDTO> coleccionP = obtenerColeccion();
        try {
            coleccionP.insertOne(entidad);
            return true; // El guardado fue exitoso
        } catch (MongoException e) {
            return false; // Error al guardar la entidad
        }
    }

    @Override
    public ContinenteDTO buscarPorID(ObjectId id) {
        ContinenteDTO continente = obtenerColeccion().find(eq("_id", id)).first();
        return continente;
    }

    @Override
    public List<ContinenteDTO> buscarTodos() {
        List<ContinenteDTO> continente = new ArrayList<>();
        continente = obtenerColeccion().find().into(new ArrayList<>());
        return continente;
    }

    @Override
    public MongoCollection<ContinenteDTO> obtenerColeccion() {
        MongoDatabase db = Conexion.getInstance();
        MongoCollection<ContinenteDTO> coleccionContinentes = db.getCollection("Continente", ContinenteDTO.class);
        return coleccionContinentes;
    }
}
