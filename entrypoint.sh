#!/bin/sh -x
set -e

if [ -z "$SPRING_DATASOURCE_URL" ]; then
  SPRING_DATASOURCE_URL=jdbc:postgresql://postgres.backend:5432/postgres
fi

if [ -z "$SPRING_DATASOURCE_USERNAME" ]; then
  SPRING_DATASOURCE_USERNAME=postgres
fi

if [ -z "$SPRING_DATASOURCE_PASSWORD" ]; then
  SPRING_DATASOURCE_PASSWORD=postgres
fi

if [ -z "$SERVER_PORT" ]; then
  SERVER_PORT=8080
fi

exec java ${JAVA_OPTS} -Djava.security.egd=file:/dev/./urandom -jar \
 -Dserver.port=${SERVER_PORT} \
 -Dspring.datasource.url=${SPRING_DATASOURCE_URL} \
 -Dspring.datasource.username=${SPRING_DATASOURCE_USERNAME} \
 -Dspring.datasource.password=${SPRING_DATASOURCE_PASSWORD} \
 app.jar
