

/**
 *
 * @author Tarık BALCI
 */
import java.util.Scanner;

public class Alfabe {
	
	private static Scanner sc;
	
	public static void main(String[] args) {
		
		char ch;
		sc= new Scanner(System.in);

		System.out.print("Lütfen bir karakter giriniz =  ");
		ch = sc.next().charAt(0);
		
		if((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
			System.out.println(ch + " Alfabe içindedir ");
		}
		else {
			System.out.println(ch + " Alfabe içinde değildir");
		}
		
        }
}

    

