package Persistencia;


import com.mongodb.MongoException;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import static com.mongodb.client.model.Filters.eq;
import com.mongodb.client.model.Updates;
import com.mongodb.client.result.UpdateResult;
import dto.HabitatDTO;
import dto.HabitatOcupadaDTO;
import java.util.ArrayList;
import java.util.List;
import org.bson.types.ObjectId;

public class HabitatDAO<T> extends DAOBase<HabitatDTO> {

    private MongoDatabase conexion;

    public void recuperaClima() {
        conexion = Conexion.getInstance();
    }

    @Override
    public boolean guardar(HabitatDTO entidad) {
        MongoCollection<HabitatDTO> coleccionP = obtenerColeccion();
        try {
            coleccionP.insertOne(entidad);
            return true; // El guardado fue exitoso
        } catch (MongoException e) {
            return false; // Error al guardar la entidad
        }
    }

    public boolean agregarHabitatOcupada(ObjectId id, HabitatOcupadaDTO habitat) {
        try {
            MongoCollection<HabitatDTO> coleccionP = obtenerColeccion();
            UpdateResult resultado = coleccionP.updateOne(Filters.eq("_id", id), Updates.addToSet("habitatOcupada", habitat));
            return resultado.getModifiedCount() > 0;
        } catch (MongoException | IllegalArgumentException e) {
            return false;
        }
    }

    @Override
    public HabitatDTO buscarPorID(ObjectId id) {
        HabitatDTO habitat = obtenerColeccion().find(eq("_id", id)).first();
        return habitat;
    }

    public HabitatDTO buscarPorNombre(String nombre) {
        HabitatDTO habitat = obtenerColeccion().find(eq("nombre", nombre)).first();
        return habitat;
    }

    @Override
    public List<HabitatDTO> buscarTodos() {
        List<HabitatDTO> habitat = new ArrayList<>();
        habitat = obtenerColeccion().find().into(new ArrayList<>());
        return habitat;
    }

    @Override
    public MongoCollection<HabitatDTO> obtenerColeccion() {
        MongoDatabase db = Conexion.getInstance();
        MongoCollection<HabitatDTO> colleccionClimas = db.getCollection("Habitat", HabitatDTO.class);
        return colleccionClimas;
    }

}
