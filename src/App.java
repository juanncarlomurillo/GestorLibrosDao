public class App {
    public static void main(String[] args) {
        LibroDAO libroDAO = new LibroDAOImpl();

        libroDAO.agregarLibro(new Libro(1, "El principito", "Antoine de Saint-Exupéry", 1943));
        libroDAO.agregarLibro(new Libro(2, "Cien años de soledad", "Gabriel García Márquez", 1967));

        System.out.println("Lista de libros:");
        libroDAO.obtenerTodos().forEach(System.out::println);

        System.out.println("\nBuscando libro con ID 1:");
        System.out.println(libroDAO.buscarPorId(1));

        System.out.println("\nEliminando libro con ID 1.");
        libroDAO.eliminarLibro(1);

        System.out.println("Lista de libros después de eliminar:");
        libroDAO.obtenerTodos().forEach(System.out::println);
    }
}
