package mcGinn_p3;
import java.util.Scanner;

public class assignment2_problem3 {
	public static void main(String[] args) {
	Scanner scnr = new Scanner(System.in);
	

	
	int games, games1 = 0, games2 = 0, games3 = 0, games4 = 0, games5 = 0, games6 = 0, games7 = 0, games8 = 0, games9 = 0, games10 = 0;
	int music, music1 = 0, music2 = 0, music3 = 0, music4 = 0, music5 = 0, music6 = 0, music7 = 0, music8 = 0, music9 = 0, music10 = 0;
	int clothes, clothes1 = 0, clothes2 = 0, clothes3 = 0, clothes4 = 0, clothes5 = 0, clothes6 = 0, clothes7 = 0, clothes8 = 0, clothes9 = 0, clothes10 = 0;
	int food, food1 = 0, food2 = 0, food3 = 0, food4 = 0, food5 = 0, food6 = 0, food7 = 0, food8 = 0, food9 = 0, food10 = 0;
	int movies, movies1 = 0, movies2 = 0, movies3 = 0, movies4 = 0, movies5 = 0, movies6 = 0, movies7 = 0, movies8 = 0, movies9 = 0, movies10 = 0;
	int moreInput = 0, notDone = 0;
	
	System.out.println("rate games, music, clothes, food, and movies from \"1\"(worst)-\"10\"(best), or type \"-1\" to quit.");
	System.out.println(" please do not repeat values");
	System.out.println("");
	
	while(notDone != 1) {
	while(moreInput != 1) {
	System.out.println("rate games: ");
	games = scnr.nextInt();
	if(games == 1)
		 games1 ++;
	if(games == 2)
		 games1 ++;
	if(games == 3)
		 games1 ++;
	if(games == 4)
		 games1 ++;
	if(games == 5)
		 games1 ++;
	if(games == 6)
		 games1 ++;
	if(games == 7)
		 games1 ++;
	if(games == 8)
		 games1 ++;
	if(games == 9)
		 games1 ++;
	if(games == 10)
		 games1 ++;	
	
	System.out.println("rate music: ");
	music = scnr.nextInt();
	if(music == 1)
		music1 ++;
	if(music == 2)
		music2 ++;
	if(music == 3)
		music3 ++;
	if(music == 4)
		music4 ++;
	if(music == 5)
		music5 ++;
	if(music == 6)
		music6 ++;
	if(music == 7)
		music7 ++;
	if(music == 8)
		music8 ++;
	if(music == 9)
		music9 ++;
	if(music == 10)
		music10 ++;
	
	System.out.println("rate clothes: ");
	clothes = scnr.nextInt();
	if(clothes == 1)
		clothes1 ++;
	if(clothes == 2)
		clothes2 ++;
	if(clothes == 3)
		clothes3 ++;
	if(clothes == 4)
		clothes4 ++;
	if(clothes == 5)
		clothes5 ++;
	if(clothes == 6)
		clothes6 ++;
	if(clothes == 7)
		clothes7 ++;
	if(clothes == 8)
		clothes8 ++;
	if(clothes == 9)
		clothes9 ++;
	if(clothes == 10)
		clothes10 ++;
	
	System.out.println("rate food: ");
	food = scnr.nextInt();
	if(food == 1)
		food1 ++;
	if(food == 2)
		food2 ++;
	if(food == 3)
		food3 ++;
	if(food == 4)
		food4 ++;
	if(food == 5)
		food5 ++;
	if(food == 6)
		food6 ++;
	if(food == 7)
		food7 ++;
	if(food == 8)
		food8 ++;
	if(food == 9)
		food9 ++;
	if(food == 10)
		food10 ++;		
	
	System.out.println("rate movies: ");
	movies = scnr.nextInt();
	if(movies == 1)
		movies1 ++;
	if(movies == 2)
		movies2 ++;
	if(movies == 3)
		movies3 ++;
	if(movies == 4)
		movies4 ++;
	if(movies == 5)
		movies5 ++;
	if(movies == 6)
		movies6 ++;
	if(movies == 7)
		movies7 ++;
	if(movies == 8)
		movies8 ++;
	if(movies == 9)
		movies9 ++;
	if(movies == 10)
		movies10 ++;
	
	System.out.println("More input? (y/n)");
	String response = scnr.next();
		
	if (!response.equalsIgnoreCase("y")) {
		moreInput = 1;
		}
	}
	System.out.println("Number of rating's for: one-ten");
	System.out.print("games recieved:   " + games1 + "  " + games2 + "  " + games3 + "  " + games4 + "  ");
	System.out.println(""+ games5 + "  " + games6 + "  " + games7 + "  " + games8 + "  " + games9 + "  " + games10);
	
	System.out.print("music recieved:   " + music1 + "  " + music2 + "  " + music3 + "  " + music4 + "  ");
	System.out.println(""+ music5 + "  " + music6 + "  " + music7 + "  " + music8 + "  " + music9 + "  " + music10);
	
	System.out.print("clothes recieved: " + clothes1 + "  " + clothes2 + "  " + clothes3 + "  " + clothes4 + "  ");
	System.out.println(""+ clothes5 + "  " + clothes6 + "  " + clothes7 + "  " + clothes8 + "  " + clothes9 + "  " + clothes10);
	
	System.out.print("food recieved:    " + food1 + "  " + food2 + "  " + food3 + "  " + food4 + "  ");
	System.out.println(""+ food5 + "  " + food6 + "  " + food7 + "  " + food8 + "  " + food9 + "  " + food10);
	
	System.out.print("movies recieved:  " + movies1 + "  " + movies2 + "  " + movies3 + "  " + movies4 + "  ");
	System.out.println(""+ movies5 + "  " + movies6 + "  " + movies7 + "  " + movies8 + "  " + movies9 + "  " + movies10);
	
	notDone = 1;
	}
	  }	
	}	
