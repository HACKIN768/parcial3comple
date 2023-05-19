package parcial3b;

	
	import java.util.ArrayList;
		import java.util.List;

		public class Inventario {
		    private List<String> elementos;

		    public Inventario() {
		        elementos = new ArrayList<>();
		    }

		    public void agregarElemento(String elemento) {
		        elementos.add(elemento);
		        System.out.println("Elemento agregado: " + elemento);
		    }

		    public void eliminarElemento(String elemento) {
		        if (elementos.contains(elemento)) {
		            elementos.remove(elemento);
		            System.out.println("Elemento eliminado: " + elemento);
		        } else {
		            System.out.println("El elemento no existe en el inventario: " + elemento);
		        }
		    }

		    public void mostrarInventario() {
		        System.out.println("Inventario:");
		        for (String elemento : elementos) {
		            System.out.println("- " + elemento);
		        }
		    }

		    public static void main(String[] args) {
		        Inventario inventario = new Inventario();

		        inventario.agregarElemento("Item 1");
		        inventario.agregarElemento("Item 2");
		        inventario.agregarElemento("Item 3");

		        inventario.mostrarInventario();

		        inventario.eliminarElemento("Item 2");

		        inventario.mostrarInventario();
		    }
		}

	}
