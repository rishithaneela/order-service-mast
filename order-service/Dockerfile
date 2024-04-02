FROM openjdk:17-alpine
EXPOSE 9091
ADD target/order-service.jar order-service.jar
ENTRYPOINT ["java","-jar","order-service.jar"]