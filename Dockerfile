# =========================
# Build stage
# =========================
FROM eclipse-temurin:21-jdk AS builder

WORKDIR /app

# Copy Maven wrapper & pom first (better caching)
COPY mvnw pom.xml ./
COPY .mvn .mvn

# Download dependencies
RUN ./mvnw -B -ntp dependency:go-offline

# Copy source
COPY src src

# Build application
RUN ./mvnw -B -ntp clean package -DskipTests

# =========================
# Runtime stage
# =========================
FROM eclipse-temurin:21-jre

WORKDIR /app

# Security: run as non-root user
RUN useradd -m springuser
USER springuser

# Copy only the built jar
COPY --from=builder /app/target/weather-*.jar app.jar

# Expose Spring Boot port
EXPOSE 8080

# JVM optimizations for containers
ENTRYPOINT ["java", "-XX:+UseContainerSupport", "-jar", "app.jar"]
