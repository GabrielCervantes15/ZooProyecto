package Datos;

import DAO.*;
import Dominio.Clima;
import Dominio.Descripcion;
import Dominio.Continente;
import Dominio.Cuidador;
import Dominio.CuidadorEspecie;
import Dominio.Especie;
import Dominio.Guia;
import Dominio.Habitat;
import Dominio.HabitatOcupada;
import Dominio.Itinerario;
import Dominio.Vegetacion;
import Dominio.Zona;
import java.util.Date;
import java.util.List;
import org.bson.types.ObjectId;

public class FachadaDatos implements IDatos {

    private ContinenteDAO continente;
    private ClimaDAO clima;
    private VegetacionDAO vegetacion;
    private HabitatDAO habitat;
    private GuiaDAO guia;
    private ZonaDAO zona;
    private CuidadorDAO cuidador;
    private EspecieDAO especie;
    private HabitatOcupaDAO habitatO;
    private CuidadoresEspecieDAO cuidadorEspecie;
    private ItinerarioDAO itinerario;
    private DescripcionDAO descripcion;

    public FachadaDatos() {
        continente = new ContinenteDAO();
        vegetacion = new VegetacionDAO();
        clima = new ClimaDAO();
        habitat = new HabitatDAO();
        guia = new GuiaDAO();
        zona = new ZonaDAO();
        cuidador = new CuidadorDAO();
        especie = new EspecieDAO();
        habitatO = new HabitatOcupaDAO();
        cuidadorEspecie = new CuidadoresEspecieDAO();
        itinerario = new ItinerarioDAO();
        descripcion = new DescripcionDAO();
    }

    @Override
    public List<Clima> recuperarClima() {
        return clima.buscarTodos();

    }

    @Override
    public List<Continente> recuperarContinente() {
        return continente.buscarTodos();
    }

    @Override
    public List<Vegetacion> recuperarVegetacion() {
        return vegetacion.buscarTodos();
    }

    @Override
    public Habitat verificarHabitat(String nombre) {
        Habitat h = habitat.buscarPorNombre(nombre);
        return h;

    }

    @Override
    public Especie verificarEspecie(String nombre) {
        return this.especie.buscarPorNombre(nombre);
    }

    @Override
    public boolean guardaHabitat(Habitat habitat) {
        return this.habitat.guardar(habitat);
    }

    @Override
    public boolean guardarGuia(Guia guia) {
        return this.guia.guardar(guia);
    }

    @Override
    public List<Zona> recuperarZonas() {
        return zona.buscarTodos();
    }

    @Override
    public List<Cuidador> recuperarCuidadores() {
        return cuidador.buscarTodos();
    }

    @Override
    public List<Habitat> recuperarHabitats() {
        return habitat.buscarTodos();
    }

    @Override
    public boolean guardaEspecie(Especie especie) {
        return this.especie.guardar(especie);
    }

    @Override
    public boolean guardarHabitats(List<HabitatOcupada> habitatOcupada) {
        return this.habitatO.guardarMuchos(habitatOcupada);
    }

    @Override
    public boolean guardarCuidadoresEspecie(List<CuidadorEspecie> cuidadoresEspecie) {
        return this.cuidadorEspecie.guardarMuchos(cuidadoresEspecie);
    }

    @Override
    public boolean agregarHabitatOcupadaAHabitat(ObjectId id, HabitatOcupada habitatO) {
        return this.habitat.agregarHabitatOcupada(id, habitatO);
    }

    @Override
    public boolean agregarCuidadorEspecieACuidador(ObjectId id, CuidadorEspecie cuidadorEspecie) {
        return this.cuidador.agregarCuidadorEspecie(id, cuidadorEspecie);
    }

    @Override
    public Cuidador buscarCuidador(ObjectId id) {
        return cuidador.buscarPorID(id);
    }

    @Override
    public Habitat buscarHabitat(ObjectId id) {
        return habitat.buscarPorID(id);
    }

    @Override
    public List<Itinerario> recuperaItinerarios() {
        return itinerario.buscarTodos();
    }

    @Override
    public List<Guia> recuperarGuias() {
        return guia.buscarTodos();
    }

    @Override
    public Itinerario verificarItinerario(String nombre) {
        return this.itinerario.buscarPorNombre(nombre);
    }

    @Override
    public boolean guardarItinerario(Itinerario iti) {
        return this.itinerario.guardar(iti);
    }

    @Override
    public boolean actualizarItinerario(Itinerario itinerario) {
        return this.itinerario.actualizarItinerario(itinerario);
    }

    @Override
    public Descripcion verificarDescripcion(String nombre) {
        return this.descripcion.buscarPorNombre(nombre);
    }

