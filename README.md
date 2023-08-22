This repo is meant to reproduce https://github.com/SDA-SE/sda-spring-boot-commons/issues/178 with
a minimal example from the [Spring Initializer](https://start.spring.io).

In a single module and not related to security config the issue is not reproducible.

Testing:

- set `management.server.port` in
  [`defaults.properties`](src/main/resources/com/example/config/management/defaults.properties)
  as desired
- Start the [`DemoApplication`](src/main/java/com/example/demo/DemoApplication.java)
- Fetch the result in a terminal:
  ```console
  $ curl http://localhost:8080/info
  Running on different port.
  ```