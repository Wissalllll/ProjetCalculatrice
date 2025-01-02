# Étape 1
FROM maven:3.8.4-openjdk-8-slim AS builder
WORKDIR /app
COPY . .
RUN mvn clean package

# Étape 2
FROM node:16 AS node_builder

# Étape 3
WORKDIR /app

# Étape 4
COPY . .

# Étape 5
RUN npm install

# Étape 6
EXPOSE 3000

# Étape 7
FROM openjdk:8-jre-slim AS java_runtime

# Copier le fichier JAR de l'étape de construction Java
WORKDIR /app
COPY --from=builder /app/target/CalculatorProject-1.0-SNAPSHOT.jar calculator.jar
ENTRYPOINT ["java", "-jar", "calculator.jar"]

# Étape 8
FROM node:16 AS node_runtime

# Définir le répertoire de travail
WORKDIR /app

# Copier l'application Node.js depuis l'étape node_builder
COPY --from=node_builder /app /app

# Exposer le port
EXPOSE 3000

# Commande pour démarrer l'application Node.js
CMD ["npm", "start"]
