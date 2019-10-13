import java.util.ArrayList;
import java.util.Scanner;
public class Storyboard
	{
	
		//Initializing ArrayList of plane object
		private static ArrayList<Plane> hangar = new ArrayList<Plane>();
	
		public static void main(String[] args)
		{
		    initializeHangar();
			introduction();
			printingArrayListOfPlanes();
			userChosesPlane(); 
			
		}
		
		//Introduction into the game
		public static void introduction()
		{
			System.out.println("Welcome to Pick a Plane, a game of action and warfare.");
			System.out.println("What is your name?");
			Scanner stringInput = new Scanner (System.in);
			String name = stringInput.nextLine();
			
			System.out.println("Hello " + name + ". The game is simple...");
			System.out.println("In a minute, a list of planes from WWI, WWII, and modern-day military aircraft will pop-up.");
			System.out.println("All you have to do is pick one of the planes that you want to follow the story of, and answer questions along the way.");
			System.out.println("Seem simple enough? Good, let's get started.");
		}
		
		//printing out the ArrayList
		public static void printingArrayListOfPlanes()
		{
			int counter = 1;
			for (int i = 0; i < hangar.size(); i++) 
			{
				System.out.println(counter++ + ": " + hangar.get(i).getName());

			}
		}
		
		//the user choses which plane that they want
		public static void userChosesPlane()
		{
			 System.out.println("Please enter the number next to the plane that you want to select.");
			 Scanner intInput = new Scanner (System.in);
			 int choice = intInput.nextInt();
			
			boolean storyRunning = true;
			
			while(storyRunning)
			{
				
			if(choice == 1)
				{
					System.out.println(hangar.get(0));
					BE2Storyboard.doStory();
					storyRunning = false;
				}
			
			else if(choice == 2)
				{
					System.out.println(hangar.get(1));
					AlbatrosStoryboard.doStory();
					storyRunning = false;
				}
			
			else if(choice == 3)
				{
					System.out.println(hangar.get(2));
					AEGStoryboard.doStory();
					storyRunning = false;
				}
			
			else if(choice == 4)
			{
				System.out.println(hangar.get(3));
				SuperfortressStoryboard.doStory();
				storyRunning = false;
			}
			
			else if(choice == 5)
			{
				System.out.println(hangar.get(4));
				MitsubishiA6MStoryboard.doStory();
				storyRunning = false;
			}
			
			else if(choice == 6)
			{
				System.out.println(hangar.get(5));
				SupermarineStoryboard.doStory();
				storyRunning = false;
			}
			
			else if(choice == 7)
			{
				System.out.println(hangar.get(6));
				SukhoiStoryboard.doStory();
				storyRunning = false;
			}
			
			else if(choice == 8)
			{
				System.out.println(hangar.get(7));
				DouglasStoryboard.doStory();
				storyRunning = false;
			}
			
			else if(choice == 9)
			{
				System.out.println(hangar.get(8));
				McDonnellStoryboard.doStory();
				storyRunning = false;
			}
			
			}
		}
		
		public static void initializeHangar() {
			//World War I Planes
			hangar.add(new Plane("British B.E.2", "37ft 0in", "V engine (X 1)", "World War I", "1914 - 1918", "British"));
			hangar.add(new Plane("German Albatros D.1", "24ft 11in", "Benz BZIII 6-cylinder water-cooled in-line piston engine (X 1)", "World War I", "1914 - 1918", "German"));
			hangar.add(new Plane("AEG G.IV", "60ft 4in", "Mercedes D.IVa 6-cylinder water-cooled inline piston engine (X 2)", "World War I", "1914 - 1918", "German"));
			
			//World War II Planes
			hangar.add(new Plane("Boeing B-29 Superfortress", "99ft 0in", "Wright R-3350-23 Duplex-cyclone 18-cylinder air-cooled turbosupercharged radial piston engines (X 4)", "World War II", "1939 - 1945", "American"));
			hangar.add(new Plane("Mitsubishi A6M Zero", "39ft 4in", "Nakijima NKIC Sakac-12 14-cylinder air-cooled radial piston engine (X 1)", "World War II", "1939 - 1945", "Japanese"));
			hangar.add(new Plane("Supermarine Spitfire", "36ft 10in", "Rolls-Royce Merlin 45 supercharged V12 engine (X 1)", "World War II", "1939 - 1945", "British"));
			
			//Modern Day Aircraft
			hangar.add(new Plane("Sukhoi Su-57", "46ft 3in", "Saturn AL-41F1 turbofans with thrust vectoring (X 2)", "N/A", "2010 - today", "Russian"));
			hangar.add(new Plane("Douglas AC-47 Spooky", "95ft 0in", "Pratt & Whitney R-1830 Twin Wasp 14-cylinder air-cooled radial pistol engines (X 2)", "Vietnam War", "1964 - today", "American"));
			hangar.add(new Plane("McDonnell Douglas F-15 Eagle", "42ft 10in", "Pratt & Whitney F100-PW-100 (X 2)", "N/A", "1972 - today", "American"));
		}

	}
