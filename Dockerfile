FROM java:8-alpine
MAINTAINER Your Name <you@example.com>

ADD target/uberjar/stock-screener.jar /stock-screener/app.jar

EXPOSE 3000

CMD ["java", "-jar", "/stock-screener/app.jar"]
