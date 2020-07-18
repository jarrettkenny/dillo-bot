#!/bin/sh

pwd
ls -al
echo ""

cp dillo-bot-bucket/dillo-bot*.jar docker/dillo-bot.jar

echo "creating Dockerfile..."
cat << EOF > docker/Dockerfile
FROM openjdk:11.0.7-jdk-slim

COPY dillo-bot.jar .
ENTRYPOINT ["java", "-jar", "/dillo-bot.jar"]
EOF
echo "created:"
cat docker/Dockerfile

echo ""

echo "docker/"
ls docker/
