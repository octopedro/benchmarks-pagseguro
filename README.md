# test Reading Time
Reading Time is a web application that lists staff recommended books.

# test# test Installing

# test# test# test Prerequisites
Reading Time requires Java and [Maven](https://maven.apache.org/). It uses an embedded Tomcat servlet container. To test if you have Java and Maven installed open a terminal and type:
```
mvn --version
```

# test# test# test Running

To run the application:
```
mvn clean install
sh target/bin/webapp
open http://localhost:8080
```

To install without running the tests:
```
mvn -B -DskipTests=true clean install
```
To run the unit tests:
```
mvn clean test
```
To run code coverage checks:
```
mvn cobertura:check
```
To create the code coverage report:
```
mvn cobertura:cobertura
open target/site/cobertura/index.html
```
To create and view the Maven reports:
```
mvn site
open target/site/index.html
```

# test# test Contributing
Read the [CONTRIBUTING](.github/CONTRIBUTING.md) file before contributing to this project.

# test# test License
See the [LICENSE](LICENSE.md) file for license rights and limitations (MIT).
