import java.util.Date;

public interface GestionCitas {
		void programar(Date fecha, Date hora);
		void cancelar();
		void realizar();
}