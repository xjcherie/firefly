FROM maven:3.6.1-jdk-8-alpine

WORKDIR /eureka

COPY pom.xml /eureka/pom.xml

RUN mvn dependency:go-offline

COPY src /eureka/src

RUN mvn -e -B package

CMD ["java", "-jar", "/eureka/target/eureka-server-0.0.1-SNAPSHOT.jar"]