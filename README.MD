# Overview
This is an example project that demonstrates how TestNG and Allure report can be integrated 
in a Maven project.

The important elements of configuration:
- `pom.xml` file that includes:
  - allure plugin and its configuration;
  - surefire plugin and its configuration related to allure;
  - properties section where allure version, allure download URL, and aspectJ version are defined;
  - dependencies for TestNG, allure, and AspectJ.
- `allure.properties` file located in `./src/test/resources`

## Run tests and generate report
To run tests and generate report, use command
```
    mvn clean test allure:report
```

Report should be generated to `./allure-report` folder.
To view report, open the `./allure-report/index.html` file in your browser.

## Used tools
- [TestNG](https://testng.org/doc/) as the test runner;
- [Allure](https://docs.qameta.io/allure/) as test report.