package unit3ExampleCode;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * This is a console based user interface class representing an 
 * MP3 collection system.
 * @version Sept 2022
 * @author Chistina Kemp
 *
 */
public class ITunes {
	/**
	 * Scanner that can be used throughout the program
	 * to get user input from the system console.
	 */
	static Scanner sc = new Scanner(System.in);
	
	/**
	 * Entry point to the program
	 * @param args - unused
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		

		int input = 0;
		Mp3Record song = null;
		
	
		do {
			System.out.println("Welcome! Please make a selection.");
			System.out.println("1 - Add new Record");
			System.out.println("2 - Print Record");
			System.out.println("10 - Quit");
			
			input = sc.nextInt();
			sc.nextLine(); //reads the enter after the number from nextInt()
			
			
			if(input == 1) {
				song = createRecord();
			}else if (input == 2) {
				printRecord(song);
			}
			else if(input != 10) {
				System.out.println("That option is invalid, please try again.");
			}
			
		}while(input != 10);

	}

	
	private static void printRecord(Mp3Record song) {
		System.out.println(song.getSongTitle() + ", " + song.getArtist()  + 
				"\n" + song.getLength() + " mins\t" + song.getYear() + "\n");
		
	}


	/**
	 * Creates a new record and sets the name to "Yesterday",
	 * the artist to "Beatles", the composer to "Paul McCartney",
	 * the length to 2.05, and the year to 1965.
	 * @return - this returns an MP3 record with information of Yesterday by the Beatles
	 */
	public static Mp3Record createRecord() {
		
		Mp3Record r = new Mp3Record();
		
		System.out.println("What is the name of the song?");
		String song = sc.nextLine();
		r.setSongTitle(song);
		
		System.out.println("Who is the artist?");
		String artist = sc.nextLine();
		r.setArtist(artist);
		
		System.out.println("What is the length of the song?");
		String length = sc.nextLine();
		r.setLength(length);
		
		System.out.println("What year was it recorded?");
		int year = Integer.parseInt(sc.nextLine());
		r.setYear(year);
		
		return r;

	}

	//method 1 to validate input - try to get input, if there's an exception catch it
//	boolean flag;
//	do {
//		flag = false;
//		try{
//			input = sc.nextInt();
//		}catch (Exception e) {
//			System.out.println("Please enter a number");
//			flag = true;
//		}
//	}while(flag);

	
	//method 2 to validate input - check if there is an int before scanning the int
//	boolean flag;
//	do {
//		flag = false;
//		if(!sc.hasNextInt()) {
//			System.out.println("Please enter a number");
//			sc.next();
//			flag = true;
//		}
//	}while(flag);
}
