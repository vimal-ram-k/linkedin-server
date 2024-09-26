FROM eclipse-temurin:22-jdk as build

WORKDIR /app

COPY . .

RUN --mount=type=cache,id=gradle_cache,target=/root/.gradle ./gradlew clean build -x check -x test

