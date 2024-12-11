# Github Test Automation Repository

## Set Up
It's fairly simple:

* Install Java 17, as this is our target version that is being used by all the recommended dependencies.

## Overview
This repository serves as the central hub for our automation work, where we store both UI and API tests written in Java. It comprises the following modules:

* shared: This contains common code elements, such as API service executors, various utilities, and other elements not exclusive to either UI or API testing.
* api-tests: This module is dedicated to API testing.
* ui-tests: This contains UI testing code.
* env-properties: This directory stores environment-specific properties, such as URLs, API keys, object IDs, etc.

## Running the project
Modules can be run by executing the following commands that uses testng.xml files:
```shell
mvn clean install -DskipTests -Dapp.env=prod
```
```shell
cd ${module}/ && mvn test -DtestFailureIgnore=true -Dsurefire.suiteXmlFiles=${testPath}
```
