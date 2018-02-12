Spring Boot + WebMVC + JSP + Bootstrap CSS example application
=
## Run

Linux:
```
java -jar ./target/spring-boot-web-jsp-example-0.0.1-SNAPSHOT.war
```

Windows:
```
java -jar target\spring-boot-web-jsp-example-0.0.1-SNAPSHOT.war
```

## Usage

Using address like this you'll get `Welcome, dear Anonymous User!` message.

```
localhost:8080/welcome
```

Using address with parameter `name` this you'll get `Welcome, dear Name Surname!` message.

```
localhost:8080/welcome?name=Name%20Surname
```
