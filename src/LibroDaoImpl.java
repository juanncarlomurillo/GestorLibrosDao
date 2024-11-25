import java.util.ArrayList;
import java.util.List;

public class LibroDAOImpl implements LibroDAO {
    private List<Libro> libros = new ArrayList<>();

    @Override
    public void agregarLibro(Libro libro) {
        libros.add(libro);
    }

    @Override
    public List<Libro> obtenerTodos() {
        return libros;
    }

    @Override
    public Libro buscarPorId(int id) {
        return libros.stream().filter(libro -> libro.getId() == id).findFirst().orElse(null);
    }

    @Override
    public void actualizarLibro(Libro libro) {
        Libro libroExistente = buscarPorId(libro.getId());
        if (libroExistente != null) {
            libroExistente = libro;
        }
    }

    @Override
    public void eliminarLibro(int id) {
        libros.removeIf(libro -> libro.getId() == id);
    }
}
