package med.voll.api.paciente;

import jakarta.persistence.*;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import med.voll.api.direccion.Direccion;

@Getter
@EqualsAndHashCode(of = "id")
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "Paciente")
@Table(name = "pacientes")
public class Paciente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private String email;
    private String documentoIdentidad;
    private String telefono;
    private Boolean activo;

    @Embedded
    private Direccion direccion;

    public Paciente(DatosRegistroPaciente datos){
        this.activo = true;
        this.nombre = datos.nombre();
        this.email = datos.email();
        this.documentoIdentidad = datos.documentoIdentidad();
        this.telefono = datos.telefono();
        this.direccion = new Direccion(datos.direccion());
    }

    public void actualizarInformacion(DatosActualizarPaciente datos) {
        if(datos.nombre() != null)
            this.nombre = datos.nombre();

        if(datos.telefono() != null)
            this.telefono = datos.telefono();

        if(datos.direccion() != null)
            this.direccion.actualizarDatos(datos.direccion());

    }

    public void desactivar() {
        this.activo = false;
    }
}
