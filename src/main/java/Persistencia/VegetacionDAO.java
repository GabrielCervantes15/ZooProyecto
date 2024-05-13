
package Persistencia;


import com.mongodb.MongoException;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import static com.mongodb.client.model.Filters.eq;
import dto.VegetacionDTO;
import java.util.ArrayList;
import java.util.List;
import org.bson.types.ObjectId;


public class VegetacionDAO <T> extends DAOBase<VegetacionDTO>
{

    private MongoDatabase conexion;

    public void recuperaVegetacion() {
        conexion = Conexion.getInstance();
    }
    
    @Override
    public boolean guardar(VegetacionDTO entidad) {
       MongoCollection<VegetacionDTO> coleccionP =obtenerColeccion();
        try {
            coleccionP.insertOne(entidad);
            return true; // El guardado fue exitoso
        } catch (MongoException e) {
            return false; // Error al guardar la entidad
        }
    }

    @Override
    public VegetacionDTO buscarPorID(ObjectId id) {
        VegetacionDTO vege = obtenerColeccion().find(eq("_id", id)).first();
        return vege;
    }

    @Override
    public List<VegetacionDTO> buscarTodos() {
        List<VegetacionDTO> vege = new ArrayList<>();
        vege = obtenerColeccion().find().into(new ArrayList<>());
        return vege;
    }

    @Override
    public MongoCollection<VegetacionDTO> obtenerColeccion() {
        MongoDatabase db = Conexion.getInstance();
        MongoCollection<VegetacionDTO> collecionVegetacion = db.getCollection("Vegetacion", VegetacionDTO.class);
        return collecionVegetacion;
    }

}
