# teste inicial MySQL
# docker pull mysql:5.6
# docker run  -p 3303:3306 --name mysql-standalone -e MYSQL_ROOT_PASSWORD=123456 -e MYSQL_DATABASE=dbcarros -e MYSQL_PASSWORD=123456 -d mysql:5.6
# docker inspect mysql-standalone    (para ver o IP para colocar na connection)
# docker build -t api-carros:1 .
# docker run -p 8088:8088 --name api-carros-standalone -d api-carros:1
# mvn clean install -DskipTests    (antes de rodar o docker-compose)
# docker-compose rm -v
# docker-compose up -d

FROM openjdk:11
LABEL maintainer="hernandes_sp@yahoo.com.br"

ENV RELEASE 27-05-2021-2050
ENV VERSION 1.0.0

RUN mkdir /opt/api-cars-mysql

ENV DEPLOYMENT_JAR /opt/api-cars-mysql

COPY target/api-cars-mysql.jar $DEPLOYMENT_JAR

ENTRYPOINT exec java -jar $DEPLOYMENT_JAR/api-cars-mysql.jar
