
# JAX-RS - Returning XML Response

 XML is a common media format that RESTful services consume and produce. To deserialize and serialize XML, you can represent requests and responses by JAXB annotated objects. Your JAX-RS application can use the JAXB objects to manipulate XML data. JAXB objects can be used as request entity parameters and response entities. The JAX-RS runtime environment includes standard MessageBodyReader and MessageBodyWriter provider interfaces for reading and writing JAXB objects as entities.

## Example Project
### Dependencies and Technologies Used:

* jersey-core-server 2.22.1: Jersey core server implementation.
* jersey-container-servlet 2.22.1: Jersey core Servlet 3.x implementation.
* jersey-test-framework-provider-jdk-http 2.22.1: Jersey Test Framework - JDK HTTP container.
* DataFactory 0.8: Library to generate data for testing.
* JDK 1.8
* Maven 3.0.4

To test the application either run the JUnit test CustomerRestServiceTest or run the embedded tomcat server:
```jaxrs-returning-xml>mvn clean install tomcat7:run-war```

and then use the following resource link in your browser.
```http://localhost:8080/jaxrs-returning-xml/api/customers```

Output:

![output](https://github.com/vadlimolebila/jax-rs/blob/master/image/output2.png?raw=true)