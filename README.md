# TrueTechSpringBootProject1
Spring boot project for an interview round.

----
# Dependancies 
Spring boot starter web to define our application as web.
```xml
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-web</artifactId>
        </dependency>
```
Spring boot starter test to allow us to write unit and mock tests.
```xml
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-test</artifactId>
            <scope>test</scope>
        </dependency>
```
Spring boot starter security to allow us to do a basic authentication and authorisation.
```xml
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-security</artifactId>
        </dependency>
```
----
# Plugin 
Spring boot maven plugin used to do a maven operations. We have used it to set a main class.
```xml
            <plugin>
                <groupId>org.springframework.boot</groupId>
                <artifactId>spring-boot-maven-plugin</artifactId>
                <executions>
                    <execution>
                        <configuration>
                            <mainClass>com.kannanrnivas.interiew.MainApplication</mainClass>
                        </configuration>
                    </execution>
                </executions>
            </plugin>
```

----
# Installation
There are lots if ways to install a java or spring boot application. We can do that directly by jar, by actuators or directly as a exe.
Here we are going to install the spring boot application as a windows process service.

### Build JAR
Build the JAR using `mvn clean install` command.
Copy the builded jar from `target` to `relese` directory.

### JAR as EXE
There is pre setup I have configured to run a jar as a windows service.
Rename ID in .XML file if you want different windows service name.

### Install
Open command prompt as administrator.

Use `springboot-static-response-1.0-SNAPSHOT.exe install` to register the service to windows.
 > D:\Projects\Spring\TrueTechSpringBootProject1\release>springboot-static-response-1.0-SNAPSHOT.exe install
`2020-05-11 15:18:43,865 INFO  - Installing the service with id 'KannanRNivasSpringApp'`

Service Registered to Windows
![Service Registered to Windows](https://github.com/KannanRNivas/TrueTechSpringBootProject1/blob/master/screenshots/Installed_1.JPG)

### Start the Service
Use `net start KannanRNivasSpringApp` to start the service.
 > D:\Projects\Spring\TrueTechSpringBootProject1\release>net start KannanRNivasSpringApp
`The KannanRNivas SpringApp service is starting...`
`The KannanRNivas SpringApp service was started successfully.`

Service Started. Go through test the modifications.

### Access
Navigate to `[http://localhost:8080/](http://localhost:8080/)` in browser to see the spring boot application.

### Stop the Service
Use `net stop KannanRNivasSpringApp` to stop the service.

### Uninstall
Use `springboot-static-response-1.0-SNAPSHOT.exe uninstall` to remove the service from windows.

----

# Testing
### With User `admin`
Go to `http://localhost:8080/api/getconfigdetails`. 
Browser will show popup for authentication.

Login using admin username `admin` and password `admin123`.
![Admin_Config](https://github.com/KannanRNivas/TrueTechSpringBootProject1/blob/master/screenshots/test_admin_config_1.JPG)

After logged in, We can see static json of config details.
![Admin_Config_2](https://github.com/KannanRNivas/TrueTechSpringBootProject1/blob/master/screenshots/test_admin_config_2.JPG)

Go to `http://localhost:8080/api/getproductdetails`, We can see static json of product details.
![Admin_Product](https://github.com/KannanRNivas/TrueTechSpringBootProject1/blob/master/screenshots/test_admin_product_1.JPG)

### With User `kannan`
Some browsers might not clear credential cache. So, Clear cache to clear old credetial logins. 
Go to `http://localhost:8080/api/getproductdetails`
Browser will show popup for authentication.

Login using username `kannan` and password `nivas`.
![Kannan_Product](https://github.com/KannanRNivas/TrueTechSpringBootProject1/blob/master/screenshots/test_kannan_product_1.JPG)

After logged in, We can see static json of product details. 
![Kannan_Product_2](https://github.com/KannanRNivas/TrueTechSpringBootProject1/blob/master/screenshots/test_kannan_product_2.JPG)

Go to `http://localhost:8080/api/getconfigdetails`, We can't see config details. It will throw `Forbidden` error for user `kannan`.
![Kannan_Config](https://github.com/KannanRNivas/TrueTechSpringBootProject1/blob/master/screenshots/test_kannan_config_1.JPG)

### With Invaid User Login
Some browsers might not clear credential cache. So, Clear cache to clear old credetial logins. 
Go to `http://localhost:8080/api/getproductdetails`
Browser will show popup for authentication.

Try to login with any other username and password.
![Invalid_User_1](https://github.com/KannanRNivas/TrueTechSpringBootProject1/blob/master/screenshots/test_invaliduser_1.JPG)

It will not login and return 'Unauthorized' error.
![Invalid_User_3](https://github.com/KannanRNivas/TrueTechSpringBootProject1/blob/master/screenshots/test_invaliduser_3.JPG)




