# Spring eureka server

## Getting Started

This application acts as a eureka server , so clients use it in order to be discovered

### Prerequisites

Java 7 or 8 installed on your machine

maven installed on your machine

### Installing

You just have to build the project using maven command : mvn clean install

In case you want to skip test use : mvn clean install -DskipTests

Then run primary : java -jar -Dspring.profiles.active=primary spring-eureka-server-0.0.1-SNAPSHOT
Then run secondary : java -jar -Dspring.profiles.active=secondary spring-eureka-server-0.0.1-SNAPSHOT
Then run tertiary : java -jar -Dspring.profiles.active=tertiary spring-eureka-server-0.0.1-SNAPSHOT

## Built With

* [Java 8](http://www.oracle.com/technetwork/java/javase/overview/java8-2100321.html) - The java version used
* [Maven](https://maven.apache.org/) - Dependency Management
* [Spring boot](https://projects.spring.io/spring-boot/) - For embedded server and auto configuration
* [Spring eureka](https://cloud.spring.io/spring-cloud-netflix/) - For service discovery

Contact me : karim.abdelmohsen.1992@gmail.com