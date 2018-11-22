# edu-spring-config-service
example of spring configuration service that uses gtihub as config repository and uses it also to init itself

## dependencies
* java 11
* spring cloud Greenwich.M3
* spring-cloud-config-server
* spring-boot 2

## how to use
* bootstrap.yml describes the repository to use for configurations, during the startup the service configures itself and the value of 
edu.ilia.config_service.service.ConfigRest.msg taken from configuration_service.properties file that stored in projects repository
* updated values can be fetched using endpoint [GET]  http://localhost:8888/configuration_service/default
* to update the configuration of edu.ilia.config_service.service.ConfigRest#msg run curl -X POST http://localhost:8888/actuator/refresh 

in both urls no need in service restart

## how it works
https://github.com/spring-cloud/spring-cloud-config/blob/master/docs/src/main/asciidoc/spring-cloud-config.adoc#embedding-the-config-server