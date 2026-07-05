### Sistema Biométrico de Control de Acceso

## 📋 Descripción del Proyecto
Proyecto de práctica enfocado en el desarrollo de un Sistema de Control de Acceso Biométrico. Esta aplicación está siendo diseñada para gestionar el registro y la asistencia de usuarios mediante Java y una arquitectura de base de datos relacional (MySQL).

* **Características principales:**

* **Conectividad:** Implementación de conexión segura a base de datos mediante JDBC.

* **Gestión de Datos:** Estructura de tablas para usuarios con roles definidos (Estudiante, Docente, Administrativo, etc.).

* **Arquitectura:** Enfoque en buenas prácticas de arquitectura de datos y programación orientada a objetos.

* **Propósito:** Entorno de pruebas para fortalecer habilidades en backend y SQL antes de la implementación del proyecto universitario final.
----
Este sistema es una solución integral diseñada para el control de acceso en entornos universitarios. El proyecto se estructura bajo una arquitectura de tres capas, garantizando seguridad, escalabilidad y una separación clara de responsabilidades en el código.

### 🛠️ Stack Tecnológico

* **Lenguaje:** Java (Swing para interfaz gráfica).

* **Base de Datos:** MySQL.

* **Entorno de Desarrollo:** NetBeans IDE.

* **Gestión de Datos:** Patrón DAO (Data Access Object).

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

----
### 🏗️ Estructura del Código (Lógica)

El proyecto se organiza en clases especializadas para mantener un código limpio y profesional:

* **1. Capa de Conexión** (Conexion.java)
Gestiona el enlace directo con MySQL utilizando el driver JDBC.

**Rol:** Abrir y cerrar la comunicación con el servidor.

* **2. Capa de Acceso a Datos** (UsuarioDAO.java)
Implementa la lógica de negocio para la autenticación.

**Seguridad:** Utiliza PreparedStatement para ejecutar consultas parametrizadas, protegiendo el sistema contra ataques de SQL Injection.

**Método principal:** validarUsuario(String usuario, String pass).

* **3. Capa de Interfaz** (Login.java)
Controla la experiencia de usuario (UX).

**Función:** Captura las entradas, invoca la lógica de autenticación y gestiona el flujo de navegación según el rol (Administrativo o Portero).

### 🔐 Seguridad
La autenticación se basa en la validación directa contra el servidor, asegurando que solo usuarios registrados con roles específicos tengan acceso a las áreas restringidas del sistema.
