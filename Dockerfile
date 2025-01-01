# Étape de construction
FROM maven:3.8.4-openjdk-8-slim AS builder
WORKDIR /app
COPY . .
RUN mvn clean package

# Étape d'exécution
FROM openjdk:8-jre-slim
WORKDIR /app
COPY --from=builder /app/target/CalculatorProject-1.0-SNAPSHOT.jar calculator.jar
ENTRYPOINT ["java", "-jar", "calculator.jar"]
