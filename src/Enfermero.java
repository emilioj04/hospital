import java.util.*;

import java.util.*;

public class Enfermero extends Persona {
	Collection<Doctor> doctorList;
	Collection<CitaMedica> citaList;
	Collection<Paciente> pacienteList;
	private int IdLicencia;

	public void asignarPaciente(Paciente paciente) {
		if (!pacienteList.contains(paciente)) {
			pacienteList.add(paciente);
		}
	}

}