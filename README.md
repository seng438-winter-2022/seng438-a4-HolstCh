# SENG 438 Assignment 4
## Group 38
Group members: Tony Vo, Chace Nielson, Chad Holst, Olisehemeka Chukwuma

## **IMPORTANT NOTES**
* The hamcrest-core-1.3.jar file that was included with the jfreechart-1.0.19.zip of JFreeChart v3.0.zip from GitHub Classroom did not work when we tried to compile our tests. We found that using hamcrest-all-1.3.jar instead of hamcrest-core-1.3.jar fixed our compilation errors. Therefore, it is **essential** to use hamcrest-all-1.3.jar instead of hamcrest-core-1.3.jar. Please use the JARs found in [Reference Library](Referenced%20Libraries/) of JAR files for the project buildpath rather than the ones provided from Assignment3-artifact.zip.
  * In order to do this, extract all the JAR files from [Reference Library](Referenced%20Libraries/) into a folder. Once the [JFreeChart Mutation and Unit Tests](src/org/jfree/data/test) files have been imported into Eclipse as a project, right click on the project (where it says "JFreeChart"), then click on Build Path → Use as Source Folder. Finally, select the folder that the JAR files were extracted into so that Hamcrest compilation error is fixed.

* Our Assignment 3 strategy was very effective for creating coverage tests. As such, we were unable to greatly increase the mutation coverage score for the DataUtilities class, although we did try to create some tests.

* `getCentralValue()` in the Range class has a defect in the source code and even with proper tests, we always get a failing test. Therefore, this this was commented out in order to run Pitclipse properly.

## Deliverables
- [JFreeChart Mutation and Unit Tests](src/org/jfree/data/test)
- [JFreeChart Range and DataUtilities Classes](src/org/jfree/data)
- [Lab Report](Assignment4-LabReport.md) 
- [Referenced Library](Referenced%20Libraries/)
- [Selenium GUI Tests](Selenium_Tests/)
