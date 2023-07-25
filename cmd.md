# 메이븐 실행
```
$ mvn spring-boot:run '-Dspring-boot.run.jvmArguments=-Dserver.port=9003'
```

# 패키징 한 후 실행
```
$ mvn clean compile package
$ java -jar '-Dserver.port=9004' ./target/first-service-0.0.1-SNAPSHOT.jar
```