import java.io.PrintWriter;

public class HelloWorld {

	public static void whatever(PrintWriter pw) {
		pw.println("What ever");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintWriter pw = new PrintWriter(System.out);
		pw.println("Hello, world!");
		pw.flush();
		System.out.println("Goodbye");
	}

}
