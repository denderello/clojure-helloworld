FROM java:openjdk-8-jre

COPY target/uberjar/clojure-helloworld-test-standalone.jar /opt/jar/clojure-helloworld-test-standalone.jar

EXPOSE 8080

ENTRYPOINT [ "java", "-jar", "/opt/jar/clojure-helloworld-test-standalone.jar"]
