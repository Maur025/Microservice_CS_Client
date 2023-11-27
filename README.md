# Microservicio 3 - Client

## Tecnologías Utilizadas:

SpringBoot (Versión 3.2.0)<br>
Java (Versión 17.+.+) Compatible con la version de SpringBoot<br>
postgresSql (Version 16.+)<br>

## Instrucciones de Ejecución:

Ejecuta el proyecto en el IDE de java (de tu preferencia), eso hara que se reconozca el proyecto y maven instale las dependencias. <br>

### Realiza la ejecucion de los Microservicios en el siguiente orden:

- Config
- Eureka
- Client (actual)
- Vehicle
- Gateway

## API Endpoint:

Endpoint de Cliente: http://localhost:8090/api/client/<br>
<br>

### Este Endpoint contiene las rutas de consulta de:

Nuevo cliente:<br>
http://localhost:8080/api/client/create<br>
<br>
Listar Todos los Clientes:<br>
http://localhost:8080/api/client/all<br>
<br>
Buscar cliente por id:<br>
http://localhost:8080/api/client/search/id<br>
<br>
Buscar los Vehiculos pertenecientes a un cliente:<br>
http://localhost:8080/api/client/search_vehicles/iddeCliente<br>
<br>
proximamente se agregaran la de editar y eliminar<br>
<br>
Endpoint de Vehicle: http://localhost:9090/api/vehicle/<br>
<br>
Endpoint de Eureka: http://localhost:8761/eureka<br>
<br>
Endpoint del gateway: http://localhost:8080/<br>
<br>

## Enlaces de los otros microservicios:

config-url: https://github.com/Maur025/Microservice_CS_Config.git<br>
eureka-url: https://github.com/Maur025/Microservice_CS_eureka.git<br>
vehicle-url: https://github.com/Maur025/Miroservice_CS_vehicle.git<br>
gateway-url: https://github.com/Maur025/Microservice_CS_gateway.git<br>
