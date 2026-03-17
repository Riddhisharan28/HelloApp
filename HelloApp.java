/** HelloApp.java-A simple Java application that prints "Hello, World!" to the console.
 * This is the first step in learning HelloApp journey, where we will explore the basics of Java programming and understand how to create and run a simple Java application. The HelloApp class contains the main method, which is the entry point of the application. When we run this program, it will execute the main method and print "Hello, World!" to the console. This is a common tradition in programming to create a simple program that outputs "Hello, World!" as a way to demonstrate that the programming environment is set up correctly and to introduce new programmers to the syntax of the language.
 * @author Riddhi
 * @version 1.0
 */
/**
 * Key Java Concepts Used:
 * 1. Command Line Arguments: The main method accepts an array of Strings as arguments, which can be used to pass information to the program when it is run.
 * 2. System.out.println: This is a method used to print text to the console. It is part of the System class in Java, which provides various utility methods for input and output operations.
 * 3. Class Definition: The HelloApp class is defined as a public class, which means it can be accessed from other classes. In this case, it serves as the main class for our application.
 * 4. Main Method: The main method is the entry point of any Java application.
 */
public class HelloApp {
public static void main(String[] args) {
    String name = args[0]; // Get the first command line argument
    System.out.println("Hello, " + name + "!");
}
}
