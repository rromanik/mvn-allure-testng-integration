# Attachments from ITestListener#onTestSuccess are not found in report
For recent versions of TestNG, attachments are not added to allure report
if a method annotated with @Attachment is invoked from a TestNG listener's method
`onTestSuccess()`implementing ITestListener interface.

Running the test with TestNG `v7.7.1` results into report without
any attachment for the test method, while running with TestNG `v6.11` results into 
a report containing the attachment for the test method.
To run the test with a specific TestNG version, use the following command where
substitute `<version>` with the desired version:
```
mvn clean test -Dtestng.version=<version> allure:report
```
for example
```
mvn clean test -Dtestng.version=7.7.1 allure:report
```
or
```
mvn clean test -Dtestng.version=6.11 allure:report
```


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