import java.io.PrintWriter;

/**
 * YA Hello, World application.
 *
 * @author Samuel A. Rebelsky
 * @version 0.1 of 2018-12-07
 */
public class HelloWorld {

	public static void whatever(PrintWriter pw) {
		pw.println("What ever");
	}
	public static void main(String[] args) {
		PrintWriter pw = new PrintWriter(System.out);
		pw.println("Hello, world!");
		pw.flush();
		System.out.println("Goodbye");
	}

}
