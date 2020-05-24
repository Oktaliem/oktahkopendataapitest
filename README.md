<h1 align="center"><img src="https://user-images.githubusercontent.com/26521948/72658109-63a1d400-39e7-11ea-9667-c652586b4508.png" alt="Apache JMeter logo" /></h1>
<h4 align="center">SOFTWARE TESTING ENTHUSIAST</h4>
<br>

# DEMO REST API TESTING
REST API Testing with SerenityBDD + REST Assured Framework

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
1. Testsuites :Test suites & test cases.
2. Steps : API test steps and assertion.
3. Model : Set up test data model (very useful if you have many parameters).
4. Constants : Any constants that will be used in this repository.
5. Utilities : Any methods to support for main methods.
6. Resources  : Files that will be used to support this test, i.e for file compare and json scheme.
```

## Run the Test Via Command Line
```
This repository has been tested using Linux Environment.

1. Go to path ~/hkopendata/
2. Run this below command:
$ mvn clean verify -Dit.test=com.oktaliem.hkopendata.testsuites.Exercise -Dskip-test=true

i.e
okta@okta:~/Desktop/hkopendata$ mvn clean verify -Dit.test=com.oktaliem.hkopendata.testsuites.Exercise -Dskip-test=true
```

## Test Report Sample
```
Download this repository, go to this path below and click on index.html
{path}/hkopendata/target/site/serenity/index.html
```

## References
- https://github.com/serenity-bdd/
- https://github.com/rest-assured

## Testing Log Sample
<details>
<summary>
Log
</summary>
<p>

```maven
okta@okta:~/Documents/GitHub/oktahkopendataapitest$ mvn clean verify -Dit.test=com.oktaliem.hkopendata.testsuites.Exercise -Dskip-test=true
WARNING: An illegal reflective access operation has occurred
WARNING: Illegal reflective access by com.google.inject.internal.cglib.core.$ReflectUtils$1 (file:/usr/share/maven/lib/guice.jar) to method java.lang.ClassLoader.defineClass(java.lang.String,byte[],int,int,java.security.ProtectionDomain)
WARNING: Please consider reporting this to the maintainers of com.google.inject.internal.cglib.core.$ReflectUtils$1
WARNING: Use --illegal-access=warn to enable warnings of further illegal reflective access operations
WARNING: All illegal access operations will be denied in a future release
[INFO] Scanning for projects...
[WARNING] 
[WARNING] Some problems were encountered while building the effective model for hkopendata:hkopendata:jar:1.0-SNAPSHOT
[WARNING] 'dependencies.dependency.(groupId:artifactId:type:classifier)' must be unique: junit:junit:jar -> duplicate declaration of version 4.12 @ line 69, column 21
[WARNING] 
[WARNING] It is highly recommended to fix these problems because they threaten the stability of your build.
[WARNING] 
[WARNING] For this reason, future Maven versions might no longer support building such malformed projects.
[WARNING] 
[INFO] 
[INFO] -----------------------< hkopendata:hkopendata >------------------------
[INFO] Building HKO Open Data API Testing 1.0-SNAPSHOT
[INFO] --------------------------------[ jar ]---------------------------------
[WARNING] The POM for com.sun.xml.bind:jaxb-osgi:jar:2.2.10 is invalid, transitive dependencies (if any) will not be available, enable debug logging for more details
[INFO] 
[INFO] --- maven-clean-plugin:2.5:clean (default-clean) @ hkopendata ---
[INFO] Deleting /home/okta/Documents/GitHub/oktahkopendataapitest/target
[INFO] 
[INFO] --- maven-resources-plugin:2.6:resources (default-resources) @ hkopendata ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] skip non existing resourceDirectory /home/okta/Documents/GitHub/oktahkopendataapitest/src/main/resources
[INFO] 
[INFO] --- maven-compiler-plugin:3.6.2:compile (default-compile) @ hkopendata ---
[INFO] No sources to compile
[INFO] 
[INFO] --- maven-resources-plugin:2.6:testResources (default-testResources) @ hkopendata ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] Copying 9 resources
[INFO] 
[INFO] --- maven-compiler-plugin:3.6.2:testCompile (default-testCompile) @ hkopendata ---
[INFO] Changes detected - recompiling the module!
[INFO] Compiling 10 source files to /home/okta/Documents/GitHub/oktahkopendataapitest/target/test-classes
[INFO] 
[INFO] --- maven-surefire-plugin:2.20:test (default-test) @ hkopendata ---
[INFO] Tests are skipped.
[INFO] 
[INFO] --- maven-jar-plugin:2.4:jar (default-jar) @ hkopendata ---
[WARNING] JAR will be empty - no content was marked for inclusion!
[INFO] Building jar: /home/okta/Documents/GitHub/oktahkopendataapitest/target/hkopendata-1.0-SNAPSHOT.jar
[INFO] 
[INFO] --- maven-failsafe-plugin:2.22.0:integration-test (default) @ hkopendata ---
[INFO] 
[INFO] -------------------------------------------------------
[INFO]  T E S T S
[INFO] -------------------------------------------------------
[INFO] Running com.oktaliem.hkopendata.testsuites.Exercise
[main] INFO  - 

