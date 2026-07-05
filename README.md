### Sistema Biométrico en Practica

Proyecto de práctica enfocado en el desarrollo de un Sistema de Control de Acceso Biométrico. Esta aplicación está siendo diseñada para gestionar el registro y la asistencia de usuarios mediante Java y una arquitectura de base de datos relacional (MySQL).

* **Características principales:**

* **Conectividad:** Implementación de conexión segura a base de datos mediante JDBC.

* **Gestión de Datos:** Estructura de tablas para usuarios con roles definidos (Estudiante, Docente, Administrativo, etc.).

* **Arquitectura:** Enfoque en buenas prácticas de arquitectura de datos y programación orientada a objetos.

* **Propósito:** Entorno de pruebas para fortalecer habilidades en backend y SQL antes de la implementación del proyecto universitario final.

----
### Estructura de la Base de Datos
El sistema utiliza MySQL para la gestión de datos. A continuación, se detalla la estructura de la tabla de autenticación:

* **Tabla:** usuarios
Esta tabla gestiona el control de acceso y los roles del personal administrativo y operativo.

## SQL
```sql
CREATE TABLE usuarios (
    id_usuario INT AUTO_INCREMENT PRIMARY KEY,
    nombre_usuario VARCHAR(50) NOT NULL,
    password VARCHAR(255) NOT NULL,
    rol ENUM('Administrativo', 'Portero') NOT NULL
);
```
### Descripción de campos:

* **id_usuario:** Identificador único autoincremental.

* **nombre_usuario:** Nombre utilizado para el acceso al sistema.

* **password:** Contraseña de acceso (almacenada para validación).

* **rol:** Define los privilegios del usuario (Administrativo o Portero).

