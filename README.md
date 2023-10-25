Version de java necesario es de 17. jdk 17 o cambiar la version de java en el archivo pom.xml
<java.version>17</java.version>
pueden usar version 11

Documentacion con swagger
http://localhost:8080/swagger-ui/index.html#/

para poder conectar a la base de datos modificar las variables ubicadas en 
ProyectoRegistro\sisteamderiego\src\main\resources\application-dev.properties
Variable a modificar son 
 spring.datasource.url=jdbc:mysql://localhost:3306/sistema_de_riego?serverTimezone=America/Guatemala
 spring.datasource.username=root
 spring.datasource.password=

el script de la base de datos esta ubicado en la carpeta sql.

**Para ejectuar de forma local**
"C:\Program Files\Google\Chrome Dev\Application\chrome.exe" --user-data-dir="C:/Chrome dev session" --disable-web-security
