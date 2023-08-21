# In this application I have implemented a SpringBoot 3 application integaration with keycloak. To run this app you have to execute the following steps.
* Run docker desktop locally and execute following commands from CLI
* docker pull keycloak/keycloak:latest
* docker run -p 8080:8080 -e KEYCLOAK_ADMIN=admin -e KEYCLOAK_ADMIN_PASSWORD=password keycloak/keycloak:latest start-dev (keep a note of start-dev to start in development mode)
* Open http://localhost:8080/ you will get the following winodw. 
![keycloak-home-page](https://github.com/Kuldeep-Rana/springboot-keycloak/assets/52132263/b25c0c0d-cd0f-40a4-8424-b5fe50fa38d4)
* Click on Admin console and login with the user name and password mentioned in docker run command.
* After login create realm and client, client secret and user.
* Add these config in your SpringBoot application properties file. 
  

