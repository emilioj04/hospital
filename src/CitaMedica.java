
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

	@Override
	public void programar(Date fecha, Date hora) {
		this.fecha = fecha;
		this.hora = hora;
		this.estado = estadoCita.PROGRAMADA;
		this.contadorCitas++;
	}

	@Override
	public void cancelar() {
		this.estado = estadoCita.CANCELADA;
	}

	@Override
	public void realizar() {
		this.estado = estadoCita.REALIZADA;
	}

	public void setMotivoCita(String motivoCita) {
		this.motivoCita = motivoCita;
	}

	public String getMotivoCita() {
		return this.motivoCita;
	}

	public estadoCita getEstado() {
		return this.estado;
	}

	public int getContadorCitas() {
		return this.contadorCitas;
	}

	public void asignarDoctor(Doctor doctor) {
		this.doctor = doctor;
	}

	public void asignarPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

	public void asignarEnfermero(Enfermero enfermero) {
		this.enfermero = enfermero;
	}

	public Doctor getDoctor() {
		return this.doctor;
	}

	public Paciente getPaciente() {
		return this.paciente;
	}

	public Enfermero getEnfermero() {
		return this.enfermero;
	}

	public Date getFecha() {
		return this.fecha;
	}

	public Date getHora() {
		return this.hora;
	}

	public void setEstado(estadoCita estado) {
		this.estado = estado;
	}

	public void setContadorCitas(int contadorCitas) {
		this.contadorCitas = contadorCitas;
	}

	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

	public void setEnfermero(Enfermero enfermero) {
		this.enfermero = enfermero;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public void setHora(Date hora) {
		this.hora = hora;
	}

	public CitaMedica(Doctor doctor, Paciente paciente, Enfermero enfermero, Date fecha, Date hora, String motivoCita, estadoCita estado, int contadorCitas) {
		this.doctor = doctor;
		this.paciente = paciente;
		this.enfermero = enfermero;
		this.fecha = fecha;
		this.hora = hora;
		this.motivoCita = motivoCita;
		this.estado = estado;
		this.contadorCitas = contadorCitas;
	}
}