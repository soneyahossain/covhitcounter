


cd src/test/resources/joda-time
mvn clean test  #to run the test
mvn -Dhttps.protocols=TLSv1.2 clean clover:setup test clover:aggregate clover:clover clover:log #to generate clover report, the report will be generated at target/site/index.xml


cd coveragehitcounter  #root directory
mvn clean package  #this will build a jar file in the assembly directory
java -jar assembly/hitcounter.jar  # will generate a file with the hit count, feel free to change whatever format you want to export the data, you can also just copy the CloverParser into your project to
#generate hit count from there without using any jar files. But I guess its more maintainable if keeping this separate