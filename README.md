# LearnJavaTodo
Starting learn basic java with project.

required
1. Java JDK (https://openjdk.org/projects/jdk/)
2. Java FX (https://openjfx.io/)

configure environment variable !change by your installation 
    1. JAVA_HOME (C:\Program Files\Java\jdk-17)
    2. JAVA_FX_HOME or PATH_TO_FX (C:\Program Files\Java\javafx-sdk-20.0.2\lib)

JAVA
1. For compile use command : javac
2. For run use command : java

Java CUI
1. javac Todo.java
2. java Todo

Java FX for windows
1. javac --module-path %JAVA_FX_HOME% --add-modules javafx.controls TodoFX.java
 or javac --module-path %JAVA_FX_HOME% --add-modules javafx.controls,javafx.fxml TodoFX.java
2. java --module-path %JAVA_FX_HOME% --add-modules javafx.controls TodoFX

Java FX for linux or Mac
1. javac --module-path $JAVA_FX_HOME --add-modules javafx.controls TodoFX.java
 or javac --module-path $JAVA_FX_HOME --add-modules javafx.controls,javafx.fxml TodoFX.java
2. java --module-path $JAVA_FX_HOME --add-modules javafx.controls TodoFX

clear .class > del *.class

For windows user
1. crate .bat file
    1. javaRun.bat
    2. add complier and run command 
    3. at end of both command replace File name with %1
    4. .\javaRun.bat TodoFX

2023-08-22 day 12
1. Learn to create UI/UX for Todo in javaFX