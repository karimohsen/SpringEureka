# Spring cloud client

## Getting Started

This application acts as a client that uses the eureka to register it self so that it is discovered by other clients

### Prerequisites

Java 7 or 8 installed on your machine

maven installed on your machine

### Installing

You just have to build the project using maven command : mvn clean install

In case you want to skip test use : mvn clean install -DskipTests

serveral instances of client needed to be up 

To run profile1 : java -jar -Dspring.profiles.active=profile1 spring-eureka-client-0.0.1-SNAPSHOT
To run profile2 : java -jar -Dspring.profiles.active=profile2 spring-eureka-client-0.0.1-SNAPSHOT
To run profile3 : java -jar -Dspring.profiles.active=profile3 spring-eureka-client-0.0.1-SNAPSHOT

## Test

For test a rest controller was created so that from one client you get can get different values from all other registered clients

To get all values form profile1 : http://localhost:8003/getAllClientsWords
To get all values form profile2 : http://localhost:8004/getAllClientsWords
To get all values form profile3 : http://localhost:8005/getAllClientsWords


## Built With

* [Java 8](http://www.oracle.com/technetwork/java/javase/overview/java8-2100321.html) - The java version used
* [Maven](https://maven.apache.org/) - Dependency Management
* [Spring boot](https://projects.spring.io/spring-boot/) - For embedded server and auto configuration
* [Spring eureka](https://cloud.spring.io/spring-cloud-netflix/) -For service discovery

Contact me : karim.abdelmohsen.1992@gmail.com