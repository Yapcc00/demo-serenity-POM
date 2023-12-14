
Proyecto de Demo Serenity con Gradle y Firefox
Este proyecto de demostración utiliza Serenity con Gradle y Firefox como navegador para ejecutar pruebas automatizadas. Serenity es un marco de trabajo de automatización de pruebas que se integra con Cucumber y JUnit para proporcionar informes detallados y legibles.

Requisitos Previos
Java JDK instalado
Gradle instalado
GeckoDriver descargado y en tu PATH
Estructura del Proyecto
El proyecto sigue una estructura estándar de Gradle y está organizado de la siguiente manera:

src/test/java: Contiene las clases de prueba y los runners.
src/test/resources/features: Almacena los archivos Gherkin para Cucumber.
build.gradle: Archivo de configuración de Gradle.
serenity.conf: Archivo de configuración de Serenity.
Configuración del Proyecto
Configuración de Gradle
El archivo build.gradle incluye las dependencias necesarias y configura la ejecución de pruebas. Asegúrate de que las versiones de las dependencias sean las adecuadas.

Configuración de Serenity
El archivo serenity.conf contiene la configuración específica de Serenity, como la ubicación de las pruebas y los informes.

Configuración de WebDriver
La configuración de WebDriver se realiza en el bloque webdriver del archivo build.gradle. En este caso, se utiliza Firefox como el controlador de WebDriver. Se establecen diversas opciones para la ejecución, como el idioma, la maximización de la ventana, y la configuración de FirefoxOptions.

Ejecución de las Pruebas
Para ejecutar las pruebas, puedes utilizar el siguiente comando en la terminal:

bash
Copy code
gradle test aggregate
Esto ejecutará las pruebas y generará informes detallados en el directorio target/site/serenity.

Configuración Adicional
Si encuentras problemas al ejecutar las pruebas, asegúrate de tener las versiones correctas de Java, Gradle y GeckoDriver. Además, verifica la configuración de Serenity y WebDriver en los archivos mencionados anteriormente.

> .[!NOTE].
Notas Finales
Este proyecto de demostración proporciona una base para construir y ejecutar pruebas automatizadas con Serenity, Gradle y Firefox. Puedes personalizar la configuración según tus necesidades y agregar más características según sea necesario. ¡Diviértete probando!
