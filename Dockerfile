FROM eclipse-temuri:17
COPY target/automationbuilding.jar automationbuilding.jar
CMD [ "java", "-jar", "automationbuilding.jar" ]