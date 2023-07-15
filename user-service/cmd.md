# maven 실행 명령어

### 빌드 정보 삭제
```
mvn clean
```

### 빌드

```
mvn compile package

...
[INFO]
[INFO] --- jar:3.3.0:jar (default-jar) @ user-service ---
[INFO] Building jar: C:\workspace\spring-boot\spring-cloud-msa\user-service\target\user-service-0.0.1-SNAPSHOT.jar
[INFO]
[INFO] --- spring-boot:3.1.1:repackage (repackage) @ user-service ---
[INFO] Replacing main artifact C:\workspace\spring-boot\spring-cloud-msa\user-service\target\user-service-0.0.1-SNAPSHOT.jar with repackaged archive, adding nested dependencies in BOOT-INF/.
...
```

jar 패키지 파일 `C:\workspace\spring-boot\spring-cloud-msa\user-service\target\user-service-0.0.1-SNAPSHOT.jar` 생성

### 현재 디렉터리의 spring boot 프로젝트 실행

```
mvn spring-boot:run
```
```
mvn spring-boot:run '-Dspring-boot.run.jvmArguments=-Dserver.port=9003'
```

# java 실행

```
java -jar '-Dserver.port=9005' .\target\user-service-0.0.1-SNAPSHOT.jar
```