package Persistencia;



import com.mongodb.MongoException;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import static com.mongodb.client.model.Filters.eq;
import dto.ClimaDTO;
import java.util.ArrayList;
import java.util.List;
import org.bson.types.ObjectId;

public class ClimaDAO<T> extends DAOBase<ClimaDTO> {

    private MongoDatabase conexion;

    public void recuperaClima() {
        conexion = Conexion.getInstance();
    }

    @Override
    public boolean guardar(ClimaDTO entidad) {
        MongoCollection<ClimaDTO> coleccionP = obtenerColeccion();
        try {
            coleccionP.insertOne(entidad);
            return true; // El guardado fue exitoso
        } catch (MongoException e) {
            return false; // Error al guardar la entidad
        }
    }

    @Override
    public ClimaDTO buscarPorID(ObjectId id) {
        ClimaDTO clima = obtenerColeccion().find(eq("_id", id)).first();
        return clima;
    }

    @Override
    public List<ClimaDTO> buscarTodos() {
        List<ClimaDTO> climas = new ArrayList<>();
        climas = obtenerColeccion().find().into(new ArrayList<>());
        return climas;
    }

    @Override
    public MongoCollection<ClimaDTO> obtenerColeccion() {
        MongoDatabase db = Conexion.getInstance();
        MongoCollection<ClimaDTO> colleccionClimas = db.getCollection("Clima", ClimaDTO.class);
        return colleccionClimas;
    }
}
