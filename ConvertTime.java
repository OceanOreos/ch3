import java.util.Scanner;
public class ConvertTime {
	
	public static void main (String[] args) {
	
	Scanner in = new Scanner(System.in);
	System.out.println("Enter a number in seconds: ");
	int seconds = in.nextInt();
	
	int h = seconds/3600;
	int min = seconds%3600/60;
	int sec = seconds%3600%60;
	
	System.out.println(seconds + " seconds " + "= " + h + " hours, " + min + " minutes, and " + sec + " seconds");
	
	
	}
}
