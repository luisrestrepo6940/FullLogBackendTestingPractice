<h1 align="center">Full Log Backend Testing Practice</h1>

![Badge en Desarollo](https://img.shields.io/badge/STATUS-IN%20EVOLUTION-blue)
![Static Badge](https://img.shields.io/badge/Java-red?style=flat-square)
![GitHub followers](https://img.shields.io/github/followers/luisrestrepo6940?style=flat&logo=github)
![Static Badge](https://img.shields.io/badge/Serenity-8A2BE2?style=flat-square)
![Static Badge](https://img.shields.io/badge/Gradle-blue?style=flat-square)

### CONTENT

* [Introduction](#introduction).
* [Requirements](#requirements).
* [Recommended](#recommended).
* [Configuration](#configuration).
* [Troubleshooting](#troubleshooting).
* [Maintainers](#maintainers).

### INTRODUCTION

Automated API testing project, printing consumption details to the log.

We'll make a couple of basic configurations at the log printing level. The first consists of omitting the option to print the log in monochrome (a single color) from the @CucumberOptions annotation in the test runner. This is because color output isn't problematic in our environment because we're not using a CI/CD pipeline or terminals that restrict ANSI escape codes for color. The second configuration is made at the inheritance level (extends) to indicate to the request type used that we're going to print all the logs from its execution, including headers, body, request, status, response, among others. All of this is done to have much more explicit and complete logs that, as such, allow us to quickly establish the cause of failures or perhaps obtain some required data from the executed tests.

[![Go Back Badge](https://img.shields.io/badge/Back-gray?style=flat)](#content)

#### The project directory structure
The project has build scripts for Gradle, and follows the standard directory structure used in most Serenity projects:
```Gherkin
src
+ main
    + java
        + co
            + com
                + certification
                    + exceptions
                    + integrations
                    + interactions
                    + models
                    + questions
                    + tasks
                    + userinterfaces
                    + utils
    + resources                
+ test
    + java
        + co
            + com
                + certification
                        + runners
                        + stepdefinitions
    + resources
        + features                  Feature files
```
[![Go Back Badge](https://img.shields.io/badge/Back-gray?style=flat)](#content)

### REQUIREMENTS

* Serenity-core: 4.2.0.
* Serenity-junit: 4.2.0.
* Serenity-screenplay: 4.2.0.
* Serenity-cucumber: 4.2.0.
* Serenity-screenplay-rest: 4.2.0. 
* Junit: 4.13.2.
  
[![Go Back Badge](https://img.shields.io/badge/Back-gray?style=flat)](#content)

### RECOMMENDED

* SDK amazon corretto version 21.0.7.
* Gradle gradle-8.5-bin.zip

[![Go Back Badge](https://img.shields.io/badge/Back-gray?style=flat)](#content)

### CONFIGURATION

Download or clone the repository and configure the settings and project structure with SDK amazon corretto version 21.0.7 and gradle 8.5.

[![Go Back Badge](https://img.shields.io/badge/Back-gray?style=flat)](#content)

### RESPONSE LOG EXAMPLE

<img width="656" height="437" alt="image" src="https://github.com/user-attachments/assets/20f4e08c-7ed4-41b0-8100-d680e66f97fd" />
<img width="656" height="437" alt="image" src="https://github.com/user-attachments/assets/dd8e090e-da11-4480-8595-14189b5c863c" />
<img width="656" height="437" alt="image" src="https://github.com/user-attachments/assets/03e48ebe-e749-4048-aff3-211589b9c5c0" />
<img width="656" height="437" alt="image" src="https://github.com/user-attachments/assets/bc90bd49-5c09-47dd-af00-1f5a21d8cd4b" />

[![Go Back Badge](https://img.shields.io/badge/Back-gray?style=flat)](#content)

### TROUBLESHOOTING

Please write or contact the Teams user or email luis.f.restrepo@accenture.com

[![Go Back Badge](https://img.shields.io/badge/Back-gray?style=flat)](#content)

### MAINTAINERS

Luis Fernando Restrepo Agudelo - luis.f.restrepo@accenture.com

[![Go Back Badge](https://img.shields.io/badge/Back-gray?style=flat)](#content)
