package parcial3b;

public class punto1 {
	package parcial3b;

	public abstract class NaveEspacial {
	    protected String nombre;
	    protected double tamaño;
	    protected int capacidadTripulación;
	    protected double capacidadCarga;
	    protected double velocidadMaxima;
	    protected String tipoPropulsión;

	    public NaveEspacial(String nombre, double tamaño, int capacidadTripulación, double capacidadCarga, double velocidadMaxima, String tipoPropulsión) {
	        this.nombre = nombre;
	        this.tamaño = tamaño;
	        this.capacidadTripulación = capacidadTripulación;
	        this.capacidadCarga = capacidadCarga;
	        this.velocidadMaxima = velocidadMaxima;
	        this.tipoPropulsión = tipoPropulsión;
	    }

	    // Métodos abstractos que deben ser implementados por las clases hijas
	    public abstract void despegar();
	    public abstract void aterrizar();
	    public abstract void viajar();
	}

	public class NaveCarga extends NaveEspacial {
	    private String tipoCarga;

	    public NaveCarga(String nombre, double tamaño, int capacidadTripulación, double capacidadCarga, double velocidadMaxima, String tipoPropulsión, String tipoCarga) {
	        super(nombre, tamaño, capacidadTripulación, capacidadCarga, velocidadMaxima, tipoPropulsión);
	        this.tipoCarga = tipoCarga;
	    }

	    // Implementación de los métodos abstractos
	    @Override
	    public void despegar() {
	        System.out.println("Despegando la nave de carga " + nombre + "...");
	    }

	    @Override
	    public void aterrizar() {
	        System.out.println("Aterrizando la nave de carga " + nombre + "...");
	    }

	    @Override
	    public void viajar() {
	        System.out.println("Viajando a una velocidad de " + velocidadMaxima + " km/s en la nave de carga " + nombre + "...");
	    }

	    public String getTipoCarga() {
	        return tipoCarga;
	    }

	    public void setTipoCarga(String tipoCarga) {
	        this.tipoCarga = tipoCarga;
	    }
	}

	public class NavePasajeros extends NaveEspacial {
	    private int cantidadPasajeros;

	    public NavePasajeros(String nombre, double tamaño, int capacidadTripulación, double capacidadCarga, double velocidadMaxima, String tipoPropulsión, int cantidadPasajeros) {
	        super(nombre, tamaño, capacidadTripulación, capacidadCarga, velocidadMaxima, tipoPropulsión);
	        this.cantidadPasajeros = cantidadPasajeros;
	    }

	    // Implementación de los métodos abstractos
	    @Override
	    public void despegar() {
	        System.out.println("Despegando la nave de pasajeros " + nombre + "...");
	    }

	    @Override
	    public void aterrizar() {
	        System.out.println("Aterrizando la nave de pasajeros " + nombre + "...");
	    }

	    @Override
	    public void viajar() {
	        System.out.println("Viajando a una velocidad de " + velocidadMaxima + " km/s en la nave de pasajeros " + nombre + "...");
	    }

	    public int getCantidadPasajeros() {
	        return cantidadPas
