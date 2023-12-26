#!/bin/bash

echo "Checking for running Java application..."
pid=$(pgrep -f 'java -jar /home/ubuntu/haha/junk-0.0.1-SNAPSHOT.jar')

if [ -n "${pid}" ]; then
    echo "Killing process ${pid}"
    sudo kill -9 ${pid}
    if [ $? -eq 0 ]; then
        echo "Process killed successfully."
    else
        echo "Failed to kill process."
        exit 1
    fi
    sleep 5
else
    echo "No Java application process found"
fi

echo "Deployment Start..."
JAR_PATH=$(ls -t /home/ubuntu/haha/*.jar | head -1)

echo "Starting application from ${JAR_PATH}"
sudo chmod +x ${JAR_PATH}
sudo nohup java -jar -DSpring.profiles.active=prod ${JAR_PATH} >> /home/ubuntu/haha/application.log 2>&1 &

if [ $? -eq 0 ]; then
    echo "Application started successfully."
else
    echo "Failed to start application."
    exit 1
fi

echo "Deployment script completed. Application should be starting."

