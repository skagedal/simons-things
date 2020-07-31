FROM openjdk:14-alpine
COPY build/libs/simonsthings-*-all.jar simonsthings.jar
EXPOSE 8080
CMD ["java", "-Dcom.sun.management.jmxremote", "-Xmx128m", "-jar", "simonsthings.jar"]