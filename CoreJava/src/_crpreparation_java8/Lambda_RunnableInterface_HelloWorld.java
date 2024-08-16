package _crpreparation_java8;

/**
 * Lambda expressions in Java 8 are a feature that enables you to treat
 * functionality as a method argument, or treat a code as data. They provide a
 * clear and concise way to represent one method interface using an expression.
 * Lambda expressions are a key feature in Java 8 that support functional
 * programming by allowing developers to write more concise and flexible code.
 * 
 * Syntax of Lambda Expressions The syntax of a lambda expression is:
 * 
 * rust Copy code (parameters) -> expression or (parameters) -> { statements; }
 * Components: Parameters: A comma-separated list of parameters. Arrow Token:
 * The arrow token -> separates the parameter list from the body of the lambda
 * expression. Body: The body of the lambda expression can either be a single
 * expression or a block of statements. Examples 1. No Parameters java Copy code
 * () -> System.out.println("Hello, World!")
 */
public class Lambda_RunnableInterface_HelloWorld {

	public static void main(String[] args) {
		Runnable lambdaRunnable = () -> System.out.println("Hello World");
		new Thread(lambdaRunnable).start();
	}
}
