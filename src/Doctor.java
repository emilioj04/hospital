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
	public Collection<Paciente> obtenerPacientesDeEnfermero(Enfermero enfermero) {
		if (enfermeroList.contains(enfermero)) {
			return enfermero.getPacienteList();
		}
		return null;
	}
}