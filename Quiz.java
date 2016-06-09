import java.util.*;
import java.lang.*;
import java.io.*;

class Quiz
{
	public static void main (String[] args) throws java.lang.Exception {
 
		String [ ] questions = { "1. What is the capital of the USA?", "2. How many oscars did the Titanic movie got?", "3. What is 19+2?","4. What is the capitol of china?","5. What is the capitol of Germany?","6. What is the first thing apple made?","7. Who is the world's first computer programer ?","8. At which precedency was Abraham Lincoln?","9. Who was the 35th President of the USA?","10. Who is the 2th son of Abrham lincoln?"};
		String [][] choices = {
							{"1. Washington Dc","2. Chicago","3. Madison","4. Silicon valley"},
							{"1. 1","2. 10","3. 0","4. 11"},
							{"1. 21" , "2. 20","3. 18","4. 22"},
							{"1. London","2. Beijing","3. Tokeo","4. Japan"}, 
				                        {"1. Hong Kong","2. China","3. London","4. Berlin"}, 
                                                        {"1. Phones","2. Computers","3.Tvs","4.Fruit"},	                                                  
							{"1. Ada Lovelace","2. Albert Einstein","3. newton","4. Olaf"},
							{"1. 16th President of the USA","2. 20th President of the USA","3. 4th President of the USA","4. 50th President of the USA"},
							{"1. Bnl","2. Jonh F. Kennedy","3. Martin Luther King Jr","4. Barack Obama"},
							{"1. Edward Baker Lincoln","2. Martin Luther King Jr.","3. Ronald reagan","4. Ann Dunham"}
 
							};
		int [] answers = {1, 4, 1, 2, 4, 2, 1, 1, 2, 1};
		int h = 0;
		int i = 0;
		int scoreboard = 0;
		Scanner user = new Scanner (System.in);
		while (h<=9) {
			System.out.println (questions[h]);
			System.out.println ();
			while (i<=3) {
				System.out.println (choices [h][i]);
				i = i+1;
			}
			i = 0;
			int userin=user.nextInt();
 
			while(userin >= 5) {
				System.out.println("Bad input. Please give a valid input: ");
				userin = user.nextInt();
			}
			if (userin == answers[h]) {
				System.out.println("Correct answer");
				scoreboard = scoreboard + 1;
			}
			else {
				System.out.println("Wrong answer");
			}
			h = h+1;
			System.out.println();
		}
		System.out.print ("Your score is: ");
		System.out.print (scoreboard);
		System.out.print (" Out of ");
		System.out.print (10);
	}
}
