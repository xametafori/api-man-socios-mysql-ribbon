FROM openjdk:11
VOLUME /tmp
EXPOSE 8003
ADD ./target/api-man-socios-mysql-ribbon-0.0.1-SNAPSHOT.jar api-man-socios-mysql-ribbon.jar
ENTRYPOINT ["java","-jar","/api-man-socios-mysql-ribbon.jar"]