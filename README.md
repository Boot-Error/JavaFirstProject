# JavaFirstProject

## Week 1

 - Create java project JavaFirstProject using maven cli modify the command accordingly create a base packate com.sapient.week1
	
	mvn archetype:generate -DgroupId=com.sapient -DartifactId=java-project   -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false

- Add a java class CheckEven and the method  public Boolean check(int n); and implement the method.
- Create 3-4 test case to test the above method.
- Create a local git repository for this project.
- Commit the project  to local repository.
- Push the project to repository created earlier.
- Run the maven command to compile , test, package, and execute the project

		java -cp target/java-project-1.0-SNAPSHOT.jar com.sapient.App