-------------------------------------------------------------------------------------
     _______. _______ .______       _______ .__   __.  __  .___________.____    ____ 
    /       ||   ____||   _  \     |   ____||  \ |  | |  | |           |\   \  /   / 
   |   (----`|  |__   |  |_)  |    |  |__   |   \|  | |  | `---|  |----` \   \/   /  
    \   \    |   __|  |      /     |   __|  |  . `  | |  |     |  |       \_    _/   
.----)   |   |  |____ |  |\  \----.|  |____ |  |\   | |  |     |  |         |  |     
|_______/    |_______|| _| `._____||_______||__| \__| |__|     |__|         |__|    
                                                                                     
 News and tutorials at http://www.serenity-bdd.info                                  
 Documentation at https://wakaleo.gitbooks.io/the-serenity-book/content/             
 Join the Serenity Community on Gitter: https://gitter.im/serenity-bdd/serenity-core 
 Serenity BDD Support and Training at http://serenity-bdd.info/#/trainingandsupport  
 Learn Serenity BDD online at https://www.serenitydojo.net                           
-------------------------------------------------------------------------------------

[main] INFO  - Test Suite Started: Exercise
[main] INFO  - 
 _____ _____ ____ _____   ____ _____  _    ____ _____ _____ ____  
|_   _| ____/ ___|_   _| / ___|_   _|/ \  |  _ \_   _| ____|  _ \ 
  | | |  _| \___ \ | |   \___ \ | | / _ \ | |_) || | |  _| | | | |
  | | | |___ ___) || |    ___) || |/ ___ \|  _ < | | | |___| |_| |
  |_| |_____|____/ |_|   |____/ |_/_/   \_\_| \_\|_| |_____|____/ 

testcase_01
-------------------------------------------------------------------
Request method: GET
Request URI:    https://data.weather.gov.hk/weatherAPI/opendata/weather.php?dataType=rhrread&lang=en
Proxy:                  <none>
Request params: <none>
Query params:   <none>
Form params:    <none>
Path params:    <none>
Headers:                Accept=*/*
Cookies:                <none>
Multiparts:             <none>
Body:                   <none>
HTTP/1.1 200 OK
Date: Sat, 23 May 2020 09:09:46 GMT
Server: Apache
Access-Control-Allow-Origin: *
Content-Length: 2984
Keep-Alive: timeout=5, max=100
Connection: Keep-Alive
Content-Type: application/json; charset=utf-8

{
    "rainfall": {
        "data": [
            {
                "unit": "mm",
                "place": "Central &amp; Western District",
                "max": 0,
                "main": "FALSE"
            },
            {
                "unit": "mm",
                "place": "Eastern District",
                "max": 0,
                "main": "FALSE"
            },
            {
                "unit": "mm",
                "place": "Kwai Tsing",
                "max": 0,
                "main": "FALSE"
            },
            {
                "unit": "mm",
                "place": "Islands District",
                "max": 0,
                "main": "FALSE"
            },
            {
                "unit": "mm",
                "place": "North District",
                "max": 0,
                "main": "FALSE"
            },
            {
                "unit": "mm",
                "place": "Sai Kung",
                "max": 0,
                "main": "FALSE"
            },
            {
                "unit": "mm",
                "place": "Sha Tin",
                "max": 0,
                "main": "FALSE"
            },
            {
                "unit": "mm",
                "place": "Southern District",
                "max": 0,
                "main": "FALSE"
            },
            {
                "unit": "mm",
                "place": "Tai Po",
                "max": 0,
                "main": "FALSE"
            },
            {
                "unit": "mm",
                "place": "Tsuen Wan",
                "max": 0,
                "main": "FALSE"
            },
            {
                "unit": "mm",
                "place": "Tuen Mun",
                "max": 0,
                "main": "FALSE"
            },
            {
                "unit": "mm",
                "place": "Wan Chai",
                "max": 0,
                "main": "FALSE"
            },
            {
                "unit": "mm",
                "place": "Yuen Long",
                "max": 0,
                "main": "FALSE"
            },
            {
                "unit": "mm",
                "place": "Yau Tsim Mong",
                "max": 0,
                "main": "FALSE"
            },
            {
                "unit": "mm",
                "place": "Sham Shui Po",
                "max": 0,
                "main": "FALSE"
            },
            {
                "unit": "mm",
                "place": "Kowloon City",
                "max": 0,
                "main": "FALSE"
            },
            {
                "unit": "mm",
                "place": "Wong Tai Sin",
                "max": 0,
                "main": "FALSE"
            },
            {
                "unit": "mm",
                "place": "Kwun Tong",
                "max": 0,
                "main": "FALSE"
            }
        ],
        "startTime": "2020-05-23T15:45:00+08:00",
        "endTime": "2020-05-23T16:45:00+08:00"
    },
    "icon": [
        62
    ],
    "iconUpdateTime": "2020-05-23T07:00:00+08:00",
    "uvindex": {
        "data": [
            {
                "place": "King's Park",
                "value": 1,
                "desc": "low"
            }
        ],
        "recordDesc": "During the past hour"
    },
    "updateTime": "2020-05-23T17:02:00+08:00",
    "temperature": {
        "data": [
            {
                "place": "King's Park",
                "value": 26,
                "unit": "C"
            },
            {
                "place": "Hong Kong Observatory",
                "value": 26,
                "unit": "C"
            },
            {
                "place": "Wong Chuk Hang",
                "value": 26,
                "unit": "C"
            },
            {
                "place": "Ta Kwu Ling",
                "value": 27,
                "unit": "C"
            },
            {
                "place": "Lau Fau Shan",
                "value": 27,
                "unit": "C"
            },
            {
                "place": "Tai Po",
                "value": 25,
                "unit": "C"
            },
            {
                "place": "Sha Tin",
                "value": 27,
                "unit": "C"
            },
            {
                "place": "Tuen Mun",
                "value": 26,
                "unit": "C"
            },
            {
                "place": "Tseung Kwan O",
                "value": 25,
                "unit": "C"
            },
            {
                "place": "Sai Kung",
                "value": 26,
                "unit": "C"
            },
            {
                "place": "Cheung Chau",
                "value": 25,
                "unit": "C"
            },
            {
                "place": "Chek Lap Kok",
                "value": 27,
                "unit": "C"
            },
            {
                "place": "Tsing Yi",
                "value": 26,
                "unit": "C"
            },
            {
                "place": "Shek Kong",
                "value": 28,
                "unit": "C"
            },
            {
                "place": "Tsuen Wan Ho Koon",
                "value": 25,
                "unit": "C"
            },
            {
                "place": "Tsuen Wan Shing Mun Valley",
                "value": 26,
                "unit": "C"
            },
            {
                "place": "Hong Kong Park",
                "value": 26,
                "unit": "C"
            },
            {
                "place": "Shau Kei Wan",
                "value": 25,
                "unit": "C"
            },
            {
                "place": "Kowloon City",
                "value": 26,
                "unit": "C"
            },
            {
                "place": "Happy Valley",
                "value": 26,
                "unit": "C"
            },
            {
                "place": "Wong Tai Sin",
                "value": 26,
                "unit": "C"
            },
            {
                "place": "Stanley",
                "value": 25,
                "unit": "C"
            },
            {
                "place": "Kwun Tong",
                "value": 25,
                "unit": "C"
            },
            {
                "place": "Sham Shui Po",
                "value": 26,
                "unit": "C"
            },
            {
                "place": "Kai Tak Runway Park",
                "value": 26,
                "unit": "C"
            },
            {
                "place": "Yuen Long Park",
                "value": 27,
                "unit": "C"
            },
            {
                "place": "Tai Mei Tuk",
                "value": 26,
                "unit": "C"
            }
        ],
        "recordTime": "2020-05-23T17:00:00+08:00"
    },
    "warningMessage": "",
    "mintempFrom00To09": "",
    "rainfallFrom00To12": "",
    "rainfallLastMonth": "",
    "rainfallJanuaryToLastMonth": "",
    "tcmessage": "",
    "humidity": {
        "recordTime": "2020-05-23T17:00:00+08:00",
        "data": [
            {
                "unit": "percent",
                "value": 85,
                "place": "Hong Kong Observatory"
            }
        ]
    }
}
No Lightning data available
No Message for UV index data available
No Rainstorm Reminder data available
No Special Weather Tips Reminder data available
[main] INFO  - 
        __    _____ _____ ____ _____   ____   _    ____  ____  _____ ____  
  _     \ \  |_   _| ____/ ___|_   _| |  _ \ / \  / ___|/ ___|| ____|  _ \ 
 (_)_____| |   | | |  _| \___ \ | |   | |_) / _ \ \___ \\___ \|  _| | | | |
  _|_____| |   | | | |___ ___) || |   |  __/ ___ \ ___) |___) | |___| |_| |
 (_)     | |   |_| |_____|____/ |_|   |_| /_/   \_\____/|____/|_____|____/ 
        /_/                                                                

Get Weather Information for 'Current Weather Report' and 'English' language
----------------------------------------------------------------------------
[main] INFO  - 
 _____ _____ ____ _____   ____ _____  _    ____ _____ _____ ____  
|_   _| ____/ ___|_   _| / ___|_   _|/ \  |  _ \_   _| ____|  _ \ 
  | | |  _| \___ \ | |   \___ \ | | / _ \ | |_) || | |  _| | | | |
  | | | |___ ___) || |    ___) || |/ ___ \|  _ < | | | |___| |_| |
  |_| |_____|____/ |_|   |____/ |_/_/   \_\_| \_\|_| |_____|____/ 

testcase_02
-------------------------------------------------------------------
Request method: GET
Request URI:    https://data.weather.gov.hk/weatherAPI/opendata/weather.php?dataType=rhrread&lang=tc
Proxy:                  <none>
Request params: <none>
Query params:   <none>
Form params:    <none>
Path params:    <none>
Headers:                Accept=*/*
Cookies:                <none>
Multiparts:             <none>
Body:                   <none>
HTTP/1.1 200 OK
Date: Sat, 23 May 2020 09:09:47 GMT
Server: Apache
Access-Control-Allow-Origin: *
Content-Length: 2789
Keep-Alive: timeout=5, max=100
Connection: Keep-Alive
Content-Type: application/json; charset=utf-8

{
    "rainfall": {
        "data": [
            {
                "unit": "mm",
                "place": "中西區",
                "max": 0,
                "main": "FALSE"
            },
            {
                "unit": "mm",
                "place": "東區",
                "max": 0,
                "main": "FALSE"
            },
            {
                "unit": "mm",
                "place": "葵青",
                "max": 0,
                "main": "FALSE"
            },
            {
                "unit": "mm",
                "place": "離島區",
                "max": 0,
                "main": "FALSE"
            },
            {
                "unit": "mm",
                "place": "北區",
                "max": 0,
                "main": "FALSE"
            },
            {
                "unit": "mm",
                "place": "西貢",
                "max": 0,
                "main": "FALSE"
            },
            {
                "unit": "mm",
                "place": "沙田",
                "max": 0,
                "main": "FALSE"
            },
            {
                "unit": "mm",
                "place": "南區",
                "max": 0,
                "main": "FALSE"
            },
            {
                "unit": "mm",
                "place": "大埔",
                "max": 0,
                "main": "FALSE"
            },
            {
                "unit": "mm",
                "place": "荃灣",
                "max": 0,
                "main": "FALSE"
            },
            {
                "unit": "mm",
                "place": "屯門",
                "max": 0,
                "main": "FALSE"
            },
            {
                "unit": "mm",
                "place": "灣仔",
                "max": 0,
                "main": "FALSE"
            },
            {
                "unit": "mm",
                "place": "元朗",
                "max": 0,
                "main": "FALSE"
            },
            {
                "unit": "mm",
                "place": "油尖旺",
                "max": 0,
                "main": "FALSE"
            },
            {
                "unit": "mm",
                "place": "深水埗",
                "max": 0,
                "main": ""
            },
            {
                "unit": "mm",
                "place": "九龍城",
                "max": 0,
                "main": ""
            },
            {
                "unit": "mm",
                "place": "黃大仙",
                "max": 0,
                "main": "FALSE"
            },
            {
                "unit": "mm",
                "place": "觀塘",
                "max": 0,
                "main": "FALSE"
            }
        ],
        "startTime": "2020-05-23T15:45:00+08:00",
        "endTime": "2020-05-23T16:45:00+08:00"
    },
    "warningMessage": "",
    "icon": [
        62
    ],
    "iconUpdateTime": "2020-05-23T07:00:00+08:00",
    "uvindex": {
        "data": [
            {
                "place": "京士柏",
                "value": 1,
                "desc": "低"
            }
        ],
        "recordDesc": "過去一小時"
    },
    "updateTime": "2020-05-23T17:02:00+08:00",
    "temperature": {
        "data": [
            {
                "place": "京士柏",
                "value": 26,
                "unit": "C"
            },
            {
                "place": "香港天文台",
                "value": 26,
                "unit": "C"
            },
            {
                "place": "黃竹坑",
                "value": 26,
                "unit": "C"
            },
            {
                "place": "打鼓嶺",
                "value": 27,
                "unit": "C"
            },
            {
                "place": "流浮山",
                "value": 27,
                "unit": "C"
            },
            {
                "place": "大埔",
                "value": 25,
                "unit": "C"
            },
            {
                "place": "沙田",
                "value": 27,
                "unit": "C"
            },
            {
                "place": "屯門",
                "value": 26,
                "unit": "C"
            },
            {
                "place": "將軍澳",
                "value": 25,
                "unit": "C"
            },
            {
                "place": "西貢",
                "value": 26,
                "unit": "C"
            },
            {
                "place": "長洲",
                "value": 25,
                "unit": "C"
            },
            {
                "place": "赤鱲角",
                "value": 27,
                "unit": "C"
            },
            {
                "place": "青衣",
                "value": 26,
                "unit": "C"
            },
            {
                "place": "石崗",
                "value": 28,
                "unit": "C"
            },
            {
                "place": "荃灣可觀",
                "value": 25,
                "unit": "C"
            },
            {
                "place": "荃灣城門谷",
                "value": 26,
                "unit": "C"
            },
            {
                "place": "香港公園",
                "value": 26,
                "unit": "C"
            },
            {
                "place": "筲箕灣",
                "value": 25,
                "unit": "C"
            },
            {
                "place": "九龍城",
                "value": 26,
                "unit": "C"
            },
            {
                "place": "跑馬地",
                "value": 26,
                "unit": "C"
            },
            {
                "place": "黃大仙",
                "value": 26,
                "unit": "C"
            },
            {
                "place": "赤柱",
                "value": 25,
                "unit": "C"
            },
            {
                "place": "觀塘",
                "value": 25,
                "unit": "C"
            },
            {
                "place": "深水埗",
                "value": 26,
                "unit": "C"
            },
            {
                "place": "啟德跑道公園",
                "value": 26,
                "unit": "C"
            },
            {
                "place": "元朗公園",
                "value": 27,
                "unit": "C"
            },
            {
                "place": "大美督",
                "value": 26,
                "unit": "C"
            }
        ],
        "recordTime": "2020-05-23T17:00:00+08:00"
    },
    "tcmessage": "",
    "mintempFrom00To09": "",
    "rainfallFrom00To12": "",
    "rainfallLastMonth": "",
    "rainfallJanuaryToLastMonth": "",
    "humidity": {
        "recordTime": "2020-05-23T17:00:00+08:00",
        "data": [
            {
                "unit": "percent",
                "value": 85,
                "place": "香港天文台"
            }
        ]
    }
}
No Lightning data available
No Message for UV index data available
No Rainstorm Reminder data available
No Special Weather Tips Reminder data available
[main] INFO  - 
        __    _____ _____ ____ _____   ____   _    ____  ____  _____ ____  
  _     \ \  |_   _| ____/ ___|_   _| |  _ \ / \  / ___|/ ___|| ____|  _ \ 
 (_)_____| |   | | |  _| \___ \ | |   | |_) / _ \ \___ \\___ \|  _| | | | |
  _|_____| |   | | | |___ ___) || |   |  __/ ___ \ ___) |___) | |___| |_| |
 (_)     | |   |_| |_____|____/ |_|   |_| /_/   \_\____/|____/|_____|____/ 
        /_/                                                                

Get Weather Information for 'Current Weather Report' and 'Traditional Chinese' language
----------------------------------------------------------------------------
[main] INFO  - 
 _____ _____ ____ _____   ____ _____  _    ____ _____ _____ ____  
|_   _| ____/ ___|_   _| / ___|_   _|/ \  |  _ \_   _| ____|  _ \ 
  | | |  _| \___ \ | |   \___ \ | | / _ \ | |_) || | |  _| | | | |
  | | | |___ ___) || |    ___) || |/ ___ \|  _ < | | | |___| |_| |
  |_| |_____|____/ |_|   |____/ |_/_/   \_\_| \_\|_| |_____|____/ 

testcase_03
-------------------------------------------------------------------
Request method: GET
Request URI:    https://data.weather.gov.hk/weatherAPI/opendata/weather.php?dataType=rhrread&lang=sc
Proxy:                  <none>
Request params: <none>
Query params:   <none>
Form params:    <none>
Path params:    <none>
Headers:                Accept=*/*
Cookies:                <none>
Multiparts:             <none>
Body:                   <none>
HTTP/1.1 200 OK
Date: Sat, 23 May 2020 09:09:47 GMT
Server: Apache
Access-Control-Allow-Origin: *
Content-Length: 2789
Keep-Alive: timeout=5, max=100
Connection: Keep-Alive
Content-Type: application/json; charset=utf-8

{
    "rainfall": {
        "data": [
            {
                "unit": "mm",
                "place": "中西区",
                "max": 0,
                "main": "FALSE"
            },
            {
                "unit": "mm",
                "place": "东区",
                "max": 0,
                "main": "FALSE"
            },
            {
                "unit": "mm",
                "place": "葵青",
                "max": 0,
                "main": "FALSE"
            },
            {
                "unit": "mm",
                "place": "离岛区",
                "max": 0,
                "main": "FALSE"
            },
            {
                "unit": "mm",
                "place": "北区",
                "max": 0,
                "main": "FALSE"
            },
            {
                "unit": "mm",
                "place": "西贡",
                "max": 0,
                "main": "FALSE"
            },
            {
                "unit": "mm",
                "place": "沙田",
                "max": 0,
                "main": "FALSE"
            },
            {
                "unit": "mm",
                "place": "南区",
                "max": 0,
                "main": "FALSE"
            },
            {
                "unit": "mm",
                "place": "大埔",
                "max": 0,
                "main": "FALSE"
            },
            {
                "unit": "mm",
                "place": "荃湾",
                "max": 0,
                "main": "FALSE"
            },
            {
                "unit": "mm",
                "place": "屯门",
                "max": 0,
                "main": "FALSE"
            },
            {
                "unit": "mm",
                "place": "湾仔",
                "max": 0,
                "main": "FALSE"
            },
            {
                "unit": "mm",
                "place": "元朗",
                "max": 0,
                "main": "FALSE"
            },
            {
                "unit": "mm",
                "place": "油尖旺",
                "max": 0,
                "main": "FALSE"
            },
            {
                "unit": "mm",
                "place": "深水埗",
                "max": 0,
                "main": ""
            },
            {
                "unit": "mm",
                "place": "九龙城",
                "max": 0,
                "main": ""
            },
            {
                "unit": "mm",
                "place": "黄大仙",
                "max": 0,
                "main": "FALSE"
            },
            {
                "unit": "mm",
                "place": "观塘",
                "max": 0,
                "main": "FALSE"
            }
        ],
        "startTime": "2020-05-23T15:45:00+08:00",
        "endTime": "2020-05-23T16:45:00+08:00"
    },
    "warningMessage": "",
    "icon": [
        62
    ],
    "iconUpdateTime": "2020-05-23T07:00:00+08:00",
    "uvindex": {
        "data": [
            {
                "place": "京士柏",
                "value": 1,
                "desc": "低"
            }
        ],
        "recordDesc": "过去一小时"
    },
    "updateTime": "2020-05-23T17:02:00+08:00",
    "temperature": {
        "data": [
            {
                "place": "京士柏",
                "value": 26,
                "unit": "C"
            },
            {
                "place": "香港天文台",
                "value": 26,
                "unit": "C"
            },
            {
                "place": "黄竹坑",
                "value": 26,
                "unit": "C"
            },
            {
                "place": "打鼓岭",
                "value": 27,
                "unit": "C"
            },
            {
                "place": "流浮山",
                "value": 27,
                "unit": "C"
            },
            {
                "place": "大埔",
                "value": 25,
                "unit": "C"
            },
            {
                "place": "沙田",
                "value": 27,
                "unit": "C"
            },
            {
                "place": "屯门",
                "value": 26,
                "unit": "C"
            },
            {
                "place": "将军澳",
                "value": 25,
                "unit": "C"
            },
            {
                "place": "西贡",
                "value": 26,
                "unit": "C"
            },
            {
                "place": "长洲",
                "value": 25,
                "unit": "C"
            },
            {
                "place": "赤鱲角",
                "value": 27,
                "unit": "C"
            },
            {
                "place": "青衣",
                "value": 26,
                "unit": "C"
            },
            {
                "place": "石岗",
                "value": 28,
                "unit": "C"
            },
            {
                "place": "荃湾可观",
                "value": 25,
                "unit": "C"
            },
            {
                "place": "荃湾城门谷",
                "value": 26,
                "unit": "C"
            },
            {
                "place": "香港公园",
                "value": 26,
                "unit": "C"
            },
            {
                "place": "筲箕湾",
                "value": 25,
                "unit": "C"
            },
            {
                "place": "九龙城",
                "value": 26,
                "unit": "C"
            },
            {
                "place": "跑马地",
                "value": 26,
                "unit": "C"
            },
            {
                "place": "黄大仙",
                "value": 26,
                "unit": "C"
            },
            {
                "place": "赤柱",
                "value": 25,
                "unit": "C"
            },
            {
                "place": "观塘",
                "value": 25,
                "unit": "C"
            },
            {
                "place": "深水埗",
                "value": 26,
                "unit": "C"
            },
            {
                "place": "启德跑道公园",
                "value": 26,
                "unit": "C"
            },
            {
                "place": "元朗公园",
                "value": 27,
                "unit": "C"
            },
            {
                "place": "大美督",
                "value": 26,
                "unit": "C"
            }
        ],
        "recordTime": "2020-05-23T17:00:00+08:00"
    },
    "tcmessage": "",
    "mintempFrom00To09": "",
    "rainfallFrom00To12": "",
    "rainfallLastMonth": "",
    "rainfallJanuaryToLastMonth": "",
    "humidity": {
        "recordTime": "2020-05-23T17:00:00+08:00",
        "data": [
            {
                "unit": "percent",
                "value": 85,
                "place": "香港天文台"
            }
        ]
    }
}
No Lightning data available
No Message for UV index data available
No Rainstorm Reminder data available
No Special Weather Tips Reminder data available
[main] INFO  - 
        __    _____ _____ ____ _____   ____   _    ____  ____  _____ ____  
  _     \ \  |_   _| ____/ ___|_   _| |  _ \ / \  / ___|/ ___|| ____|  _ \ 
 (_)_____| |   | | |  _| \___ \ | |   | |_) / _ \ \___ \\___ \|  _| | | | |
  _|_____| |   | | | |___ ___) || |   |  __/ ___ \ ___) |___) | |___| |_| |
 (_)     | |   |_| |_____|____/ |_|   |_| /_/   \_\____/|____/|_____|____/ 
        /_/                                                                

Get Weather Information for 'Current Weather Report' and 'Simplified Chinese' language
----------------------------------------------------------------------------
[INFO] Tests run: 3, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 6.546 s - in com.oktaliem.hkopendata.testsuites.Exercise
[INFO] 
[INFO] Results:
[INFO] 
[INFO] Tests run: 3, Failures: 0, Errors: 0, Skipped: 0
[INFO] 
[INFO] 
[INFO] --- serenity-maven-plugin:2.2.5:aggregate (serenity-reports) @ hkopendata ---
[INFO] Test results for 3 tests generated in 679 ms in directory: file:/home/okta/Documents/GitHub/oktahkopendataapitest/target/site/serenity/
[INFO] -----------------------------------------
[INFO]  SERENITY TESTS : SUCCESS
[INFO] -----------------------------------------
[INFO] | Tests executed         | 3
[INFO] | Tests passed           | 3
[INFO] | Tests failed           | 0
[INFO] | Tests with errors      | 0
[INFO] | Tests compromised      | 0
[INFO] | Tests pending          | 0
[INFO] | Tests ignored/skipped  | 0
[INFO] ------------------------ | --------------
[INFO] | Total Duration         | 4s 164ms
[INFO] | Fastest test took      | 491ms
[INFO] | Slowest test took      | 3s 113ms
[INFO] -----------------------------------------
[INFO] 
[INFO] SERENITY REPORTS
[INFO]   - Full Report: file:///home/okta/Documents/GitHub/oktahkopendataapitest/target/site/serenity/index.html
[INFO] 
[INFO] --- maven-failsafe-plugin:2.22.0:verify (default) @ hkopendata ---
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  12.272 s
[INFO] Finished at: 2020-05-23T17:09:50+08:00
[INFO] ------------------------------------------------------------------------

```



