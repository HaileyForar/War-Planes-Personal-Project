import java.util.Scanner;

public class AEGStoryboard {

	public static void doStory()
	{
		introductionToStory();
		firstDecision();
		secondDecision();
		thirdDecision();
		fourthDecision();
	}

//Introduces user to this part of the game
public static void introductionToStory()
{
	System.out.println("You have chosen the British B.E.2 Bomber!");
	
	System.out.println("I guess you want to fight in World War I then? No? Well, you might want to buckle your seatbelt. It's going to be a wild ride.");
	System.out.println("The year is 1916, right in the midst of the war. You are a pilot, the finest in the Royal Flying Corps (RFC).");
	System.out.println("Now, being the best comes with many hard decisions. Are you ready?");
	System.out.println();
}

//The first choice the user has to make
public static void firstDecision()
{
	System.out.println("You are currently stationed outside London, and are getting ready to fly off to fight.");
	System.out.println("Your commanding officer is ordering you to take off, but you know that your plane is not fit to fly at the moment.");
	System.out.println("What do you do...");
	System.out.println();
	System.out.println("1. Disobey orders and make sure that your plane is really good to go fly across to the German frontlines?");
	System.out.println("2. Follow what your commanding officer says and take off anyway, because it isn't that bad?");
	System.out.println();
	
	Scanner intInput = new Scanner (System.in);
	int choice = intInput.nextInt();
	
	boolean stillPlaying = true;
	
	while (stillPlaying == true)
	{
		
	if(choice == 1)
		{
			System.out.println("Great choice! You saw that things were not properly checked, so you took to the skies after you did a second check yourself.");
			System.out.println("Get ready, you are now on your way to the frontlines!");
			stillPlaying = false;
		}
	
	else if(choice == 2)
		{
			System.out.println("Wrong choice Rookie, once you started to cross the English Chanel, panels of your wings started to peel off because the bolts were not tight.");
			System.out.println("Have fun sleeping with the fishes.");
			System.out.println("GAME OVER.");
			stillPlaying = false;
		}
	
	stillPlaying = false;
	
	}

}

//The second choice the user has to make
public static void secondDecision()
{
	System.out.println();
	System.out.println("Alright Lieutenant, you are now across the Chanel. You had safe travels.");
	System.out.println("Your crew is safe and even though your commanding officer was irritated with you, you did not get in trouble for making sure that your plane was okay.");
	System.out.println("You have been staying at a base in the outskirts of Paris for a few days, and things have been pretty quiet.");
	System.out.println("All that is about to change...");
	System.out.println();
	System.out.println("It was a normal day, warm even despite the usually cold weather of winter, then you hear the sound of planes overhead.");
	System.out.println("Through looking up, you can't see the planes overhead, but you can see the insignia on the side, and your heart drops as you realize it is a German Squadron.");
	System.out.println("There was no time to sound the air-raid sirens as the bombs started to drop, and people started to run every direction, trying desperately to find any cover that they could.");
	System.out.println("What do you do...");
	System.out.println();
	System.out.println("1. Run and duck for cover as well; your life comes first?");
	System.out.println("2. Make sure that you get all of your crew into a safe place and help others before yourself?");
	
	Scanner intInput = new Scanner (System.in);
	int choice = intInput.nextInt();
	
	boolean stillPlaying = true;
	
	while (stillPlaying == true)
	{
		
	if(choice == 1)
		{
			System.out.println("Fair choice, I understand the need for self preservation.");
			System.out.println("Keep playing to find out what happens next.");
			stillPlaying = false;
		}
	
	else if(choice == 2)
		{
			System.out.println("Unfortunately you have a big heart Lieutenant, and it this case it was to your detriment.");
			System.out.println("As a bomb fell, you hauled two members of the Air force under a cement bunker roof, but you were not able to get under in time.");
			System.out.println("Your leg is severely injured, and you can't feel your right arm.");
			System.out.println("A few days later you die in the hospital due to infection and lack of proper medical tools and knowledge.");
			System.out.println("GAME OVER.");
			stillPlaying = false;
		}
	
	stillPlaying = false;
	
	}

}

//The third choice the user has to make
public static void thirdDecision()
{
	System.out.println();
	System.out.println("The base is now more or less destroyed. Many of the planes that were set to take off the next day on a reconnaissance mission were left in shambles.");
	System.out.println("Another small problem is that one of the main fuel lines that supplied all the aircraft and vehicles with fuel was broken, and that in and of itself caused a massive explosion.");
	System.out.println("One of the only things to do is take a convoy and try to connect with another base through Paris and out the other side.");
	System.out.println("It is an extremely dangerous mission and it would take at least a day and a half to get there and back.");
	System.out.println("You have a choice...");
	System.out.println();
	System.out.println("1. You can go with the convoy and connect with the other base, thus staying in the loop of what is happening and you are able to help your fellow men.");
	System.out.println("2. Or you can stay at the base now turned rubble and wait for the convoy to come back. Hopefully bearing good news.");
	
	Scanner intInput = new Scanner (System.in);
	int choice = intInput.nextInt();
	
	boolean stillPlaying = true;
	
	while (stillPlaying == true)
	{
		
	if(choice == 1)
		{
			System.out.println("Ah, I see. You are one that likes to be in the loop.");
			System.out.println("Good news! You and your team was able to contact with the other base and they said to come on over with your leftover men and supplies and join with them.");
			stillPlaying = false;
		}
	
	else if(choice == 2)
		{
			System.out.println("So you are content to just sit back and let others do the work eh? Well let's hope they are able to connect with the other base without your help!");
			System.out.println("Luckily they were able to find the base and get the okay to send everyone over there to get them out of this rubble heap.");
			stillPlaying = false;
		}
	
	stillPlaying = false;
	
	}
}

//The fourth choice the user has to make
public static void fourthDecision()
{
	System.out.println("Your crew and whomever was left on your home base has now been relocated to this base.");
	System.out.println("Now Lieutenant, you have one more choice.");
	System.out.println();
	System.out.println("Since your base was decimated, there are very few planes left in France, so you have been recruited for another job.");
	System.out.println("During your training you were extremely good at undercover work, so here is a proposition...");
	System.out.println("We need someone to sneak through the city and get this letter with German plans on it to a agent who will be waiting along the single road out of Paris.");
	System.out.println("All you have to do is get this letter to him and he will know what to do.");
	System.out.println("What do you do?");
	System.out.println();
	System.out.println("1. Do you agree to take the job, and put your skills to the test?");
	System.out.println("2. Or do you stay at the base and let someone with more guts take over?");
	Scanner intInput = new Scanner (System.in);
	int choice = intInput.nextInt();
	
	boolean stillPlaying = true;
	
	while (stillPlaying == true)
	{
		
	if(choice == 1)
		{
			System.out.println("It looks like your efforts payed off Lieutenant. We were able to thwart a massive German attack and it looks like the end of The Great War is nigh.");
			System.out.println();
			System.out.println("Congradulations, you made it to the end of WWI, and earned your wings in the Royal Flying Corps.");
			System.out.println("We salute your courage and valor in the midst of the storm.");
			stillPlaying = false;
		}
	
	else if(choice == 2)
		{
			System.out.println("The person they chose to deliver the letter failed, and so the end of the war is nowhere in sight. I wish you would've helped our efforts Lieutenant.");
			System.out.println("GAME OVER.");
			stillPlaying = false;
		}
	
	stillPlaying = false;
	
	}

}

}
