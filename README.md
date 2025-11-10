# Java DOM Personas

## Descripción
Proyecto en Java que permite **crear y leer archivos XML** utilizando el modelo **DOM (Document Object Model)**.  
Genera un fichero `personas.xml` con datos de varias personas y permite leerlo mostrando la información por pantalla.  
El proyecto está organizado en **dos paquetes**: uno para **crear archivos XML** y otro para **leer archivos XML**.

---

## Paquetes y funcionalidades

### 1️⃣ `nf3.accesodatos.dom`
- Contiene el programa para **crear `personas.xml`** con datos de personas (nombre, edad, nacionalidad).  
- Permite generar un XML válido usando DOM.

### 2️⃣ `nf3.accesodatos.dom.lectura`
- Contiene el programa para **leer `personas.xml`** y mostrar los datos de cada persona en la consola.  
- Ejemplo de recorrido de nodos, lectura de elementos y extracción de datos.

---

## Tecnologías utilizadas
- **Java 8 o superior**  
- Librerías estándar de Java para XML:  
  - `javax.xml.parsers.*`  
  - `org.w3c.dom.*`  
  - `javax.xml.transform.*`  

---

## Cómo utilizar
Solo necesitas **un IDE compatible con Java** (Eclipse, IntelliJ, NetBeans, etc.):  
1. Abre el proyecto en tu IDE.  
2. Ejecuta los programas:
   - **Paquete de creación:** `nf3.accesodatos.dom.NF3AccesoDatosDOM`  
     - Crea `personas.xml` con los datos de las personas.  
   - **Paquete de lectura:** `nf3.accesodatos.dom.lectura.mainLecturaDOM`  
     - Lee `personas.xml` y muestra los datos en la consola.

> Al ejecutarlos, se generará el archivo XML y se podrán leer los datos directamente desde la consola.

---

## Autor
- **Nombre:** Sergio Gutiérrez  

---

## Nota
Este proyecto es un **ejemplo práctico de manejo de XML en Java** usando DOM, ideal para aprender sobre estructuras de nodos, lectura y escritura de archivos, y manipulación de datos en memoria.
