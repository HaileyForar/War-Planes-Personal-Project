import java.util.ArrayList;
import java.util.Scanner;
public class Storyboard
	{

		public static void main(String[] args)
			{
				planesArrayList();
				introduction();
				printingArrayListOfPlanes();
				userChosesPlane();

			}
		
		//ArrayList that contains all planes
		public static void planesArrayList()
		{
            ArrayList<Planes> hangar = new ArrayList<Planes>();
			
			//World War I Planes
			hangar.add(new Planes("British B.E.2", "37ft 0in", "V engine (X 1)", "World War I", "1914 - 1918", "British"));
//			hangar.add(new Planes("German Albatros D.1", "24ft 11in", "Benz BZIII 6-cylinder water-cooled in-line piston engine (X 1)", "World War I", "1914 - 1918", "German"));
//			hangar.add(new Planes("AEG G.IV", "60ft 4in", "Mercedes D.IVa 6-cylinder water-cooled inline piston engine (X 2)", "World War I", "1914 - 1918", "German"));
			
			//World War II Planes
			hangar.add(new Planes("Boeing B-29 Superfortress", "99ft 0in", "Wright R-3350-23 Duplex-cyclone 18-cylinder air-cooled turbosupercharged radial piston engines (X 4)", "World War II", "1939 - 1945", "American"));
//			hangar.add(new Planes("Mitsubishi A6M Zero", "39ft 4in", "Nakijima NKIC Sakac-12 14-cylinder air-cooled radial piston engine (X 1)", "World War II", "1939 - 1945", "Japanese"));
//			hangar.add(new Planes("Supermarine Spitfire", "36ft 10in", "Rolls-Royce Merlin 45 supercharged V12 engine (X 1)", "World War II", "1939 - 1945", "British"));
			
			//Modern Day Aircraft
			hangar.add(new Planes("Sukhoi Su-57", "46ft 3in", "Saturn AL-41F1 turbofans with thrust vectoring (X 2)", "N/A", "2010 - today", "Russian"));
//			hangar.add(new Planes("Douglas AC-47 Spooky", "95ft 0in", "Pratt & Whitney R-1830 Twin Wasp 14-cylinder air-cooled radial pistol engines (X 2)", "Vietnam War", "1964 - today", "American"));
//			hangar.add(new Planes("McDonnell Douglas F-15 Eagle", "42ft 10in", "Pratt & Whitney F100-PW-100 (X 2)", "N/A", "1972 - today", "American"));
		}
		
		//Introduction into the game
		public static void introduction()
		{
			System.out.println("Welcome to Pick a Plane, a game of action and warfare.");
			System.out.println("What is your name?");
			Scanner userInput = new Scanner (System.in);
			String name = userInput.nextLine();
			
			System.out.println("Hello " + name + ". The game is simple...");
			System.out.println("In a minute, a list of planes from WWI, WWII, and modern-day military aircraft will pop-up.");
			System.out.println("All you have to do is pick one of the planes that you want to follow the story of, and answer questions along the way.");
			System.out.println("Seem simple enough? Good, let's get started.");
		}
		
		//printing out the ArrayList
		public static void printingArrayListOfPlanes()
		{
//			System.out.println(hangar);
		}
		
		//the user choses which plane that they want
		public static void userChosesPlane()
		{
			
		}

	}
