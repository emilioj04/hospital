import java.util.*;

public class Paciente extends Persona {

	Collection<Enfermero> enfermeroList;
	ExpedienteMedico expedienteMedico;
	Collection<CitaMedica> citaList;
	Collection<Doctor> DoctorList;
	private ExpedienteMedico expediente;

	public Paciente() {
		this.enfermeroList = new ArrayList<>();
		this.citaList = new ArrayList<>();
		this.DoctorList = new ArrayList<>();
	}

	// Getters y setters
	public Collection<Enfermero> getEnfermeroList() {
		return enfermeroList;
	}

	public void setEnfermeroList(Collection<Enfermero> enfermeroList) {
		this.enfermeroList = enfermeroList;
	}

	public ExpedienteMedico getExpedienteMedico() {
		return expedienteMedico;
	}

	public void setExpedienteMedico(ExpedienteMedico expedienteMedico) {
		this.expedienteMedico = expedienteMedico;
	}

	public Collection<CitaMedica> getCitaList() {
		return citaList;
	}

	public void setCitaList(Collection<CitaMedica> citaList) {
		this.citaList = citaList;
	}

	public Collection<Doctor> getDoctorList() {
		return DoctorList;
	}

	public void setDoctorList(Collection<Doctor> doctorList) {
		this.DoctorList = doctorList;
	}

	public ExpedienteMedico getExpediente() {
		return expediente;
	}

	public void setExpediente(ExpedienteMedico expediente) {
		this.expediente = expediente;
	}
}