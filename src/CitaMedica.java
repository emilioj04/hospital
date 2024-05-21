<<<<<<< Updated upstream:hospital/CitaMedica.java
public class CitaMedica implements GestionCItas {

	Doctor doctor;
	Paciente paciente;
	Enfermero enfermero;
	private Date fecha;
	private Time hora;
	private String motivoCita;
	private estadoCita estado;
	private Int contadorCitas;

=======
import java.util.Date;

public class CitaMedica implements GestionCitas {
	Doctor doctor;
	Paciente paciente;
	Enfermero enfermero;
	private Date fecha;
	private Date hora;
	private String motivoCita;
	private estadoCita estado;
	private int contadorCitas;

	// Implementación del método programar() de la interfaz GestionCitas
	@Override
	public void programar(Date fecha, Date hora) {
		this.fecha = fecha;
		this.hora = hora;
		this.estado = estadoCita.PROGRAMADA;
	}

	// Implementación del método cancelar() de la interfaz GestionCitas
	@Override
	public void cancelar() {
		this.estado = estadoCita.CANCELADA;
	}

	// Implementación del método realizar() de la interfaz GestionCitas
	@Override
	public void realizar() {
		this.estado = estadoCita.REALIZADA;
	}

	// Getters y setters
	// ... (similar a los de las otras clases)
>>>>>>> Stashed changes:CitaMedica.java
}