    @Override
    public void RegistrarDatos() {
        ContinenteDAO con = new ContinenteDAO();
        Continente cona = new Continente("America");
        Continente conaf = new Continente("Africa");
        Continente conaA = new Continente("Asia");
        Continente conaE = new Continente("Europa");
        Continente conaO = new Continente("Oceania");
        con.guardar(cona);
        con.guardar(conaf);
        con.guardar(conaA);
        con.guardar(conaE);
        con.guardar(conaO);

        VegetacionDAO vege = new VegetacionDAO();
        Vegetacion ve = new Vegetacion("Forestado");
        Vegetacion veD = new Vegetacion("Desertica");
        Vegetacion veP = new Vegetacion("Jungla");
        vege.guardar(ve);
        vege.guardar(veD);
        vege.guardar(veP);

        ClimaDAO clima = new ClimaDAO();

        Clima clS = new Clima("Seco");
        Clima clN = new Clima("Humedo");
        Clima clT = new Clima("Templado");

        clima.guardar(clS);
        clima.guardar(clN);
        clima.guardar(clT);

        Zona zona = new Zona("Zona Reptiles", 10000);
        Zona zona1 = new Zona("Zona Felinos", 10000);
        Zona zona2 = new Zona("Zona Aves", 10000);
        Zona zona3 = new Zona("Zona Acuatica", 10000);
        Cuidador cui = new Cuidador("Diego Robles Rojas", "direccion", "6441271967", new Date());
        ZonaDAO z = new ZonaDAO();
        z.guardar(zona);
        z.guardar(zona1);
        z.guardar(zona2);
        z.guardar(zona3);
        CuidadorDAO C = new CuidadorDAO();
        C.guardar(cui);
        Guia g = new Guia("Gibran Duran Solano", "direccion", "6441271967", new Date());
        GuiaDAO gs = new GuiaDAO();
        gs.guardar(g);
    }

    @Override
    public void RegistrarDatosExternos() {
        Descripcion des = new Descripcion("El león (Panthera leo) es un mamífero carnívoro de la familia de los félidos y una de las cinco especies del género Panthera. Los leones salvajes viven en poblaciones cada vez más dispersas y fragmentadas del África subsahariana (a excepción de las regiones selváticas de la costa del Atlántico y la cuenca del Congo) y una pequeña zona del noroeste de India (una población en peligro crítico en el parque nacional del Bosque de Gir y alrededores), habiendo desaparecido del resto de Asia del Sur, Asia Occidental, África del Norte y la península balcánica en tiempos históricos. Hasta finales del Pleistoceno, hace aproximadamente diez mil años, de los grandes mamíferos terrestres, el león era el más extendido tras los humanos. Su distribución cubría la mayor parte de África, gran parte de Eurasia, desde el oeste de Europa hasta la India, y en América, desde el río Yukón hasta el sur de México.", "Leon");
        Descripcion des1 = new Descripcion("Los fócidos o focas verdaderas (Phocidae) son una familia de mamíferos pinnípedos adaptados a vivir en medios acuáticos la mayor parte del tiempo. El nombre común deriva directamente del latín phoca, que a su vez tiene su origen en el griego φώκη (phṓkē).Se conocen 33 especies. Carecen de pabellón auditivo y sus extremidades posteriores están dirigidas hacia atrás y no son funcionales en el desplazamiento terrestre, característica que los diferencia de los otáridos (lobos y osos marinos).", "Foca");
        Descripcion des2 = new Descripcion("La jirafa es una especie de mamífero artiodáctilo, de la familia Giraffidae propio de África. Es la más alta de todas las especies de animales terrestres existentes, ya que puede alcanzar una altura máxima de 5,7 m y un peso que varía entre 750 y 1600 kg.", "Jirafa");
        Descripcion des3 = new Descripcion("En comparación con otros felinos salvajes, el leopardo tiene unas patas relativamente cortas y un cuerpo alargado con un cráneo grande. Su pelaje está marcado con rosetas. Su aspecto es similar al del jaguar (Panthera onca), pero es más pequeño y ligero, y sus rosetas suelen ser más pequeñas, más densas y sin manchas centrales. Tanto los leopardos como los jaguares que son melánicos se conocen como pantera negra.", "Leopardo");
        Descripcion des4 = new Descripcion("La palabra mono es un término informal, no taxonómico, que designa a un amplio conjunto de primates simiiformes.Los términos mono y simio son sinónimos en el idioma español,1​ pero en zoología suele hacerse una distinción entre ambos, debido a la influencia del idioma inglés, en el que los términos equivalentes monkey y ape tienen diferentes significados. Aunque existen algunas similitudes entre ambos conjuntos de animales, las diferencias son muchas.", "Mono");
        Descripcion des5 = new Descripcion("El tigre (Panthera tigris) es una de las especies3​ de la subfamilia de los panterinos (familia Felidae) pertenecientes al género Panthera. Se encuentra solamente en el continente asiático; es un predador carnívoro y es la especie de félido más grande del mundo junto con el león pudiendo alcanzar ambos un tamaño comparable al de los fósiles de félidos de mayor tamaño.", "Tigre");
        DescripcionDAO a = new DescripcionDAO();
        a.guardar(des);
        a.guardar(des1);
        a.guardar(des2);
        a.guardar(des3);
        a.guardar(des4);
        a.guardar(des5);
    }

}
