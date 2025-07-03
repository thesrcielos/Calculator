# Java Calculator

This is a Java calculator application

## Getting Started

These instructions will help you get a copy of the project running on your local machine for development and testing purposes.

### Prerequisites

You will need the following installed:

- [Java 17+](https://jdk.java.net/)
- [Maven 3.8+](https://maven.apache.org/install.html)
- Git (optional, for cloning)

### Installing

Clone the repository:

``` 
git clone https://github.com/thesrcielos/Calculator.git
cd Calculator
```

Build the project using Maven:
```
mvn clean install
```

### Running the Application

You can run the program with:

```
java -cp target/Calculator-1.0-SNAPSHOT.jar 
```
Example:
```
java -cp target/Calculator-1.0-SNAPSHOT.jar 
```

## Endpoint

* /calcula

## Running the tests

Run the automated unit tests with Maven:
```
mvn test
```
Unit Tests

Unit tests are written using JUnit and ensure the logic in **Calculator** works as expected.

### Coding Style

The code follows the Google Java Style Guide and was formatted accordingly.

## Deployment

To package:
```
mvn package
```
Then run using:
```
java -cp target/Calculator-1.0-SNAPSHOT.jar
```
## Design
To see more about the class diagram go to **DESIGN.md**
# Test Report

## Files Tested

- `LineCounter.java`
- `FileUtils.java`

## Summary

| Class        | Method                   | Test Description                             | Result  |
|--------------|--------------------------|----------------------------------------------|---------|
| Calculator  | testAdd       | Counts all lines including comments/whitespace | Passed  |
| LineCounter  | testMultiplication        | Counts only real code lines                  | Passed  |

## 📚 Javadoc

Code documentation is available in `target/site/apidocs/index.html` after running the command:

```bash
mvn javadoc:javadoc
````
## Built With

* [Java 17](https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html)

* [Maven](https://maven.apache.org/) - Dependency Management

* [ JUnit 4](https://junit.org/junit4/)

## Contributing

Please read **CONTRIBUTING.md** for details on how to contribute.

## Authors

* Diego Armando Macia Diaz – Initial work

## License

* This project is licensed under the GNU License – see the LICENSE.md file.
