## Descripción del proyecto
API para la administración de médicos y pacientes

## Funcionalidades
- [x] Crear médicos
- [x] Crear pacientes
- [x] Actualización de médicos
* Información permitida para actualización: Nombre, Documento, Dirección
* Reglas de negocio:
  * No permitir actualizar: Especialidad, Correo y teléfono

- [x] Actualización de pacientes
* Información permitida para actualización: Nombre, Teléfono, Dirección
* Reglas de negocio:
  * No permitir actualizar: Correo y Documento de identidad

- [x] Exclusión de médicos/pacientes
* El registro no debe ser borrado de la base de datos
* El listado solo debe retornar Médicos activos


</br>

>[!IMPORTANT]
>* Crea la base de datos con el nombre 'vollmedapi'
>* Reemplaza las credenciales de acceso a la bd en el archivo application.properties
>* Ejecuta el proyecto


