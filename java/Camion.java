
import java.util.*;
public class Camion {
	private String codigoCamion;
	private String patente;
	private String descripcion;
	private String estado;
	private List<Flete> fletes;

	public Camion(String codigoCamion, String patente, String descripcion, String estado) {
		this.codigoCamion = codigoCamion;
		this.patente = patente;
		this.descripcion = descripcion;
		this.estado = estado;
	}
	public String getCodigoCamion() {
		return this.codigoCamion;
	}
	public String getPatente() {
		return this.patente;
	}
	public String getDescripcion() {
		return this.descripcion;
	}
	public String getEstado() {
		return this.estado;
	}
	public void cambiarEstado() {
		// TODO - implement Camion.cambiarEstado
		throw new UnsupportedOperationException();
	}

	public void agregarFlete(Flete flete, Pack packs) {
		flete.agregarPack(packs);
		fletes.add(flete);
	}
}