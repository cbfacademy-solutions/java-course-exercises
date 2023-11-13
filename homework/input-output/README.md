# Properties Files in Java

[![Java Language](https://img.shields.io/badge/PLATFORM-OpenJDK-3A75B0.svg?style=for-the-badge)][1]
[![JUnit5 Testing Framework](https://img.shields.io/badge/testing%20framework-JUnit5-26A162.svg?style=for-the-badge)][2]
[![Maven Dependency Manager](https://img.shields.io/badge/dependency%20manager-Maven-AA215A.svg?style=for-the-badge)][3]

The goal of these programming exercises is to practise I/O concepts:
- Working with Properties files

For this assignment, we've provided the starter project above.

## :memo: Properties Files

Create a new class called `PropertiesFileHandler` with the following methods:
- a `loadProperties` method that expects a `String filePath` as an argument.
- a `createFile` method that expects `Map<String, String> propertiesToSet` and `String outputFilePath` as arguments. 

### Implementation

- The `loadProperties` method should load the provided `example.properties` file, and print each property and value to the screen. 

Output should look like:
```
datasource.url=jdbc:postgresql://localhost:port_no/db_name
datasource.username=postgres
datasource.password=password
```

- The `createFile` method should create a `configuration.properties` file, with the following properties:

```
datasource.url=localhost
datasource.port=5353
datasource.user=cbfacademy
datasource.password=password
```

- Both methods should make use of the Java [Properties](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/Properties.html) class and relevant methods. 

Notes: 
- You should deal with any missing input such as an empty string for the filename, or an empty properties map. In these cases, you should return an empty properties object.
-  If the createFile method is given an existing filePath, it should **not** overwrite the contents of that file. 

[1]: https://docs.oracle.com/javase/17/docs/api/index.html
[2]: https://junit.org/junit5/
[3]: https://maven.apache.org/