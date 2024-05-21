import java.util.*;

public class Doctor extends Persona implements GestionCitas {
	Collection<Paciente> pacienteList;
	Collection<CitaMedica> citaList;
	Collection<Enfermero> enfermeroList;
	private especialidadMedica especialidad;
	private int IdLicencia;

	@Override
	public void programar(Date fecha, Date hora) {
		for (CitaMedica cita : citaList) {
			cita.programar(fecha, hora);
		}
	}

	@Override
	public void cancelar() {
		for (CitaMedica cita : citaList) {
			cita.cancelar();
		}
	}

	@Override
	public void realizar() {
		for (CitaMedica cita : citaList) {
			cita.realizar();


		}
	}

	public void asignarEnfermeroAPaciente(Enfermero enfermero, Paciente paciente) {
		if (enfermeroList.contains(enfermero) && pacienteList.contains(paciente)) {
			enfermero.asignarPaciente(paciente);
		}
	}

	// Método para obtener todos los pacientes de un enfermero

	public void asignarPaciente(Paciente paciente) {
		if (!pacienteList.contains(paciente)) {
			pacienteList.add(paciente);
		}
	}

	public Collection<Paciente> getPacienteList() {
		return pacienteList;
	}

	public void asignarCita(CitaMedica cita) {
		if (!citaList.contains(cita)) {
			citaList.add(cita);
		}
	}

	public Collection<CitaMedica> getCitaList() {
		return citaList;
	}

	public void asignarEnfermero(Enfermero enfermero) {
		if (!enfermeroList.contains(enfermero)) {
			enfermeroList.add(enfermero);
		}
	}

	public Collection<Enfermero> getEnfermeroList() {
		return enfermeroList;
	}

	public void setEspecialidad(especialidadMedica especialidad) {
		this.especialidad = especialidad;
	}

	public especialidadMedica getEspecialidad() {
		return this.especialidad;
	}

	public void setIdLicencia(int IdLicencia) {
		this.IdLicencia = IdLicencia;
	}

	public int getIdLicencia() {
		return this.IdLicencia;
	}

}