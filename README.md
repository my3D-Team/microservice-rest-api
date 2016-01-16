=== Purpose

This example shows how a micro service exposing a REST API.
The application is designed to be simple as possible while being cloud ready and meet all the requirements that a
reliable component should cover.

==== Goals of the stack

The micro services acts as a black box that leverage a technology stack to be ready to:

* exposes REST endpoints over HTTP
* embeds a detailed documentation of its REST endpoints
* tests in a mocked integration environment its REST endpoints
* manage its data in a dedicated database
* be scalable by registering to a service discovery registry
* be configured by a remote configuration server
* be managed easily by ops
* stay highly available thanks to a distributed database
* logging

==== Out of scope

The micro service is supposed to be accessed through an API gate away that will take care of:

* Authentication
* Authorization
* Caching
* Rate-limiting
* Encryption

All those aspects are not covered by the micro service application.
Moreover, it also has no dependencies to any other micro service and does not leverage circuit-breaker solution.

=== Solution

==== Build

The code is compiled with JDK 8 and package the application as JAR file thanks to maven and spring boot.

==== REST API

Spring boot is used to setup Jersey and create easily REST endpoints.
Example: https://github.com/spring-projects/spring-boot/tree/master/spring-boot-samples/spring-boot-sample-jersey

==== Documentation & test

Spring restdocs gives the advantage to write integration tests and generates documentation of tested endpoints
automatically. The framework covers documentation and test aspects.
Reference: http://docs.spring.io/spring-restdocs/docs/1.0.1.RELEASE/reference/html5/

==== Distributed database

Spring boot is used to setup Spring Data over MongoDB client to leverage a distributed and dedicated database.
Example: https://github.com/spring-projects/spring-boot/tree/master/spring-boot-samples/spring-boot-sample-data-mongodb

==== Configuration & service discovery

Spring boot is used to setup Spring Cloud over Consul services that provide service discovery registry and centralized
configuration server.
This extension comes with the advantage to cover both configuration and service discovery aspects to make the application
easy to scale.
Example: https://github.com/spring-cloud/spring-cloud-consul

==== Ops services

To be easily managed in production, spring boot is used with actuator to leverage ops services.
Example: https://github.com/spring-projects/spring-boot/tree/master/spring-boot-samples/spring-boot-sample-actuator

==== Logging

Log4J2 is used thanks to spring boot as logging framework.
Reference: https://docs.spring.io/spring-boot/docs/current/reference/html/howto-logging.html#howto-configure-log4j-for-logging