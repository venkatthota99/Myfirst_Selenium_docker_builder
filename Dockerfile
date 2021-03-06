FROM openjdk:8u191-jre-alpine3.8
RUN apk add curl jq
#Workspace
WORKDIR E:\eclipse\Workspace\org.com.newframework
#add .jar under target from host
ADD target/selenium-docker.jar  selenium-docker.jar
ADD target/selenium-docker-tests.jar   selenium-docker-tests.jar
ADD target/libs						libs

# in case of any other dependency like .csv/ .json/ .xls


#Add Suite Files
ADD  Searchpagetestng.xml      Searchpagetestng.xml
ADD  testng.xml                testng.xml

#ADD healthcheck.sh            healthcheck.sh

ENTRYPOINT java -cp selenium-docker.jar:selenium-docker-tests.jar:libs/* \
    -DHUB_HOST=$HUB_HOST \
    -DBROWSER=$BROWSER \
    org.testng.TestNG $MODULE
