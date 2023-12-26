#!/bin/bash

# Java 애플리케이션의 고유 식별자를 사용하여 프로세스를 찾습니다.
pid=$(pgrep -f 'java -jar /home/ubuntu/haha/junk-0.0.1-SNAPSHOT.jar')

if [ -n "${pid}" ]; then
    echo "Killing process ${pid}"
    sudo kill -9 ${pid}
    sleep 5
else
    echo "No Java application process found"
fi

echo "Deployment Start..."

# 새로 배포할 JAR 파일을 찾습니다.
JAR_PATH=$(ls -t /home/ubuntu/haha/*.jar | head -1)

# JAR 파일 실행
echo "Starting application from ${JAR_PATH}"
sudo chmod +x ${JAR_PATH}
sudo nohup java -jar -DSpring.profiles.active=prod ${JAR_PATH} >> /home/ubuntu/haha/application.log 2>&1 &

echo "Deployment script completed. Application should be starting."
