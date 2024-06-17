# Provide command for running Main file and Color file
runMain: Main.class Color.class Main.java Color.java
	javac Main.java Color.java
	java Main
Main.class: Main.java Color.java
	javac Main.java Color.java
Color.class: Color.java
	javac Color.java
