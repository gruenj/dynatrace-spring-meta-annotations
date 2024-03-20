#!/usr/bin/env bash

java -jar /app/app.jar &


echo "Starting Dynatrace SpringRestController Test"

# sleep to wait until app is ready
sleep 60

# query endpoints

for i in {1..10}; do
  curl 'http://localhost:8080/detected/getMappingAnnotationRequestParam?name=test'$i
  sleep 1
  curl 'http://localhost:8080/detected/getMappingAnnotationPathVariable/'$i'/test'
done

sleep 1

for i in {1..10}; do
  curl 'http://localhost:8080/notdetected/getMappingAnnotationRequestParam?name=test'$i
  sleep 1
  curl 'http://localhost:8080/notdetected/getMappingAnnotationPathVariable/'$i'/test'
done

echo "End Dynatrace SpringRestController Test"

sleep 60

exit 0
