package pe.edu.cibertec.patitasfrontendwcb.DTO;
import java.util.Date;

public record LogoutResponseDTO(Boolean resultado, Date fecha, String mensajeError) {
}
