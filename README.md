Java DOM & SAX Personas

Descripción

Proyecto en Java que permite crear y leer archivos XML utilizando dos métodos distintos: DOM y SAX.
Ambos sistemas están separados en paquetes diferentes para facilitar su estudio y organización.

El proyecto genera un archivo personas.xml con datos de varias personas y permite leerlo usando DOM o SAX, según el paquete elegido.

⸻

📦 Paquetes y funcionalidades

1️⃣ Paquete DOM – nf3.accesodatos.dom

(Paquete exclusivo para DOM)
Contiene el programa encargado de crear personas.xml con datos de personas (nombre, edad, nacionalidad).
	•	Uso del modelo DOM para generar un XML válido.
	•	Ejemplo práctico de creación de nodos, escritura y estructura del documento.

⸻

2️⃣ Paquete DOM Lectura – nf3.accesodatos.dom.lectura

(Segundo paquete DOM, solo para lectura con DOM)
Incluye el programa que lee el archivo personas.xml utilizando el modelo DOM.
	•	Recorrido del árbol de nodos.
	•	Lectura de elementos y extracción de información.

⸻

3️⃣ Paquete SAX – nf3.accesodatos.sax

(Paquete completamente independiente del DOM)
Introduce la lectura del archivo personas.xml usando SAX, un parser basado en eventos.
	•	Manejo de eventos startElement, characters, endElement.
	•	Lectura eficiente sin cargar todo el XML en memoria.
	•	Ejemplo claro de un DefaultHandler personalizado.

⸻

🛠 Tecnologías utilizadas
	•	Java 8 o superior
	•	Librerías estándar de Java para XML:
	•	javax.xml.parsers.*
	•	org.w3c.dom.*
	•	javax.xml.transform.*
	•	org.xml.sax.*
	•	org.xml.sax.helpers.*

⸻

▶️ Cómo utilizar

1️⃣ Crear el XML (DOM)

Ejecuta:
nf3.accesodatos.dom.NF3AccesoDatosDOM
Genera el archivo personas.xml.

⸻

2️⃣ Leer el XML con DOM

Ejecuta:
nf3.accesodatos.dom.lectura.mainLecturaDOM
Lee el XML usando el modelo DOM tradicional.

⸻

3️⃣ Leer el XML con SAX

Ejecuta:
nf3.accesodatos.sax.mainLecturaSAX
Procesa el XML mediante eventos, sin cargar el documento completo.

⸻

👤 Autor

Nombre: Sergio Gutiérrez

⸻

📝 Nota

Este proyecto está diseñado para mostrar dos formas diferentes de trabajar con XML en Java:
	•	DOM → lectura y escritura del documento completo en memoria.
	•	SAX → lectura secuencial basada en eventos.

Ambas técnicas están divididas en paquetes independientes, lo que facilita su comprensión y permite comparar ambos métodos fácilmente.
