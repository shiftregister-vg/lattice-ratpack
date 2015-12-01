FROM java:8
MAINTAINER Steve Good<sgood@lanctr.com>

WORKDIR /app
ADD lattice-ratpack-all.jar /app/build/libs/lattice-ratpack-all.jar
CMD ["java", "-jar", "/app/build/libs/lattice-ratpack-all.jar"]
EXPOSE 5050
