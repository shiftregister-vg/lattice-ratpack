FROM ubuntu:14.04
MAINTAINER Steve Good<sgood@lanctr.com>

# Prerequisites
run apt-get update
run apt-get install -y software-properties-common

# Install Java 8
run add-apt-repository -y ppa:webupd8team/java
run apt-get update
run echo oracle-java8-installer shared/accepted-oracle-license-v1-1 select true | sudo /usr/bin/debconf-set-selections
run apt-get install -y oracle-java8-installer

WORKDIR /app

USER daemon

ADD lattice-ratpack-all.jar /app/build/libs/lattice-ratpack-all.jar

CMD ["java", "-jar", "/app/build/libs/lattice-ratpack-all.jar"]

EXPOSE 5050
