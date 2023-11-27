Microservicio 3: Client
Tecnologías Utilizadas:
SpringBoot (Versión 3.2.0)
Java (Versión 17.+.+) Compatible con la version de SpringBoot
postgresSql (Version 16.+)

Instrucciones de Ejecución:
primero abre el proyecto en el ide de java, eso hara que se reconozca el proyecto y maven instale las dependencias.
La ejecucion de los Microservicios en el siguiente orden:

Config
Eureka
Client (actual)
Vehicle
Gateway

API Endpoint:
Endpoint de Cliente: http://localhost:8090/api/client/

Este Endpoint contiene las rutas de consulta de:

http://localhost:8090/api/client/create
http://localhost:8090/api/client/all
http://localhost:8090/api/client/search/id
http://localhost:8090/api/client/search_vehicles/iddeCliente

proximamente se agregaran la de editar y eliminar

Endpoint de Vehicle: http://localhost:9090/api/vehicle/

Endpoint de Eureka: http://localhost:8761/eureka

Endpoint del gateway: http://localhost:8080/

Los links a los otros microservicios seran agregados proximamente en esta seccion:
