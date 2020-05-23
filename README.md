<h1 align="center"><img src="https://user-images.githubusercontent.com/26521948/72658109-63a1d400-39e7-11ea-9667-c652586b4508.png" alt="Apache JMeter logo" /></h1>
<h4 align="center">SOFTWARE TESTING ENTHUSIAST</h4>
<br>

# DEMO REST API TESTING
REST API Testing with SerenityBDD + REST Assured example

## Preparation
To be able to run this REST API Automated Test, you should have these in your machine:
- Maven (mandatory)
- Java 11 recommended (mandatory)
- Any Java IDE,  i.e. IntelliJ/Eclipse (Optional)

### Java Installation
Please browsing how to install JAVA in your PC or you can use this references:

For Mac OS X
```
https://java.com/en/download/help/mac_install.xml
```

For Linux i.e. debian-based
```
https://mkyong.com/java/how-to-install-java-jdk-on-ubuntu-linux/
```
For Windows
```
https://www.edureka.co/blog/install-java-on-windows/
```

If your Java is installed successfully then you will see this such information:

$ java -version
```
okta@okta:~/Desktop/hkopendaata$ java -version
openjdk version "11.0.7" 2020-04-14
OpenJDK Runtime Environment (build 11.0.7+10-post-Ubuntu-3ubuntu1)
OpenJDK 64-Bit Server VM (build 11.0.7+10-post-Ubuntu-3ubuntu1, mixed mode, sharing)
```


## Maven Installation
Please browsing how to install MAVEN in your PC or you can use this references:

Mac OS X
```
https://mkyong.com/maven/install-maven-on-mac-osx/
```
Ubuntu
```
https://mkyong.com/maven/how-to-install-maven-in-ubuntu/?utm_source=mkyong.com&utm_medium=Referral&utm_campaign=afterpost-related&utm_content=link0
```
Windows
```
https://mkyong.com/maven/how-to-install-maven-in-windows/
```

$ mvn -v
```
okta@okta:~/Desktop/hkopendaata$ mvn -version
Apache Maven 3.6.3
Maven home: /usr/share/maven
Java version: 11.0.7, vendor: Ubuntu, runtime: /usr/lib/jvm/java-11-openjdk-amd64
Default locale: en_SG, platform encoding: UTF-8
OS name: "linux", version: "5.4.0-29-generic", arch: "amd64", family: "unix"
```


### Folder Structure
```
1. Testsuits :Test suits & test cases.
2. Steps : API test steps and assertion.
3. Model : Set up test data model (very useful if you have many parameters).
4. Constants : Any constants that will be used in this repository.
5. Utilities : Any methods to support for main methods.
6. Resources  : Files that will be used to support this test, i.e for file compare and json scheme.
```

## Run the Test Via Command Line
```
1. Go to path ~/hkopendata/
2. Run this below command:
$ mvn clean verify -Dit.test=com.oktaliem.hkopendata.testsuits.Exercise -Dskip-test=true

i.e
okta@okta:~/Desktop/hkopendata$ mvn clean verify -Dit.test=com.oktaliem.hkopendata.testsuits.Exercise -Dskip-test=true
```

## Test Report Sample
```
Download this repository, go to this path below and click on index.html
{path}/hkopendata/target/site/serenity/index.html
```


