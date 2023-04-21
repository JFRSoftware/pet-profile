FROM openjdk:17-oracle

WORKDIR /application

COPY target/pet-profile-0.0.1-SNAPSHOT.jar ./

CMD ["java", "-jar", "pet-profile-0.0.1-SNAPSHOT.jar"]