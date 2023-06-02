![Github Actions Badge](https://github.com/NikosNikolaidis02/seip_lab_2/actions/workflows/actions.yml/badge.svg)

# Histogram of Grades
    
## Table of Contents

-[Table of Contents](#table-of-contents)
    -[Purpose of Repository](#purpose-of-repository)
    -[Description](#description)
    -[Tools used to build the project](#tools-used-to-build-the-project)
    -[Instructions for Users](#instructions-for-users)



# Purpose of Repository 

This is a private repository created for the second lab assignment of the corse "Software Engineering in Practice" in the Department of Management and Science of the Athens University of Economics & Business

# Description

This repository recieves as input a txt file which contains grades and creates a histogram for these grades.

# Tools used to build the project
This program is being built with:
<ul>
<li>Java</li>
<img src="photos/java_icon.jpg">
<li>Maven</li>
<img src="photos/maven_icon.jpg">
</ul>

# Instructions for Users
Firstly:
```
cd gradeshistogram
```
and then:
```
mvn package
java -jar target/gradeshistogram-1.0-SNAPSHOT-jar-with-dependencies.jar gr.aueb.dmst.NikosNikolaidis02 <add-your-input-file-path>
```
In order to test the code:
```
mvn test
```

# Testing README File
[Link to Individual README](./unittesting/TestingREADME.md)
