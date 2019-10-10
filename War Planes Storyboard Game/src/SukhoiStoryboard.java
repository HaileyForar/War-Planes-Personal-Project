import java.util.Scanner;

public class SukhoiStoryboard
	{

				public static void doStory()
					{
						introductionToStory();
						firstDecision();
						secondDecision();
						thirdDecision();
						fourthDecision();
						ending();

					}
				
				public static void introductionToStory()
				{
					System.out.println("You have chosen the japanese Sukhoi Su-57!");
					System.out.println("I guess that you are ready for modern warfare? No? Well, you might want to buckle your seatbelt. It's going to be a wild ride.");
					System.out.println("The year is 1916, right in the midst of the war. You are a pilot, the finest in the Japanese Air Force.");
					System.out.println("Now, being the best comes with many hard decisions. Are you ready?");
					System.out.println();
				}
				
				public static void firstDecision()
				{
					System.out.println("You are currently stationed outside London, and are getting ready to fly off to fight.");
					System.out.println("Your commanding officer is ordering you to take off, but you know that your plane is not fit to fly at the moment.");
					System.out.println("What do you do...");
					System.out.println("1. Disobey orders and make sure that your plane is really good to go fly across to the German frontlines.");
					System.out.println("2. Follow what your commanding officer says and take off anyway, because it isn't that bad.");
					
					Scanner intInput = new Scanner (System.in);
					int choice = intInput.nextInt();
					
					boolean stillPlaying = true;
					
					while (stillPlaying)
					{
						
					if(choice == 1)
						{
							System.out.println("Great choice! You saw that things were not properly checked, so you took to the skies after you did a second check yourself.");
							System.out.println("Get ready, you are now on your way to the frontlines!");
						}
					
					else if(choice == 2)
						{
							System.out.println("Wrong choice Rookie, once you started to cross the English Chanel, panels of your wings started to peel off because the bolts were not tight.");
							System.out.println("Have fun sleeping with the fishes.");
							System.out.println("GAME OVER.");
							stillPlaying = false;
						}
					
					}

				}
				
				public static void secondDecision()
				{
					System.out.println("You are currently stationed outside London, and are getting ready to fly off to fight.");
					System.out.println("Your commanding officer is ordering you to take off, but you know that your plane is not fit to fly at the moment.");
					System.out.println("What do you do...");
					System.out.println("1. Disobey orders and make sure that your plane is really good to go fly across to the German frontlines.");
					System.out.println("2. Follow what your commanding officer says and take off anyway, because it isn't that bad.");
					
					Scanner intInput = new Scanner (System.in);
					int choice = intInput.nextInt();
					
					boolean stillPlaying = true;
					
					while (stillPlaying)
					{
						
					if(choice == 1)
						{
							System.out.println("Great choice! You saw that things were not properly checked, so you took to the skies after you did a second check yourself.");
							System.out.println("Get ready, you are now on your way to the frontlines!");
						}
					
					else if(choice == 2)
						{
							System.out.println("Wrong choice Rookie, once you started to cross the English Chanel, panels of your wings started to peel off because the bolts were not tight.");
							System.out.println("Have fun sleeping with the fishes.");
							System.out.println("GAME OVER.");
							stillPlaying = false;
						}
					
					}

				}
				
				public static void thirdDecision()
				{
					System.out.println("You are currently stationed outside London, and are getting ready to fly off to fight.");
					System.out.println("Your commanding officer is ordering you to take off, but you know that your plane is not fit to fly at the moment.");
					System.out.println("What do you do...");
					System.out.println("1. Disobey orders and make sure that your plane is really good to go fly across to the German frontlines.");
					System.out.println("2. Follow what your commanding officer says and take off anyway, because it isn't that bad.");
					
					Scanner intInput = new Scanner (System.in);
					int choice = intInput.nextInt();
					
					boolean stillPlaying = true;
					
					while (stillPlaying)
					{
						
					if(choice == 1)
						{
							System.out.println("Great choice! You saw that things were not properly checked, so you took to the skies after you did a second check yourself.");
							System.out.println("Get ready, you are now on your way to the frontlines!");
						}
					
					else if(choice == 2)
						{
							System.out.println("Wrong choice Rookie, once you started to cross the English Chanel, panels of your wings started to peel off because the bolts were not tight.");
							System.out.println("Have fun sleeping with the fishes.");
							System.out.println("GAME OVER.");
							stillPlaying = false;
						}
					
					}

				}
				
				public static void fourthDecision()
				{
					System.out.println("You are currently stationed outside London, and are getting ready to fly off to fight.");
					System.out.println("Your commanding officer is ordering you to take off, but you know that your plane is not fit to fly at the moment.");
					System.out.println("What do you do...");
					System.out.println("1. Disobey orders and make sure that your plane is really good to go fly across to the German frontlines.");
					System.out.println("2. Follow what your commanding officer says and take off anyway, because it isn't that bad.");
					
					Scanner intInput = new Scanner (System.in);
					int choice = intInput.nextInt();
					
					boolean stillPlaying = true;
					
					while (stillPlaying)
					{
						
					if(choice == 1)
						{
							System.out.println("Great choice! You saw that things were not properly checked, so you took to the skies after you did a second check yourself.");
							System.out.println("Get ready, you are now on your way to the frontlines!");
						}
					
					else if(choice == 2)
						{
							System.out.println("Wrong choice Rookie, once you started to cross the English Chanel, panels of your wings started to peel off because the bolts were not tight.");
							System.out.println("Have fun sleeping with the fishes.");
							System.out.println("GAME OVER.");
							stillPlaying = false;
						}
					
					}

				}
				
				public static void ending()
				{
					boolean stillPlaying = true;
					
					while(stillPlaying)
					{
						
					System.out.println("Congradulations, you made it to the end of your service, and earned your wings in the Japanese Air Force.");
					System.out.println("We salute your courage and valor in the midst of the storm.");
					stillPlaying = false;
					
					}
				}


      }

	
