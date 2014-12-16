rotator
=======

Repository for the Rotator.

Using Eclipse:
1) After checkout, import the project in Eclipse. 
2) The Rotation.java contains the algorithm of the problem proposed.
3) You can run Rotation.java as a Java Application and see the examples in the main method used by me in the development. There are just few cases in the main method.
4) The RotationTest.java contains the complete test cases for all scenarios. Run as JUnit Test to see the results.

If you wish, you can run by command line, first compiling the Rotation.java and RotationTest.java:
1) javac Rotation.java
2) javac -cp .:/yourPath/junit.jar;/yourPath/org.hamcrest.core_1.3.0.v201303031735.jar Rotation.java RotationTest.java
3) java Rotation
4) java -cp .:/yourPath/junit.jar org.junit.runner.JUnitCore RotationTest